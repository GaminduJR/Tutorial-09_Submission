object Q2{
    def main(args: Array[String]): Unit ={
        var rat1 = new Rational(3, 4);
        var rat2 = new Rational(5, 8);
        var rat3 = new Rational(2, 7);
        var subtractRat = rat1.sub(rat2).sub(rat3);
        println(subtractRat.numerator +"/"+ subtractRat.denominator);
    }

    class Rational(x: Int, y:Int){
        val numerator: Int = x;
        val denominator: Int = y;

        def sub(r:Rational) = new Rational(this.numerator*r.denominator - r.numerator*this.denominator, this.denominator*r.denominator);
    }
}