package com.example.layeredarchitecture.dao;

public class Gdse {
    public static void main(String args){
        Gdse gdse=new Gdse();
        gdse.example();
    }

    public void example(int... a){
        System.out.println("example....");
        for(int i:a){
            System.out.println(i);
        }
    }
}
