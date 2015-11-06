package study.homework.day2

import scala.runtime.RichInt

/**
 * 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
 * 
 * @author Yunseong
 */
object Exercise4_6 {
    def main(args: Array[String]): Unit = {
        var dice1: Dice = new Dice()
        var dice2: Dice = new Dice()
        
        dice1.range.foreach { x => 
            dice2.range.foreach { y => 
                if(x + y == 6) println("x : " + x + ", y : " + y + ", sum : " + (x + y)) 
            }        
        }
        /*
        var num:Int = (Math.random() * 6).toInt + 1
        
        println("num : " + num)
        */
    }
    
    
}

class Dice(val range : Range = 1 to 6) {
  
    /*
    def range(value: Range):Unit = {
        println("setter")
        value
    }
    
    def range_= {
        
        _range   
    }
    */

    
}