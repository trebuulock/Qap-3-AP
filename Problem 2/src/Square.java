class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth(); // Since width and length are the same for a square
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    // No need to override getArea() and getPerimeter() since they're inherited from Rectangle

    public String toString() {
        return super.toString() + ", side=" + getWidth() + ", which is a subclass of " + super.toString();
    }
}
