package study.exam

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

/**
 * @author Haoul
 */
object Exam_7_4_02 {
  def main(args: Array[String]): Unit = {
    
		var file: FileReader = null
    try {
      file = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException => println("FileNotFoundException")
      case ex: IOException => println("IOException")
    } finally {
      println("file close")
      file.close();
    }
  }
}