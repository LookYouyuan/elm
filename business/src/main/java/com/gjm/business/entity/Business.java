package com.gjm.business.entity;


public class Business {
    private int businessId;
    private String businessName,password;
    private double starPrice;
    private double deliveryPrice;
    private String newpw;

    @Override
    public String toString() {
        return "Business{" +
                "businessId=" + businessId +
                ", businessName='" + businessName + '\'' +
                ", password='" + password + '\'' +
                ", starPrice=" + starPrice +
                ", deliveryPrice=" + deliveryPrice +
                ", newpw='" + newpw + '\'' +
                '}';
    }

    public double getStarPrice() {
        return starPrice;
    }

    public void setStarPrice(double starPrice) {
        this.starPrice = starPrice;
    }

    public void setBusinessId(int businessId) {
        this.businessId = businessId;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNewpw(String newpw) {
        this.newpw = newpw;
    }

    public int getBusinessId() {
        return businessId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public String getPassword() {
        return password;
    }

    public String getNewpw() {
        return newpw;
    }

    public double getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public Business(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public Business(int businessId, double deliveryPrice) {
        this.businessId = businessId;
        this.deliveryPrice = deliveryPrice;
    }

    public Business(int businessId, String businessName, String password) {
        this.businessId = businessId;
        this.businessName = businessName;
        this.password = password;
    }

    public Business() {
    }

    public Business(String businessName, String password, String newpw) {
        this.businessName = businessName;
        this.password = password;
        this.newpw = newpw;
    }

    public Business(int businessId, String businessName, String password, String newpw) {
        this.businessId = businessId;
        this.businessName = businessName;
        this.password = password;
        this.newpw = newpw;
    }

    public Business(String businessName, String password) {
        this.businessName = businessName;
        this.password = password;
    }
}
