import java.util.ArrayList;
import java.util.List;

public class lambdaexp4 {
    public static void main(String[] args) {
        List<String> words=new ArrayList<>();
        words.add("Super-Man");
        words.add("Bat-Man");
        words.add("Spider-Man");
        

        words.removeIf(s ->(s.length())%2!=0); //checks odd length of the word

        for (String n : words) {
            System.out.println(n);
        }

    }
}