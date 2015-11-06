package study.exam.day5.refactoring2

import scala.io.Source

/**
 * @author Yunseong
 */
object LongLines {
  def processFile(filename: String, width: Int) {
    def processLine(line: String) {
      if (line.length() > width)
        println(filename + ": " + line.trim())
    }
    val source = Source.fromFile(filename)
    
    for (line <- source.getLines()) 
      processLine(line)
  }
}