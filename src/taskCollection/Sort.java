package taskCollection;
import java.util.*;
/**7.	Использовать Алгоритмы. Не используя вспомогательных объектов,
        переставить отрицательные элементы сгенерированного списка в конец, а положительные – в начало этого списка.*/
public class Sort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-6, -56, -565, 56, -6, -2, -4, 0, 45, 2, 8, 9));
        System.out.println("\n " + list);
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}