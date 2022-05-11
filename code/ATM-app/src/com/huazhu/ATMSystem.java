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
     *
     * @param accounts 集合验证是否登录成功
     */
    private static void login(ArrayList<Account> accounts) {
        while (true) {
            System.out.println("========用户登录========");
            if (accounts.size() == 0) {
                System.out.println("对不起,系统中,没任何账号,请先注册,再来登录~~~");
                return;
            }

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的账号");
            String carId = sc.next();
            Account acc = getAccountByCardId(accounts, carId);
            if (acc != null) {
                System.out.println("请输入您的密码");
                String PassWord = sc.next();
                //验证登录逻辑
                Account account = verifyPassWord(accounts, carId, PassWord);
                if (account == null) {
                    System.out.println("您输入的密码有误,请重兴登录");
                } else {
                    System.out.println("恭喜" + account.getUserName() + "登录成功,您的卡号是:" + account.getCardId());
                    showUserCommand(accounts, account);
                    //再次返回上一层
                    return;
                }
            } else {
                System.out.println("没有查到您输入的卡号,请重新输入");
            }
        }

    }

    /**
     * 验证密码
     *
     * @param accounts  个人信息存放的集合
     * @param carId     卡号id
     * @param PassWord 密码
     */
    private static Account verifyPassWord(ArrayList<Account> accounts, String carId, String PassWord) {

        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if (acc.getCardId().equals(carId)) {
                if (acc.getPassWord().equals(PassWord)) {
                    return acc;
                }
            }
        }

        return null;
    }

    ;

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
            String PassWord = sc.next();
            System.out.println("请再次输入您的密码");
            String PassWordAgain = sc.next();
            if (PassWord.equals(PassWordAgain)) {
                account.setPassWord(PassWord);
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
        System.out.println("恭喜您" + name + "先生/女士,您开户成功,您的卡号是:" + cardId);
    }

    private static void showUserCommand(ArrayList<Account> accounts, Account account) {
        while (true) {
            System.out.println("==============用户操作页==============");
            System.out.println("1.查询账户");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.修改密码");
            System.out.println("6.退出");
            System.out.println("7.注销账户");
            Scanner sc = new Scanner(System.in);
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //查询用户
                    QueryAccount(account);
                    break;
                case 2:
                    //存款\
                    deposit(account);
                    break;
                case 3:
                    //取款
                    withDrawCash(account);
                    break;
                case 4:
                    //转账
                    transferAccounts(account, accounts);
                    break;
                case 5:
                    //修改密码
                    changePassWord(account);
                    break;
                case 6:
                    //退出  记住 这里直接可以退出
                    return;
                case 7:
                    //注销账户
                   boolean flag =  deleteAccounts(account, accounts);
                   if(flag){
                       return;
                   }else{
                       break;
                   }
                default:
                    System.out.println("您的输入有误,请重新输入");
            }
        }
    }

    /**
     * 删除账户
     * @param account 当前账户
     * @param accounts 账户集合
     */
    private static boolean deleteAccounts(Account account, ArrayList<Account> accounts) {
        System.out.println("您确定删除账户嘛,不可反悔");
        System.out.println("请输入y/n");
        Scanner sc = new Scanner(System.in);
        String command = sc.next();
        if ("y".equals(command)) {
            if (account.getMoney() > 0) {
                System.out.println("您的账户里还要钱,要取出,不允许销户");
            } else {
                accounts.remove(account);
                System.out.println("注销账户成功");
                return true;
            }
        } else {
            System.out.println("您输入的操作有误,请重新输入");
        }
        return false;
    }

    /**
     * 修改密码
     * @param account 当前密码
     */
    private static void changePassWord(Account account) {
        System.out.println("请输入你的当前密码");
        Scanner sc = new Scanner(System.in);
        String PassWord = sc.next();
        if(PassWord.equals(account.getPassWord())){
            System.out.println("请输入你的新密码");
            String newPassWord = sc.next();
            System.out.println("请再次输入你的新密码");
            String newPassWordAgain = sc.next();
            if(newPassWordAgain.equals(newPassWord)){
                account.setPassWord(newPassWord);
                System.out.println("您的密码修改成功");
            }
        }
    }

    /**
     * 转账
     *
     * @param account  自己的账户
     * @param accounts 集合
     */
    private static void transferAccounts(Account account, ArrayList<Account> accounts) {
        if(accounts.size()<2){
            System.out.println("当前系统不足2个账户,不能进行转账,请创建账户");
            return;
        }
        System.out.println("请输入你要转账账户的卡号");
        Scanner sc = new Scanner(System.in);
        String CardId = sc.next();
        Account acc = getAccountByCardId(accounts, CardId);
        if (acc != null) {
            //验证成功
            System.out.println("请输入你要转账户主的姓名");
            String name = sc.next();
            if (acc.getUserName().equals(name)) {
                //输入账户名称正确
                System.out.println("请输入你要转出的金融");
                double money = sc.nextDouble();
                if (money > account.getQuotaMoney()) {
                    System.out.println("您转出的金额超过当日限额");
                    return;
                }
                if (money > account.getMoney()) {
                    System.out.println("您转出的金额超过余额");
                    return;
                }
                //从自己的账户转出
                account.setMoney(account.getMoney() - money);
                //转入
                acc.setMoney(acc.getMoney() + money);
                System.out.println("你转入成功,您的当前余额为" + account.getMoney());
            } else {
                System.out.println("对不起,您输入的转账户名称错误");
            }
        } else {
            System.out.println("您输入的卡号不存在");
        }
    }


    /**
     * 取钱的方法
     *
     * @param account 账户信息
     */
    private static void withDrawCash(Account account) {
        System.out.println("请输入你要取出的金额");
        Scanner sc = new Scanner(System.in);
        double aDouble = sc.nextDouble();
        if (aDouble > account.getMoney()) {
            System.out.println("不好意思您的账号现在没这么多钱,努力赚钱把骚年,现在余额为" + account.getMoney());
            return;
        }
        if (aDouble > account.getQuotaMoney()) {
            System.out.println("你输入的金额超过您设置当日存储的金额");
        } else {
            account.setMoney(account.getMoney() - aDouble);
            System.out.println("取出成功,现在余额为" + account.getMoney() + "元");
        }
    }

    /**
     * 存款
     *
     * @param account 账户信息
     */
    private static void deposit(Account account) {
        System.out.println("请输入你要存款的金融");
        Scanner sc = new Scanner(System.in);
        double aDouble = sc.nextDouble();
        if (aDouble > account.getQuotaMoney()) {
            System.out.println("你输入的金额超过您设置当日存储的金额");
        } else {
            account.setMoney(account.getMoney() + aDouble);
            System.out.println("存入成功,现在余额为" + account.getMoney() + "元");
        }
    }

    /**
     * 查询用户
     *
     * @param account 挡墙登录用户的账号
     */
    private static void QueryAccount(Account account) {
        System.out.println("用户信息展示");
        System.out.println("用户名" + account.getUserName());
        System.out.println("卡号" + account.getCardId());
        System.out.println("余额" + account.getMoney());
        System.out.println("当日限定交易额" + account.getQuotaMoney());
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
            Account acc = getAccountByCardId(accounts, cardId);
            if (acc == null) {
                //id没有重复
                return cardId;
            }
        }
    }


    /**
     * 判断卡号id是否重复
     *
     * @param accounts 接受账号的集合
     * @param cardId   卡号id
     * @return 返回null 就说明没有重复
     */
    private static Account getAccountByCardId(ArrayList<Account> accounts, String cardId) {
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if (acc.getCardId().equals(cardId)) {
                return acc;
            }
        }
        return null;
    }
}
