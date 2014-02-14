package com.cn;

import java.util.Random;

public class Main {


    public Main() {
    }


    public static void main(String[] args) {
        System.out.println("Hello World!");
        method();





    }


    private static void method() {
        Random random = new Random();
        int i = random.nextInt();
        System.out.println(i);
    }

    public boolean getBoolean(String flag){
        if(flag.equals("TURE")){
            return true;
        }else{
            return false;
        }
    }


}