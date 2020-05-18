package com.example.servicetest.staticpak;

public abstract  class Entity extends RealType implements B{

}


interface B{

    int add();
}



class  RealType{
    public RealType(){

    }
    public  void  additon(){

    };
}
class  A extends  Entity {

    @Override
    public int add() {
        return 0;
    }
}