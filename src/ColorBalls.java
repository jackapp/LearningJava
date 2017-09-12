import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by ankur on 6/8/17.
 */
public class ColorBalls {


    public static void main(String[] args) {

        Scanner in =  new Scanner(System.in);

        int t = in.nextInt();

        while (t-- >0) {

            int n = in.nextInt();

            HashMap<Integer,Integer> map = new HashMap<>();

            for (int i=0;i<n;i++) {
                int temp = in.nextInt();
                if (map.containsKey(temp)) {

                    map.put(temp,map.get(temp) + 1);

                } else {

                    map.put(temp,1);

                }

            }

            boolean flag=true;
            int key=n;
            while (flag && key!=0) {

                if (!map.containsKey(key)) {

                    flag=false;

                } else {

                    key = key - map.get(key);

                }


            }


            if (!flag) {

                System.out.println("NO");
            } else {

                System.out.println("YES");
            }

        }


    }
}
