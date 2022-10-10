package KI35.Moroz.lab4;
interface IMultifunctionalDevice{
    void scan(Paper paper);
    void printScanned() throws Exception;
}
public class MultifunctionalDevice extends Printer implements IMultifunctionalDevice{
	private String dataStorage;
    /**
     * Constructor
     * @throws Exception
     */
    public MultifunctionalDevice() throws Exception {}
    /**
     * Method for scanning the paper
     */
    public void scan(Paper paper)
    {
        dataStorage = paper.getText();
    }
    /**
     * Method prints the data
     * @throws Exception
     */
    public void printScanned() throws Exception
    {
        super.printText(dataStorage);
    }
}



