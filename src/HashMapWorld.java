import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 */

/**
 * @author SyedAtyabHussain
 *
 */
public class HashMapWorld {

    /**
     * @param args
     */
    public static void main(String[] args) {
        HashMap<String, String> developerInfo = new HashMap<String, String>();
        
        developerInfo.put("name", "Ameer");
        developerInfo.put("id", "uexx4gf9");
        developerInfo.put("age", "23");
        
        for(String currentKey: developerInfo.keySet()) {
            System.out.println(currentKey + ": " + developerInfo.get(currentKey));
        }
        
//        System.out.println(developerInfo.get("name"));
//        System.out.println(developerInfo.get("id"));
//        System.out.println(developerInfo.get("age"));
        
        
//        System.out.println(developerInfo.get("id"));
//        System.out.println(developerInfo.get("age"));
//        System.out.println(developerInfo.get("name"));
        
        String[] name = new String[] {"Noor", "Wasan", "Maryam"};
        
//        for(int index=0; index<name.length;index++) {
//            System.out.println(name[index]);
//        }
        
        ArrayList<String> listOfNameStrings = new ArrayList<String>();
        
        listOfNameStrings.add("Najla");
        listOfNameStrings.add("Malak");
        listOfNameStrings.add("Anwaar");
        
//        for(int index=0; index<listOfNameStrings.size();index++) {
//            System.out.println(listOfNameStrings.get(index));
//        }
//        for(String currentValue: listOfNameStrings) {
//            System.out.println(currentValue);
//        }
        
//        for(String currentKey: developerInfo.keySet()) {
//            
//        }
        

    }

}
