package com.example.servicetest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

import java.math.BigDecimal;

public class ComputeBigDecimal {

    public static void round_half_up() {
        System.out.println("四舍五入(保留位后一位是5进位) = " + new BigDecimal("2.35").setScale(1, BigDecimal.ROUND_HALF_UP)); //常用
        System.out.println("四舍五入(保留位后一位是5舍弃) = " + new BigDecimal("2.35").setScale(1, BigDecimal.ROUND_HALF_DOWN));
        System.out.println("四舍五入(保留位是奇数) = " + new BigDecimal("4.55").setScale(1, BigDecimal.ROUND_HALF_EVEN)); //向最接近数字方向舍入的舍入模式，如果与两个相邻数字的距离相等，则向相邻的偶数舍入。
        System.out.println("四舍五入(保留位是偶数) = " + new BigDecimal("4.45").setScale(1, BigDecimal.ROUND_HALF_EVEN)); //向最接近数字方向舍入的舍入模式，如果与两个相邻数字的距离相等，则向相邻的偶数舍入。
        System.out.println("            进位    = " + new BigDecimal("2.31").setScale(1, BigDecimal.ROUND_UP));
    }
}


class  TestBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware {

    @Override
    public void afterPropertiesSet() throws Exception {
        /*
        * InitializingBean  方法
        * */

    }


    /*
    * DisposableBean  接口方法
    * */
    @Override
    public void destroy() throws Exception {

    }

    /*
    *   BeanNameAware
    * */
    @Override
    public void setBeanName(String s) {

    }

    /*
    *       BeanFactoryAware方法
    * */
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }
}



class  FactoryInterface  implements  InstantiationAwareBeanPostProcessor {

    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

    }


}


class   CLass{
    public static void main(String[] args) {
        int i = 0;
        i = i++;
        System.out.println(i);
    }
}