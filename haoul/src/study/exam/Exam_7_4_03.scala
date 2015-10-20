package study.exam

import java.net.MalformedURLException
import java.net.URL

/**
 * @author Haoul
 */
object Exam_7_4_03 {
  def main(args: Array[String]): Unit = {
    
    println(urlFor(""))
  }
  
  def urlFor(path: String) = {
    try {
      new URL(path)
    } catch {
      case e: MalformedURLException =>
        println("Create new URL")
        new URL("http://www.scala-lang.org")      
    }
  }    
}