import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int[] integers = new int[3];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;

        double[] doubles = {1.57, 7.654, 9.986};

        String[] strings = new String[]{"Йоу", "йоу", "йоооуу"};
    }

    public static void task2() {
        System.out.println("Задача 2");

        int[] integers = new int[]{1, 2, 3};
        double[] doubles = {1.57, 7.654, 9.986};
        String[] strings = new String[]{"Йоу", "йоу", "йоооуу"};

        for (int i = 0; i < integers.length; i++) {
            if (i == integers.length - 1) {
                System.out.println(integers[i]);
                break;
            }
            System.out.print(integers[i] + ", ");
        }

        for (int i = 0; i < doubles.length; i++) {
            if (i == doubles.length - 1) {
                System.out.println(doubles[i]);
                break;
            }
            System.out.print(doubles[i] + ", ");
        }

        for (int i = 0; i < strings.length; i++) {
            if (i == strings.length - 1) {
                System.out.println(strings[i]);
                break;
            }
            System.out.print(strings[i] + ", ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");

        int[] integers = new int[]{1, 2, 3};
        double[] doubles = {1.57, 7.654, 9.986};
        String[] strings = new String[]{"Йоу", "йоу", "йоооуу"};


        for (int i = integers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(integers[i]);
                break;
            }
            System.out.print(integers[i] + ", ");
        }

        for (int i = doubles.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(doubles[i]);
                break;
            }
            System.out.print(doubles[i] + ", ");
        }

        for (int i = strings.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(strings[i]);
                break;
            }
            System.out.print(strings[i] + ", ");
        }

    }

    public static void task4() {
        System.out.println("Задача 4");

        int[] integers = new int[]{1, 2, 3};

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 != 0) {
                integers[i] += 1;
            }
        }

        System.out.println(Arrays.toString(integers));
    }
}
