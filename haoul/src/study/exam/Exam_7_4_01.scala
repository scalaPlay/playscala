package study.exam

/**
 * @author Haoul
 */
object Exam_7_4_01 {
  def main(args: Array[String]): Unit = {
    
    val n = 3
    val half =
      if(n % 2 == 0)
        n/2
      else 
        throw new RuntimeException("n must be even")
  }
}