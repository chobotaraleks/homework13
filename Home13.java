// Інтерфейс GeometricFigure
interface GeometricFigure {
    double getArea(); // метод для обчислення площі
}

// Клас Circle (Коло)
class Circle implements GeometricFigure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius; // площа кола
    }
}

// Клас Triangle (Трикутник)
class Triangle implements GeometricFigure {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height; // площа трикутника
    }
}

// Клас Square (Квадрат)
class Square implements GeometricFigure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side; // площа квадрата
    }
}

// Основний клас
public class Main {
    public static void main(String[] args) {
        // Створення масиву фігур
        GeometricFigure[] figures = new GeometricFigure[] {
            new Circle(5),
            new Triangle(4, 3),
            new Square(6)
        };

        // Виклик методу для обчислення сумарної площі
        System.out.println("Total area: " + getTotalArea(figures));
    }

    // Метод для обчислення сумарної площі
    public static double getTotalArea(GeometricFigure[] figures) {
        double totalArea = 0;
        for (GeometricFigure figure : figures) {
            totalArea += figure.getArea();
        }
        return totalArea;
    }
}
