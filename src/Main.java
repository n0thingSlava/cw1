import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Employee[] empl = new Employee[5];
        empl[0] = new Employee("Ivanov Ivan Ivanovich1", 1, 75500f);
        empl[1] = new Employee("Ivanov Ivan Ivanovich2", 2, 83450f);
        empl[2] = new Employee("Ivanov Ivan Ivanovich3", 3, 70200f);
        empl[3] = new Employee("Ivanov Ivan Ivanovich4", 4, 90200f);
        empl[4] = new Employee("Ivanov Ivan Ivanovich5", 5, 99200f);

        for (Employee e: empl) {
            System.out.println(e);
        }
    }
}