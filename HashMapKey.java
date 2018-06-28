
import java.util.HashMap;
import java.util.Map;

public class HashMapKey 
{
    public static void main(String[] args) 
    {
        HashMap<Integer, String> hm = new HashMap <>();
        hm.put(1,"Coca-Cola");
        hm.put(2,"Sprite");
        hm.put(3,"Mt. Due");
        hm.put(4,"Froti");
        hm.put(5,"7Up");
        hm.put(6,"Mazza");
        
        for(Map.Entry a:hm.entrySet())
        {
            System.out.println(a.getKey()+" "+a.getValue());  
        
        }
    }
}
