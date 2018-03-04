package pl.sda.poznan.decorator.shapedecorator;

public class ColoredCircle implements Shape {
    private String color;
    private Circle circleToDecorate;

    public ColoredCircle(String color, Circle circle) {
        this.color = color;
        this.circleToDecorate = circle;
    }

    @Override
    public String info() {
        return circleToDecorate.info() + " has the color " + color;
    }
}
