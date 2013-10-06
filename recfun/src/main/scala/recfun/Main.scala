package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = (c,r) match {
    case(0,0) => 1
    case(c, _) if c < 0 => 0
    case(_,r) if r < 0 => 0
    case(c,r) => pascal(c-1, r-1) + pascal(c,r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char], parens:List[Char]=List()): Boolean =  (chars, parens) match {
    case(List(), List()) => true
    case(List(), _) => false
    case(')' :: xs, List()) => false
    case(')' :: xs, '(' :: ys)  => balance(xs, ys)
    case('(' :: xs, ys) => balance(xs, '(' :: ys)
    case(x :: xs, ys) => balance(xs, ys)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = (money, coins) match {
    case (0, _) => 1
    case (n, _) if n < 0 => 0
    case (_, List()) => 0
    case (n, x :: xs) => countChange(n - x, x :: xs) + countChange(n, xs)
  }


}
