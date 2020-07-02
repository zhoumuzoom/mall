package com.zhoumu.mall.demo.entity;

public class Order {
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 商品金额
     */
    private String goodsPrice;
    /**
     * 用户编号
     */
    private String userNo;
    /**
     * 用户手机
     */
    private String userMobile;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }
}
