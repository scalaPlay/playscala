package study.abstractMember

/**
  * Created by kohunmin on 2016. 3. 1..
  */
trait Abstract {
  type T
  def transform(x: T) : T
  val initial: T
  var current: T
}
