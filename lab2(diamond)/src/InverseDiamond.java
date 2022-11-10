import java.util.Arrays;
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
        // Get placeholder character from user
        String characterToDraw = " ";
        while (characterToDraw.length() != 1 || characterToDraw.equals(" ")) {
            System.out.println("Enter a placeholder character: (except space character)");
            characterToDraw = new Scanner(System.in).nextLine();
        }

        // Get size of diamond from user
        int sizeOfDiamond = 0;
        while (sizeOfDiamond <= 0) {
            System.out.println("Enter the size of the Inverse Diamond: ");
            sizeOfDiamond = new Scanner(System.in).nextInt();
        }
        // fill array
        char[][] arr = new char[sizeOfDiamond][];
        for (int i = 0; i < sizeOfDiamond; i++) {
            if (sizeOfDiamond % 2 == 0) {
                arr[i] = new char[sizeOfDiamond - 1];
            } else
                arr[i] = new char[sizeOfDiamond];
        }
        printDiamond(arr, characterToDraw.charAt(0));
    }

    // Method to Print Inverse Diamond pattern
    static void printDiamond(char[][] charArr, char characterToDraw) {
        System.out.println();

        //top half
        for (int i = 0; i < charArr[i].length / 2; i++) {
            for (int j = 0; j < charArr[i].length; j++) {
                if ((j >= charArr[i].length / 2 - i && j <= charArr[i].length / 2 + i)) {
                    charArr[i][j] = ' ';
                    System.out.print(charArr[i][j]);
                } else {
                    charArr[i][j] = characterToDraw;
                    System.out.print(charArr[i][j]);
                }
            }
            
                System.out.print("\n");
            
        }
        //bottom half
        for (int k = charArr.length / 2 - 1, n = 0; k < charArr.length - 3; k++, n++) {
            for (int j = 0; j < charArr[k].length; j++) {
                if ((j >= 2 + n) && (j <= charArr[k].length - 3 - n)) {
                    charArr[k][j] = ' ';
                    System.out.print(charArr[k][j]);
                } else {
                    charArr[k][j] = characterToDraw;
                    System.out.print(charArr[k][j]);
                }
            }
            System.out.println();
        }
    }
}



