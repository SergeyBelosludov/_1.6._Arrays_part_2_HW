import java.util.Arrays;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = generateRandomArray();
        System.out.println(Arrays.toString(array));

        System.out.println();
        System.out.println("***** Задание 1 *****");
        System.out.println();
/*
Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
в формате: «Сумма трат за месяц составила … рублей».
- Критерии оценки
        – Вычисления выполнены корректно.
        – Результат вычислений выведен в консоль.
        – Код написан без ошибок.
        – Соблюдены все условия задания.
 */
        int amount = 0;
        for (int i : array) {
            amount += i;
        }
        System.out.println("Сумма трат за месяц составила " + amount + " рублей");

        System.out.println();
        System.out.println("***** Задание 2 *****");
        System.out.println();
/*
Следующая задача — найти минимальную и максимальную трату за день.
Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
- Критерии оценки
        – Минимальное значение найдено корректно.
        – Максимально значение найдено корректно.
        – При изменении данных массива код работает корректно и выводит верный результат.
        – Результат программы выведен в консоль согласно условию задания.
 */
        int maxAmount = -1;
        for (int j : array) {
            if (j > maxAmount) maxAmount = j;
        }
        int minAmount = maxAmount + 1;
        for (int k : array) {
            if (k < minAmount) {
                minAmount = k;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minAmount + " рублей. " +
                "Максимальная сумма трат за день составила " + maxAmount + " рублей");

        System.out.println();
        System.out.println("***** Задание 3 *****");
        System.out.println();
     /*
     А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить
на количество дней), и вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
**Важно помнить:** подсчет среднего значения может иметь остаток (то есть быть не целым, а дробным числом).
- Критерии оценки
        – Средняя сумма трат найдена корректно.
        – При изменении данных массива программа работает корректно и выдает верный результат.
        – В коде учтено, что средняя сумма трат может быть как целым, так и дробным числом.
      */
        double averageSpent = amount / (array.length);
        System.out.println("Средняя сумма трат за месяц составила " + averageSpent + " рублей");

        System.out.println();
        System.out.println("***** Задание 4 *****");
        System.out.println();
/*
Отойдем от подсчетов.
В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф.И.О. сотрудников начали отображаться в обратную
сторону. Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
Данные с именами сотрудников хранятся в виде массива символов (char[]).
Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде. В качестве данных
для массива используйте:
char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
В результате в консоль должно быть выведено "Ivanov Ivan".
**Важно**: не используйте дополнительные массивы для решения этой задачи. Необходимо корректно пройти по массиву
циклом и распечатать его элементы в правильном порядке.
- Критерии оценки
        – Для решения задачи не использовался дополнительный массив.
        – Для решения задачи использовался цикл.
        – Написанный код выводит в консоль корректные данные.
 */
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int i;
        for (i = reverseFullName.length - 1; i >= 0; --i) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();




    }
}