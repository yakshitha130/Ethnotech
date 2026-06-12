package colllections;
import java.util.*;
public class FestR {
    public static void main(String[] args) {

        LinkedList<String> students = new LinkedList<>();
        String[] f = { "Ravi", "Anu", "sushu", "Kiran", "madhu",
        "sushu", "Sneha", "yakshi", "chukka", "Pooja"};
        for (String s : f) {
            students.offer(s);
        }
        String[] s = {
            "Vijay", "Meena", "Arjun", "Kavya", "Rani"
        };

        for (String s1 : s) {
            if (!students.contains(s1)) {
                students.offer(s1);
            }
        }

        System.out.println("All Registered Students:");
        for (String s1 : students) {
            System.out.println(s1);
        }
        for (String s1 : s) {
            students.remove(s1);
        }

        System.out.println("\nAfter Unregistration:");
        for (String s1 : students) {
            System.out.println(s1);
        }

        System.out.println("\nTotal Registered Students = " + students.size());
    }
}
