package com.zhoumu.mall.demo.service.impl;

import com.zhoumu.mall.demo.dao.OrderDao;
import com.zhoumu.mall.demo.entity.Order;
import com.zhoumu.mall.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public int insert(Order order) {
        return orderDao.insert(order);
    }

    @Override
    public List<Order> selectList(String userMobile) {
        return orderDao.selectList(userMobile);
    }
}
