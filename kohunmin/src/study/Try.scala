package study

import java.io.FileNotFoundException
import java.io.FileReader
import java.io.IOException
import java.net.MalformedURLException
import java.net.URL

object Try {

  def main(args: Array[String]): Unit = {
    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException => println("FileNotFoundException")// 파일을 못 찾는 경우 처리
      case ex: IOException           => // 그 밖의 IO 오류 처리 
    }

    val file = new FileReader("input.txt")
    try {
      // 파일을 사용한다.
    } finally {
      file.close() // 파일을 확실히 닫는다.
    }
    
    urlFor("")
  }

  def urlFor(path: String) =
    try {
      new URL(path)
    } catch {
      case e: MalformedURLException =>
        new URL("http://www.scala-lang.org")
    }
}
