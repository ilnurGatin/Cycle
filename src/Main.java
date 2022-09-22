public class Main {
    public static void main(String[] args) {
        //Задача №1
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Задача №2
        for(int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        //Task #3
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }

        //Task #4
        for(int i = 10; i > -11; i--) {
            System.out.println(i);
        }
        //Task #2.1
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
        //Task #2.2
        for (int i = 7; i <= 98; i +=7) {
            System.out.println(i);
        }
        //Task #2.3
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }

        //Task 33.1
        int salary = 29000;
        float total = 0;
        for (int i = 1; i <= 12; i++) {
            total += salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }

        //Task #3.2
        salary = 29000;
        total = 0;
        for (int i = 1; i <= 12; i++) {
            total += total/100;
            total += salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }

    }
}