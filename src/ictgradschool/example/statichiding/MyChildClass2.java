package ictgradschool.example.statichiding;

public class MyChildClass2 extends MyParentClass {
    public int myInt = 2;


    public static void myStaticMethod(){
        System.out.println("MyChildClass2.myStaticMethod");
    }
}
