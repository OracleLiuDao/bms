package com.liudao.dao;

import com.liudao.ssm.domain.Orders;
import com.liudao.ssm.domain.Product;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author:liudao
 * @company:null
 * @date: 2020/4/8 - 9:56
 */

public interface IOrdersDao {

    @Select("select * from orders")
    @Results({
            @Result(id=true,property = "id",column = "id"),
            @Result(property = "orderNum",column = "orderNum"),
            @Result(property = "orderTime",column = "orderTime"),
            @Result(property = "orderStatus",column = "orderStatus"),
            @Result(property = "peopleCount",column = "peopleCount"),
            @Result(property = "peopleCount",column = "peopleCount"),
            @Result(property = "payType",column = "payType"),
            @Result(property = "orderDesc",column = "orderDesc"),
            @Result(property = "product",column = "productId",javaType = Product.class,one = @One(select = "com.liudao.dao.IProductDao.findById")),
    })
    public List<Orders> findAll() throws Exception;

    @Select("select * from orders where id=#{id}")
    @Results({
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "orderNum",property = "orderNum"),
            @Result(column = "orderTime",property = "orderTime"),
            @Result(column = "orderStatus",property = "orderStatus"),
            @Result(column = "peopleCount",property = "peopleCount"),
            @Result(column = "payType",property = "payType"),
            @Result(column = "orderDesc",property = "orderDesc"),
            @Result(column = "productId",property = "product",one = @One(select =
                    "com.liudao.dao.IProductDao.findById")),
            @Result(column = "id",property = "travellers",many = @Many(select =
                    "com.liudao.dao.ITravellerDao.findByOrdersId")),
            @Result(column = "memberId",property = "member",one = @One(select =
                    "com.liudao.dao.IMemberDao.findById")),
    })
    Orders findById(String id) throws Exception;


}
