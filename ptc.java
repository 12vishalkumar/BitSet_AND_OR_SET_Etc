import java.io.*;
import java.util.*;

public class ptc
{
    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int n = sc.nextInt();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        for(int i=0;i<n;i++)
        {
            String str = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            switch(str)
            {
                case "AND":
                    if(a==1)
                        b1.and(b2);
                    else
                        b2.and(b1);
                    break;
                case "SET":
                    if(a==1)
                        b1.set(b);
                    else
                        b2.set(b);
                    break;
                case "FLIP":
                    if(a==1)
                        b1.flip(b);
                    else
                        b2.flip(b);
                    break;
                case "OR":
                    if(a==1)
                        b1.or(b2);
                    else
                        b2.or(b1);
                    break;
            }
            System.out.println(b1.cardinality()+" "+b2.cardinality());
        }  
    }
}
