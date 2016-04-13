//package sevenLanguage.oneDay.exam

/**
  * Created by kohunmin on 2016. 4. 2..
  */

class tictac {

  // Map과 같은 형태로 저장한다
  var board = Array.fill[String](3, 3)(".")


  def setMark(x: Int, y: Int, mark: String): Unit = {
    board(y)(x) = mark
    println(board.map(_.mkString(" ")).mkString("\n"))
  }


  // 좌표와 mark를 집어넣은다
  def run(x: Int, y: Int, mark: String): Unit = board(x)(y) match {
    case "." => printf("(%d,%d) = %s \n잘 두었습니다\n",x,y,mark) ; setMark(x, y, mark)
    case _   => printf("(%d,%d) 이미 그자리에 두었습니다\n",x,y)
  }

  /**
    * 계산하여 이긴사람을 반환하거나 없으면 빈값을 반환한다
    */
  def estimate(): Unit = {

  }
}

object main {
  def main(args: Array[String]): Unit = {
    val tictac = new tictac()
    tictac.run(1, 2, "O")
    tictac.run(2, 2, "O")
  }
}
