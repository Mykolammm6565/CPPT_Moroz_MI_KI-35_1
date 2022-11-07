package KI35.Moroz.lab6;
import java.io.*;
import java.util.Scanner;

/**
 * Class App
 * @version 1.0
 */
public class App {
	 /**
     * @param args
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
    	String name="Qwerty tyu jfdjondnvnos";
    	String res="";
    	RandomAccessFile raf = new RandomAccessFile("file.txt", "rw");
    	raf.write(name.getBytes());
    	raf.seek(0);
    	int b = raf.read();
    	while(b != -1){
            res = res + (char)b;

            b = raf.read();
        }
    	System.out.println(res);
      
//        CalcWFio obj = new CalcWFio();
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter data: ");
//        double data = s.nextDouble();
//        obj.calculate(data);
//        System.out.println("Result is: " + obj.getResult());
//        obj.writeResTxt("lab6.txt");
//        obj.writeResBin("lab6.bin");
//        obj.readResBin("lab6.bin");
//        System.out.println("Result is: " + obj.getResult());
//        obj.readResTxt("lab6.txt");
//        System.out.println("Result is: " + obj.getResult());
    }
}


