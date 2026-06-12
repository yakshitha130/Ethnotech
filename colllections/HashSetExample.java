import java.util.*;

class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Apple");
        set.add("Mango");

        System.out.println("HashSet: " + set);
    
Set<Integer> s=new HashSet<>();
s.add(10);
s.add(30);
s.add(20);
 System.out.println(s);

 Set<Integer> se= new TreeSet<>();
  se.add(30);
  se.add(10);
  se.add(1);
  System.out.println(se);
    }
}
