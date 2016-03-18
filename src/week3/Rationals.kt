package week3

fun main(args: Array<String>) {
	val x = Rational(1,2)
	val y = Rational(2,3)
	val z = x.add(y)
	print(x.sub(y).sub(z))
}

class Rational(val numer: Int, val denom: Int){
	fun add(that: Rational) = Rational(numer * that.denom + that.numer *denom , denom * that.denom)
	
	fun sub(that: Rational) = add(that.neg())
	
	fun neg() = Rational(numer * -1, denom)
	 
	override fun toString() = "$numer/$denom"
	
}