import com.kuznetsov.chapter1.ex1.PrintIntInAnotherNumeralSystem;
import com.kuznetsov.chapter1.ex13.LotteryTicket;
import com.kuznetsov.chapter1.ex2.AngleNormalize;
import com.kuznetsov.chapter1.ex3.PrintMaxOfThree;
import com.kuznetsov.chapter1.ex4.DoubleRange;
import com.kuznetsov.chapter1.ex6.Factorial;
import com.kuznetsov.chapter2.ex5.Point;
import com.kuznetsov.chapter2.ex9.Car;
import com.kuznetsov.chapter3.ex1.Employee;
import com.kuznetsov.chapter3.ex1.Measurable;
import com.kuznetsov.chapter3.ex2.EmployeeWithLargestSalary;
import com.kuznetsov.chapter4.ex4.Circle;
import com.kuznetsov.chapter4.ex4.Line;
import com.kuznetsov.chapter4.ex4.Rectangle;

public class Main {
    public static void main(String[] args) {
        // Chapter 1, ex.1
        System.out.println("Chapter 1, ex.1");
        PrintIntInAnotherNumeralSystem.printBinary(100);
        PrintIntInAnotherNumeralSystem.printOctal(9);
        PrintIntInAnotherNumeralSystem.printHex(15);

        // Chapter 1, ex.2
        System.out.println("Chapter 1, ex.2");
        System.out.println(AngleNormalize.normalize(361));
        System.out.println(AngleNormalize.normalizeFloorMod(-361));

        // Chapter 1, ex.3
        System.out.println("Chapter 1, ex.3");
        PrintMaxOfThree.print(1, -1, 5);
        PrintMaxOfThree.printUsingMath(1, -5, -20);

        // Chapter 1, ex.4
        System.out.println("Chapter 1, ex.4");
        System.out.println(DoubleRange.MAX);
        System.out.println(DoubleRange.MIN);

        // Chapter 1, ex.6
        System.out.println("Chapter 1, ex.6");
        System.out.println(Factorial.fn(1000));

        // Chapter 1, ex.13
        System.out.println("Chapter 1, ex.13");
        LotteryTicket ticket = new LotteryTicket();
        ticket.buyTicket();
        ticket.print();

        // Chapter 2, ex.5
        System.out.println("Chapter 2, ex.5");
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p.toString());

        // Chapter 2 - ex.9
        System.out.println("Chapter 2, ex.9");
        Car car = new Car(30, 15);
        car.reFuel(10);
        car.drive(100);
        System.out.println(car.getFuelLevel());
        car.drive(350);

        // Chapter 3 - ex 1
        System.out.println("Chapter 3, ex.1");
        Measurable[] employees = new Measurable[4];
        employees[0] = new Employee(1001, "Egor", "Egorov", 15000);
        employees[1] = new Employee(1002, "Ivan", "Ivanov", 12000);
        employees[2] = new Employee(1003, "Petr", "Petrov", 18000);
        employees[3] = new Employee(1004, "Sergey", "Sergeev", 25000);
        System.out.println(Employee.average(employees));

        // Chapter 3 - ex 2
        System.out.println("Chapter 3, ex.2");
        Measurable richestEmployee = EmployeeWithLargestSalary.largest(employees);
        System.out.println(((Employee)richestEmployee).getFirstName() + " " + ((Employee)richestEmployee).getLastName());

        //4. Chapter 4 - ex 4
        System.out.println("Chapter 4, ex.4");
        Point center;
        Point circleCenter = new Point(2, 3);
        Circle circle = new Circle(circleCenter, 5);
        center = circle.getCenter();
        System.out.println(center.toString());

        Point topLeft = new Point(5, 1);
        Rectangle rectangle = new Rectangle(topLeft, 10, 6);
        center = rectangle.getCenter();
        System.out.println(center.toString());

        Point from = new Point(1, 1);
        Point to = new Point(3, 6);
        Line line = new Line(from, to);
        center = line.getCenter();
        System.out.println(center.toString());

        //4. Chapter 4 - ex 5
        System.out.println("Chapter 5, ex.5");
        Circle circleClone = circle.clone();
        circleClone.moveBy(1, 1);
        System.out.println(circle.getCenter().toString());
        System.out.println(circleClone.getCenter().toString());

        Rectangle rectangleClone = rectangle.clone();
        rectangleClone.moveBy(-10, -15);
        System.out.println(rectangle.getCenter().toString());
        System.out.println(rectangleClone.getCenter().toString());

        Line lineClone = line.clone();
        lineClone.moveBy(5, 5);
        System.out.println(line.getCenter().toString());
        System.out.println(lineClone.getCenter().toString());

    }
}
