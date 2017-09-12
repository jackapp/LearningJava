import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Created by ankur on 26/8/17.
 */
public class PayU {


    public static void main(String[] args) {


        Scanner in  = new Scanner(System.in);

            int n = in.nextInt();

            String curr1[] = new String[n];
            String curr2[] = new String [n];
            float rate[] = new float[n];


            for (int i=0;i<n;i++) {

                curr1[i] = in.next();
                curr2[i] = in.next();
                rate[i] = in.nextFloat();

            }

            String req1 = in.next();
            String req2 = in.next();

            int flag=0;
            int i=0;
            while (!curr1[i].equals(req1) && i<n) {

                i++;

            }
            float reqVal = 1;
            if (!curr1[i].equals(req1)) {
                System.out.println("0");
            } else {

                int index;

                while (flag==0 && i <n) {
                    if (!curr2[i].equals(req2)) {

                        index = findIndex(curr2[i], curr1);
                        reqVal *= rate[i];
                        i = index;

                    } else {
                        flag=1;
                        reqVal *= rate[i];
                    }

                }


                float f = reqVal;
                BigDecimal fd = new BigDecimal(f);
                BigDecimal cutted = fd.setScale(3, RoundingMode.DOWN);
                f = cutted.floatValue();


                System.out.println(f);
            }





    }

    static int findIndex(String s, String []data) {
        int x=-1;
        for (int i=0;i<data.length;i++) {

            if (s.equals(data[i])) {
                x=i;
                break;
            }
        }

        return x;

    }
}
