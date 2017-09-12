package coding;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by ankur on 18/8/17.
 */
public class SortingMap {

    public static void main(String[] args) {
        int a[] = new int[3];
        int k=45;
        a[0]=10;a[1]=7;a[2]=7;
        HashMap<Long,Long> map = new HashMap<>();
        for (int i=0;i<a.length;i++) {
            map.put(new Long(a[i]),new Long(i+1));
        }
        Map<Long,Long> newMap = new TreeMap<>(map);
        Iterator i = newMap.entrySet().iterator();
        long count=0,val=k;
        while (i.hasNext()) {

            Map.Entry entry = (Map.Entry) i.next();

            long key=(long)entry.getKey();
            long value=(long)entry.getValue();

            System.out.println("Map key is :"+key);
            if (val/key!=0) {

                if (val/key>value) {

                    val= val-(key*value);
                    count+=(long)entry.getValue();

                } else {

                    count+=val/key;
                    break;

                }


            } else {
                break;
            }



        }

        System.out.println(count);


    }
}
