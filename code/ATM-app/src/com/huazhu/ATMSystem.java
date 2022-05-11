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
     * @param accounts ������֤�Ƿ��¼�ɹ�
     */
    private static void login(ArrayList<Account> accounts) {
        while (true) {
            System.out.println("========�û���¼========");
            if(accounts.size()==0){
                System.out.println("�Բ���,ϵͳ��,û�κ��˺�,����ע��,������¼~~~");
                return;
            }

            Scanner sc = new Scanner(System.in);
            System.out.println("�����������˺�");
            String carId  = sc.next();
            Account  acc  = getAccountByCardId(accounts,carId);
            if(acc!=null){
                System.out.println("��������������");
                String passWorld = sc.next();
                //��֤��¼�߼�
                Account  account =  verifyPassWorld(accounts,carId,passWorld);
                if(account==null){
                    System.out.println("���������������,�����˵�¼");
                }else{
                    System.out.println("��ϲ"+account.getUserName()+"��¼�ɹ�,���Ŀ�����"+account.getCardId());
                }
            }else{
                System.out.println("û�в鵽������Ŀ���,����������");
            }
        }

    }

    /**
     * ��֤����
     * @param accounts ������Ϣ��ŵļ���
     * @param carId ����id
     * @param passWorld ����
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
            String passWorld = sc.next();
            System.out.println("���ٴ�������������");
            String passWorldAgain = sc.next();
            if (passWorld.equals(passWorldAgain)) {
                account.setPassWorld(passWorld);
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
        System.out.println("��ϲ��" + name + "����/Ůʿ,�������ɹ�,���Ŀ�����" + cardId);
        showUserCommand(accounts,account);
    }

    private static void showUserCommand(ArrayList<Account> accounts, Account account) {
        System.out.println("==============�û�����ҳ==============");
        System.out.println("1.��ѯ�˻�");
        System.out.println("2.���");
        System.out.println("3.ȡ��");
        System.out.println("4.ת��");
        System.out.println("5.�޸�����");
        System.out.println("6.�˳�");
        System.out.println("7.ע���˻�");
        Scanner sc  = new Scanner(System.in);
        int command = sc.nextInt();
        switch (command){
            case 1:
                //��ѯ�û�
                QueryAccount(account);
                break;
            case 2:
                //���
                break;
            case 3:
                //ȡ��
                break;
            case 4:
                //ת��
                break;
            case 5:
                //�޸�����
                break;
            case 6:
                //�˳�
                break;
            case 7:
                //ע���˻�
                break;
        }
    }

    /**
     * ��ѯ�û�
     * @param account ��ǽ��¼�û����˺�
     */
    private static void QueryAccount(Account account) {
        System.out.println("�û���Ϣչʾ");
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
            Account acc =  getAccountByCardId(accounts,cardId);
            if(acc==null){
                //idû���ظ�
                return  cardId;
            }
        }
    }


    /**
     * �жϿ���id�Ƿ��ظ�
     * @param accounts �����˺ŵļ���
     * @param cardId ����id
     * @return ����null ��˵��û���ظ�
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
