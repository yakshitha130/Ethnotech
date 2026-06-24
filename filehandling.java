import java.io.FileReader;

public class filehandling {
    public static void main(String[] args){
       try{
           FileReader fr = new FileReader(fileName: "c:\\users\\selc")
           int c =fr.read();
           System.out.println((char) c);
           c=fr.read();
           System.out.println((char)c);

           c=fr.read();
           System.out.println(c);
           while(C!=-1){
            System.out.println((char) c);
            c=fr.read();
           }
           fr.close();3
           

       } 
    }
    
}
