package KI35.Moroz.lab7;
/**
 * Class App
 * @version 1.0
 */
public class App {
	/**
     * @param args
     */
    public static void main(String[] args)
    {
        Safe<? super Jewelry> safe = new Safe();

        safe.add(new Ring(30, "Gold", "Ring1", "Gucci"));
        safe.add(new Chain(250, "Gold", "Chain1", "Acer"));
        safe.add(new Chain(250, "Silver", "Chain1", "Acer"));
        safe.add(new Chain(250, "Silver", "Chain1", "Acer"));
        safe.add(new Chain(250, "Gold", "Chain1", "Acer"));
        safe.showAll();
        System.out.println(Jewelry.count);
        System.out.println(Jewelry.count1);
       
        System.out.println(safe.get(0).getName());

        System.out.println(safe.getTotalMass());

        System.out.println(safe.getLargestStore().getName());
    }
}


