package week3

fun main(args: Array<String>) {
	val x = Rational(1,3)
	val y = Rational(2,3)
	val z = x.add(y)
	
}

class Rational(val numer: Int,val denom: Int) {
	init {
		require(denom != 0) { "denominator must be different than zero " }
	}

	constructor(x: Int): this(x,1)

	private fun gcd(a: Int, b: Int): Int = if (b == 0 ) a else gcd(b, a%b)



	fun add(that: Rational) = Rational(numer * that.denom + that.numer *denom , denom * that.denom)

	fun sub(that: Rational) = add(that.neg())

	fun neg() = Rational(numer * -1, denom)

	fun less(that: Rational) = numer * that.denom < that.numer *denom

	fun max(that: Rational) = if(less(that)) that else this

	override fun toString() = "${numer/gcd(numer,denom)}/${denom/gcd(numer,denom)}"

}