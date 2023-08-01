import java.util.HashSet;
import java.util.Set;

public class duplicate {

    public boolean containsDuplicate(int[] nums) 
    {
        Set<Integer> store = new HashSet<>();
        for (Integer n : nums) 
        {
            if (store.add(n) == false) 
                return true; 
        }
        return false;
        
    }
}