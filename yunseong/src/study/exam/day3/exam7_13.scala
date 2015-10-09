package study.exam.day3

import java.nio.charset.MalformedInputException
import java.net.MalformedURLException
import java.net.URL

/**
 * @author Yunseong
 */
object exam7_13 {
    def main(args: Array[String]): Unit = {
        println(urlFor(""))
    }
    
    def urlFor(path: String) = {
        try {
             println("Create")
            new URL(path)
        } catch {
            case ex: MalformedURLException => 
                println("Create new URL.")
                new URL("http://www.scala-lang.org")
        }
    }
}