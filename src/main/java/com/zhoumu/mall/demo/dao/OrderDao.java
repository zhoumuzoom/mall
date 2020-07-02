package com.zhoumu.mall.demo.dao;

import com.zhoumu.mall.demo.entity.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDao {

    @Insert("insert into `order` (goods_name, goods_price, user_no, user_mobile) values (#{goodsName}, #{goodsPrice}, #{userNo}, #{userMobile})")
    int insert(Order order);

    @Select("select order_no, goods_name, goods_price, user_no, user_mobile from `order` where user_mobile = #{userMobile}")
    List<Order> selectList(String userMobile);
}
