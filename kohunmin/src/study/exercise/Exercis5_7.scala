package study.exercise


object Exercis5_7 {
  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("USAGE: java Exercis5_7 3120")
    }

    var money = Integer.parseInt(args(0))

    println("money=" + money)

    val coinUnit = Array(500, 100, 50, 10)
    val coin = Array(5, 5, 5, 5)

    for ( (x,i) <- coinUnit.view.zipWithIndex) {
      var result = money / x
      if(result > coin(i))
        result = coin(i)
      money -= x * result
      coin(i) -= result
    }

    if (money > 0) {
      println("거스름돈이 부족합니다.")
    }
    
    println("=남은 동전의 개수 =")
    
    for( ( x , y )<- (coinUnit zip coin))
      println(x + "원:"+ y)

  }
}