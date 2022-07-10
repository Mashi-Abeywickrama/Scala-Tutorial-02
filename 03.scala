
object Question03 {
    def main(args : Array[String]) : Unit = {

        var i : Int = 2;
        var j = 2;
        var k = 2;
        var m = 5;
        var n = 5;
        var f  = 12.0f;
        var g : Float = 4.0f;
        var c : Char = 'X';

        println(k + 12 * m);

        println(m/j);

        println(n/j);

        println(m/j*j);

        println(f + 10+5 + g);

        //println(++i*n)
        /* in Java, ++ and -- is valid. But in scala we
        can't use ++, -- operators. Instead we can create
        a method for ++ and -- or you can just put += or -+
        whenever it needs */
        i += 1;
        println(i*n);

    }
}