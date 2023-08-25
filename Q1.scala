object Q1{
    def main(args: Array[String]): Unit ={
        var rat1 = new Rational(1, 2);
        var negtiveRat = rat1.neg;
        println(negtiveRat.numerator +"/"+ negtiveRat.denominator);
    }

    class Rational(x: Int, y:Int){
        val numerator: Int = x;
        val denominator: Int = y;

        def neg = new Rational(-this.numerator, this.denominator);
    }
}