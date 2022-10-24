package KI35.Moroz.lab4;
interface Test {
	void Test1();
}
interface IMultifunctionalDevice{
    void scan(Paper paper);
    void printScanned() throws Exception;
}
public class MultifunctionalDevice extends Printer implements IMultifunctionalDevice,Test{
	private String dataStorage;
    /**
     * Constructor
     * @throws Exception
     */
    public MultifunctionalDevice() throws Exception {}
    /**
     * Method for scanning the paper
     */
    public void Test1() {
    	System.out.println("test1");
    }
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



