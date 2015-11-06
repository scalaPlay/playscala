package study.exam.day5

/**
 * @author Yunseong
 */
object FindLongLines {
  def main(args: Array[String]): Unit = {
    val width = args(0).toInt
    
    println("width : " + width)
    
    
    for (arg <- args.drop(1)) {
      println("arg : " + arg)
      study.exam.day5.refactoring2.LongLines.processFile(arg, width)
    }
  }
}