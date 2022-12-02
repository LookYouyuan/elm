package com.gjm.business.entity;

public class Food {
    private int foodId;
    private String foodName;
    private String foodExplain;
    private String foodImg;
    private double foodPrice;
    private int businessId;

    @Override
    public String toString() {
        return "Food{" +
                "foodId=" + foodId +
                ", foodName='" + foodName + '\'' +
                ", foodExplain='" + foodExplain + '\'' +
                ", foodImg='" + foodImg + '\'' +
                ", foodPrice=" + foodPrice +
                ", businessId=" + businessId +
                '}';
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodExplain() {
        return foodExplain;
    }

    public void setFoodExplain(String foodExplain) {
        this.foodExplain = foodExplain;
    }

    public String getFoodImg() {
        return foodImg;
    }

    public void setFoodImg(String foodImg) {
        this.foodImg = foodImg;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public int getBusinessId() {
        return businessId;
    }

    public void setBusinessId(int businessId) {
        this.businessId = businessId;
    }

    public Food() {
    }

    public Food(int foodId, String foodName, String foodExplain, String foodImg, double foodPrice, int businessId) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodExplain = foodExplain;
        this.foodImg = foodImg;
        this.foodPrice = foodPrice;
        this.businessId = businessId;
    }

    public Food(String foodName, String foodExplain, String foodImg, double foodPrice) {
        this.foodName = foodName;
        this.foodExplain = foodExplain;
        this.foodImg = foodImg;
        this.foodPrice = foodPrice;
    }

    public Food(double foodPrice) {
        this.foodPrice = foodPrice;
    }
}
