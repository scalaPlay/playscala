package study.exercise

import scala.collection.immutable.HashMap


class Exercise11_12 {
  def main(args: Array[String]): Unit = {
    var deck = new SutdaDeck()
    
    deck.shuffle()
    
    var p1 = new Player("타짜",deck.pick() , deck.pick())
    var p2 = new Player("고수",deck.pick() , deck.pick())
    
    println(p1 + " " + deck.getPoint(p1))
    println(p2 + " " + deck.getPoint(p2))
    
  }
}

class SutdaDeck{
  final var CARD_NUM = 20;
  var cards = for{ i <- 1 to CARD_NUM
    num = i % 10 + 1
    isKwang = i < 10 && (num == 1 || num ==3 || num == 8)
  } yield new SutdaCard(num,isKwang)
  
  var pos:Int = 0;
  var jokbo: Map[String,Int] = Map()
  
  registerJokbo()
  
  def registerJokbo() = {
     /*
(1) 아래의 로직에 맞게 코드를 작성하시오.
1. jokbo(HashMap)에 족보를 저장한다.
두 카드의 값을 문자열로 붙여서 key로, 점수를 value로 저장한다.
*/
    jokbo += {"KK" -> 4000}
    jokbo += {"1010" -> 3100}
    jokbo += {"99" -> 3090}
    jokbo += {"88" -> 3080}
    jokbo += {"77" -> 3070}
    jokbo += {"66" -> 3060}
    jokbo += {"55" -> 3050}
    jokbo += {"44" -> 3040}
    jokbo += {"33" -> 3030}
    jokbo += {"22" -> 3020}
    jokbo += {"11" -> 3010}
    jokbo += {"12" -> 2060}
    jokbo += {"21" -> 2060}
    jokbo += {"14" -> 2050}
    jokbo += {"41" -> 2050}
    jokbo += {"19" -> 2040}
    jokbo += {"91" -> 2040}
    jokbo += {"110" -> 2030}
    jokbo += {"101" -> 2030}
    jokbo += {"410" -> 2020}
    jokbo += {"104" -> 2020}
    jokbo += {"46" -> 2010}
    jokbo += {"64" -> 2010}
  }
  
  def getPoint(p: Player) : Int = {
    if(p==null) 0
    
    var c1 : SutdaCard = p.c1
    var c2 : SutdaCard = p.c2
    
    var result : Int = 0;
    
    /*
    (2) 아래의 로직에 맞게 코드를 작성하시오.
    1. 카드 두 장이 모두 광이면, jokbo에서 키를 "KK"로 해서 점수를 조회한다.
    2. 두 카드의 숫자(num)로 jokbo에서 등급을 조회한다.
    3. 해당하는 등급이 없으면, 아래의 공식으로 점수를 계산한다.
    (c1.num + c2.num) % 10 + 1000
    4. Player의 점수(point)에 계산한 값을 저장한다.
    */
    
    return result.intValue();
  }
  
  def pick() : SutdaCard = {
    var c : SutdaCard = null;
    
    if(0 <= pos && pos < CARD_NUM){
      c
    }else {
      throw new Exception("남아 있는 카드가 없습니다.")
    }
  }
  
  def shuffle() = {
    
  }
  
  
}

class Player(var name: String, var c1 : SutdaCard, var c2 : SutdaCard){
  var point: Int = 0;
  override def toString = "[" + name + "]" + c1.toString() + "," + c2.toString()
}

class SutdaCard(var num:Int, var isKwang: Boolean){
  def this() = this(1, true)
  override def toString = num + (if(isKwang) "K" else "")
}
