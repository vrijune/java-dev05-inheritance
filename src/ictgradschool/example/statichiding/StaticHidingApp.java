package ictgradschool.example.statichiding;


public class StaticHidingApp {
    public static void main(String[] args) {
        System.out.println("Static methods - if this is overriden by the subclass, the method is hidden");
        System.out.println("Calling Static method using ClassID.methodID");
        MyParentClass.myStaticMethod();
        MyChildClass1.myStaticMethod();
        MyChildClass2.myStaticMethod();
        System.out.println();
        System.out.println();


        System.out.println("Calling Static method on instance variables.");
        System.out.println("The reference type of the variable determines which implementation is to be called");
        System.out.println("This is very bad practice. NEVER DO THIS!!!");
        MyParentClass a = new MyParentClass();
        MyParentClass b = new MyChildClass2();
        MyChildClass2 c = new MyChildClass2();

        a.myStaticMethod();
        b.myStaticMethod();
        c.myStaticMethod();

        System.out.println();
        System.out.println();

        System.out.println("Static variables - when the subclass declase the same field name, it hides the field in the parent class");
        System.out.println("The reference type of the variable determines which value is to be called");
        System.out.println("This is very bad practice. NEVER DO THIS!!!");
        System.out.println(a.myInt + ", " + b.myInt + ", " + c.myInt);
    }
}
