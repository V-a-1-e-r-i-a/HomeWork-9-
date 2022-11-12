public class Main {
    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задача 1");
        int sum = 0;
        var arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];}
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        //Задача 2
        System.out.println("Задача 2");
        int minExpenses = arr[0];
        int maxExpenses = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxExpenses) {
                maxExpenses = arr [i];
            }
            if (minExpenses > arr[i]){
                minExpenses = arr [i];
            }
        }
        System.out.println("Максимальная сумма трат за день составляет: " + maxExpenses + " рублей.");
        System.out.println("Минимальная сумма трат за день состовляет: " + minExpenses + " рублей.");

        //Задача 3
        System.out.println("Задача 3");
        double averageExpenses = sum / 30;
        System.out.println("Средняя трата за день составила: " + averageExpenses + " рублей.");

        //Задача 4
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);}
    }
}