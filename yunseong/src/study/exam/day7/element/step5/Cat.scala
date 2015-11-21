package study.exam.day7.element.step5

/**
 * @author Yunseong
 */
class Cat {
  val dangerous = false
}

class Tiger(override val dangerous: Boolean, private var age: Int) extends Cat {
  
}