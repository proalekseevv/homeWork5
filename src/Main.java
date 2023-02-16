
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static Scanner task1() {
        System.out.println("Задача 1");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите свой возвраст: ");
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            if (age >= 18) {
                System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
            } else {
                System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
            }

        }

        return scanner;
    }
    public static Scanner task2() {
        System.out.println("Задача 2");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру на улице: ");
        if (scanner.hasNextInt()) {
            int outdoorTemperature = scanner.nextInt();
            if (outdoorTemperature <=5) {
                System.out.println("На улице холодно, нужно надеть шапку");
            } else {
                System.out.println("Сегодня тепло, можно идти без шапки");
            }

        }
        return scanner;

    }


    public static Scanner task3() {
        System.out.println("Задача 3");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите скорость автомобиля: ");
        if (scanner.hasNextInt()) {
            int vehicleSpeed = scanner.nextInt();
            if (vehicleSpeed > 60) {
                System.out.println("Скорость превышена ");
            } else {
                System.out.println("Превышения скорости нет");
            }

        }
        return scanner;
    }
    public static Scanner task4() {
        System.out.println("Задача 4");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        if (scanner.hasNextInt()) {
            int ageOfThePerson = scanner.nextInt();
            if (ageOfThePerson >= 2 && ageOfThePerson <= 6) {
                System.out.println("Если возраст человека равен " + ageOfThePerson + " то ему нужно ходить в детский сад");
            }
            if (ageOfThePerson >= 7 && ageOfThePerson <= 18) {
                System.out.println("Если возраст человека равен " + ageOfThePerson + " то ему нужно ходить в школу");
            }
            if (ageOfThePerson >= 18 && ageOfThePerson <= 24) {
                System.out.println("Если возраст человека равен " + ageOfThePerson + " то ему нужно ходить в университет");
            }
            if (ageOfThePerson > 24) {
                System.out.println("Если возраст человека равен " + ageOfThePerson + " то ему нужно ходить на работу");
            }

        }
        return scanner;
    }
    public static Scanner task5(){
        System.out.println("Задача 5");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возвраст ");
        if (scanner.hasNextInt()) {
            int ageOfTheChild = scanner.nextInt();
            if (ageOfTheChild < 5) {
                System.out.println("Если возраст ребенка равен " + ageOfTheChild + " то ему нельзя кататься на аттракционе");
            }
            if (ageOfTheChild >= 5 && ageOfTheChild < 14) {
                System.out.println("Если возраст ребенка равен " + ageOfTheChild + " то можно кататься на аттракционе в сопровождении взрослого");
            }
            if (ageOfTheChild >= 14) {
                System.out.println("Если возраст ребенка равен " + ageOfTheChild + " то можно кататься на аттракционе без сопровождения взрослого");
            }

        }

        return scanner;
    }
    public static Scanner task6() {
        System.out.println("Задача 6");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер места: ");
        if (scanner.hasNextInt()) {
            int totalSeats = scanner.nextInt();
            if (totalSeats <= 60) {
                System.out.println("Есть сидячее место");
            }
            if (totalSeats > 60 && totalSeats <= 102) {
                System.out.println("Только стоячее место");
            }
            if (totalSeats > 102) {
                System.out.println("Вагон полностью забит");
            }

        }
        return scanner;
    }
    public static Scanner task7() {
        System.out.println("Задача 7");
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Введите числа");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a > b && a > c){
            System.out.println("Наибольшее число " + a);
        }
        if (b > a && b > c){
            System.out.println("Наибольшее число " + b);
        }
        if (c > b && c > a){
            System.out.println("Наибольшее число " + c);
        }


        return scanner;
    }
}

