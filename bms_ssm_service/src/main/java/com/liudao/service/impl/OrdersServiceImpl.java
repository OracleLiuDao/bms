package com.liudao.service.impl;

import com.github.pagehelper.PageHelper;
import com.liudao.dao.IOrdersDao;
import com.liudao.service.IOrdersService;
import com.liudao.ssm.domain.Orders;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author:liudao
 * @company:null
 * @date: 2020/4/8 - 9:54
 */
@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService {
    @Autowired
    private IOrdersDao ordersDao;
    @Override
    public List<Orders> findAll(int page,int size) throws Exception {
         //获取第1页，3条内容，默认查询总数count
        PageHelper.startPage(page, size);
        return ordersDao.findAll();
    }

    @Override
    public Orders findById(String id) throws Exception {
        return ordersDao.findById(id);
    }
}
