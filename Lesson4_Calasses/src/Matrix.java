

public class Matrix implements algebra {

    int x = 2;
    int y = 2;

    int [][] arr;

    public Matrix(int x, int y) {
        this.x = x;
        this.y = y;

        this.arr = new int [x][y];

        this.arr[0][0] = 5;
        this.arr[0][1] = 1;
        this.arr[1][0] = - 15;
        this.arr[1][1] = - 7;
    }




    @Override
    public double Norm() {
        int max = Math.abs(this.arr[0][0]);

        for (int i = 0; i< x; i++){
            int [] mass = arr[i];

            for(int j = 0; j< y; j++){
                if(Math.abs(max)<= Math.abs(arr[i][j])){
                    max = Math.abs(arr[i][j]);

                }

            }


        }

        return max;
    }
}
