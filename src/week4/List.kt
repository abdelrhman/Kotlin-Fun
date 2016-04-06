package week4

interface List<T> {
	fun isEmpty() :Boolean
	fun nth(n: Int): T
	val head: T
	val tail: List<T>
}




