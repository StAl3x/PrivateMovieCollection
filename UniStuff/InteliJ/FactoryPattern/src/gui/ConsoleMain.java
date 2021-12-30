package gui;

import be.Shape;
import bll.ShapeFactory;

import java.util.Scanner;

public class ConsoleMain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ShapeFactory sf = new ShapeFactory();
        Shape sh =  sf.buildShape(scn.nextLine());
        sh.draw();
    }
}
