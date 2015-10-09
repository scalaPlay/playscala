package study

import scala.util.Random

object Exercise8_8 {

  def main(args: Array[String]): Unit = {
    checkNum(100)
  }

  def checkNum(range: Int) {

    var randomNum = Random.nextInt(range)
    println(randomNum)
    var ok = true
    while (ok) {
      var num = 0
      print("1과 " + range + "사이의 값을 입력하세요 : ")
      try {
        num = Console.readInt()
      } catch {
        case e: NumberFormatException => num = 0
      }
      if (randomNum == num) {
        println("정답입니다.")
        ok = false
      } else if (num == -1)
        ok = false
    }
  }
}