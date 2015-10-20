package study.homework.day2

/**
 * 방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10 이다.
 * 
 * [실행 결과]
 * x=1, y=2
 * x=3, y=1
 * x=5, y=0 
 * 
 * @author Yunseong
 */
object Exercise4_8 {
    def main(args: Array[String]): Unit = {
        val x:Unknown = new Unknown(0 to 10, 2, "x")
        val y:Unknown = new Unknown(0 to 10, 4, "y")
        
        val eq:Equation = new Equation(x, y, 10)
        
        eq.answerFindAll
    }
}

class Unknown(var range: Range, var weight: Int, var name: String) {
    def this(range: Range, weight: Int) {
        this(range, weight, "")
    }
    
} 

class Equation(val x: Unknown, val y: Unknown, val result: Int) {
  
    def answerFindAll():Unit = {
        x.range.foreach { i => 
            y.range.foreach { j => 
                if(i*x.weight + j*y.weight == result) println("x=" + i + ", y=" + j) 
            } 
        }
    }
}