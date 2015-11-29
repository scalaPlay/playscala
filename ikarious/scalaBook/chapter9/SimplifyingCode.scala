/*
def containsNeg( nums: List[Int]): Boolean = {
  var exists = false
 
  for (num <- nums)
   
    if (nums < 0)
        exists = true
  
  exists
}
*/

def containsNeg(nums: List[Int]) = nums.exist(_ < 0)

/*
def containsOdd(nums: List[Int]): Boolean = {
    var exists = false
    for ( num <- nums )
      if ( num % 2 == 1 )
        exists = true
    exists
}
*/

def containsOdd(nums: List[Int]) = nums.exists(_ % 2 == 1)
