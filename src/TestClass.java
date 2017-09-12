/**
 * Created by ankur on 25/8/17.
 */
import java.io.*;
import java.util.*;
public class TestClass {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        long[] ct=new long[1000001];long[] nop=new long[1000001];
        int T = s.nextInt();
        boolean prime[] = new boolean[1000001];
        sieveOfEratosthenes(prime,1000001,ct,nop);
        for(int t_i=0; t_i<T; t_i++)
        {
            int L = s.nextInt();int R = s.nextInt();
            int c=0;long ln=0;
            int l=(int) Math.sqrt(L);
            int r=(int) Math.sqrt(R);
            long k=ct[r];

            //l++;
            //System.out.println(l+" "+ct[l]);System.out.println(" "+r+" "+ct[r]);
            long res = ct[r]-ct[l];
            if(l*l==L && l!=1)
                res++;
            long m=nop[(int) k]*nop[(int) k];
            if(res==0 || L>=R)
                System.out.println("0 -1");
            else
                System.out.println(res + " " + nop[(int) k]*nop[(int) k]);
            //System.out.println("");
        }
    }
    static void sieveOfEratosthenes(boolean prime[],int n,long ct[],long nop[])
    {
        for(int i=0;i<n;i++)
            prime[i] = true;
        int j=1;
        for(int p = 2; p*p <n; p++)
        {
            if(prime[p] == true)
            {
                for(int i = p*2; i < n; i += p)
                    prime[i] = false;
            }
        }

        for(int i = 2; i < n; i++)
        {

            if(prime[i] == true)
            {
                ct[i]=ct[i-1]+1;
                nop[j++]=i;
            }

            else
                ct[i]=ct[i-1];
        }
    }
}
