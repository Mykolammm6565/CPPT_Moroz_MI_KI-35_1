import java.util.Scanner;
/**
 * Клас Lab2MorozKI35 реалізує виконання 20 варіанту лабораторної роботи№2
 *
 * @author Mykola
 * @version 1.0
 * @since version <b>1.0</b>
 **/
public class InverseDiamond {
    /**
     * Статичний метод main є точкою входу в програму
     *
     * @param args масив, який зберігає значення типу String
     **/
    public static void main(String[] args) {
        // Define placeholder character
        System.out.println("Enter a placeholder character: ");
        String characterToDraw = new Scanner(System.in).nextLine();
        // Define sizeOfDiamond
        System.out.println("Enter the size of the Inverse Diamond: ");
        int sizeOfDiamond = new Scanner(System.in).nextInt()/2;
        printDiamond(sizeOfDiamond, characterToDraw.charAt(0));
    }
    /**
     * Function to Print Inverse Diamond pattern
    **/
    static void printDiamond(int sizeOfDiamond, char characterToDraw) {
        System.out.println();
        int i, j;
        // for top half
        for (i = 0; i < sizeOfDiamond; i++) {
            // for left part
            for (j = i; j < sizeOfDiamond; j++)
                System.out.print(characterToDraw);
            // for middle part
            for (j = 0; j < 2 * i + 1; j++)
                System.out.print(" ");
            // for right part
            for (j = i; j < sizeOfDiamond; j++)
                System.out.print(characterToDraw);
            System.out.println();
        }
        // for below half
        for (i = 0; i < sizeOfDiamond - 1; i++) {
            // for left *
            for (j = 0; j < i + 2; j++)
                System.out.print(characterToDraw);
            // for middle " "
            for (j = 0; j < 2 * (sizeOfDiamond - 1 - i) - 1; j++)
                System.out.print(" ");
            // for right *
            for (j = 0; j < i + 2; j++)
                System.out.print(characterToDraw);
            System.out.println();
        }
    }
}
