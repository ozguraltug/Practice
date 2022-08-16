import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static class C01_ {
        public static void main(String[] args) {
           /* ArrayList<Integer> input=new ArrayList();
            int [] arr={2,2,3,5,7,7,11};
            System.out.println(Arrays.toString(arr));
            Arrays.sort(arr);

            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i]!=arr[i+1]){
                    input.add(arr[i]);
                }


            }
            if(!input.contains(arr[arr.length-1])){
                input.add(arr[arr.length-1]);
            }

            System.out.println(input);*/

            int [] input={2,2,3,5,7,7,11};
            ArrayList<Integer> tekrarsizList=new ArrayList<>();
            tekrarsizList.add(input[0]);
            for (int i=0;i<input.length;i++){
                if(!tekrarsizList.contains(input[i])){
                    tekrarsizList.add(input[i]);
                }
            }
            System.out.println(Arrays.toString(input));
            System.out.println(tekrarsizList);
        }
    }
}