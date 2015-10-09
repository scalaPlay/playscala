package study.exam.day3

import java.io.FileReader
import java.io.FileNotFoundException

object exam7_12_worksheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  var file: FileReader = null                     //> file  : java.io.FileReader = null
    try {
        file = new FileReader("input.txt")
        //파일을 사용한다
    } catch {
        case ex: FileNotFoundException => println("File Not Found")
    } finally {
        println("file close")
        file.close()
    }                                             //> File Not Found
                                                  //| file close
                                                  //| java.lang.NullPointerException
                                                  //| 	at study.exam.day3.exam7_12_worksheet$$anonfun$main$1.apply$mcV$sp(study
                                                  //| .exam.day3.exam7_12_worksheet.scala:17)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at study.exam.day3.exam7_12_worksheet$.main(study.exam.day3.exam7_12_wor
                                                  //| ksheet.scala:6)
                                                  //| 	at study.exam.day3.exam7_12_worksheet.main(study.exam.day3.exam7_12_work
                                                  //| sheet.scala)
}