package com.gjm.business.entity;

public class Orders {
    private int orderId;
    private long userId;
    private int businessId;
    private String orderDate;
    private double orderTotal;
    private int daId;
    private int orderState;

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", businessId=" + businessId +
                ", orderDate='" + orderDate + '\'' +
                ", orderTotal=" + orderTotal +
                ", daId=" + daId +
                ", orderState=" + orderState +
                '}';
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getBusinessId() {
        return businessId;
    }

    public void setBusinessId(int businessId) {
        this.businessId = businessId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public int getDaId() {
        return daId;
    }

    public void setDaId(int daId) {
        this.daId = daId;
    }

    public int getOrderState() {
        return orderState;
    }

    public void setOrderState(int orderState) {
        this.orderState = orderState;
    }

    public Orders() {
    }

    public Orders(int orderState) {
        this.orderState = orderState;
    }



    public Orders(int orderId, long userId, int businessId, String orderDate, double orderTotal, int daId, int orderState) {
        this.orderId = orderId;
        this.userId = userId;
        this.businessId = businessId;
        this.orderDate = orderDate;
        this.orderTotal = orderTotal;
        this.daId = daId;
        this.orderState = orderState;
    }
}
