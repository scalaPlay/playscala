package study.exercise

import scala.collection.mutable.ArrayLike

class Student(val name :String, val ban :Integer, val no :Integer, val kor :Integer, val eng :Integer, val math : Integer) extends Ordered[Student] {
  var schoolRank = 0;
  val total = kor + eng + math;
  
  def getAverage():Integer = {
    return (((total / 3f) * 10 + 0.5) / 10f).toInt;
  }
  
  def compare(that: Student) = this.total - that.total
  
  override def toString(): String = {
    return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + total + "," + getAverage() + "," + schoolRank;
  }
} 

object Exercise11_8 {
  def calculateSchoolRank(list:List[Student]) {
    list.sorted
    
    var prevRank = -1
    var prevTotal = -1
    val length = list.size
    
    prevRank = length;
     
    for( student <- list){
      val presentRank = prevRank - 1
      if(prevTotal == student.total) {
        student.schoolRank = prevRank
      }else {
        student.schoolRank = presentRank
      }
      prevTotal = student.total
      prevRank = presentRank
    }
        
  }
  def main(args: Array[String]): Unit = {
    var list = List(new Student("ko",1,2,3,4,12)
                    ,new Student("ko",1,2,3,4,6)
                    ,new Student("ko",1,2,3,4,7))
    
    calculateSchoolRank(list);
    
    for( student <- list)
      println (student)
  }
}