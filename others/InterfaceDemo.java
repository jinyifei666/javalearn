package com.jinyifei.lessons.others;

/**
 * Created by acera on 2017/7/19.
 */
public class InterfaceDemo {

    public static void main(String [] args){
        InterfaceChild child=new InterfaceChild(10,11,22);
        child.printAge();
        child.printShenGao();
        child.printWeight();
    }

}

class InterfaceChild extends Weight implements ShenGao,Age {

    private int weight;
    private int height;
    private int age;

    public InterfaceChild(){
        super();
    }

    public InterfaceChild(int weight,int height,int age){
        super();
        this.weight=weight;
        this.age=age;
        this.height=height;
    }

    @Override
    public void printShenGao() {
        System.out.println("my height is:"+String.valueOf(height));
    }

    @Override
    public void printAge() {
        System.out.println("my age is:"+String.valueOf(age));

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    void printWeight() {
        System.out.println(weight);
    }
}

interface ShenGao{
    public void printShenGao();
}

interface Age{
    public void printAge();
}

abstract class Weight{
    public void printInfo(String msg){
        System.out.println(msg);
    }
    abstract void printWeight();
}
