package study.exam.day5

import scala.io.Source


/**
 * @author Yunseong
 */
object LongLines {
  def processFile(filename: String, width: Int) {
    val source = Source.fromFile(filename)
    
    for (line <- source.getLines()) 
      processLine(filename, width, line)
  }
  
  def processLine(filename: String, width: Int, line: String) {
    if (line.length() > width)
      println(filename + ": " + line.trim())
  }
}