class LineElement(s: String) extends Element {
  val contents = Array(s)
  
  override def width = s.length
  override def height = 1 

  override def demo() {
    println("Array Element's implementation invoked")
  }
}