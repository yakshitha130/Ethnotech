import java.util.*;

public class StudentQueue {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("Ravi");
        q.add("Sita");
        q.add("Ravi");
        q.add("Kiran");
        Queue<String> unique = new LinkedList<>();
        for (String student : q) {
            if (!unique.contains(student)) {
                unique.add(student);
            }
        }
        System.out.println("Students after removing duplicates:");
        System.out.println(unique);
    }
}