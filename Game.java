package Game;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        welcome();
    }
    public static void welcome() {
        System.out.println("欢迎光临青鸟游戏迷你平台");
        System.out.println();
        System.out.println("请选择您喜爱的游戏：");
        System.out.println();
        System.out.println("*********************");
        System.out.println("   1.斗地主");
        System.out.println("   2.斗牛");
        System.out.println("   3.泡泡龙");
        System.out.println("   4.连连看");
        System.out.println("   5.我不玩游戏，我是管理员");
        System.out.println("*********************");
        System.out.println();
        System.out.print("请选择，输入数字：");

        Scanner input = new Scanner(System.in);
        int opt = input.nextInt();
        switch(opt) {
            case 1:doudizhu();break;
            case 2:douniu();break;
            case 3:paopaolong();break;
            case 4:lianliankan();break;
            case 5:manage();break;
            default:break;
        }
    }
    public static void manage() {
        System.out.println("欢迎光临青鸟游戏迷你平台");
        System.out.println();
        System.out.println("您是管理员！请输入您要做的操作：");
        System.out.println();
        System.out.println("*********************");
        System.out.println("   1.统计游戏点击率");
        System.out.println("   2.斗牛");
        System.out.println("   3.我想玩游戏了");
        System.out.println("*********************");
        System.out.println();

        Scanner input = new Scanner(System.in);
        int opt = input.nextInt();
        switch (opt) {
            case 1:tongji();break;
            case 2:addinfo();break;
            case 3:welcome();break;
            default:break;
        }
    }
    public static void tongji() {
        Scanner input = new Scanner(System.in);
        System.out.println("青鸟游戏平台 > 游戏点击率");
        System.out.println();
        int t, cnt = 0;
        for(int i = 1;i <= 4;i++) {
            System.out.print("请输入第"+i+"个游戏的点击率：");
            t = input.nextInt();
            if(cnt > 100) cnt++;
        }
        double ans = cnt / 4.0 *100.0;
        String res = String.format("%.1f",ans);
        System.out.print("点击率大于100的游戏所占的比例为："+res+'%');
        manage();
    }
    public static void addinfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("青鸟游戏平台 > 添加用户信息");
        System.out.println();
        System.out.println("请输入要登录入用户的数量：");
        int n = input.nextInt();
        for(int i = 1;i <= n; i ++){
            int id, age, score;
            System.out.print("请输入用户编号(<4位整数>)：");
            id = input.nextInt();
            System.out.print("请输入用户年龄：");
            age = input.nextInt();
            if(age<18) {
                System.out.print("很抱歉，您的年龄不适宜玩游戏！");
                System.out.print("登入信息失败！");
                break;
            }
            System.out.print("请输入会员积分：");
            score = input.nextInt();
            System.out.println("您登入的会员信息是：");
            System.out.print("用户编号："+id+"    "+"年龄："+age+"积分："+score);
        }
        manage();
    }
    public static void pay() {
        System.out.println("青鸟游戏平台 > 游戏币支付");
        System.out.println();
        System.out.println("请选择您玩的游戏类型：");
        System.out.println("    1.牌类");
        System.out.println("    2.休闲竞技类");

        Scanner input = new Scanner(System.in);
        int opt = input.nextInt();
        System.out.println("请输入您的游戏时长");
        int t = input.nextInt();
        double money = 0.0;
        if(opt == 1){
            System.out.print("您玩的是牌类游戏，时长是："+t+"，可以享受");
            if(t>10) {
                System.out.print("5折优惠");
                money = 10 * t * 0.5;
            }
            else {
                System.out.print("8折优惠");
                money = 10 * t * 0.8;
            }
        }

        if(opt == 2){
            System.out.print("您玩的是休闲竞技类游戏，时长是："+t+"，可以享受");
            if(t>10) {
                System.out.print("5折优惠");
                money = 10 * t * 0.5;
            }
            else {
                System.out.print("8折优惠");
                money = 10 * t * 0.8;
            }
        }

        System.out.println("您需要支付"+money+"个游戏币");
    }
    public static void doudizhu() {
        System.out.println("您已进入斗地主房间！");
        pay();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("青鸟游戏平台 > 游戏晋级");
        System.out.println();
        Scanner input = new Scanner(System.in);
        int score, cnt=0;
        String s;

        for(int i = 1;i <= 5;i++){
            System.out.print("您正在玩第"+i+"局，成绩为：");
            score = input.nextInt();
            if(score >= 80) cnt++;
            System.out.print("继续玩下一局吗？(yes/no)");
            s = input.next();
            if(s.equalsIgnoreCase("no")){
                System.out.println("您已中途退出游戏。");
                System.out.println("对不起，您未能晋级，继续加油啊！");
                break;
            }
            else if(s.equalsIgnoreCase("yes")){
                System.out.println("继续下一局");
            }
        }
        if(cnt >= 3) {
            if(cnt >= 4) {
                System.out.print("恭喜！通过一级！");
            }
            else System.out.print("恭喜！通过二级！");
        }
        welcome();
    }
    public static void douniu() {
        System.out.println("您已进入斗牛房间！");
        pay();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("青鸟游戏平台 > 游戏晋级");
        System.out.println();
        Scanner input = new Scanner(System.in);
        int score, cnt=0;
        String s;

        for(int i = 1;i <= 5;i++){
            System.out.print("您正在玩第"+i+"局，成绩为：");
            score = input.nextInt();
            if(score >= 80) cnt++;
            System.out.print("继续玩下一局吗？(yes/no)");
            s = input.next();
            if(s.equalsIgnoreCase("no")){
                System.out.println("您已中途退出游戏。");
                System.out.println("对不起，您未能晋级，继续加油啊！");
                break;
            }
            else if(s.equalsIgnoreCase("yes")){
                System.out.println("继续下一局");
            }
        }
        if(cnt >= 3) {
            if(cnt >= 4) {
                System.out.print("恭喜！通过一级！");
            }
            else System.out.print("恭喜！通过二级！");
        }
        welcome();
    }
    public static void paopaolong() {
        System.out.println("您已进入泡泡龙房间！");
        pay();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("青鸟游戏平台 > 游戏晋级");
        System.out.println();
        Scanner input = new Scanner(System.in);
        int score, cnt=0;
        String s;

        for(int i = 1;i <= 5;i++){
            System.out.print("您正在玩第"+i+"局，成绩为：");
            score = input.nextInt();
            if(score >= 80) cnt++;
            System.out.print("继续玩下一局吗？(yes/no)");
            s = input.next();
            if(s.equalsIgnoreCase("no")){
                System.out.println("您已中途退出游戏。");
                System.out.println("对不起，您未能晋级，继续加油啊！");
                break;
            }
            else if(s.equalsIgnoreCase("yes")){
                System.out.println("继续下一局");
            }
        }
        if(cnt >= 3) {
            if(cnt >= 4) {
                System.out.print("恭喜！通过一级！");
            }
            else System.out.print("恭喜！通过二级！");
        }
        welcome();
    }
    public static void lianliankan() {
        System.out.println("您已进入连连看房间！");
        pay();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("青鸟游戏平台 > 游戏晋级");
        System.out.println();
        Scanner input = new Scanner(System.in);
        int score, cnt=0;
        String s;

        for(int i = 1;i <= 5;i++){
            System.out.print("您正在玩第"+i+"局，成绩为：");
            score = input.nextInt();
            if(score >= 80) cnt++;
            System.out.print("继续玩下一局吗？(yes/no)");
            s = input.next();
            if(s.equalsIgnoreCase("no")){
                System.out.println("您已中途退出游戏。");
                System.out.println("对不起，您未能晋级，继续加油啊！");
                break;
            }
            else if(s.equalsIgnoreCase("yes")){
                System.out.println("继续下一局");
            }
        }
        if(cnt >= 3) {
            if(cnt >= 4) {
                System.out.print("恭喜！通过一级！");
            }
            else System.out.print("恭喜！通过二级！");
        }
        welcome();
    }
}
