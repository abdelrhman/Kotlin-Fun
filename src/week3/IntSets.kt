package week3

fun main(args: Array<String>) {
	println("Test object")
	val t1 = NonEmpty(2, Empty, Empty)
	println(t1)
	val t2  = t1 incl 4
	println(t2)
}



abstract class IntSet {
	abstract infix fun incl (x: Int): IntSet
	abstract infix fun contains(x: Int): Boolean
	abstract infix fun union(other: IntSet): IntSet

}

object Empty: IntSet () {

	override fun incl (x: Int): IntSet = NonEmpty(x, Empty, Empty)
	override  fun contains(x: Int)= false
	override  fun toString() = "."
	override fun union(other: IntSet) = other
}

class NonEmpty(val elem: Int,val left: IntSet,val right: IntSet): IntSet () {
	override fun incl (x: Int): IntSet=
	if( x < elem)  NonEmpty(elem, left incl x, right)
		else if (x > elem)  NonEmpty(elem, left, right incl x)
			else  this

	override fun contains(x: Int): Boolean =
	if(x < elem)  left contains x
		else if (x > elem)  right contains x
			else  true
	
	override fun union(other: IntSet) = ((left union right) union other) incl elem

	override  fun toString() = "{ $left $elem $right}"

}