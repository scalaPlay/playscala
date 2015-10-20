package study.exam.day3

/**
 * @author Yunseong
 */
object exam7_15 {
  def main(args: Array[String]): Unit = {
    val firstArg = if (!args.isEmpty) args(0) else ""
        
    print("firstArg : " + firstArg + " => ")
    
    val friend = 
        firstArg match {
            case "salt" => "pepper"            
            case "chips" => "salsa"
            case "eggs" => "bacon"
            case _ => "huh?"
        }
   
    println(friend)
  }
}