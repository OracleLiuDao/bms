package com.liudao.dao;

import com.liudao.ssm.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author:liudao
 * @company:null
 * @date: 2020/4/5 - 23:26
 */

public interface IProductDao {
    /**
     * 查询所有的商品信息
     * @return
     * @throws Exception
     */

    //根据id查询产品
    @Select("select * from product where id=#{id}")
    public Product findById(String id) throws Exception;
    @Select("select * from product")
     List<Product> findAll() throws Exception;
    @Insert("insert into product(productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void save(Product product) throws Exception;


}
