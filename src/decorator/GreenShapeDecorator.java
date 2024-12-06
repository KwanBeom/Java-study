package decorator;

public class GreenShapeDecorator extends ShapeDecorator {
    public GreenShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        setGreenBorder(decoratedShape);
    }

    private void setGreenBorder(Shape decoratedShape) {
        System.out.println("Border: Green");
        decoratedShape.draw();
    }
}
