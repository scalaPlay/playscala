package study.exam.day3

import java.io.FileReader
import java.io.FileNotFoundException

/**
 * @author Yunseong
 */
object exam7_12 {
  def main(args: Array[String]): Unit = {
    var file: FileReader = null
    try {
        file = new FileReader("input.txt")
        //파일을 사용한다
    } catch {
        case ex: FileNotFoundException => println("File Not Found")         
    } finally {
        println("file close")
        file.close()
    }
  }
}