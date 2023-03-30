package problemtwo;

import java.util.Scanner;

public class CreateMatrix
{
    private int row, col;
    CreateMatrix()
    {
        // default constructor
    }

    CreateMatrix(int row, int col)
    {
        this.row = row;
        this.col = col;
    }

    private void  create_matrix()
    {
        Scanner sc = new Scanner(System.in);
        int i, j;
        int[][]num = new int[col][row];

        for (i = 0; i < col; i++)
        {
            for (j = 0; j < row; j++)
            {
                num[i][j] = sc.nextInt();
            }
        }
    }
}
