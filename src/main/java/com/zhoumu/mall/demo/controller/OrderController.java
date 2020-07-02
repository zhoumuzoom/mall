package com.zhoumu.mall.demo.controller;

import com.zhoumu.mall.demo.callback.CallbackBody;
import com.zhoumu.mall.demo.callback.CallbackResult;
import com.zhoumu.mall.demo.entity.Order;
import com.zhoumu.mall.demo.exception.SystemException;
import com.zhoumu.mall.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/")
    public CallbackBody<?> create(@RequestBody Order order) {
        if (null == order || order.getGoodsName() == null) {
            throw new SystemException("商品名称不可为空");
        }
        int row = orderService.insert(order);
        if (row < 0) {
            throw new SystemException("创建订单失败");
        }
        return CallbackResult.success();
    }

    @GetMapping(value = {"{userMobile}","/"})
    public CallbackBody<?> query(@PathVariable(required = false) String userMobile) {
        if (StringUtils.isEmpty(userMobile)) {
            throw new SystemException("用户手机号不可为空");
        }
        List<Order> orderList = orderService.selectList(userMobile);
        return CallbackResult.success(orderList);
    }
}
