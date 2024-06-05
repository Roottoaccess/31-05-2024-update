import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.lang.Thread;
public class set_theory extends Thread{
    public static void main(String[] args) {
        
        Set<String> names = new HashSet<>();


        names.add("Walter");
        names.add("Jesse");
        names.add("Skyler");
        names.add("Mike");
        names.add("Saul");

        names.add("Walter");

        // names.remove("Walter");

        System.out.println(names);

        // System.out.println(names.size());

        // System.out.println(names.contains("Walter"));

        // System.out.println(names.isEmpty());

        // try{
        //     for(String name: names){
        //         System.out.println(name);
        //         Thread.sleep(500);
        //     }
        // }catch(Exception e){
        //     System.out.println(e);
        // }

        // names.forEach(System.out::println);
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(2);
        numberList.add(1);

        System.out.println(numberList); // We ave duplicate

        HashSet<Integer> numSet = new HashSet<>();
        numSet.addAll(numberList);

        System.out.println(numSet);
    }
}
