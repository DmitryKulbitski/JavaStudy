public class Lesson5_DZ {
    public static void main(String[] args){

        for(int i = 0; i <= 10; i++){

            long n = fibonachi(i);
            System.out.print(" " + n);
        }
    }

    static long fibonachi(int n){
        if(n==0 ){
            return 0;
        }
        if(n==1 ){
            return 1;
        }
        return fibonachi(n-1) + fibonachi(n-2);
    }

}

