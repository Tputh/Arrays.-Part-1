public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Дз. Массивы. Часть 1");

        System.out.println("Задача 1");
        double[] one = {1.57, 7.654, 9.986};
        int[] two = {1, 2, 3, 4, 5,};
        int[] three = {5, 8, 9};
        for (int i = 0; i < one.length; i++) {
            System.out.println(one[i]);

        }
        for (int i = 0; i < two.length; i++) {
            System.out.println(two[i]);

        }
        for (int i = 0; i < three.length; i++) {
            System.out.println(three[i]);
        }

    }

    public static void task2() {
        System.out.println("Задача 2");

        double[] one = {1.57, 7.654, 9.986};
        int[] two = {1, 2, 3, 4, 5,};
        int[] three = {5, 8, 9};
        for (int i = 0; i < one.length; i++) {
            if (i == one.length - 1) {
            }
            System.out.print("," + one[i]);
        }
        System.out.println();


        for (int i = 0; i < two.length; i++) {
            if (i == two.length - 1) {
            }
            System.out.print("," + two[i]);
        }
        System.out.println();

        for (int i = 0; i < three.length; i++) {
            if (i == three.length - 1) {
            }
            System.out.print("," + three[i]);
        }
        System.out.println();
    }


    public static void task3() {
        System.out.println("Задача 3");

        double[] one = {1.57, 7.654, 9.986};
        int[] two = {1, 2, 3, 4, 5,};
        int[] three = {5, 8, 9};
        for (int i = one.length - 1; i >= 0; i--) {
            if (i == one.length - 1) {
            }
            System.out.print("," + one[i]);
        }
        System.out.println();
        for (int i = two.length - 1; i >= 0; i--) {
            if (i == two.length - 1) {
            }
            System.out.print("," + two[i]);
        }
        System.out.println();
        for (int i = three.length - 1; i >= 0; i--) {
            if (i == three.length - 1) {
            }
            System.out.print("," + three[i]);
        }

        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");

        int[] two = {1, 2, 3, 4, 5, };
        two[4] = 6;
        for (int i = 0; i < two.length; i++) {
            if (two[i] % 2 != 0) {
                i += 1;
            }
            System.out.print("," + two[i]);


        }

    }
}