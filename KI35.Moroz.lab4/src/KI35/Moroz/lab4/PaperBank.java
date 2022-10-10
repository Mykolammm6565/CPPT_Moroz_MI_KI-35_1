package KI35.Moroz.lab4;
/**
 * Class PaperBank
 * @version 1.0
 */
public class PaperBank {
	int papers;
    int MAX_COUNT = 100;

    /**
     * Constructor
     */
    public PaperBank()
    {
        this.papers = MAX_COUNT;
    }
    /**
     * Method puts a paper to the bank
     * @throws Exception
     */
    public void putPapers(int count) throws Exception
    {
        if(count > MAX_COUNT)
        {
            throw new Exception("Too many papers!");
        }

        this.papers = count;
    }
    /**
     * Method returns a last paper
     * @throws Exception
     */
    public Paper getPaper() throws Exception
    {
        if(papers == 0)
        {
            throw new Exception("No paper!");
        }

        papers -= 1;

        return new Paper();
    }

}


