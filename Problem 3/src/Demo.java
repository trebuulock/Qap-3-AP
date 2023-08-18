public class Demo {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(3.0f, 4.0f, 1.5f, 2.5f);
        System.out.println("Initial point: " + point);

        point.move();
        System.out.println("After moving: " + point);

        point.move();
        System.out.println("After moving again: " + point);
    }
}
