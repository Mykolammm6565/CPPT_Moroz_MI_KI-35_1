package KI35.Moroz.lab6;
import java.io.*;
import java.util.Scanner;
/**
 * Class CalcWFio
 * @version 1.0
 */
public class CalcWFio {
	/**
     * Method for writing file
     * @param fName file name
     * @throws FileNotFoundException
     */
    public void writeResTxt(String fName) throws FileNotFoundException
    {
        PrintWriter f = new PrintWriter(fName);
        f.printf("%f ",result);
        f.close();
    }
    /**
     * Method for reading file
     * @param fName file name
     */
    public void readResTxt(String fName)
    {
        try
        {
            File f = new File (fName);
            if (f.exists())
            {
                Scanner s = new Scanner(f);
                result = s.nextDouble();
                s.close();
            }
            else
                throw new FileNotFoundException("File " + fName + "not found");
        }
        catch (FileNotFoundException ex)
        {
            System.out.print(ex.getMessage());
        }
    }
    /**
     * Method for writing binary data into file
     * @param fName file name
     * @throws IOException
     * @throws FileNotFoundException
     */
    public void writeResBin(String fName) throws FileNotFoundException, IOException
    {
        DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
        f.writeDouble(result);
        f.close();

    }
    /**
     * Method for reading binary data from file
     * @param fName file name
     * @throws IOException
     * @throws FileNotFoundException
     */
    public void readResBin(String fName) throws FileNotFoundException, IOException
    {
        DataInputStream f = new DataInputStream(new FileInputStream(fName));
        result = f.readDouble();
        f.close();
    }
    /**
     * Method calculating
     * @param x input value
     */
    public void calculate(double x)
    {
        double rad = x * Math.PI / 180.0;
        // ctg(x) = 1 / tg(x)
        result = 1 / Math.tan(rad) / (Math.sin(2 * rad) + 4 * Math.cos(rad));
    }
    /**
     * Method returns a result
     */
    public double getResult()
    {
        return result;
    }
    private double result;

}
