import java.util.Scanner;
public class MatrixAdd
{
    public static void main(String args[])
    {
        int row,col,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        row=sc.nextInt();
        System.out.println("enter the number of cols");
        col=sc.nextInt();
        int mat1[][]=new int[3][3];
        int mat2[][]=new int[3][3];
        int res[][]=new int[3][3];
        System.out.println("enter the elements of matrix");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            mat1[i][j]=sc.nextInt();
            System.out.println();
        }
        System.out.println("enter the elements of matrix 2");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            mat2[i][j]=sc.nextInt();
            System.out.println();
        }
        for(i=0;i<row;i++)
        for(j=0;j<col;j++)
        res[i][j]=mat1[i][j]+mat2[i][j];
        System.out.println("sum of matrices");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            System.out.println(res[i][j]+"\t");
            System.out.println();
        }
    }
}
