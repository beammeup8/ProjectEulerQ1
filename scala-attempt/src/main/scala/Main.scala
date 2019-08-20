object Main {
  def basic (num: Int): Int  = basicHelper(num - 1)

  def basicHelper(num: Int): Int = 
    if(num == 0) 0 
    else 
      if((num % 3 == 0) || (num % 5 == 0)) 
        num + basicHelper(num - 1)
      else basicHelper (num - 1)

  def tailRecurse(num: Int): Int = tailRecurseHelper(num - 1, 0)

  def tailRecurseHelper(num: Int, sum: Int): Int = 
    if(num == 0) sum 
    else
      if((num % 3 == 0) || (num % 5 == 0))
        tailRecurseHelper(num - 1, sum + num)
      else
        tailRecurseHelper(num - 1, sum)

  def main(args: Array[String]): Unit = {
    println(basic(1000))
    println(tailRecurse(1000))
  }
}