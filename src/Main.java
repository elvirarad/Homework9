import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Массивы Часть 2
        //Задача 1:
        //посчитать сумму всех выплат за месяц.
        // и вывести в консоль результат в формате: «Сумма трат за месяц составила … рублей».
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int sumMonth = 0;
        for (int i : arr) {
            sumMonth += i;
        }
        System.out.println("Сумма трат за месяц составила: " + sumMonth + " рублей.");

        //Задача 2:
        //найти минимальную и максимальную трату за день.
        //вывести в консоль результат в формате: «Минимальная сумма трат за день составила … рублей.
        // Максимальная сумма трат за день составила … рублей».
        int maxSpend = 100000;
        int minSpend = 200000;
        for (int i : arr) {
            if (i > maxSpend) {
                maxSpend = i;
            }
        }
        System.out.println("Максимальная сумма трат за месяц составила: " + maxSpend + " рублей.");
        for (int j : arr) {
            if (j < minSpend) {
                minSpend = j;
            }
        }
        System.out.println("Минимальная сумма трат за месяц  составила: " + minSpend + " рублей.");
        //Задача 3:
        //какую в среднем сумму компания тратила в течение данных 30 дней.
        // вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
        //** результат может иметь остаток.
        double average;
        average = sumMonth / arr.length;
        System.out.println("Средняя сумма трат за месяц  составила: " + average + " рублей.");

        //Задача 4:
        // В бухгалтерской книге появился баг: Ф.И.О. сотрудников начали отображаться в обратную сторону.
        // Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
        //Данные с именами сотрудников хранятся в виде массива символов (char[]).
        //Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде.
        //В качестве данных для массива используйте:
        //char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        //В результате в консоль должно быть выведено "Ivanov Ivan".
        //**Важно**: не используйте дополнительные массивы для решения этой задачи.
        // Необходимо корректно пройти по массиву циклом и распечатать его элементы в правильном порядке.

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int g = reverseFullName.length - 1; g >= 0; --g){
            System.out.print(reverseFullName[g]);
        }
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}