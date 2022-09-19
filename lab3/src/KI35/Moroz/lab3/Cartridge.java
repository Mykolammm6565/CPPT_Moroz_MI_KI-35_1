package KI35.Moroz.lab3;
/**
 * Class Color
 * @version 1.0
 */
public class Cartridge {private Color color;
private int remainPaint = 100;
private int pollutionValue = 0;
private int MAX_POLLUTION = 100;
/**
 * Constructor
 * @param color cartridge color
 */
public Cartridge(Color color)
{
    this.color = color;
}
/**
 * Method prints text
 * @throws Exception
 */
public void print() throws Exception
{
    if(MAX_POLLUTION == pollutionValue)
    {
        throw new Exception("Cartridge is polluted!");
    }

    remainPaint -= 1;
}
/**
 * Method refuels the cartridge
 */
public void refuel()
{
    remainPaint = 100;
}
/**
 * Method return remain pain value
 */
public int getRemainPaint()
{
    return remainPaint;
}
/**
 * Method clears the cartridge
 */
public void clear()
{
    pollutionValue = 0;
}
/**
 * Method returns cartridge pollution
 */
public int getPollution()
{
    return pollutionValue;
}
}



