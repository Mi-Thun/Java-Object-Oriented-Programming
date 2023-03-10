package lab8ActivitiesC;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = Integer.parseInt(input.nextLine());
        ArrayList<ArrayList> listArray = new ArrayList<ArrayList>();
        for(int i = 0;i<m;i++){
            int num = input.nextInt();
            ArrayList<Integer> arrayList =  new ArrayList<Integer>();
            for(int j=0;j<num;j++){
                arrayList.add(new Integer(input.nextInt()));
            }
            listArray.add(arrayList);
            input.nextLine();
        }
        int find = Integer.parseInt(input.nextLine());
        for(int i=0;i<find;i++){
            int x = input.nextInt()-1;
            int y = input.nextInt()-1;
            input.nextLine();
            if(x<listArray.size() && y<listArray.get(x).size()){
                System.out.println(listArray.get(x).get(y));
            }else{
                System.out.println("ERROR!");
            }
        }
    }
}
