package KI35.Moroz.lab4;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
/**
 * Class App
 * @version 1.0
 */

public abstract class Printer {
	PrintWriter fout;
    private String file = "lab4.txt";

    PaperBank paperBank = new PaperBank();
    Cartridge cartridge;
    ArrayList<Paper> output = new ArrayList<>();
    /**
     * Constructor
     * @throws Exception
     */
    public Printer() throws Exception
    {
        fout = new PrintWriter(new File(file));
        cartridge = new Cartridge(new Color("BLACK"));
    }
    /**
     * Method prints text
     * @param text input text
     * @throws Exception
     */
    public void printText(String text) throws Exception
    {
        printMessage("Printing: " + text);
        Paper paper = paperBank.getPaper();
        paper.printText(text);
        cartridge.print();
        output.add(paper);
    }
    /**
     * Method returns last paper
     * @throws Exception
     */
    public Paper getPaper() throws Exception
    {
        if(output.size() == 0)
        {
            throw new Exception("No papers in output!");
        }

        Paper paper = output.get(output.size() - 1);

        printMessage("Paper content: " + paper.getText());
        return paper;
    }
    /**
     * Method adds papers to the bank
     * @param count papers count
     * @throws Exception
     */
    public void addPapers(int count) throws Exception
    {

        printMessage("Adding " + count + " papers...");
        paperBank.putPapers(count);
    }
    /**
     * Method closes the file
     */
    public void dispose()
    {
        fout.flush();
        fout.close();
    }
    /**
     * Method changes the cartridge
     */
    public void changeCartridge(Color color)
    {
        printMessage("Changing the cartridge");
        cartridge = new Cartridge(color);
    }
    /**
     * Method refuels the cartridge
     */
    public void refuelCartridge()
    {
        printMessage("Refueling the cartridge");
        cartridge.refuel();
    }
    /**
     * Method return remain pain value
     */
    public int getRemainPaint()
    {
        printMessage("Remain paint: " + cartridge.getRemainPaint());

        return cartridge.getRemainPaint();
    }
    /**
     * Method clears the cartridge
     */
    public void clearCartridge()
    {
        printMessage("Cleaning the cartridge");
        cartridge.clear();
    }
    /**
     * Method returns cartridge pollution
     */
    public int getCartridgePollution()
    {
        printMessage("Cartridge pollution: " + cartridge.getPollution());
        return cartridge.getPollution();
    }

    private void printMessage(String message)
    {
        System.out.println(message);
        fout.println(message);
    }


}
