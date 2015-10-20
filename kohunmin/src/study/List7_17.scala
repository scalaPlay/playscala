package study

object List7_17 {
  def main(args: Array[String]): Unit = {
    val i = searchFrom(0, args)
  }
  def searchFrom(i: Int, args: Array[String]): Int =
    if (i >= args.length) -1
    else if (args(i).startsWith("-")) searchFrom(i + 1, args)
    else if (args(i).endsWith(".scala")) i
    else searchFrom(i + 1, args)
}