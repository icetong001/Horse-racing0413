package com.tong.test;

public class Tester {
    public static void main(String[] args) {
        Box[] boxes = {new Box1(), new Box2(),new Box3(),new Box4(),new Box5(),new Box6()};


        int length = 15;
        int width = 15;
        int height = 15;
        for (Box box : boxes) {
            if (box.validate(length, width, height)) {
                System.out.println(box.name + " it is!, " + box.price);
                break;
            }


        }
    }}