package study.exam.day6.control.by_name_parameter

object byNameParameter {
  var assertionEnabled: Boolean = true
  
  def myAssert(predicate: () => Boolean) = {
    if(assertionEnabled && !predicate())
      throw new AssertionError
  }
  
  def byNameAssert(predicate: => Boolean) = 
    if(assertionEnabled && !predicate)
      throw new AssertionError
  
  def byNameAssert2(predicate: Boolean) = 
  if(assertionEnabled && !predicate)
	  throw new AssertionError
	  
	def func(): Boolean = {
    5 > 3
  }
  
  def main(args: Array[String]): Unit = {
    //1. 표현식이 계산되어 값 형태로 넘어감
    //myAssert(() => 5 > 3)
    myAssert(func)
    
    //myAssert(5 > 3) //함수 리터럴 ()가 없어서 동작하지 않는다.
   
    //2. byNameAssert에 표현식이 넘어감
    byNameAssert(5 > 3)
    byNameAssert(func)
    
    //3. 이미 평가된 값이 byNameAssert로 넘어감
    byNameAssert2(5 > 3)
    byNameAssert2(func)
  }
}