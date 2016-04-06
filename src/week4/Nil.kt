package week4

class Nil<T>(): List<T>{
	override val tail: List<T>
		get() = throw UnsupportedOperationException()
	
	override val head: T
		get() = throw UnsupportedOperationException()

	

	override fun nth(n: Int): T = throw IndexOutOfBoundsException()

	 

	override fun isEmpty() = true

}