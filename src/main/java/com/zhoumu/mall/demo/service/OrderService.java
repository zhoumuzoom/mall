package com.zhoumu.mall.demo.service;

import com.zhoumu.mall.demo.entity.Order;

import java.util.List;

public interface OrderService {
    int insert(Order order);

    List<Order> selectList(String userMobile);
}
