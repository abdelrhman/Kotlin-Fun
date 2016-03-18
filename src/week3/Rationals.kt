package week3

fun main(args: Array<String>) {
	val x = Rational(1,3)
	val y = Rational(2,3)
	x + y
	x == y

}

class Rational(val numer: Int,val denom: Int) {
	init {
		require(denom != 0) { "denominator must be different than zero " }
	}

	constructor(x: Int): this(x,1)

	private fun gcd(a: Int, b: Int): Int = if (b == 0 ) a else gcd(b, a%b)



	operator fun plus(that: Rational) = Rational(numer * that.denom + that.numer *denom , denom * that.denom)


	operator fun minus(that: Rational) = plus(-that)

	fun equals(other: Rational) = numer == other.numer && denom == other.denom


	operator fun unaryMinus() = Rational(numer * -1, denom)

	fun less(that: Rational) = numer * that.denom < that.numer *denom

	fun max(that: Rational) = if(less(that)) that else this

	override fun toString() = "${numer/gcd(numer,denom)}/${denom/gcd(numer,denom)}"

}