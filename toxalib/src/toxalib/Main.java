package toxalib;




import java.util.ArrayList;
import java.util.Collections;

public class Main {




    public static void main(String[] args) {
        int [] a =  {4, 7, 15, 56, 35, 753, 12, 5, 6};

        ArrayList<Integer> massiv = new ArrayList<>();


        for(int x:a) {
            massiv.add(x);
        }


        Collections.sort(massiv);
        System.out.println(massiv);


    }



}



