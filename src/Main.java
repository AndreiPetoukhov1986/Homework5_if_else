public class Main {
    public static void main(String[] args) {
        task1 ( );
        task2 ( );
        task3 ( );
        task4 ( );
        task5 ( );
        task6 ( );
        task7 ( );
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int age = 17;
        if (age>=18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int temperatyre = 10;
        if (temperatyre>=5) {
            System.out.println("На улице " + temperatyre + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperatyre + " градусов, нужно надеть шапку");
        }

    }
    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 59;
        if (speed<=60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int age = 25;
        if (age>=2 && age<=6){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age>=7 && age<=18){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if  (age>18 && age<24){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if  (age>=24){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int age = 4;
        if (age<5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age<14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int totalSeat = 102;
        int seating = 60; // сидячие
        int stating = totalSeat-seating; // стоячие
        int busySeating = 5; // 60 мест сидячих в вагоне всего
        int busyStating = 4; // 42 стоячих мест в вагоне всего
        int busySeat = busySeating+busyStating;
        if (busySeat<102){
            System.out.println("Свободных мест в вагоне " + (totalSeat-busySeat) + ":");
            if (busySeating<60){
                System.out.println("сидячих мест - " + (seating-busySeating));
            }
            if (busyStating<stating){
                System.out.println("стоячих мест - " + (stating-busyStating));
            }
        } else {
            System.out.println("Вагон полный. Мест нет");
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one=15;
        int two=5;
        int three=15;
        if (one>=two && one>three){
            System.out.println("наибольшее число " + one);
        } else if (two>=three && two>one){
            System.out.println("наибольшее число " + two);
        } else if (three>=one && three>two) {
            System.out.println("наибольшее число " + three);
        } else {
            System.out.println("все числа равны");
        }
    }
}