public class Main {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        System.out.println(point.toString());
        point.setXY(4, 5);

        System.out.println(point.getX());
        System.out.println(point.getY());
        System.out.println(point.toString());

        point.setX(9);
        point.setY(10);
        System.out.println(point.toString());
        MovablePoint movablePoint = new MovablePoint(5, 7, 10, 12);
        System.out.println(movablePoint.toString());
        movablePoint.move();
        System.out.println(movablePoint.toString());
    }
}
