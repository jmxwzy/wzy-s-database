package com.dao;

import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;
import com.util.DButil;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseDao {
    protected Connection connection=null;
    protected PreparedStatement preparedStatement=null;
    protected ResultSet resultSet=null;

    protected final void getConnection() throws SQLException {
        try {
            connection=DButil.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    protected final void close() throws SQLException {
        DButil.close(connection,preparedStatement,resultSet);
    }

    protected final int executeUpdate(String sql,Object...params) throws SQLException {
        int row=0;
        getConnection();
        preparedStatement=connection.prepareStatement(sql);
        if(params!=null) {
            for(int i=0;i<params.length;i++) {
                preparedStatement.setObject((i+1),params[i]);
            }
        }
        row=preparedStatement.executeUpdate();
        return row;
    }

    protected final List<Map<String,Object>> executeQuery(String sql,Object...params) throws SQLException {
        List<Map<String,Object>> list=new ArrayList<Map<String, Object>>();
        try{
            getConnection();
            preparedStatement=connection.prepareStatement(sql);
            if(params!=null) {
                for(int i=0;i<params.length;i++) {
                    preparedStatement.setObject(i+1,params[i]);
                }
            }
            resultSet=preparedStatement.executeQuery();
            ResultSetMetaData metaData=resultSet.getMetaData();
            int nums=metaData.getColumnCount();
            String[] columns=new String[nums];
            for(int i=0;i<nums;i++) {
                columns[i]=metaData.getColumnLabel(i+1).toLowerCase();
            }
            while(resultSet.next()) {
                Map<String,Object> map=new HashMap<String,Object>();
                for(int i=0;i<nums;i++) {
                    map.put(columns[i],resultSet.getObject(i+1));
                }
                list.add(map);
            }
        } catch (SQLException e) {
            throw new RuntimeException();
        } finally {
            close();
        }
        return list;
    }
}
