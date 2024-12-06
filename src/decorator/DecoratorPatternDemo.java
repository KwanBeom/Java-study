package decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class DecoratorPatternDemo {
    public static void main(String[] args) throws FileNotFoundException {
//        Circle circle = new Circle();
//        circle.draw();
//
//        RedShapeDecorator redShapeDecorator= new RedShapeDecorator(circle);
//        redShapeDecorator.draw();
//
//        GreenShapeDecorator greenShapeDecorator = new GreenShapeDecorator(circle);
//        greenShapeDecorator.draw();

        Shape shape = new GreenShapeDecorator(new RedShapeDecorator(new Rectangle()));
        shape.draw();

        InputStream in = new DataInputStream(new FileInputStream("a.text"));
    }
}
