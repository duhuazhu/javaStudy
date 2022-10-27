package com.tt.bean;

public class Business extends User{
    // 店铺名称
    private String shopName;

    public Business(String loginName, String userName, String password, char sex, String phone, Double money) {
        super(loginName, userName, password, sex, phone, money);
    }

    public Business() {
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //店铺地址
    private String address;

}
