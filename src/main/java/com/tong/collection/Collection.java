package com.tong.collection;

import com.tong.test.Box;
import com.tong.test.Box1;
import com.tong.test.Box2;

import java.util.ArrayList;

public class Collection {

    public static void main(String[] args) {
        ArrayList list=new ArrayList();

        Byte byt=new Byte((byte) 1);
        list.add(byt);


        Double d=new Double(5);
        list.add(d);

        Float f= new Float(5.3);
        list.add(f);

        Integer n=new Integer(123);
        list.add(n);

        Boolean b=new Boolean(true);
        list.add(b);

        Box1 box= new Box1();
        list.add(box);

        String name= (String) list.get(0);
        String jj=(String) list.get(1);

        Box1 box1 = new Box1();
        Box2 box2=new Box2();
        ArrayList<Box> boxes=new ArrayList<Box>();
        boxes.add(box1);
        boxes.add(box2);
        Box box3  = boxes.get(0);

    }


}
