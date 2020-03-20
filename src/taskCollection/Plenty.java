package taskCollection;
import java.util.*;

/**5.	Определить множество на основе множества целых чисел. Создать методы для определения пересечения и объединения множеств.*/
public class Plenty {

    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(0, 3, 4, 7, 9, 11, 7, 2));
        System.out.println(s1);
        Set<Integer> s2 = new HashSet<>(Arrays.asList(1, 0, 4, 0, 7, 11, 10));
        System.out.println(s2);
        System.out.println("Пересечение - " + intersect(s1, s2));
        System.out.println("Объединение - " + unification(s1, s2));
    }
    public static Set<Integer> intersect(Set<Integer> s1, Set<Integer> s2) {
        Set<Integer> set = new HashSet<>(s1);
        set.retainAll(s2);
        return set ;
    }
    public static Set<Integer> unification(Set<Integer> s1, Set<Integer> s2) {
        Set<Integer> set = new HashSet<>(s1);
        set.addAll(s2);
        return set;
    }
}
