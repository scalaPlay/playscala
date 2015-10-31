package study

object Exercise4_8 {
  def main(args: Array[String]): Unit = {
    equation((x ,y) => x * 2 + 4 * y == 10)
  }
  
  def equation(f: (Int,Int) => Boolean): Unit = {
    for(x <- 0 to 10)
      for(y <- 0 to 10)
        if(f(x,y))
          println("x="+ x + ", y=" + y)
  }
}