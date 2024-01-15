package LLD.Design_Patterns.Factory_Design_Pattern.factory;

import LLD.Design_Patterns.Factory_Design_Pattern.shape.CircleShape;
import LLD.Design_Patterns.Factory_Design_Pattern.shape.IShape;
import LLD.Design_Patterns.Factory_Design_Pattern.shape.RectangleShape;

public class ShapeFactory {
    public IShape getShape(String type) {
        switch (type) {
            case "RECTANGLE":
                return new RectangleShape();
            case "CIRCLE":
                return new CircleShape();
            default:
                return null;
        }
    }
}
