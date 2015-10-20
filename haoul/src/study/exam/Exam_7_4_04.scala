package study.exam

/**
 * @author Haoul
 */
object Exam_7_4_04 {
  def main(args: Array[String]): Unit = {
    val firstArg = if(args.length > 0) args(0) else ""
      
    println("firstArg : " + firstArg + " => ")
      
    firstArg match {
      case "salt" => println("pepper")
      case "chips" => println("salsa")
      case "eggs" => println("bacon")
      case _ => println("huh?")
    }
  }
}