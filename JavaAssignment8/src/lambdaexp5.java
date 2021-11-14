import java.util.ArrayList;
import java.util.List;

public class lambdaexp5 {
    public static void main(String[] args) {
List<String> Names=new ArrayList<>();
        Names.add("Ram");
        Names.add("Mohan");
        Names.add("Shyam");
        Names.add("Hari");

StringBuilder str=new StringBuilder();
Names.forEach(s ->str.append(s.charAt(0)));
        System.out.println("first character of names are:"+str);
    }
}