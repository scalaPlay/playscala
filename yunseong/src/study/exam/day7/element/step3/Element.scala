package study.exam.day7.element.step3

/**
 * @author Yunseong
 */
abstract class Element {
  def contents: Array[String]
  val height: Int = contents.length
  val width: Int = 
    if(height == 0) 0 else contents(0).length()
}