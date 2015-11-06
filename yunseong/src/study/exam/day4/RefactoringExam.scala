package study.exam.day4

/**
 * @author Yunseong
 */
object RefactoringExam {
  def main(args: Array[String]): Unit = {
    //절차형 프로그래밍 방식
    printMultiTable()
    
    //함수형 프로그래밍 방식
    
  }
  
  /**
   * 전형적인 절차형 프로그래밍 방식
   * 1. 테스트하기가 매우 어렵다. (테스트 케이스가 많고, 부수 효과가 많다)
   * 2. 변수들이 실질적으로 하는 역할을 변수명을 통해 알기 어렵다.
   */
  def printMultiTable() {
    var i = 1
    
    while (i <= 10) {
      var j = 1
      
      while (j <= 10) {
        val prod = (i * j).toString()
        
        var k = prod.length()
        
        while (k < 4) {
          print(" ")
          k += 1
        }
        
        print(prod)
        
        j += 1
      }
      
      println()
      i += 1
    }
  }
  
  def makeRowSeq(row: Int) = {
    for (col <- 1 to 10) yield {
      val prod = (row * col).toString()
      val padding = " " + (4 - prod.length)
      
      padding + prod
    }
    
    //하나의 열을 문자열로 반환
    //def makeRow(row: Int) = makeRowSeq(row).mkString
  }
}