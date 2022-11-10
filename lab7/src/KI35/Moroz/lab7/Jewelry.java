package KI35.Moroz.lab7;
/**
 * Class Jewelry
 * @version 1.0
 */
public class Jewelry {
	private int weight;
    private String material;
    private String name;
    private String brand;
    public static int count = 0;
    public static int count1 = 0;

    /**
     * Constructor
     * @param weight
     * @param material
     * @param name
     * @param brand
     */
    public Jewelry(int weight, String material, String name, String brand)
    {
        this.name = name;
        this.material = material;
        this.brand = brand;
        this.weight = weight;
        if (this.material=="Gold") {count++;}
    if (this.material=="Silver") {count1++;}}
    
    /**
     * Method prints data
     */
    public void printData()
    {
        System.out.println("Name: " + name);
        System.out.println("Material: " + material);
        System.out.println("Brand: " + brand);
        System.out.println("Weight: " + weight);
    }
    /**
     * Method returns weight
     */
    public int getWeight() {return weight;}
    /**
     * Method returns name
     */
    public String getName() { return name; }
    /**
     * Method returns brand
     */
    public String getBrand() {return brand; }
    /**
     * Method returns material
     */
    public String getMaterial() {return material;}
}


