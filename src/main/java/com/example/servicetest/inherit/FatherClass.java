package com.example.servicetest.inherit;


import java.math.BigDecimal;
import java.math.MathContext;

public class FatherClass {

    public FatherClass() {

        System.out.println("FatherClass Create");

    }


    class  Objecs{
        void add(){

        }
    }



    public void   process(){
        BigDecimal bigDecimal = new BigDecimal(234567.13552);
        bigDecimal.setScale(2,BigDecimal.ROUND_HALF_UP);


    }
}




class ChildClass extends FatherClass {

    public ChildClass() {

        System.out.println("ChildClass Create");

    }

    public static void main(String[] args) {

        FatherClass fc = new FatherClass();

        ChildClass cc = new ChildClass();

    }

}