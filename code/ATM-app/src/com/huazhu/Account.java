package com.huazhu;

public class Account {
    private String cardId;//�û�id
    private String userName;//�û���

    public Account() {
    }
    public Account(String cardId, String userName, String passWorld, double money, double quotaMoney) {
        this.cardId = cardId;
        this.userName = userName;
        this.passWorld = passWorld;
        this.money = money;
        this.quotaMoney = quotaMoney;
    }

    private String passWorld;//����
    private double money;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWorld() {
        return passWorld;
    }

    public void setPassWorld(String passWorld) {
        this.passWorld = passWorld;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getQuotaMoney() {
        return quotaMoney;
    }

    public void setQuotaMoney(double quotaMoney) {
        this.quotaMoney = quotaMoney;
    }

    private double quotaMoney;
}
