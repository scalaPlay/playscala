//package sevenLanguage.oneDay.exam

/**
  * Created by kohunmin on 2016. 4. 2..
  */
class mark
class tic extends mark
class tac extends mark

class tictac {


  // Map과 같은 형태로 저장한다
  var board = Array.tabulate[mark](10,10)


  // 좌표와 mark를 집어넣은다
  def run(x : Int , y : Int , mark: mark): Unit ={
    print(board)

    return estimate()
  }

  def set(x : Int , y : Int , mark: mark): Unit = {

  }

  /**
    *  계산하여 이긴사람을 반환하거나 없으면 빈값을 반환한다
    */
  def estimate(): Unit = {

  }

  def main(args: Array[String]) {
    val tictac = new tictac()
    tictac.run(1,2,new tic)
  }
}
