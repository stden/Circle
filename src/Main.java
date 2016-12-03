public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        System.out.println("circle: " + c.x + ", " + c.y + ", " +c.r);
        c.move(1,3);
        System.out.println("circle: " + c.x + ", " + c.y + ", " +c.r);
        System.out.println(c.circumference());
        System.out.println(c.circleArea());
        System.out.println(c.diametrCircle());
        c.statusCircle();
        if (c.isIncludePoint(-20, 11)) {
            System.out.println("true");
        } else
            System.out.println("false");
        c.changeR(10);
        c.statusCircle();
        Circle c2 = new Circle(7, -8, 50);
        c2.statusCircle();

    }

}