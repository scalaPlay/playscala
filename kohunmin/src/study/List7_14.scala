package study

object List7_14 {
  def main(args: Array[String]): Unit = {
    val firstArg = if(args.length > 0) args(0) else ""
      
    val friend =
      firstArg match {
      case "salt" => "pepper"
      case "chips" => "sales"
      case "eggs" => "bacon"
      case _ => "huh?"
    }
    println(friend)
  }
}