package arraylist;
import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args){

        ArrayList<student> names = new ArrayList<student>();
        names.add(new student("David", "hahaha"));
        System.out.println(names.get(0));


        // 2D Array w/ value
        int student[][] = new int[4][2];
        // 2D Array w/ no value
        int stud[][] = {
            {0,0,1,2,3,4,5,6},
            {0,1,2,3,4,5,6,7},
            {0,2,3,4,5,6,7,8}
        };
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 8; j++){
                for(int p = 0; p < 9; p++){
                    System.out.print(stud[i][j]);
                }
            }
            System.out.println();
        }

    }
}