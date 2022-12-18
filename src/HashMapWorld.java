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
        System.out.println("Working of a HashMap");
        
        HashMap<String, String> developerInfo = new HashMap<String, String>();
        
        developerInfo.put("name", "Mr A");
        developerInfo.put("age", "26");
        developerInfo.put("id", "10232");
        
        // String name = developerInfo.get("name");
        String[] listOfNames = {"Mr A", "Mr B", "Mr C"};
        
        for(String currentName: listOfNames) {
            System.out.println(currentName);
        }
        
        System.out.println("");
        for(int index=0; index < listOfNames.length; index++) {
            System.out.println(listOfNames[index]);
        }
        
//        for(String currentKey: developerInfo.keySet()) {
//            System.out.println(currentKey + ": " + developerInfo.get(currentKey));
//        }
//        
//        System.out.println(developerInfo.get("name"));
//        System.out.println(developerInfo.get("id"));
//        System.out.println(developerInfo.get("age"));
//        
//        
//        System.out.println(developerInfo.get("id"));
//        System.out.println(developerInfo.get("age"));
//        System.out.println(developerInfo.get("name"));
//        
//        String[] name = new String[] {"Noor", "Wasan", "Maryam"};
//        
//        for(int index=0; index<name.length;index++) {
//            System.out.println(name[index]);
//        }
//        
//        ArrayList<HashMap<String, String>> listOfNameStrings = new ArrayList<HashMap<String, String>>();
//        
//        HashMap<String, String> developerInfo = new HashMap<String, String>();
//        developerInfo.put("name", "Ameer");
//        developerInfo.put("id", "uexx4gf9");
//        developerInfo.put("age", "23");
//        
//        listOfNameStrings.add(developerInfo)
//        
//        listOfNameStrings.add("Najla");
//        listOfNameStrings.add("Malak");
//        listOfNameStrings.add("Anwaar");
//        
//        for(int index=0; index<listOfNameStrings.size();index++) {
//            System.out.println(listOfNameStrings.get(index));
//        }
//        for(String currentValue: listOfNameStrings) {
//            System.out.println(currentValue);
//        }
//        
//        for(String currentKey: developerInfo.keySet()) {
//            
//        }
//        
        

    }

}
