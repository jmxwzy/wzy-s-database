package Shopping;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("登录系统");
        System.out.println("1.登录系统");
        System.out.println("2.退出");
        int opt = sc.nextInt();
        switch (opt) {
            case 1:Menu();break;
            case 2:Exit();break;
            default:break;
        }
    }
    static void Menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("主菜单");
        System.out.println("1.客户信息管理");
        System.out.println("2.购物结算");
        System.out.println("3.真情回馈");
        System.out.println("4.注销");
        int opt = sc.nextInt();
        switch (opt) {
            case 1:Info();break;
            case 2:Cost();break;
            case 3:huikui();break;
            case 4:Exit();break;
            default:break;
        }
    }
    static void Exit() {
        System.out.println("Goodbye!Thanks for your using！");
    }
    static void Info() {
        System.out.println("购物管理系统>客户信息管理");
        System.out.println("1.显示所有客户信息");
        System.out.println("2.添加客户信息");
        System.out.println("3.修改客户信息");
        System.out.println("4.查询客户信息");
    }
    static void Cost() {
        System.out.println("We are working for this...");
    }
    static void huikui() {
        System.out.println("1.幸运大放送");
        System.out.println("2.幸运抽奖");
        System.out.println("3.生日问候");
    }
}
