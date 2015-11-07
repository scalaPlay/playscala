package study.exam.day6.control.loopapi

object Test {
  def main(args: Array[String]): Unit = {
     containsNeg(List(1, 2, 3, 4)) 
     containsNeg(Nil)
     containsNeg(List(1, 2, -3, 4))
  }
  
  def containsNeg(nums: List[Int]): Boolean = {
    var exists = false
    for (num <- nums)
      if (num < 0)
        exists = true
    exists
  }
  
  def containsNeg2(nums: List[Int]) = nums.exists(_ < 0)

  def containsOdd(nums: List[Int]): Boolean = {
    var exists = false
    for (num <- nums)
      if (num % 2 == 1)
        exists = true
    exists
  }
  
  def containsOdd2(nums: List[Int]) = nums.exists(_ % 2 == 1)
}