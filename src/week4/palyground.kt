package week4

fun main(args: Array<String>) {
	
	val mList = Cons(1,Cons(2,Cons(3, Nil())))
	print(mList.nth(2))
	//print(mList.nth(-1))
	//print(mList.nth(3))
}

