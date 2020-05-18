package com.example.servicetest.staticpak;

public abstract class BaseStaticType  implements  Cloneable {

        static  void add(){

        }

        abstract  void add(int a);


        public static class  B{
            static  void add(){
                System.out.println("hello world");
            }
        }


        abstract    void addition(int b);

        public void  methodGC(){
            System.gc();
        }

}


