package com.test;

import com.dao.BaseDao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class StuInfoDao extends BaseDao {
    public int save(String no,String name,int tel) throws SQLException {
        int r=0;
        String sql="insert into stu_info(stu_no,stu_name,stu_tel) values(?,?,?)";
        r=super.executeUpdate(sql,no,name,tel);
        return r;
    }
    public int deleteById(int id) throws SQLException {
        int r=0;
        String sql="delete from stu_info where stu_id=?";
        r=super.executeUpdate(sql,id);
        return r;
    }
    public List<Map<String,Object>> findByNameAndTel(String name,int tel) throws SQLException {
        List<Map<String,Object>> list=null;
        String sql="select * from stu_info where stu_name=? and stu_tel=?";
        list=super.executeQuery(sql,"%"+name+"%",tel);
        return list;
    }
    public List<Map<String,Object>> findAll() throws SQLException {
        List<Map<String,Object>> list=null;
        String sql="select * from stu_info";
        list=super.executeQuery(sql);
        return list;
    }
}
