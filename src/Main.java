public class Main {
    public static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int elm = arr[i];
            sum += elm;
        }
        System.out.printf("Сумма трат за месяц составила %s рублей%n", sum);

    }

    public static void task2() {
        System.out.println("Задание 2");
        int min = 1_000_000;
        int max = -1;
        int i = 0;
        while (i < arr.length) {
            int elm = arr[i];
            if (elm < min) {
                min = elm;
            }
            if (elm > max) {
                max = elm;
            }
            i++;
        }
        System.out.printf("Максимальная сумма тарт за день составила %s рублей%n", max);
        System.out.printf("Минимальная сумма тарт за день составила %s рублей%n", min);
    }

    public static void task3() {
        System.out.println("Задание 3");
        int sum = 0;
        int average = 0;
        for (int i = 0; i < arr.length; i++) {
            int elm = arr[i];
            sum += elm;
        }
        average = sum / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %s рублей%n", average);
    }

    public static void task4() {
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}