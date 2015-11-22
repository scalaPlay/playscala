package study.controlAbstraction

import java.io.PrintWriter
import java.io.File

object List9_4 {
  def withPrintWriter(file: File)(op: PrintWriter => Unit) {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }
  
  def main(args: Array[String]): Unit = {
    val file = new File("data.txt")
    withPrintWriter(file){
      writer => writer.println(new java.util.Date)
    }
  }
}