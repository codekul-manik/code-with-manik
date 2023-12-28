package com.java.methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro2 {

    static boolean checkIsEvenOrOdd(int num){
        if(num % 2 ==0){
            return true;
        }
        return false;
    }

    void printTheNumber(int num){
        for(int i=1; i<=num; i++){
            System.out.print(" "+i);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char c ='y';
        do{
            System.out.println("Enter the number for checking even number :");
            int num1 = Integer.parseInt(br.readLine());
            //call to the method
            boolean ans = Pro2.checkIsEvenOrOdd(num1);
            if(ans){
                System.out.println("The number is even");
            }else{
                System.out.println("The number is odd");
            }


            System.out.println("Enter the number for print till that number");
            int num2 = Integer.parseInt(br.readLine());

            //create Object for calling method
            Pro2 obj1 = new Pro2();
            obj1.printTheNumber(num2);

            System.out.println();
            System.out.println("Do you want to continue ?");
            int ans1 = br.read();
            c = (char)ans1;
            br.skip(1);
        }while(c == 'y' || c == 'Y');


    }

}
