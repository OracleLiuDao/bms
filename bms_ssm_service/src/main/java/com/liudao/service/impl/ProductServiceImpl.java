package com.liudao.service.impl;

import com.liudao.dao.IProductDao;
import com.liudao.service.IProductService;
import com.liudao.ssm.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author:liudao
 * @company:null
 * @date: 2020/4/5 - 23:33
 */
@Service
@Transactional
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductDao productDao;
    @Override
    public List<Product> findAll() throws Exception {
        return productDao.findAll();
    }

    @Override
    public void save(Product product) throws Exception {
        productDao.save(product);
    }
}
