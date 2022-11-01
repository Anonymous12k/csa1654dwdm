import java.io.*;
 
class Perfectsquare
{
static void perfectSquares(int l, int r)
{
    for (int i = l; i <= r; i++)
    {
        if (Math.sqrt(i) == (int)Math.sqrt(i))
            System.out.print(i + " ");
    }
}
 public static void main (String[] args)
{
    int l = 2, r = 24;
    perfectSquares(l, r);
}
}