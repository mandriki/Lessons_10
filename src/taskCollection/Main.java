package taskCollection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        list();
        lestStudent();
        stacks();
    }
    /**
     * Создать список оценок учеников с помощью ListIterator,
     * заполнить случайными оценками. Удалить неудовлетворительные оценки из списка.
     */
    public static void list() {
        System.out.println("\n Без неудов");
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(11));
        }
        System.out.println(list);
        list.removeIf(i -> i < 5);
        System.out.println(list + "\n");
        /** Создать список оценок учеников с помощью ListIterator,
         * заполнить случайными оценками. Найти самую высокую оценку с использованием итератора.*/
        System.out.println("Мах оценка");
        Iterator<Integer> iterator = list.listIterator();
        int max = 0;
        int i = 0;
        while(iterator.hasNext()) {
            i = (int) iterator.next();
            if (max < i) {
                max = i;
            }
        }
        System.out.println("Оценки без неудов - " + list + " мах оценка -  " + max + "\n");
    }
    /**3. Вывести учеников из списка в обратном порядке. (2 варианта решения).*/
    public static void lestStudent() {
        List<String> list = Arrays.asList("Вася", "Петя", "Тома", "Клава", "Пиндос");
        for (int i = 0; i <= list.size() - 1; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println(" ");
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
        System.out.println(" ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
    /** 4.	Ввести с консоли число, занести его цифры в стек. Стек – самостоятельно спроектированный класс, поддерживающий 3 операции:
     •	Задать размер стека.
     •	Внести цифру в стек.
     •	Извлечь цифру из стека.
     Вывести число, у которого цифры идут в обратном порядке.
     */
    public static void stacks() {
        Scanner in = new Scanner(System.in);
        System.out.print("\n \n Введите размер стека: ");
        int size = in.nextInt();
        Stack stack = new Stack(size);
        System.out.printf("Добавьте %d элемент(а) в стек через enter :\n", size);

        for (int i = 0; i < size; i++) {
            System.out.printf(" элемент \"%d\"- ", i);
            stack.setNumer(in.nextInt());
        }
        System.out.println("Какой элемент надо - ");
        System.out.println("Элемент - " + stack.getNumer(in.nextInt()));
        System.out.println("Стек в обратном порядке -" + stack.skinwalker());
    }
}
class Stack {
    private List<Object> stack;
    public Stack(int size) {
        stack = new ArrayList<>(size);
        System.out.println("Создан стек размером " + size);
    }
    public Object getNumer(int i) { return stack.get(i);}
    public void setNumer(Object nam) {stack.add(nam);}
    public String skinwalker() {
        List<Object> list = new ArrayList<>();
        for (int i = stack.size() - 1; i >= 0; i--) {
            list.add(stack.get(i));
        }
        StringBuilder a = new StringBuilder(" ");
        for (Object o : list) {
            a.append(o.toString());
        }
       return a.toString();
    }
}


/**1.	Задание. Создать список оценок учеников с помощью ListIterator, заполнить случайными оценками. Удалить неудовлетворительные оценки из списка.
 2.	Задание. Создать список оценок учеников с помощью ListIterator, заполнить случайными оценками. Найти самую высокую оценку с использованием итератора.
 3.	Вывести учеников из списка в обратном порядке. (2 варианта решения).
 4.	Ввести с консоли число, занести его цифры в стек. Стек – самостоятельно спроектированный класс, поддерживающий 3 операции:
 •	Задать размер стека.
 •	Внести цифру в стек.
 •	Извлечь цифру из стека.
 Вывести число, у которого цифры идут в обратном порядке.
 5.	Определить множество на основе множества целых чисел. Создать методы для определения пересечения и объединения множеств.
 6.	Имеется текст. Следует составить для него частотный словарь.
 7.	Использовать Алгоритмы. Не используя вспомогательных объектов, переставить отрицательные элементы сгенерированного списка в конец, а положительные – в начало этого списка.
 */
