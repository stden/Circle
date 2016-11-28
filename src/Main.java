public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        System.out.println("circle: " + c.x + ", " + c.y + ", " +c.r);
        c.move(1,3);
        System.out.println("circle: " + c.x + ", " + c.y + ", " +c.r);
        System.out.println(c.dlinaOkr(c.r));
        System.out.println(c.ploschadKr(c.r));
        System.out.println(c.diametrOkr(c.r));
        c.statusCheck();
        if (c.isIncludePoint(-20, 11)) {
            System.out.println("true");
        } else
            System.out.println("false");
        c.changeR(10);
        c.statusCheck();
        Circle c2 = new Circle(7, -8, 50);
        c2.statusCheck();

    }

}