package com;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

import javax.annotation.PreDestroy;
import java.util.Stack;

public class Test {

    private boolean check(String string){

        Stack<Character> stack = new Stack<Character>();
        Character current = null;
        boolean is = false;

        for( int i=0; i<string.length();i++){
            is=false;
            current = string.charAt(i);
            if(current.equals('(') || current.equals('{') || current.equals('['))
            {
                stack.push(current);
            }else {

                if(current.equals(')') && stack.peek()!=null &&  stack.peek().equals('(')){
                    stack.pop();
                    is=true;
                }
                else  if(current.equals(']') && stack.peek()!=null &&  stack.peek().equals('[')){
                    stack.pop();
                    is =true;
                }
                else  if(current.equals('}') && stack.peek()!=null &&  stack.peek().equals('{')){
                    stack.pop();
                    is=true;
                }
                else{
                    System.out.println("false");
                    return false;
                }
                if(!is){
                    return false;
                }
            }
        }
        return  true;
    }

    public static void main(String[] args) {
      Test  test = new Test();
      boolean result = test.check("{[()][()]}");
      System.out.println(result);
    }
}


class  testClass  implements BeanFactoryAware, BeanNameAware {

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    @Override
    public void setBeanName(String s) {
    }

    @PreDestroy
    public void  destroy(){

    }
}

