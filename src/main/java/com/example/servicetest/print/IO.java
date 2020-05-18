package com.example.servicetest.print;

import org.springframework.stereotype.Component;

@Component
public class IO {


    public void printRec(int n){

//        int n=2;
        int i = 0;
        int j = 0;
        for (  i = 0; i <n/2; i++ ){
            for (  j =0;j < n/2-i;j++){
                System.out.print(" ");
            }
            for( ;j <=n/2+i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for ( ; i < n; i++ ){
            for (j =0;j<i-n/2;j++){
                System.out.print(" ");
            }
            for( ;j < 1.5*n-i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public  void  print(int line){
        //上三角
        //控制行
        for (int i = 1;i<=line;i++){
            //控制空格
            for (int j = 1;j<=line-i;j++){
                System.out.print(" ");
            }
            //控制*
            for (int k = 0;k<2*i - 1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        int num = 2*line -3;
        //下三角
        for (int i = num;i>=1;i-=2){
            for (int k = (num-i)/2;k>=0;k--){
                System.out.print(" ");
            }
            for (int j = i;j>=1;j--){
                System.out.print("*");
            }
            if (i!=1) {
                System.out.println();
            }
        }
    }

}
