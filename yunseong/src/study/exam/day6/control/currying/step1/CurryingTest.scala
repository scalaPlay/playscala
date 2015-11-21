package study.exam.day6.control.currying.step1

object CurryingTest {
  def plainOldSum(x: Int, y: Int): Int = {
    x + y
  }
  
  def curredSum(x: Int)(y: Int): Int = {
    x + y
  }
  
  def first(x: Int) = (y: Int) => x + y
  
  def main(args: Array[String]): Unit = {
    val second = first(1)
    
    second(3)
  }
}