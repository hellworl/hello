package com.example.servicetest;

import com.example.servicetest.print.IO;
import com.example.servicetest.sort.InsertSort;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.UnsupportedEncodingException;

@SpringBootTest
class ServiceTestApplicationTests {

    @Autowired
    IO  io;

    @Autowired
    InsertSort  sort;

    @Test
    void contextLoads() {
        for(int i =1 ; i<20;i+=1){
            io.print(i);
        }

    }

    @Test
    public  void  listSort(){
//        sort.InsertSort();
//        sort.beforeInsertSort();
        sort.selectSort();
    }

    @Test
    public void test() throws UnsupportedEncodingException {
        float f = (float) 2.3;

        short s2=1;
        s2+=1;
        String  a ="";
        switch (a){
            case "hello":
                System.out.print(a);
                break;
        }


//        long  l =2L;
//        switch (l){
//
//        }

        /* round  */
        System.out.println("round");
        System.out.println(Math.round(2.5));
        System.out.println(Math.round(-2.5));

        /*floor*/
        System.out.println("floor");
        System.out.println(Math.floor(2.5)); ;
        System.out.println(Math.floor(-2.5));

        /*  ceil */
        System.out.println("ceil");
        System.out.println(Math.ceil(2.6));
        System.out.println(Math.ceil(-2.6));


        /*字符串编码*/
        String   string = new String("中国");
        String  code = new String(string.getBytes("UTF-8"),"UTF-16");
        code = code.trim();
        System.out.println(code);



        /*String  类型代码单元  代码UNIT*/
        System.out.println("代码单元长度"+code.length());
        System.out.println("代码单元长度"+code.charAt(1));
        System.out.println("代码point长度"+code.codePointCount(0,string.length()));
        System.out.println("代码point长度"+code.codePointAt(1));

        System.out.println(string.endsWith("国"));
        System.out.println(string.compareTo("中"));

        System.out.println(string.indexOf("国"));
        System.out.println(string.indexOf(0));

        System.out.println("last index  of");
        System.out.println(string.lastIndexOf("中"));
        System.out.println(string.lastIndexOf("中",0));
        System.out.println(string.lastIndexOf('2'));



        System.out.println("codepoint index  of");
        System.out.println(string.codePointCount(0,string.length()));
        System.out.println(string.codePointAt(1));
        System.out.println(string.codePointBefore(1));


        System.out.println("String  start with  ");
        System.out.println(string.replace('中','z'));

        System.out.println("String.copyValueof()");
        char[] p ={'a','b'};
        System.out.println(String.copyValueOf(p));
    }



    @Test
    public void stringTest(){
        String a ="hello";
        String b ="hello";

        System.out.println(a.equals(b));
    }

}
