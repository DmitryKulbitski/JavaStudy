import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lesson9 {

    public static void main(java.lang.String[] args) {

        MyArrayList  ArrList = new MyArrayList(1,2,3,4,5,6,7,8,9,10);

        System.out.println(ArrList.toString());

        ArrList.Add(15.5);

        System.out.println(ArrList.toString());

        ArrList.Remove(3);

        System.out.println(ArrList.toString());

        int n = 9;

        System.out.println("ArrList contains " + n + " = " +  ArrList.contains(n));

        //ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        //numbers.add(7,150);

        //numbers.remove();

        //System.out.println(Collections.max(numbers));
        //System.out.println(Collections.min(numbers));

        TwoGen TwoGen1 = new TwoGen(7, 10.5);

        System.out.println("SUMM " + TwoGen1.Summ());


    }

}
