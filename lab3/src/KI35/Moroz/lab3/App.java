package KI35.Moroz.lab3;
import java.util.Scanner;
/**
 * Class App
 * @version 1.0
 */
public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception
    {
        Printer printer = new Printer();

        printer.printText("Some text");

        printer.getPaper();

        printer.getRemainPaint();

        printer.getCartridgePollution();

        printer.addPapers(1);
       
        Scanner in1 = new Scanner(System.in);
        System.out.print("Введіть колір 1-го картреджа: \n ");
        String color1 = in1.nextLine();
       
        Scanner in2 = new Scanner(System.in);
        System.out.print("Введіть колір 2-го картреджа: \n ");
        String color2 = in2.nextLine();
        
        Scanner in3 = new Scanner(System.in);
        System.out.print("Введіть колір 3-го картреджа: \n ");
        String color3 = in3.nextLine();
        
        Scanner in4 = new Scanner(System.in);
        System.out.print("Введіть колір 4-го картреджа: \n ");
        String color4 = in4.nextLine();
        
        Scanner in5 = new Scanner(System.in);
        System.out.print("Введіть колір 5-го картреджа: \n ");
        String color5 = in5.nextLine(); 
       
        Cartridge C1 = new Cartridge(new Color(color1));
        Cartridge C2 = new Cartridge(new Color(color2));
        Cartridge C3 = new Cartridge(new Color(color3));
        Cartridge C4 = new Cartridge(new Color(color4));
        Cartridge C5 = new Cartridge(new Color(color5));
       
       
        System.out.print(C1.getColor().color +"\n");
        System.out.print(C2.getColor().color +"\n");
        System.out.print(C3.getColor().color +"\n");
        System.out.print(C4.getColor().color +"\n");
        System.out.print(C5.getColor().color +"\n");

       // printer.dispose();
    }
}

