package com.liudao.service;

import com.liudao.ssm.domain.Product;

import java.util.List;

/**
 * @author:liudao
 * @company:null
 * @date: 2020/4/5 - 23:31
 */
public interface IProductService {
    /**
     * 查询所有商品
     * @return
     * @throws Exception
     */
    List<Product> findAll() throws Exception;
    //添加商品
    public void save(Product product) throws Exception;
}
