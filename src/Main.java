public class Main {
    public static void main(String[] args) {
        //Задача1
        int year = 2020;
        checkYear(year);
        //Задача2
        int clienTOS = 0;
        int yearOfLssue = 2013;
        checkOS(clienTOS, yearOfLssue);
        //Задача3
        int deliveryDistance = 95;
        calculateTheTiming(deliveryDistance);

    }

    public static void checkYear(int year) {
        System.out.println("Задача 1");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void checkOS(int clienTOS, int yearOfLssue) {
        System.out.println("Задача 2");
        if (clienTOS == 0 && yearOfLssue < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clienTOS == 0 && yearOfLssue >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clienTOS == 1 && yearOfLssue < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clienTOS == 1 && yearOfLssue >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int calculateTheTiming(int deliveryDistance) {
        System.out.println("Задача 3");
        int deliveryTime = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
            return 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + deliveryTime * 2);
            return 2;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + deliveryTime * 3);
            return 3;
        } else {
            System.out.println("Доставки нет.");
            return -1;
        }
    }
}