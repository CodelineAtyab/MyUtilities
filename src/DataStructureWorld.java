import java.util.HashMap;
import java.util.Map;

/**
 * 
 */

/**
 * @author SyedAtyabHussain
 *
 */
public class DataStructureWorld {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Map<String, String> data = new HashMap<String, String>();
        data.put("id", "153032");
        data.put("age", "26");
        data.put("name", "Something");
        
        for(String key: data.keySet()) {
            System.out.println(key);
            System.out.println(data.get(key));
            System.out.println("");
        }
        
        int[] array = {1, 2, 3, 4, 5};
        
        for(int element: array) {
            System.out.println(element);
        }
        
        String sentence = "You have to find vowels and also their number of occurences";
        
        for(int index=0; index<sentence.length();index++) {
            System.out.println(sentence.charAt(index));
        }

    }

}
