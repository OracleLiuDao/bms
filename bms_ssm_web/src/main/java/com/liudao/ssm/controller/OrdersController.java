package com.liudao.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.liudao.service.IOrdersService;
import com.liudao.ssm.domain.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author:liudao
 * @company:null
 * @date: 2020/4/8 - 9:51
 */
@Controller
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private IOrdersService ordersService;

/* 未分页
   @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv=new ModelAndView();
        List<Orders> ordersList = ordersService.findAll();
        mv.addObject("ordersList",ordersList);
        mv.setViewName("orders-list");
        return mv;
    }*/

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name = "page", required = true, defaultValue = "1") int page, @RequestParam(name = "size", required = true, defaultValue = "4") int size) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Orders> ordersList = ordersService.findAll(page, size);
        //PageInfo就是一个分页Bean
        PageInfo pageInfo=new PageInfo(ordersList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("orders-page-list");
        return mv;
    }

    @RequestMapping("/findById.do")
    public ModelAndView findById(String id) throws Exception {
        Orders orders = ordersService.findById(id);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("orders-show");
        mv.addObject("orders", orders);
        return mv;
    }

}
