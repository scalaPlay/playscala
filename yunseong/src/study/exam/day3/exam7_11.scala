package study.exam.day3

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException


/**
 * @author Yunseong
 */
object exam7_11 {
  def main(args: Array[String]): Unit = {
    try {
        val f = new FileReader("input.txt")
        //파일을 사용하고 닫는다
    } catch {
        case ex: FileNotFoundException => ex.printStackTrace() //파일을 못찾는 경우 처리
        case ex: IOException => ex.printStackTrace() // 그 밖의 IO 오류 처리
    }
  }
}