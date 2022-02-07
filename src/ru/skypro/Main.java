package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Task1

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.print("\n");

        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.print("\n");

        //Task2

        int firstFriday = 7;
        while (firstFriday <= 31) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число");
            firstFriday += 7;
        }

        //Task3

        int year = 2022;
        int periodToYear = year - 200;
        int periodAfterYear = year + 100;

        for (int cometYear = 0; cometYear <= periodAfterYear; cometYear += 79) {
            if (periodToYear <= cometYear) {
                System.out.println(cometYear);
            }
        }

        System.out.println("Дополнительные задачи");
        System.out.println("Task4");

        for (int c = 1; c <= 30; c++)
            if (c % 3 == 0 && c % 5 == 0) {
                System.out.println(c + ": ping pong");
            } else if (c % 3 == 0) {
                System.out.println(c + ": ping");
            } else if (c % 5 == 0) {
                System.out.println(c + ": pong");
            } else {
                System.out.println(c + ":");
            }

        System.out.println("Task5");

        int d = 0;
        int e = 1;
        System.out.println(d);
        System.out.println(e);

        for (int j = 0; j <= 10; j++) {
            int f = d + e;
            d = e;
            e = f;
            System.out.println(f);
        }

        System.out.println("Task6");

        int age = 19;
        int salary = 58_000;
        int limit = 0;

        if (age >= 23) {
            limit = salary*3;
        } else if (age < 23) {
            limit = salary*2;
        }
        if (salary >= 80_000) {
            limit *= 1.5;
        } else if (salary >= 50_000) {
            limit *= 1.2;
        }
        System.out.println("Мы готовы выдать вам карту с лимитом: " + limit + " рублей.");

        System.out.println("Task7");

        int Age = 23;
        int Salary = 60_000;
        int WantedSum = 330_000;

        float creditSum = WantedSum + WantedSum * 0.1f;
        int loanPeriod = 12;
        float maxPay = Salary * 0.5f;

        if (Age < 23) {
            creditSum += creditSum * 0.01;
        } else if (Age < 30) {
            creditSum += creditSum * 0.005;
        }
        if (Salary > 80_000) {
            creditSum -= creditSum * 0.007;
        }
        if (creditSum/loanPeriod < maxPay) {
            System.out.println("Максимальный платеж при ЗП: " + Salary + " равен " + maxPay + " рублей. Платеж по кредиту: " + creditSum/loanPeriod + " рублей. Одобрено.");
        } else {
            System.out.println("Максимальный платеж при ЗП: " + Salary + " равен " + maxPay + " рублей. Платеж по кредиту: " + creditSum/loanPeriod + " рублей. Отказано.");
        }
    }
}
