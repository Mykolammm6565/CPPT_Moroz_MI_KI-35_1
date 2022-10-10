package KI35.Moroz.lab4;

/**
 * Class App
 * @version 1.0
 */


public class AppPrinter {
	/**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception
    {
        MultifunctionalDevice device = new MultifunctionalDevice();

        device.printText("Some text");

        Paper paper = device.getPaper();

        device.getRemainPaint();

        device.getCartridgePollution();

        device.addPapers(1);

        device.scan(paper);

        device.printScanned();

        device.dispose();
    }
}


