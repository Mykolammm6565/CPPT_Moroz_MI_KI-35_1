package KI35.Moroz.lab7;
import java.util.ArrayList;
/**
 * Class Safe
 * @version 1.0
 */
public class Safe<T extends Jewelry>  {
    private ArrayList<T> storage = new ArrayList();
    /**
     * Method returns an item by the index
     * @param index Element index
     * @throws Exception
     */
    public T get(int index)
    {
        try{
            return storage.get(index);
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    /**
     * Method adds an item
     * @param item Item to be added
     */
    public void add(T item)
    {
        try {
            storage.add(item);
        }
        catch (Exception e)
        {
            throw e;
        }
    }
    /**
     * Method shows safe content
     */
    public void showAll()
    {
        for(int i = 0; i < storage.size(); i++)
        {
            try{
                storage.get(i).printData();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
    /**
     * Method returns total content mass
     */
    public int getTotalMass()
    {
        int result = 0;
        for(int i = 0; i < storage.size(); i++)
        {
            result += storage.get(i).getWeight();
        }
        return result;
    }
    /**
     * Method returns the heaviest item
     */
    public T getLargestStore()
    {
        int largestIdx = 0;

        for(int i = 0; i < storage.size(); i++)
        {
            if(i == 0)
            {
                continue;
            }
            if(storage.get(i).getWeight() > storage.get(largestIdx).getWeight())
            {
                largestIdx = i;
            }
        }
        return storage.get(largestIdx);
    }
}


