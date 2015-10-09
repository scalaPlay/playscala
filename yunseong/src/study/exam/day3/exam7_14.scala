package study.exam.day3

/**
 * @author Yunseong
 */
object exam7_14 {
  def main(args: Array[String]): Unit = {
      val firstArg = if (args.length > 0) args(0) else ""
          
      print("firstArg : " + firstArg + " => ")
          
      firstArg match {
          case "salt" => println("pepper") 
          case "chips" => println("salsa") 
          case "eggs" => println("becon") 
          case _ => println("huh?") 
      } 
      
  }

  
}