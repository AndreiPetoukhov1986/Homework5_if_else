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
        int age = 18;
        if (age>=2 && age<=6){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age>=7 && age<=18){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age>18 && age<24){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        if (age>=24){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int age = 14;
        if (age<5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        if (age>=5 && age<14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (age>=14){
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int totalSeat = 102;
        int seating = 60;
        int statingRoom = totalSeat-seating;
        int seat = 102;
        int emptySeats = totalSeat-seat;
        int emptySeating = seating-seat;
        if (seat<102){
            System.out.println("Свободных мест в вагоне " + emptySeats);
            if (seat<60){
                System.out.println("из них сидячих мест " + emptySeating + " и стоячих мест 42");
            }
            if (seat>=60 && seat<102){
                System.out.println("сидячих мест нет, а стоячих мест свободно " + emptySeats);
            }
        } else {
            System.out.println("Вагон полный. Мест нет");
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one=1;
        int two=2;
        int three=3;
        if (one>two && one>three){
            System.out.println("наибольшее число " + one);
        }
        if (two>three && two>one){
            System.out.println("наибольшее число " + two);
        }
        if (three>two && three>one) {
            System.out.println("наибольшее число " + three);
        }
    }
}