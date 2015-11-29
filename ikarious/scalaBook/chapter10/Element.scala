abstract class Element {
  def contents: Array[String]
  val height: Int = contents.length
  val width: Int = if (height == 0) 0 else contents(0).length
 
  def demo() {
    println("Element's implementation invoked")
  }

  def above(that: Element): Element = 
    new ArrayElement(this.contents ++ that.contents)

  def beside(that: Element): Element = {
    val contents = new Array[String](this.contents.length)
      for ( i <- 0 until this.contents(i) + that.contents(i)
    new ArrayElement(
    for (
      (line1, line2) <- this.contents zip that.contents
    ) yield line1 + line2
    )
  } 

}
