
import java.util.HashMap;
import java.util.Map;

public class HashMapKey 
{
    public static void main(String[] args) 
    {
        HashMap<Integer, String> hm = new HashMap <>();
        hm.put(1,"Coca-Cola");
        hm.put(2,"Sprite");
        hm.put(1,"Mt. Due");
        hm.put(2,"Froti");
        hm.put(1,"7Up");
        hm.put(2,"Mazza");
        
        for(Map.Entry a:hm.entrySet())
        {
            System.out.println(a.getKey()+" "+a.getValue());  
        
        }
    }
}
