package com.liudao.service;

import com.liudao.ssm.domain.Orders;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author:liudao
 * @company:null
 * @date: 2020/4/8 - 9:53
 */
public interface IOrdersService {
    public List<Orders> findAll(int page,int size) throws Exception;
    Orders findById(String id) throws Exception;
}
