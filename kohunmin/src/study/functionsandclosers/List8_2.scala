package study.functionsandclosers

import scala.io.Source

object List8_2 {
  def processFile(filename: String, width: Int) {
      def processLine(line: String) {
        if (line.length > width)
          println(filename + ": " + line)
      }
      
      val source = Source.fromFile(filename)
      for (line <- source.getLines())
        processLine(line)
    }
  
  def main(args: Array[String]) {
    val width = args(0).toInt
    for (arg <- args.drop(1))
      List8_2.processFile(arg, width)
  }
}
