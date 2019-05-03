package com.cjs.bean;

//nihao

import java.util.ArrayList;
import java.util.List;

/**
 * 这是多行注释
 */
public class Custerm {
    public static final int a = 0;
    public static final int b = 0;
    public static final String str = "adsf";
    public static void main(String[] args) {


        List list = new ArrayList();
        //ifn
        if (list == null) {

        }
        //inn
        if (list != null) {

        }

        //xxx.nn
        if (list != null) {

        }
        //xxx.null
        if (list == null) {

        }
        //soutp soutm soutv sout
        System.out.println();
        System.out.println("args = [" + args + "]");
        System.out.println("Custerm.main");
        System.out.println("list = " + list);

    }
    public void set(){

        List list = new ArrayList<>();
        list.add(1);
        list.add(3);
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);

        }
        //for fori itar foreach 
        for (int i = 0; i < list.size()-1; i++) {
            System.out.println("asdf");
            
        }
        int[] a = new int[]{1,3,5,6,7,8};
        for (int i = 0; i < a.length; i++) {
            int i1 = a[i];
            
        }


    }
}