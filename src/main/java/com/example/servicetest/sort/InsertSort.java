package com.example.servicetest.sort;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class InsertSort {

    public void InsertSort(){
        int a[] = {1,6,7,8,2,9,6,7};

        int i =0;
        int j = 0;
        for ( i =1;i<a.length;i++){
            for (j=0;j<i;j++){
                if(a[j] > a[i]){
                    int t =a[i];
                    int s = i;
                    while (s>j){
                        a[s]=a[s-1];
                        s--;
                    }
                    a[j] = t;
                    break;
                }
            }
        }

        for (i = 0 ; i< a.length ;i++){
            System.out.print(a[i]);
        }

    }


    public void beforeInsertSort(){
        int a[] = {1,6,7,8,2,9,6,7};

        int i =0;
        int j = 0;
        for ( i =1;i<a.length;i++){
            int t =a[i];
            for (j=i;j>=0;j--){
                if(j>0 && a[j-1] > t){
                    a[j]=a[j-1];
                }else{
                    a[j] =t;
                    break;
                }
            }
        }

        System.out.print(Arrays.toString(a));
    }

    public  void  selectSort(){
        int a[] = {1,6,7,8,2,9,6,7};

        int i =0;
        int j = 0;
        int min =0;
        for ( i =0;i<a.length;i++){
            min =i;
            for (j=i;j<a.length;j++){
                if (a[j] < a[min]){
                    min =  j;
                }
            }
            int temp = 0;
            if( min!=i){
                temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }

        }

        System.out.print(Arrays.toString(a));
    }
}
