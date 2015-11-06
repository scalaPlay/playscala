package study.homework.day5

/**
 * @author Yunseong
 */
object Exercise11_8 {
  def main(args: Array[String]): Unit = {
    val st1:Student = new Student("이자바", 2, 1,  70,  90,  70)
    val st2:Student = new Student("안자바", 2, 2,  60, 100,  80)
    val st3:Student = new Student("홍길동", 1, 3, 100, 100, 100)
    val st4:Student = new Student("남궁성", 1, 1,  90,  70,  80)
    val st5:Student = new Student("김자바", 1, 2,  80,  80,  90)
    
    var studentList = List(st1, st2, st3, st4, st5)
    println("list : " + studentList + "\n")
    
    calculateSchoolRank(studentList)
    
  }
  
  def calculateSchoolRank(studentList: List[Student]): Unit = {
    val sortedList: List[Student] = studentList.sortWith((x, y) => x.getTotal() > y.getTotal())
    
    def registerRank(): Unit = {
      var prevRank: Int = 0;
      var prevTotal: Int = 0;
      
      for(currentStudent <- sortedList) {
        if(prevTotal != currentStudent.total) {
          prevRank = prevRank + 1
          prevTotal = currentStudent.total
          currentStudent.schoolRank = prevRank
        } else {
          currentStudent.schoolRank = prevRank
          prevRank = prevRank + 1
        }
        
        println(currentStudent)
      }
      
    }
    
    registerRank()
    
    println("\nsortedList : " + sortedList)
  }
  
  def registerRank(list: List[Student]): Unit = {
    
  }
}

class Student(name: String, ban: Int, no: Int, kor: Int, eng: Int, math: Int) {
  var schoolRank: Int = 0
  val total: Int = kor + math + eng

  def getTotal(): Int = {
    total
  }

  def getAverage(): Int = {
    (((getTotal() / 3f) * 10 + 0.5) / 10f).toInt
  }

  override def toString(): String = {
    name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + total + ", " + schoolRank
  }

}