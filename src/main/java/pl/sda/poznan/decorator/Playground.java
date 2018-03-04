package pl.sda.poznan.decorator;

import pl.sda.poznan.decorator.shapedecorator.Circle;
import pl.sda.poznan.decorator.shapedecorator.ColoredCircle;
import pl.sda.poznan.decorator.shapedecorator.Shape;
import pl.sda.poznan.decorator.shapedecorator.TransparentCircle;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;


public class Playground {
    public static void main(String[] args) throws IOException {

       /* FileReader fileReader = new FileReader("plik.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        bufferedReader.readLine();*/

        Circle circle = new Circle(4);
        System.out.println(circle.info());

        ColoredCircle coloredCircle = new ColoredCircle("red", circle);
        System.out.println(coloredCircle.info());

        //Obiekt kolo ktory ma kolor
        ColoredCircle cc = new ColoredCircle("green", new Circle(10));

        //kolo ktore ma przezroczystosc
        TransparentCircle transparentCircle = new TransparentCircle(60, new Circle(14));

        //kolo ktore ma kolor i przezroczystosc
        Shape mostDecorateShape = new TransparentCircle(80, new ColoredCircle("red",new Circle(20)));
        System.out.println(mostDecorateShape.info());
    }
}
