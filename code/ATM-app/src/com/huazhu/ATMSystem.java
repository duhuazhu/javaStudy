package com.huazhu;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<Account>();
        while (true) {
            System.out.println("========欢迎进入到ATM系统========");
            System.out.println("1.账户登录");
            System.out.println("2.账户开户");
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的操作");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //登录
                    login(accounts);
                    break;
                case 2:
                    //开户
                    register(accounts);
                    break;
                default:
                    System.out.println("你输入的操作不存在,请重新输入");
            }
        }
    }

    /**
     * 登录方法
     * @param accounts 集合验证是否登录成功
     */
    private static void login(ArrayList<Account> accounts) {
        while (true) {
            System.out.println("========用户登录========");
            if(accounts.size()==0){
                System.out.println("对不起,系统中,没任何账号,请先注册,再来登录~~~");
                return;
            }

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的账号");
            String carId  = sc.next();
            Account  acc  = getAccountByCardId(accounts,carId);
            if(acc!=null){
                System.out.println("请输入您的密码");
                String passWorld = sc.next();
                //验证登录逻辑
                Account  account =  verifyPassWorld(accounts,carId,passWorld);
                if(account==null){
                    System.out.println("您输入的密码有误,请重兴登录");
                }else{
                    System.out.println("恭喜"+account.getUserName()+"登录成功,您的卡号是"+account.getCardId());
                }
            }else{
                System.out.println("没有查到您输入的卡号,请重新输入");
            }
        }

    }

    /**
     * 验证密码
     * @param accounts 个人信息存放的集合
     * @param carId 卡号id
     * @param passWorld 密码
     */
    private static Account verifyPassWorld(ArrayList<Account> accounts, String carId, String passWorld) {

        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if(acc.getCardId().equals(carId)){
                if(acc.getPassWorld().equals(passWorld)){
                    return acc;
                }
            }
        }

        return null;
    };

    /**
     * 用户开户功能实现
     *
     * @param accounts 接受账户的集合
     */
    private static void register(ArrayList<Account> accounts) {
        System.out.println("================系统开户操作================");
        Account account = new Account();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的用户名");
        String name = sc.next();
        account.setUserName(name);
        while (true) {
            System.out.println("请输入您的密码");
            String passWorld = sc.next();
            System.out.println("请再次输入您的密码");
            String passWorldAgain = sc.next();
            if (passWorld.equals(passWorldAgain)) {
                account.setPassWorld(passWorld);
                break;
            } else {
                System.out.println("您输入的密码不一致");
            }
        }
        System.out.println("请您输入账户限额");
        double d = sc.nextDouble();
        account.setQuotaMoney(d);
        //生成一个8位随机生成的卡号
        String cardId = getRandomCardId(accounts);
        account.setCardId(cardId);
        accounts.add(account);
        System.out.println("恭喜您" + name + "先生/女士,您开户成功,您的卡号是" + cardId);
        showUserCommand(accounts,account);
    }

    private static void showUserCommand(ArrayList<Account> accounts, Account account) {
        System.out.println("==============用户操作页==============");
        System.out.println("1.查询账户");
        System.out.println("2.存款");
        System.out.println("3.取款");
        System.out.println("4.转账");
        System.out.println("5.修改密码");
        System.out.println("6.退出");
        System.out.println("7.注销账户");
        Scanner sc  = new Scanner(System.in);
        int command = sc.nextInt();
        switch (command){
            case 1:
                //查询用户
                QueryAccount(account);
                break;
            case 2:
                //存款
                break;
            case 3:
                //取款
                break;
            case 4:
                //转账
                break;
            case 5:
                //修改密码
                break;
            case 6:
                //退出
                break;
            case 7:
                //注销账户
                break;
        }
    }

    /**
     * 查询用户
     * @param account 挡墙登录用户的账号
     */
    private static void QueryAccount(Account account) {
        System.out.println("用户信息展示");
    }


    /**
     * 创建随机8位密码
     *
     * @return 返回随机卡号
     */
    public static String getRandomCardId(ArrayList<Account> accounts) {
        Random random = new Random();
        while (true) {
            String cardId = "";
            for (int i = 0; i < 9; i++) {
                cardId += random.nextInt(10);
            }
            // 判断是否重复
            Account acc =  getAccountByCardId(accounts,cardId);
            if(acc==null){
                //id没有重复
                return  cardId;
            }
        }
    }


    /**
     * 判断卡号id是否重复
     * @param accounts 接受账号的集合
     * @param cardId 卡号id
     * @return 返回null 就说明没有重复
     */
    private static Account getAccountByCardId(ArrayList<Account> accounts, String cardId) {
        for (int i = 0; i < accounts.size(); i++) {
            Account acc  =accounts.get(i);
            if (acc.getCardId().equals(cardId)){
                return acc;
            }
        }
        return null;
    }
}
