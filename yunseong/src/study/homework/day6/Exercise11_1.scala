package study.homework.day6

/**
 * @author Yunseong
 */
object Exercise11_1 {
  def main(args: Array[String]): Unit = {
    val targetList:List[Int]  = List(1, 2, 3, 4)
    val compareList:List[Int] = List(3, 4, 5, 6)
    
    println("list1 : " + targetList)
    
    println("list2 : " + compareList)
    
    println("cha : " + getRelativeComplement(targetList, compareList))
     
    println("hap : " + hap(targetList, compareList))
    
    println("kyo : " + kyo(targetList, compareList))
  }
  
  def getRelativeComplement(targetList: List[Int], compareList: List[Int]): List[Int] = {
    targetList.diff(compareList)
  }
  
  def hap(targetList: List[Int], compareList: List[Int]): List[Int] = {
    (targetList ::: compareList).distinct
  }
  
  def kyo(targetList: List[Int], compareList: List[Int]): List[Int] = {
    compareList.intersect(targetList.toSeq)
  }
}