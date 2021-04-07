package com.company;

import java.util.Scanner;

public class Rectangle {
    int width;
    int height;
    public Rectangle(){
    }
    public Rectangle (int width, int height){
        this.width = width;
        this.height = height;
    }
    public int getArea(){
        return this.width*this.height;
    }
    public int getPerimeter(){
        return  (this.width + this.height) * 2;
    }
    public String display(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width");
        int width = sc.nextInt();
        System.out.println("Enter height");
        int height = sc.nextInt();
        Rectangle hcn = new Rectangle(width,height);
        System.out.println("Your Recrangle");
        System.out.println(hcn.display());
        System.out.println("Area = " + hcn.getArea());
        System.out.println("Perimeter = " + hcn.getPerimeter());

    }
}
