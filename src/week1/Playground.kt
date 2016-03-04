package week1


fun main(args: Array<String>) {
	print(factTail(0))
}

fun abs(x: Double): Double = if (x > 0) x else -x


fun sqrt(x: Double): Double {
	fun isGoodEnough(guess: Double): Boolean= abs(guess*guess - x) /x < .001

	fun improve(guess: Double): Double = (guess + x/guess )/2

	fun sqrtIter(guess: Double): Double = if(isGoodEnough(guess)) guess
		else sqrtIter(improve(guess))

	return sqrtIter(1.0)
}

fun gdc(a: Int, b: Int): Int = if(b == 0) a else gdc(b,a%b)

fun factorial(n: Int): Int = if(n == 0) 1 else n*factorial(n-1)

fun factTail(n: Int): Int {
	fun factIter(acc: Int, n: Int): Int = if (acc == 0 ) n else factIter(acc -1 ,n*acc)
	return factIter(n,1)
}


