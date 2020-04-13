package com.learn.ioc.service;

/**
 * @author clark
 * @Description:
 * @date 2020/4/13 10:04
 */
public class ZhangHelloServiceImpl implements HelloService {

    @Override
    public void hello() {
        System.out.println("hello ZhangHelloServiceImpl");
    }
}
