package KI35.Moroz.lab5;
/**
 * Class Equations
 * @version 1.0
 */
public class Equations {
	/**
     * Method for calculating
     * @param x input value
     * @throws CalcException
     */
    public double calculate(int x) throws CalcException
    {
        double y, rad;
        rad = x * Math.PI / 180.0;
        try
        {
            y = 1 / Math.tan(rad) / (Math.sin(2 * rad) + 4 * Math.cos(rad));
            if (y==Double.NaN || y==Double.NEGATIVE_INFINITY || y==Double.POSITIVE_INFINITY || x==90 || x== -90)
                throw new ArithmeticException();
        }
        catch (ArithmeticException ex)
        {
            if (rad==Math.PI/2.0 || rad==-Math.PI/2.0)
                throw new CalcException("Exception reason: Illegal value of X for tangent calculation");

            else if (x==0)
                throw new CalcException("Exception reason: X = 0");
            else
                throw new CalcException("Unknown reason of the exception during exception calculation");

        }
        return y;
    }

}
