package Questions.Mentoring;

import java.util.ArrayList;
import java.util.Arrays;

public class C01_TekrarsizList {

    /* Soru : ArrayListte tekrarlanan ogeleri kaldirmak
    icin java programi yaziniz
    input:[2,2,3,5,7,7,11]
    output[2,3,5,7,11]

    arr=input
    ArrayList

     */
    public static void main(String[] args) {
        int [] arr={2,2,3,5,7,7,11};
        ArrayList<Integer> tekrarsizList=new ArrayList<>();
        tekrarsizList.add(arr[0]);//[2]
        for (int i=0;i<arr.length;i++){
            if(!tekrarsizList.contains(arr[i])){
                tekrarsizList.add(arr[i]);
            }
        }
        System.out.println("Verilen input : "+ Arrays.toString(arr));
        System.out.println("Tekrarsiz Liste : "+tekrarsizList);

    }


}
