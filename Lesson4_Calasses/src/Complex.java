public class Complex implements algebra {
    private double mRe;
    private double mIm;

    public Complex(double re, double im) {
        this.mRe = re;
        this.mIm = im;
    }

    public double getRe() {
        return this.mRe;
    }

    public double getIm() {
        return this.mIm;
    }

    public double abs() {
        return Math.sqrt(mRe*mRe + mIm*mIm);
    }

    @Override
    public double Norm() {
        //return (this.mRe*this.mRe + (-1) * this.mIm*this.mIm);
        return abs();

    }

    public Complex summ(Complex сomplex2 ) {

        Complex сomplex3 = new Complex(0, 0);

        сomplex3.mRe = this.mRe + сomplex2.mRe;
        сomplex3.mIm = this.mIm + сomplex2.mIm;
        //return Math.sqrt(mRe*mRe + mIm*mIm);
        return сomplex3;
    }
    //public double difference() {
    //    return Math.sqrt(mRe*mRe + mIm*mIm);
    //}

    public static Complex summ_vers2(Complex сomplex1, Complex сomplex2 ) {

        Complex сomplex3 = new Complex(0, 0);

        сomplex3.mRe = сomplex1.mRe + сomplex2.mRe;
        сomplex3.mIm = сomplex1.mIm + сomplex2.mIm;
        //return Math.sqrt(mRe*mRe + mIm*mIm);
        return сomplex3;
    }

    @Override
    public String toString() {
        return "Complex " + "" + " {"  +
                "mRe=" + this.mRe +
                ", mIm=" + this.mIm +
                '}';
    }


    //Сложение
    //Вычитание
    //Умножение
    //Деление

}