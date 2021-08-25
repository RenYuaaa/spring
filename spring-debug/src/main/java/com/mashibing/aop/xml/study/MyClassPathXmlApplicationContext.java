package com.mashibing.aop.xml.study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: renjiahui
 * @date: 2021-08-25 23:23
 * @description:
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

    public MyClassPathXmlApplicationContext(String... configLocations) {
        super(configLocations);
    }

    @Override
    protected void initPropertySources() {
        // 父类中该方法内容为空，留给他人自己实现
//        super.initPropertySources();

        // 扩展initPropertySources
        System.out.println("扩展initPropertySources");
        // 环境对象中设置
        getEnvironment().setRequiredProperties("username");
        getEnvironment().validateRequiredProperties();
    }
}
