package study.homework.day3

import scala.actors.Exit

/**
 * @author Yunseong
 */
object Exercise5_7 {
  def main(args: Array[String]): Unit = {
    if(args.length != 1) {
      println("USAGE: java Exercise5_7 3120")
      System.exit(0)
    }  
    
    var money:Int = args(0).toInt
    
    println("money : " + money)
    
    val coinUnitArr: Array[Int] = Array(500, 100, 50, 10) 
    val coinArr: Array[Int] = Array(5, 5, 5, 5)
    
    for(i <- 0 to coinUnitArr.length-1) {
      val coinNum:Int = money / coinUnitArr(i);
      
      /*
       * 1. 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다. 
       * 2. 배열 coin에서 coinNum만큼의 동전을 뺀다. (만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.) 
       * 3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
       */
      
      if(coinArr(i) >= coinNum) {
        println(coinUnitArr(i) + "원: " + coinNum);
        money -= coinNum * coinUnitArr(i);
        coinArr(i) -= coinNum;
      } else {
        println(coinUnitArr(i) + "원: " + coinArr(i));
        money -= coinArr(i) * coinUnitArr(i);
        coinArr(i) = 0;
      }

    }

    if (money > 0) {
      println("거스름돈이 부족합니다")
      System.exit(0)
    }
    
    
    println("\n=남은 동전의 개수 =");
    
    for (i <- 0 to coinUnitArr.length-1) {
      println(coinUnitArr(i) + "원:" + coinArr(i));
    }
    
  }
}