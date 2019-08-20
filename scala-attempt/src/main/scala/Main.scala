object Main {
  def basic (num: Int): Int  = basicHelper(num - 1)

  def basicHelper(num: Int): Int = 
    if(num == 0) 0 else 
      if((num % 3 == 0) || (num % 5 == 0)) 
        num + basicHelper(num - 1)
      else basicHelper (num - 1)

  def main(args: Array[String]): Unit = {
    println(basic(1000))
  }
}