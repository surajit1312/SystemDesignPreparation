package LLD.Design_Patterns.Factory_Design_Pattern;

import LLD.Design_Patterns.Factory_Design_Pattern.factory.ShapeFactory;
import LLD.Design_Patterns.Factory_Design_Pattern.shape.IShape;

public class CreateShapeMain {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        IShape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        IShape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
    }
}
