
import java.util.HashSet;

public class HashSetRetain 
{
    public static void main(String[] args) 
    {
        HashSet<String> H1 = new HashSet<>();
          H1.add("Coca-Cola");
          H1.add("Pepsi");
          H1.add("Sprite");
          H1.add("Mt.Due");
          H1.add("7Up");
          System.out.println("First HashSet content: "+H1);
          
          HashSet<String>H2 = new HashSet<>();
          H2.add("Frotie");
          H2.add("Mazza");
          H2.add("Sprite");
          H2.add("Minute Maid");
          H2.add("Coca-Cola");
          System.out.println("Second HashSet content: "+H2);
          H1.retainAll(H2);
          System.out.println("HashSet content:");
          System.out.println(H1);
        
    }
    
}
