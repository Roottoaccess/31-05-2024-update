import java.util.HashMap;
public class map_theory {
    public static void main(String[] args) {
        System.out.println();
        /* Creating the Hashmap */
        HashMap<String, Integer> empIds = new HashMap<>();

        /* Putting values inside the hashmap */
        empIds.put("John", 12345);
        empIds.put("Carl", 54321);
        empIds.put("Jerry", 8675309);

        /* Printing the values */
        System.out.println(empIds);

        /* Fetching the value */
        System.out.println(empIds.get("Carl"));


        /* Checking that if the value is existing or not */
        System.out.println(empIds.containsKey("Jerry"));

        System.out.println(empIds.containsKey("Hcker"));

        /* Checking value contains */
        System.out.println(empIds.containsValue(8675309));

        /* Replace the value */
        empIds.replace("John", 777);
        System.out.println(empIds);

        /* Put if absence */
        empIds.putIfAbsent("Steve", 101);
        System.out.println(empIds);

        /* Remove functions */
        empIds.remove("John");
        System.out.println(empIds);
    }
}
