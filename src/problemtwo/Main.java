// WRITE A JAVA PROGRAM THAT DISPLAYS THE PRODUCT OF TWO MATRICES. THE USER
// WILL INPUT THE SIZE OF THE MATRICES AS WELL AS THE ELEMENTS. IF THE SIZES
// INPUTTED DOES NOT ALLOW MULTIPLICATION, IT WILL DISPLAY 'INVALID' OTHERWISE
// COMPUTES THE PRODUCT AND DISPLAY IT. 100pts.
package problemtwo;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int row1, col1;
        int i, j;

        System.out.println("Enter matrix 1...");

        System.out.print("Enter row: ");
        row1 = sc.nextInt();

        System.out.print("Enter col: ");
        col1 = sc.nextInt();

        int[][]num1 = new int[col1][row1];

        for (i = 0; i < col1; i++)
        {
            for (j = 0; j < row1; j++)
            {
                num1[i][j] = sc.nextInt();
            }
        }

        int row2, col2;
        System.out.println("Enter matrix 2...");

        System.out.print("Enter row: ");
        row2 = sc.nextInt();

        System.out.print("Enter col: ");
        col2 = sc.nextInt();

        int[][]num2 = new int[col2][row2];

        for (i = 0; i < col2; i++)
        {
            for (j = 0; j < row2; j++)
            {
                num2[i][j] = sc.nextInt();
            }
        }


        System.out.println("Matrix 1 elements");
        for(i = 0; i < col1; i++)
        {
            for(j = 0; j < row1; j++)
            {
                System.out.print(num1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix 2 elements");
        for(i = 0; i < col2; i++)
        {
            for(j = 0; j < row2; j++)
            {
                System.out.print(num2[i][j] + " ");
            }
            System.out.println();
        }

        // multiplying
    }
}


/*
Matrix 1 elements
1 2
1 3
4 2
Matrix 2 elements
1 3 3
4 1 2
3 4 1

 */