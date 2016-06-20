package com.tiny3;

import classfile.Aron;
import java.util.ArrayList;
import java.util.List;

public class HelloWorld{
    public static void main(String[] args) {
        for(String s: args){
            System.out.println("s:=" + s);
        }

        System.out.println("HelloWorld");
        for(int i=0; i<3; i++){
            System.out.println("HelloWorld");
        } 

        List<String> list = new ArrayList<String>();
        list.add("ant");
        list.add("maven");
        list.add("gradle");
        Aron.printList(list);
    }
}

