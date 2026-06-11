import java.util.LinkedList;
 class  list{
    public static void main(String[] args)
    {
        LinkedList <String> lin = new LinkedList<>();
        lin.add("uuuuu");
        lin.add("vvv");
        lin.add("sss");
        lin.add("yyy");
        lin.add("aaa");
        System.out.println(lin);
        lin.remove(3);
        System.out.println(lin);
        System.out.println(lin.get(0));
        System.out.println(lin.getFirst());
        System.out.println(lin.getLast());
  }
}