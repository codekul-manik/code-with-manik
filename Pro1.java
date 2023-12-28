package com.java.methods;


public class Pro1 {
     int addition(int a, int b){
        System.out.println(a+b);
        return a+b;
    }

    //static method -> call -> class.methodName
    //non static method -> call -> obj.methodName
    //return void -> nothing to return
    //return type is availbale -> data will be return as same as return type of method

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        //new keyword
        Pro1 obj1 = new Pro1();
         int ans = obj1.addition(50,55);
        System.out.println(ans);






    }



}
