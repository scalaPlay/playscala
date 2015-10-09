package study.homework

/**
 * @author Haoul
 */
object Exercise4_6 {
  
  def main(args: Array[String]): Unit = {  
    sumDices(6)  
  }
  
  def sumDices(sum:Int): Unit = {
    for(i <- 1 to 6) {
      for(j <- 1 to 6) {
        if(i + j == 6) println(i + "," + j)
      }        
    }      
  }
}