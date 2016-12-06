public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        System.out.println("circle: " + c.x + ", " + c.y + ", " + c.r);
        c.move(1, 3);
        System.out.println("circle: " + c.x + ", " + c.y + ", " + c.r);
        System.out.println("Длина окружности: " + c.circumference());
        System.out.println("Площадь окружности: " + c.circleArea());
        System.out.println("Диаметр окружности: " + c.diametrCircle());
        c.statusCircle();
        // Тут тоже не нужен отдельно if
        System.out.println("Окружность включает точку: " + c.isIncludePoint(-20, 11));
        c.changeR(10);
        c.statusCircle();
        Circle c2 = new Circle(7, -8, 50);
        c2.statusCircle();
    }
}