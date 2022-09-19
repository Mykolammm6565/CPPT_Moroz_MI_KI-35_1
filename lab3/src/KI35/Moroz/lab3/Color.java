package KI35.Moroz.lab3;
/**
 * Class Color
 * @version 1.0
 */
public class Color {
    String color;
    /**
     * Constructor
     * @param color cartridge color
     * @throws Exception
     */
    public Color(String color) throws Exception
    {
        if(!isValid(color))
        {
            throw new Exception("Color is invalid!");
        }

        this.color = color;
    }

    private boolean isValid(String color)
    {
        if(!color.equals("BLACK") && !color.equals("BLUE") && !color.equals("YELLOW") && !color.equals("RED"))
        {
            return false;
        }
        return true;
    }
}


