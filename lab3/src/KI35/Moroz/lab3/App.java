package KI35.Moroz.lab3;
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

        printer.dispose();
    }
}

