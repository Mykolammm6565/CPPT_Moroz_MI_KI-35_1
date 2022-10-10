package KI35.Moroz.lab4;
/**
 * Class Paper
 * @version 1.0
 */
public class Paper {
	private String text = "";
    /**
     * Method prints a text
     */
    public void printText(String input)
    {
        text = input;
    }
    /**
     * Method returns a text on paper
     */
    public String getText()
    {
        return text;
    }

}
