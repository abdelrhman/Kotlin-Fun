package week2

fun main(args: Array<String>) {
	print(sqrt(2.0))
}

fun sum(a: Int, b: Int, f: (Int) -> Int): Int {
	fun loop(a: Int, acc:Int) : Int {
		if(a > b)
			return acc
			else
			return loop(a + 1 ,f(a)+acc)
	}
	return loop(a,0)
}

fun sum2(f: (Int)-> Int): (Int, Int)->Int {
	fun sumF(a: Int, b: Int): Int {
		if (a > b) return 0 else return f(a) + sumF(a+1, b)
	}
	return ::sumF
}

fun product(f: (Int)-> Int): (Int, Int)->Int {
	fun productF(a: Int, b: Int): Int {
		if (a > b) return 1 else return f(a) * productF(a+1, b)
	}
	return ::productF
}

fun fact(n: Int) :Int = product( {x-> x})(1, n)

// FixedPoint Algorithm



fun fixedPoint(f: (Double) -> Double, firstGuess: Double): Double {

	val tolerance = .001
	fun isGoodEnough(x: Double,y: Double): Boolean {
		return Math.abs((x - y)/x) / x < tolerance
	}
	fun iter(guess: Double): Double {
		println(guess)
		val next = f(guess)
		if (isGoodEnough(guess, next)) return next else return iter(next)
	}
	return iter(firstGuess)
}

// This is buggy 
fun sqrt(x: Double) = fixedPoint( {y->(y + y/x)/2}, 1.0)













