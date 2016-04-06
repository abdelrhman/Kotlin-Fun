package week4

class Cons<T>( override val head: T,  override val tail: List<T>) :List<T> {
	
	override fun nth(n: Int): T  = if (n == 0) this.head else tail.nth(n-1)

	override fun isEmpty() = false

}