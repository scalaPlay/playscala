package study.exam.day3

/**
 * @author Yunseong
 */
object exam7_17 {

  def main(args: Array[String]): Unit = {
    searchFrom(1, args)
    //val i: Int = searchFrom(0, args)
  }

  def searchFrom(i: Int, args: Array[String]): Int = {
    if (i >= args.length) -1
    else if (args(i).startsWith("-")) searchFrom(i + 1, args)
    else if (args(i).endsWith(".scala")) i
    else searchFrom(i + 1, args)
  }

}