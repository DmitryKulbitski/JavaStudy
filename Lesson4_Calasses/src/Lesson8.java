public class Lesson8 {

    public static void main(String[] args){

        int x = 2;
        int y = 2;

        Matrix matrix1 = new Matrix(x, y);
        System.out.println("Max : " + matrix1.Norm());

        Vector vector1 = new Vector(
                (int) 1, (int) 2,(int) 3, (int) 4, (int) 5, (int) 6, (int) 7, (int) 8, (int) 9, (int) 10
        );
        System.out.println("Квадратный корень из суммы модулей : " + vector1.Norm());


        //double ib = (double) Math.sqrt(-1) * y;
        double b = 3;
        //System.out.println("i*B = " + ib);
        Complex complex1 = new Complex(x, b);
        //z = a + b*i;
        //z = 4 + 9;
        //a
        System.out.println("Модуль комплексного числа : " + complex1.Norm());


        Complex Complex1 = new Complex(3, 5);
        Complex Complex2 = new Complex(2, 6);

        //Complex Complex3 = Complex1.summ(Complex2);

        Complex Complex3 = Complex.summ_vers2(Complex1, Complex2);

        System.out.println(Complex3.toString());
    }
}
