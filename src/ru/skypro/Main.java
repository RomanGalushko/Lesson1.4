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

        for (int startYear = 0; startYear <= periodAfterYear; startYear += 79) {
            if (periodToYear <= startYear) {
                System.out.println(startYear);
            }
        }

    }
}
