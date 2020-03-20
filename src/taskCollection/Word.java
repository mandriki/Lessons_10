package taskCollection;
import java.util.*;
/**6.	Имеется текст. Следует составить для него частотный словарь.*/
public class Word {
    public static void main(String[] args) {
        String text = "Следует составить для него частотный словарьСледует составить2. для него, частотный словарь";
        Map<String, Integer> wordsMap = new HashMap<>();
        String[] words = text.replaceAll("\\p{Punct}", "").split(" ");
        List<String> wordsList = new ArrayList<>(Arrays.asList(words));
        for (String word : words) {
            wordsMap.put(word, Collections.frequency(wordsList, word));
        }
        System.out.println("слов - " +  wordsMap);
    }
}
