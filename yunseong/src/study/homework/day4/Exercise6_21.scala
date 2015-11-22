package study.homework.day4

/**
 * @author Yunseong
 */
object Exercise6_21 {
  def main(args: Array[String]): Unit = {
    var t:MyTv = new MyTv(100, 0)

    println("채널 : " + t.channel + ", 볼륨 : " + t.volume)

    t.channerDown()
    t.volumeDown()

    println("채널 : " + t.channel + ", 볼륨 : " + t.volume)   

    var t2:MyTv = new MyTv(99, 100)    

    t2.channerUp()
    t2.volumeUp()

    println("채널 : " + t2.channel + ", 볼륨 : " + t2.volume)       
  }
}

class MyTv(var channel: Int, var volume: Int) {
  var isPowerOn: Boolean = false
  val MAX_VOLUME: Int = 100
  val MIN_VOLUME: Int = 0
  val MAX_CHANNEL: Int = 100
  val MIN_CHANNEL: Int = 0

  def turnOnOff(): Unit = {
    this.isPowerOn = !isPowerOn
  }

  def volumeUp(): Unit = {
    if(volume < MAX_VOLUME) volume = volume + 1
  }

  def volumeDown(): Unit = {
    if(volume > MIN_VOLUME) volume = volume - 1 
  }

  def channerUp(): Unit = {
    if(channel == MAX_CHANNEL) channel = MIN_CHANNEL else channel = channel + 1
  }

  def channerDown(): Unit = {
    if(channel == MIN_CHANNEL) channel = MAX_CHANNEL else channel = channel - 1
  }

}