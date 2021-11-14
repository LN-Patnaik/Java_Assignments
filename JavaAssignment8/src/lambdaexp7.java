
import java.util.LinkedHashMap;
import java.util.Map;

public class lambdaexp7 {
    public static void main(String[] args) {

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(120,"Ram");
        map.put(67,"Dinesh");
        map.put(101,"Salmaan");


        StringBuilder result=new StringBuilder();

        map.forEach((k, v) -> result.append(k).append(v));
        System.out.println("Result String is :"+result);


//        for (Map.Entry<Integer, String> entry :map.entrySet()){
//            Integer key = entry.getKey();
//            String value = entry.getValue();
//            result.append(key).append(value);
//        }
//        System.out.println("Result String is :"+result);
    }
}