package study.TypeParameter

/**
  * Created by kohunmin on 2016. 2. 27..
  */
class Person(val firstName: String, val lastName: String)
  extends Ordered[Person]{

  def compare(that: Person) = {
    val lastNameComparison =
      lastName.compareToIgnoreCase(that.lastName)
    if (lastNameComparison != 0)
      lastNameComparison
    else
      firstName.compareToIgnoreCase(that.firstName)
  }
  override def toString = firstName + " " + lastName
}

object Person{
  def orderedMergeSort[T <: Ordered[T]](xs:List[T]): List[T] = {
    def merge(xs: List[T], ys: List[T]): List[T] =
      (xs, ys) match {
        case (Nil, _) => ys
        case (_, Nil) => xs
        case (x :: xsl, y :: ysl) =>
          if (x < y) x :: merge(xsl, ys)
          else y :: merge(xs, ysl)
      }
    val  n = xs.length / 2
    if ( n == 0 ) xs
    else {
      val (ys, zs) = xs splitAt n
      merge(orderedMergeSort(ys), orderedMergeSort(zs))
    }
  }
  def main(args: Array[String]) {
    val robert = new Person("Robert", "Jones")
    val sally = new Person("Sally", "Smith")

    print (robert < sally)

    val people = List(
      new Person("Larray", "Wall"),
      new Person("Anders", "Hejlsberg"),
      new Person("Guido", "van Rossum"),
      new Person("Alan", "Kay"),
      new Person("Yukihiro", "Matsumoto")
    )

    val sortedPeople = orderedMergeSort(people)
    println(sortedPeople)

    //val wontCompile = orderedMergeSort(List(3, 2, 1))
    //println(wontCompile)
  }
}