public class Lesson10 {

    public static void main(String[] args) {

        Zveno Z1 = new Zveno();
        Z1.Prev = Z1;
        Z1.Next = Z1;
        Z1.element = 0;

        Zveno Z2 = new Zveno();
        Z2.Prev = Z1;
        Z2.Next = Z2;
        Z2.element = 1;

        Zveno Z3 = Z2.addAfter(Z2, 55);
        Zveno Z4 = Z3.addBefore(Z3, 48);

        System.out.println(Z1.toString());
        System.out.println(Z2.toString());
        System.out.println(Z4.toString());
        System.out.println(Z3.toString());

        /*MyLinkedList  LinkedList1 = new MyLinkedList(3,5,7,8,9,6);

        System.out.println(LinkedList1.toString());

        for (int i=0; i< 6; i++){
            Zveno z = (Zveno) LinkedList1.arr[i];
            System.out.println(z.Znach);

        }

         */

        /*
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
        */

    }

}
