import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ankur on 23/8/17.
 */
public class ModKnapsack {
    static List<Item> my_pack;

    public static void main(String[] args) throws IOException {



        try (BufferedReader br = new BufferedReader(new FileReader("/home/ankur/a"))) {
            String line;
            while ((line = br.readLine()) != null) {

                ArrayList<Item> itemList = new ArrayList<>();

                char []input = line.toCharArray();
                int i=0;
                char []weight = new char[4];
                while (input[i]!=':') {

                    weight[i]=input[i];
                    i++;

                }

                String w = new String(weight).trim();

                int W = Integer.parseInt(w.trim());

                while (i<input.length) {


                    while (input[i] != '(') {
                        i++;
                    }

                    i++;
                    double weightOfPackage;
                    int index, cost;

                    while (input[i] != ')') {

                        char[] n = new char[3];
                        int l = 0;
                        while (input[i] != ',') {
                            n[l] = input[i];
                            l++;
                            i++;
                        }

                        index = Integer.parseInt(new String(n).trim());
                        while (input[i] != ',') {
                            i++;
                        }
                        i++;
                        char weightInDouble[] = new char[6];
                        int k = 0;
                        while (input[i] != ',') {
                            weightInDouble[k] = input[i];
                            k++;
                            i++;
                        }

                        weightOfPackage = Double.parseDouble(new String(weightInDouble).trim());
                        k = 0;
                        i = i + 2;
                        char costInChar[] = new char[5];
                        while (input[i] != ')') {
                            costInChar[k] = input[i];
                            k++;
                            i++;
                        }

                        cost = Integer.parseInt(new String(costInChar).trim());

                        Item item = new Item();
                        item.setCost(cost);
                        item.setIndex(index);
                        item.setWeight(weightOfPackage);

                        itemList.add(item);
                        //System.out.println(item.toString());
                    }
                    i++;
                }


                printOptimalChoice(itemList,W);

            }


        }


    }

    public static int fillPackage(double weight, ArrayList<Item> item, List<Item> optimalChoice, int n){

        if(n == 0 || weight == 0)
            return 0;

        if(item.get(n-1).getWeight() > weight) {
            List<Item> subOptimalChoice = new ArrayList<>();
            int optimalCost =fillPackage(weight, item, subOptimalChoice, n-1);
            optimalChoice.addAll(subOptimalChoice);
            return optimalCost;
        }
        else{
            List<Item> includeOptimalChoice = new ArrayList<>();
            List<Item> excludeOptimalChoice = new ArrayList<>();
            int include_cost = item.get(n-1).getCost() + fillPackage((weight-item.get(n-1).getWeight()), item, includeOptimalChoice, n-1);
            int exclude_cost = fillPackage(weight, item, excludeOptimalChoice, n-1);
            if(include_cost > exclude_cost){
                optimalChoice.addAll(includeOptimalChoice);
                optimalChoice.add(item.get(n - 1));
                return include_cost;
            }
            else{
                optimalChoice.addAll(excludeOptimalChoice);
                return exclude_cost;
            }
        }
    }


    private static void printOptimalChoice(ArrayList<Item> itemList, double weight) {
        my_pack = new ArrayList<>();
        fillPackage(weight, itemList, my_pack, itemList.size());
        int flag=0;
        for(int i = 0; i < my_pack.size(); i++) {
            System.out.print(my_pack.get(i).getIndex() );
            if (i!=my_pack.size()-1) {
                System.out.print(", ");
            }
            flag=1;
        }
        if (flag!=1) {
            System.out.println("-");
        } else {
            System.out.println();
        }

    }










}
