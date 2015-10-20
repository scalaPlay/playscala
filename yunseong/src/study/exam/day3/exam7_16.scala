package study.exam.day3

/**
 * @author Yunseong
 */
object exam7_16 {
  def main(args: Array[String]): Unit = {
    var i = 0

    var foundIt = false

    println("start")
    
    while (i < args.length && !foundIt) {
        if(!args(i).startsWith("-") 
        &&  args(i).endsWith(".scala")) {
            foundIt = true
            println(args(i))
        }
        
        i = i + 1
    }
    
    println("end")
    
  }
}