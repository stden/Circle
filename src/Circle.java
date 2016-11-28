/*
класс Circle сделан так, чтобы там были методы для следующих операций:

конструктор, который позволяет создать круг с центром в точке 0, 0 и с заданным радиусом
конструктор, который позволяет создать круг с заданными координатами и радиусом
перемещение в другие координаты
увеличение/уменьшение радиуса (на какую-то величину или в какое-то число раз)
проверка, находится ли данная точка внутри круга
считает длину окружности
считает площадь круга
считает диаметр
возвращает строковое представление состояния класса
 */
public class Circle {
    double x;
    double y;
    double r;
    public Circle(double r) { // это конструктор
        if (r <= 0) {
            throw new RuntimeException("Радиус должен быть положительным");
        }
        this.r = r;
    }
    public Circle(double r, double x, double y) { //ещё один конструктор, который позволяет создать объект с заданным центром и радиусом
        if (r <= 0) {
            throw new RuntimeException("Радиус должен быть положительным");
        }
        this.r = r;
        this.x =x;
        this.y = y;
    }
    public void move(double dx, double dy) { // перемещение окружности
        this.x = dx;
        this.y = dy;
    }
    public double dlinaOkr(double r) { // длина окружности
        double I = 2*(Math.PI)*r;
        return I;
    }
    public double ploschadKr(double r) { //площадь круга
        double S = Math.PI *(r*r);
        return S;
    }
    public double diametrOkr(double r) { // диаметр окружности
        double D = 2*r;
        return D;
    }
    public void statusCheck() { // проверка состояния
        System.out.println("circle: " + this.x + ", " + this.y + ", " + this.r);
    }
    //(x-x0)^2 + (y-y0)^2 <=R^2
    public boolean isIncludePoint(double xx, double yy){ // проверка, включена ли точка в круг
        if (((Math.pow((xx - this.x), 2)) - (Math.pow((yy - this.y), 2 ))) <= (Math.pow((this.r), 2))) {
            return true;
            // System.out.println("true");
        } else {
            return false;
            //System.out.println("false");
        }

    }
    public double changeR(double rr) { //увеличение радиуса в n раз
        this.r = this.r*rr;
        if (r <= 0) {
            throw new RuntimeException("Радиус должен быть положительным! ");
        }
        return this.r;
    }
}