package study.abstractMember

/**
  * Created by kohunmin on 2016. 3. 1..
  */
class Concrete extends Abstract{
  override type T = String

  override def transform(x: T): T = x + x

  override val initial: T = "hi"
  override var current: T = initial
}
