package com.tiny3;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector; 
import classfile.*;

// File: src/main/java/hello/com/tiny3/Simple.java

public class HelloWorld{
    public static void main(String[] args) {
        //System.out.println(System.getProperty("simple.message") + args[0] + " from Simple.");
        System.out.println("HelloWorld");
        List<String> list = new ArrayList<String>();
        Aron.printList(list);
        for(int i=0; i<10; i++){
            System.out.println("HelloWorld");
        } 
    }
}

