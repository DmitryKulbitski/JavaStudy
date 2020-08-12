import javax.lang.model.type.NullType;
import java.util.Arrays;

public class MyLinkedList<T> {

    Zveno Header;
    Zveno Tail;

        //private Object Zveno;
    //T[] arr = (T[]) new Zveno[6];

    /*int NumberOfElements;

    Number lastElement ;

     */

    public MyLinkedList(Zveno Header, Zveno Tail) {

        this.Header = Header;
        this.Tail   = Tail;
    }

    public Zveno addBefore(Zveno<T> Z1, T element){

        Zveno<T> Z2 = new Zveno<T>();

        if(Z1 != this.Tail && Z1 != this.Header){

            Z2.Prev = Z1.Prev;
            Z2.Next = Z1;
            Z2.element = element;


            Z1.Prev.Next = Z2;
            Z1.Prev = Z2;
            return Z2;

        }
        else {

            if(Z1 == this.Header ){
                if((this.Header != this.Tail)){
                    Z2.Prev = Z1.Prev;
                    Z2.Next = Z1;
                    Z2.element = element;


                    Z1.Prev.Next = Z2;
                    Z1.Prev = Z2;


                    return Z2;
                }
                else{

                    Z2.Prev = Z2;
                    Z2.Next = Z1;
                    Z2.element = element;

                    Z1.Prev = Z2;

                    this.Header = Z2;
                    return Z2;


                }
            }

            if(Z1 == this.Tail ){
                if((this.Header != this.Tail)){
                    Z2.Prev = Z1.Prev;
                    Z2.Next = Z1;
                    Z2.element = element;


                    Z1.Prev.Next = Z2;
                    Z1.Prev = Z2;


                    return Z2;
                }
                else{

                    Z2.Prev = Z2;
                    Z2.Next = Z1;
                    Z2.element = element;

                    Z1.Prev = Z2;

                    this.Header = Z2;
                    return Z2;


                }
            }
        }

        return Z2;

    }

    public Zveno addAfter(Zveno<T> Z1, T element){

        Zveno<T> Z2 = new Zveno<T>();

        if(Z1 != this.Tail &&  Z1 != this.Header){

            Z2.Next = Z1.Next;
            Z2.Prev = Z1;

            Z2.element = element;

            Z1.Next.Prev = Z2;
            Z1.Next = Z2;
        }
        else{
            if(Z1 == this.Header ){
                if((this.Header != this.Tail)){

                    Z2.Next = Z1.Next;
                    Z2.Prev = Z1;

                    Z2.element = element;

                    Z1.Next.Prev = Z2;
                    Z1.Next = Z2;
                    return Z2;
                }
                else{
                    Z2.Next = Z2;
                    Z2.Prev = Z1;

                    Z1.Next = Z2;
                    Z1.Prev = Z1;

                    Z2.element = element;

                    this.Header = Z1;
                    this.Tail = Z2;

                    return Z2;
                }


            }


            if(Z1 == this.Tail){
                if((this.Header != this.Tail)){

                    Z2.Next = Z2;
                    Z2.Prev = Z1;

                    Z2.element = element;

                    //Z1.Next.Prev = Z2;
                    Z1.Next = Z2;
                    this.Tail = Z2;

                }
                else{
                    Z2.Next = Z2;
                    Z2.Prev = Z1;

                    Z2.element = element;

                    Z1.Next = Z2;
                    Z1.Prev = Z1;

                    this.Header = Z1;
                    this.Tail = Z2;

                }

            }

            //Z2.Next = Z1.Next;
            //Z2.Prev = Z1;

            //Z2.element = element;

            //Z1.Next = Z2;

        }


        //Prev.Next = Z2;

        return Z2;

    }

    public Zveno addEnd(T element){
        Zveno<T> Z1 = this.Tail;

        Zveno<T> Z2 = new Zveno<T>();

        if(Z1 != this.Tail &&  Z1 != this.Header){

            Z2.Next = Z1.Next;
            Z2.Prev = Z1;

            Z2.element = element;

            Z1.Next.Prev = Z2;
            Z1.Next = Z2;
        }
        else{
            if(Z1 == this.Header ){
                if((this.Header != this.Tail)){

                    Z2.Next = Z1.Next;
                    Z2.Prev = Z1;

                    Z2.element = element;

                    Z1.Next.Prev = Z2;
                    Z1.Next = Z2;
                    return Z2;
                }
                else{
                    Z2.Next = Z2;
                    Z2.Prev = Z1;

                    Z1.Next = Z2;
                    Z1.Prev = Z1;

                    Z2.element = element;

                    this.Header = Z1;
                    this.Tail = Z2;

                    return Z2;
                }


            }


            if(Z1 == this.Tail){
                if((this.Header != this.Tail)){

                    Z2.Next = Z2;
                    Z2.Prev = Z1;

                    Z2.element = element;

                    //Z1.Next.Prev = Z2;
                    Z1.Next = Z2;
                    this.Tail = Z2;

                }
                else{
                    Z2.Next = Z2;
                    Z2.Prev = Z1;

                    Z2.element = element;

                    Z1.Next = Z2;
                    Z1.Prev = Z1;

                    this.Header = Z1;
                    this.Tail = Z2;

                }

            }

            //Z2.Next = Z1.Next;
            //Z2.Prev = Z1;

            //Z2.element = element;

            //Z1.Next = Z2;

        }


        //Prev.Next = Z2;

        return Z2;

    }

        //int Znach = (int) a1;
        //Zveno Z1 = new Zveno(Z1,Z1, Znach);

        /*Znach = (int) a2;
        Zveno Z2 = new Zveno(0,2, Znach);
        Znach = (int) a3;
        Zveno Z3 = new Zveno(1,3, Znach);
        Znach = (int) a4;
        Zveno Z4 = new Zveno(3,5, Znach);
        Znach = (int) a5;
        Zveno Z5 = new Zveno(4,6, Znach);
        Znach = (int) a6;
        Zveno Z6 = new Zveno(5,999, Znach);

        this.arr[0] = (T) Z1;
        this.arr[1] = (T) Z2;
        this.arr[2] = (T) Z3;
        this.arr[3] = (T) Z4;
        this.arr[4] = (T) Z5;
        this.arr[5] = (T) Z6;


        //this.lastElement = a10;

        //this.NumberOfElements = 10;

         */





    //{
    //    arr = new int[];
    //}



    /*public void Add(T n){

        //this.NumberOfElements = this.NumberOfElements + 1;
        int NextNumberOfElements = this.NumberOfElements + 1;
        T[] arr2 = (T[]) new Number[NextNumberOfElements];

        for (int i = 0; i < NextNumberOfElements; i++){
            if (i == (NextNumberOfElements - 1)){
                arr2[i] = (T) n;
            }
            else{
                arr2[i] = this.arr[i];
            }

        }

        this.arr = arr2;
        this.lastElement =  n;
        this.NumberOfElements = this.NumberOfElements + 1;
    }

     */

    /*public void Remove(int d){

        //this.NumberOfElements = this.NumberOfElements + 1;
        int NextNumberOfElements = this.NumberOfElements - 1;
        T[] arr2;
        arr2 = (T[]) new Number [NextNumberOfElements];

        for (int i = 0; i < this.NumberOfElements; i++){

            if (i < d){
                arr2[i] = this.arr[i];
            };
            if (i == d){
                int i2 = i - 1;
                //arr2[i] = this.arr[i2];
                arr2[i2] = this.arr[i];
            };
            if (i > d){
                int i2 = i - 1;
                arr2[i2] = this.arr[i];
            };


        }

        this.lastElement = (T) arr2[NextNumberOfElements - 1];
        this.arr =  arr2;

        this.NumberOfElements = NextNumberOfElements;
    }

     */


    /*public boolean contains(Number n){

        //this.NumberOfElements = this.NumberOfElements + 1;
        //int NextNumberOfElements = this.NumberOfElements - 1;
        //int[] arr2 = new int[NextNumberOfElements];

        boolean result = false;

        for (int i = 0; i < this.NumberOfElements; i++){

            if (this.arr[i] == n){
                result = true;
            };
        }


        return result;
    }

     */

    /*@Override
    public String toString() {
        return "MyArrayList{" +
                "arr=" + Arrays.toString(arr) +
                ", NumberOfElements=" + NumberOfElements +
                ", lastElement=" + lastElement +
                '}';
    }

     */

    @Override
    public String toString() {

        String Str = "";
        Zveno Z1 = Header;

        int i = 0;

        do{
            Str = Str + " Z"+ i + " = " + Z1.element + ";";
            Z1 = Z1.Next;
            i++;

            if (Z1 == this.Tail){
                Str = Str + " Z"+ i + " = " + Z1.element + ";";
            }

        }
        while(Z1!= Tail.Next);

        return "MyLinkedList{" + Str + "}";

    }
}

