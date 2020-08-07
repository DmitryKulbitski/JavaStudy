import java.util.Arrays;

public class MyArrayList<T extends Number> {

    T[] arr = (T[]) new Integer[10];

    int NumberOfElements;

    Number lastElement ;

    public MyArrayList(T a1,T a2,T a3,T a4,T a5,T a6,T a7,T a8,T a9,T a10){

        this.arr[0] = a1;
        this.arr[1] = a2;
        this.arr[2] = a3;
        this.arr[3] = a4;
        this.arr[4] = a5;
        this.arr[5] = a6;
        this.arr[6] = a7;
        this.arr[7] = a8;
        this.arr[8] = a9;
        this.arr[9] = a10;

        this.lastElement = a10;

        this.NumberOfElements = 10;

    }

    //{
    //    arr = new int[];
    //}



    public void Add(T n){

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

    public void Remove(int d){

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


    public boolean contains(Number n){

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

    @Override
    public String toString() {
        return "MyArrayList{" +
                "arr=" + Arrays.toString(arr) +
                ", NumberOfElements=" + NumberOfElements +
                ", lastElement=" + lastElement +
                '}';
    }
}
