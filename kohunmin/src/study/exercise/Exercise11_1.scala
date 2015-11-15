package study.exercise


object Exercise11_1 {
  def main(args: Array[String]): Unit = {
    var list1 = List[Int]()
    var list2 = List[Int]()
    var kyo = List[Int]()
    var cha = List[Int]()
    var hap = List[Int]()
    
    list1 :+= 1
    list1 :+= 2
    list1 :+= 3
    list1 :+= 4
    
    list2 :+= 3
    list2 :+= 4
    list2 :+= 5
    list2 :+= 6
    
    kyo = list1.intersect(list2)
    hap = list1.union(list2)
    cha = list1.diff(list2)
    
    println(list1)
    println(list2)
    println(kyo)
    println(cha)
    println(hap)
  }
}