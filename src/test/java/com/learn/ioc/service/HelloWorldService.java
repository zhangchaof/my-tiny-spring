package com.learn.ioc.service;

/**
 * @author clark
 * @Description:
 * @date 2020/4/13 10:04
 */
public class HelloWorldService {
    private String text;

    public void helloWorld() {
        System.out.println("hello HelloWorldService:" + text);
    }

    public void setText(String text) {
        this.text = text;
    }
}
