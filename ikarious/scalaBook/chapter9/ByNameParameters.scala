
object ByNameParameter {
  var assertionEnabled = true

  def myAssert(predicate : () => Boolean) =
    if (assertionsEnabled && !predicate())
    throw new AssertionError

  def byNameAssert(predicate : => Boolean) = 
    if (assertionEnabled && !predicate)
    throw new AssertionError
}
