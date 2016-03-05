package week1


fun main(args: Array<String>) {
	print(balance("((()))".toList()))
}


//Exercise 1: Pascal’s Triangle
fun pascal(c: Int, r: Int): Int = if (c == 0 || r == c)  1 else pascal(c,r-1)+ pascal(c-1,r)

fun <T> List<T>.tail() = this.takeLast(this.size -1)

//Exercise 2: Parentheses Balancing
fun balance(chars: List<Char>): Boolean {
	fun balanceWithCounter(chars: List<Char>, openParen: Int): Boolean {
		if (chars.isEmpty()) return openParen == 0
			else {
			val num =
			if (chars.first() == '(') openParen + 1
				else if (chars.first() == ')') openParen - 1
					else openParen
			if (num >= 0) return balanceWithCounter(chars.tail(), num)
				else return false
		}
	}
	return balanceWithCounter(chars, 0)
}

fun countChange(money: Int, coins: List<Int>): Int {
	if (money < 0 || coins.isEmpty()) return  0
		else if (money == 0) return 1
			else return countChange(money - coins.first(), coins) + countChange(money, coins.tail())
}

