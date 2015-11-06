package study.homework.day3

import java.util.Scanner

/**
 * @author Yunseong
 */
object Exercise8_8 {
  val randomNum: Int = (Math.random() * 100).toInt + 1
  val scanner = new Scanner(System.in)

  def main(args: Array[String]): Unit = {
    matchingNumber(1)
  }

  def matchingNumber(count: Int): Unit = {
    print("1과 100 사이의 값을 입력하세요 : ")
    
    try {
      val matchingNum: Int = scanner.nextLine().trim().toInt

      matchingNum match {
        case this.randomNum => println("정답입니다. 재시도 횟수  총 " + count + "회.")
        case _ =>
          if (randomNum > matchingNum) println("좀 더 큰 값을 입력해야 합니다") else println("좀 더 작은 값을 입력해야 합니다")
          matchingNumber(count + 1)
      }

    } catch {
      case ex: NumberFormatException =>
        println("입력한 값은 숫자 형식이 아닙니다.")
        matchingNumber(count)
    }
  }
  
}