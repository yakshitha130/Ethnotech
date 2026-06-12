import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class example{
    public static void main(String[] args) {
        Set<Integer> Rollno = new HashSet<>();
        Rollno.add(1);
        Rollno.add(2);
        Rollno.add(1); // Duplicate, will not be added

        System.out.println(Rollno); 
        HashSet<String> names = new HashSet<>();
        names.add("A");
        names.add("B");
        names.add("A"); // Duplicate, will not be added 
        System.out.println(names); 
        System.out.println(names.size());
        System.out.println(names.contains("A"));
        names.remove("A");
        LinkedList<Integer> list = new LinkedList<>();
        for(Integer i: Rollno) {
            list.add(i);
        } 
        System.out.println(list.isEmpty());
        System.out.println(list.removeFirst());
        System.out.println(list);
    }
}
