package com.tong.test;

public class Tester {
    public static void main(String[] args) {
    //    Box[] boxes = {new Box1(), new Box2(),new Box3(),new Box4(),new Box5(),new Box6()};
        Box[] boxes=new Box[5];
        boxes[0]=new Box1();
        boxes[1]=new Box2();
        boxes[2]=new Box3();
        boxes[3]=new Box4();
        boxes[4]=new Box5();
        System.out.println(boxes[0].price);

        int length = 15;
        int width = 15;
        int height = 15;
        for (Box box : boxes) {
           // Box1 box1=(Box1) box;
            if (box.validate(length, width, height)) {
                System.out.println(box.name + " it is!, " + box.price);
                break;
            }


        }
    }}