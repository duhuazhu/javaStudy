package com.huazhu;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<Account>();
        while (true) {
            System.out.println("========��ӭ���뵽ATMϵͳ========");
            System.out.println("1.�˻���¼");
            System.out.println("2.�˻�����");
            Scanner sc = new Scanner(System.in);
            System.out.println("���������Ĳ���");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //��¼
                    login(accounts);
                    break;
                case 2:
                    //����
                    register(accounts);
                    break;
                default:
                    System.out.println("������Ĳ���������,����������");
            }
        }
    }

    /**
     * ��¼����
     *
     * @param accounts ������֤�Ƿ��¼�ɹ�
     */
    private static void login(ArrayList<Account> accounts) {
        while (true) {
            System.out.println("========�û���¼========");
            if (accounts.size() == 0) {
                System.out.println("�Բ���,ϵͳ��,û�κ��˺�,����ע��,������¼~~~");
                return;
            }

            Scanner sc = new Scanner(System.in);
            System.out.println("�����������˺�");
            String carId = sc.next();
            Account acc = getAccountByCardId(accounts, carId);
            if (acc != null) {
                System.out.println("��������������");
                String PassWord = sc.next();
                //��֤��¼�߼�
                Account account = verifyPassWord(accounts, carId, PassWord);
                if (account == null) {
                    System.out.println("���������������,�����˵�¼");
                } else {
                    System.out.println("��ϲ" + account.getUserName() + "��¼�ɹ�,���Ŀ�����:" + account.getCardId());
                    showUserCommand(accounts, account);
                    //�ٴη�����һ��
                    return;
                }
            } else {
                System.out.println("û�в鵽������Ŀ���,����������");
            }
        }

    }

    /**
     * ��֤����
     *
     * @param accounts  ������Ϣ��ŵļ���
     * @param carId     ����id
     * @param PassWord ����
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
     * �û���������ʵ��
     *
     * @param accounts �����˻��ļ���
     */
    private static void register(ArrayList<Account> accounts) {
        System.out.println("================ϵͳ��������================");
        Account account = new Account();
        Scanner sc = new Scanner(System.in);
        System.out.println("�����������û���");
        String name = sc.next();
        account.setUserName(name);
        while (true) {
            System.out.println("��������������");
            String PassWord = sc.next();
            System.out.println("���ٴ�������������");
            String PassWordAgain = sc.next();
            if (PassWord.equals(PassWordAgain)) {
                account.setPassWord(PassWord);
                break;
            } else {
                System.out.println("����������벻һ��");
            }
        }
        System.out.println("���������˻��޶�");
        double d = sc.nextDouble();
        account.setQuotaMoney(d);
        //����һ��8λ������ɵĿ���
        String cardId = getRandomCardId(accounts);
        account.setCardId(cardId);
        accounts.add(account);
        System.out.println("��ϲ��" + name + "����/Ůʿ,�������ɹ�,���Ŀ�����:" + cardId);
    }

    private static void showUserCommand(ArrayList<Account> accounts, Account account) {
        while (true) {
            System.out.println("==============�û�����ҳ==============");
            System.out.println("1.��ѯ�˻�");
            System.out.println("2.���");
            System.out.println("3.ȡ��");
            System.out.println("4.ת��");
            System.out.println("5.�޸�����");
            System.out.println("6.�˳�");
            System.out.println("7.ע���˻�");
            Scanner sc = new Scanner(System.in);
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //��ѯ�û�
                    QueryAccount(account);
                    break;
                case 2:
                    //���\
                    deposit(account);
                    break;
                case 3:
                    //ȡ��
                    withDrawCash(account);
                    break;
                case 4:
                    //ת��
                    transferAccounts(account, accounts);
                    break;
                case 5:
                    //�޸�����
                    changePassWord(account);
                    break;
                case 6:
                    //�˳�  ��ס ����ֱ�ӿ����˳�
                    return;
                case 7:
                    //ע���˻�
                   boolean flag =  deleteAccounts(account, accounts);
                   if(flag){
                       return;
                   }else{
                       break;
                   }
                default:
                    System.out.println("������������,����������");
            }
        }
    }

    /**
     * ɾ���˻�
     * @param account ��ǰ�˻�
     * @param accounts �˻�����
     */
    private static boolean deleteAccounts(Account account, ArrayList<Account> accounts) {
        System.out.println("��ȷ��ɾ���˻���,���ɷ���");
        System.out.println("������y/n");
        Scanner sc = new Scanner(System.in);
        String command = sc.next();
        if ("y".equals(command)) {
            if (account.getMoney() > 0) {
                System.out.println("�����˻��ﻹҪǮ,Ҫȡ��,����������");
            } else {
                accounts.remove(account);
                System.out.println("ע���˻��ɹ�");
                return true;
            }
        } else {
            System.out.println("������Ĳ�������,����������");
        }
        return false;
    }

    /**
     * �޸�����
     * @param account ��ǰ����
     */
    private static void changePassWord(Account account) {
        System.out.println("��������ĵ�ǰ����");
        Scanner sc = new Scanner(System.in);
        String PassWord = sc.next();
        if(PassWord.equals(account.getPassWord())){
            System.out.println("���������������");
            String newPassWord = sc.next();
            System.out.println("���ٴ��������������");
            String newPassWordAgain = sc.next();
            if(newPassWordAgain.equals(newPassWord)){
                account.setPassWord(newPassWord);
                System.out.println("���������޸ĳɹ�");
            }
        }
    }

    /**
     * ת��
     *
     * @param account  �Լ����˻�
     * @param accounts ����
     */
    private static void transferAccounts(Account account, ArrayList<Account> accounts) {
        if(accounts.size()<2){
            System.out.println("��ǰϵͳ����2���˻�,���ܽ���ת��,�봴���˻�");
            return;
        }
        System.out.println("��������Ҫת���˻��Ŀ���");
        Scanner sc = new Scanner(System.in);
        String CardId = sc.next();
        Account acc = getAccountByCardId(accounts, CardId);
        if (acc != null) {
            //��֤�ɹ�
            System.out.println("��������Ҫת�˻���������");
            String name = sc.next();
            if (acc.getUserName().equals(name)) {
                //�����˻�������ȷ
                System.out.println("��������Ҫת���Ľ���");
                double money = sc.nextDouble();
                if (money > account.getQuotaMoney()) {
                    System.out.println("��ת���Ľ��������޶�");
                    return;
                }
                if (money > account.getMoney()) {
                    System.out.println("��ת���Ľ������");
                    return;
                }
                //���Լ����˻�ת��
                account.setMoney(account.getMoney() - money);
                //ת��
                acc.setMoney(acc.getMoney() + money);
                System.out.println("��ת��ɹ�,���ĵ�ǰ���Ϊ" + account.getMoney());
            } else {
                System.out.println("�Բ���,�������ת�˻����ƴ���");
            }
        } else {
            System.out.println("������Ŀ��Ų�����");
        }
    }


    /**
     * ȡǮ�ķ���
     *
     * @param account �˻���Ϣ
     */
    private static void withDrawCash(Account account) {
        System.out.println("��������Ҫȡ���Ľ��");
        Scanner sc = new Scanner(System.in);
        double aDouble = sc.nextDouble();
        if (aDouble > account.getMoney()) {
            System.out.println("������˼�����˺�����û��ô��Ǯ,Ŭ��׬Ǯ��ɧ��,�������Ϊ" + account.getMoney());
            return;
        }
        if (aDouble > account.getQuotaMoney()) {
            System.out.println("������Ľ��������õ��մ洢�Ľ��");
        } else {
            account.setMoney(account.getMoney() - aDouble);
            System.out.println("ȡ���ɹ�,�������Ϊ" + account.getMoney() + "Ԫ");
        }
    }

    /**
     * ���
     *
     * @param account �˻���Ϣ
     */
    private static void deposit(Account account) {
        System.out.println("��������Ҫ���Ľ���");
        Scanner sc = new Scanner(System.in);
        double aDouble = sc.nextDouble();
        if (aDouble > account.getQuotaMoney()) {
            System.out.println("������Ľ��������õ��մ洢�Ľ��");
        } else {
            account.setMoney(account.getMoney() + aDouble);
            System.out.println("����ɹ�,�������Ϊ" + account.getMoney() + "Ԫ");
        }
    }

    /**
     * ��ѯ�û�
     *
     * @param account ��ǽ��¼�û����˺�
     */
    private static void QueryAccount(Account account) {
        System.out.println("�û���Ϣչʾ");
        System.out.println("�û���" + account.getUserName());
        System.out.println("����" + account.getCardId());
        System.out.println("���" + account.getMoney());
        System.out.println("�����޶����׶�" + account.getQuotaMoney());
    }


    /**
     * �������8λ����
     *
     * @return �����������
     */
    public static String getRandomCardId(ArrayList<Account> accounts) {
        Random random = new Random();
        while (true) {
            String cardId = "";
            for (int i = 0; i < 9; i++) {
                cardId += random.nextInt(10);
            }
            // �ж��Ƿ��ظ�
            Account acc = getAccountByCardId(accounts, cardId);
            if (acc == null) {
                //idû���ظ�
                return cardId;
            }
        }
    }


    /**
     * �жϿ���id�Ƿ��ظ�
     *
     * @param accounts �����˺ŵļ���
     * @param cardId   ����id
     * @return ����null ��˵��û���ظ�
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
