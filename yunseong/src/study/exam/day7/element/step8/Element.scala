package study.exam.day7.element.step8

import study.exam.day7.element.step5.ArrayElement

/**
 * @author Yunseong
 */
abstract class Element {
  def contents: Array[String]
  def width: Int =
    if (height == 0) 0 else contents(0).length()
  def height: Int = contents.length
  def above(that: Element): Element =
    new ArrayElement(this.contents ++ that.contents)
  def beside(that: Element): Element = 
    new ArrayElement(
      for (
          (line1, line2) <- this.contents zip that.contents
      ) yield line1 + line2
    )
  
  override def toString = contents mkString "\n"
  
  
}

class ArrayElement(val contents: Array[String]) extends Element {
  
}
