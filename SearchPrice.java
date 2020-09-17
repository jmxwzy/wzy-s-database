package Shopping;

import java.util.Scanner;

public class SearchPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("MyShopping管理系统 > 购物结算");
        System.out.println();
        System.out.println("**************************");
        while(true) {
            int id;
            System.out.println("请输入购买的商品编号：");
            System.out.println("1.T恤  2.网球鞋  3.网球拍");
            System.out.println("**************************");
            System.out.print("请输入商品编号：");
            id = input.nextInt();
            switch (id) {
                case 1:System.out.println("T恤   $245.0");break;
                case 2:System.out.println("网球鞋   $245.0");break;
                case 3:System.out.println("网球拍   $245.0");break;
                default:break;
            }
            System.out.println();
            System.out.print("是否继续（y/n）");
            String optt = input.next();
            if(optt.equalsIgnoreCase("n")) {
                System.out.println("程序结束！");
                break;
            }
        }
    }
}
