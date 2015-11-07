package study.exam.day6.control.currying.step2

import java.io.PrintWriter
import java.io.File

object newcontrol {
  def twice(op: Double => Double, x: Double) = op(op(x))
  
  def withPrintWriter(file: File, op: PrintWriter => Unit) {
    val writer = new PrintWriter(file)
    
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }
  
  def withPrintWriter2(file: File)(op: PrintWriter => Unit) {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }
  
  def main(args: Array[String]): Unit = {
    withPrintWriter(new File("date.txt"), writer => writer.println(new java.util.Date))
    
    println("Hello, world!")
    println{"Hello, world!"}
    
    val file = new File("date.txt")
    
    withPrintWriter2(file) { writer => writer.println(new java.util.Date) }
  }
}