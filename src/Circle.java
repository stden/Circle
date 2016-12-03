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
        this.x = x;
        this.y = y;
    }

    public void move(double dx, double dy) { // перемещение окружности
        this.x = dx;
        this.y = dy;
    }

    public double circumference() { // длина окружности
        double I = 2 * (Math.PI) * this.r;
        return I;
    }

    public double circleArea() { //площадь круга
        double S = Math.PI * (this.r * this.r);
        return S;
    }

    public double diametrCircle() { // диаметр окружности
        double D = 2 * this.r;
        return D;
    }

    public String statusCircle() { // проверка состояния
        //System.out.println("circle: " + this.x + ", " + this.y + ", " + this.r);
        return "circle: " + this.x + ", " + this.y + ", " + this.r;
    }

    //(x-x0)^2 + (y-y0)^2 <=R^2
    public boolean isIncludePoint(double xx, double yy) { // проверка, включена ли точка в круг
        double EPS = 1e-7;
        if (((Math.pow((xx - this.x), 2)) - (Math.pow((yy - this.y), 2))) - (Math.pow((this.r), 2)) <= EPS) {
            return true;
            // System.out.println("true");
        } else {
            return false;
            //System.out.println("false");
        }

    }

    public double changeR(double rr) { //увеличение радиуса в n раз
        this.r = this.r * rr;
        if (r <= 0) {
            throw new RuntimeException("Радиус должен быть положительным! ");
        }
        return this.r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.x, x) != 0) return false;
        if (Double.compare(circle.y, y) != 0) return false;
        return Double.compare(circle.r, r) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(r);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}