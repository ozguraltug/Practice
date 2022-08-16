package Questions;


import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Z01 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("mavi");//mavi,kirmizi,beyaz,siyah,yesil,turuncu
        list.add("kirmizi");//**siyah**,kirmizi,beyaz,**mavi**,yesil,turuncu
        list.add("beyaz");
        list.add("siyah");
        list.add("yesil");
        list.add("turuncu");
        System.out.println(list);
        Iterator<String> yeniList=list.iterator();



    }
}
