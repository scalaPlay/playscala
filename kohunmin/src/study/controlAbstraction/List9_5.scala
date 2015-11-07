package study.controlAbstraction

object List9_5 {
  var assertionsEnabled = true
  def byNameAssert(predicate: => Boolean) =
    if(assertionsEnabled && !predicate)
      throw new AssertionError
}