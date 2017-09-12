import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ankur on 26/8/17.
 */


public class CountDivisors {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        List<Long> list = sieveOfEratosthenes(1000000);


        Long arr[] = new Long[list.size()];
        list.toArray(arr);
        //System.out.println(list.size() + " " + arr[list.size()-1]);


        int t= in.nextInt();

        //long max= 1000000000000L;


        while (t-- >0) {

            long l = in.nextLong();
            long r = in.nextLong();





            Long maxVal = Long.MIN_VALUE;
            long count=0;

            int leftVal = lessThanEqualOrLastBinSearch(l,arr);
            int rightVal = nextLargestBinSearch(r,arr,leftVal);



            System.out.println(rightVal-leftVal + " " + ((rightVal-leftVal)!=0?arr[rightVal-1]:"-1"));

            /*
            for (int i=0;i<arr.length;i++) {

                if (arr[i]<=r && arr[i]>=l) {
                    maxVal=arr[i];
                    count++;
                } else if (arr[i]>r) {

                    break;
                }

            }
            */

            //System.out.println(count + " " +maxVal);

            /*
            for (int i=0;i<arr.length;i++) {

                if (arr[i]<0) {
                    System.out.print( arr[i]+" ");
                }

            }

            */

        }

    }



    static int lessThanEqualOrLastBinSearch( long key, Long data[])
    {
        int min = 0;
        int max = data.length-1;
        int len = data.length;


        while( min <= max)
        {
            int mid = min + ((max - min) / 2);

        /**/ if (data[mid] < key)  min  = mid + 1;
        else if (data[mid] > key)  max  = mid - 1;
        else  return mid    ;
        }

        if( max < 0 )
            return 0;
        else
        if( min > (len-1))
            return len-1;
        else
            return (min < max)
                    ? min
                    : max + 1;
    }



    static int nextLargestBinSearch( long key, Long data[],int min)
    {
        int low  = min;

        int len = data.length;
        int high = len-1;
        while( low <= high)
        {

            int mid = low + ((high - low) / 2);

        /**/ if (data[mid] < key) low  = mid + 1;
        else if (data[mid] > key) high = mid - 1;
        else return                      mid + 1;
        }

        if( high < 0 )
            return 0;
        else
        if( low > (len-1))
            return len;
        else
            return (low < high)
                    ? low  + 1
                    : high + 1;
    }



    static List<Long> sieveOfEratosthenes(int n)
    {

        boolean prime[] = new boolean[n+1];
        for(int i=0;i<n;i++)
            prime[i] = true;

        for(int p = 2; p*p <=n; p++)
        {

            if(prime[p] == true)
            {

                for(int i = p*2; i <= n; i += p)
                    prime[i] = false;
            }
        }



        List<Long> list = new ArrayList<Long>();

        for(int i = 2; i <= n; i++)
        {
            if(prime[i] == true) {

                //System.out.println(i);
                Long val = Long.valueOf(i);
                list.add(Long.valueOf(val*i));
            }

        }

        return list;
    }




}


