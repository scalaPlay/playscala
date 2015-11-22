package study.homework.day4

/**
 * @author Yunseong
 */
object Exercise7_10 {
  def main(args: Array[String]): Unit = {
    var tv2:MyTv2 = new MyTv2(100, 100)
    
    tv2.channel = 10
    println("채널 : " + tv2.channel)
    
    tv2.volume = 20
    println("볼륨 : " + tv2.volume)
  }
}

class MyTv2(private var _channel:Int, private var _volume: Int) {
  private var _isPowerOn:Boolean = false
  val MAX_VOLUME:Int = 100
  val MIN_VOLUME:Int = 0
  val MAX_CHANNEL:Int = 100
  val MIN_CHANNEL:Int = 0
  
  def channel = _channel
  def channel_=(channelNumber: Int): Unit = {
    println("set Channel : " + channelNumber)
    _channel = channelNumber
  }
  
  def volume = _volume
  def volume_=(volumeNum: Int): Unit = {
    println("set volumn : " + volumeNum)
    _volume = volumeNum    
  }

  def isPowerOn = _isPowerOn
  def isPowerOn_=(flag:Boolean): Unit = {
    println("isPowerOn : " + flag)
    _isPowerOn = flag
  }
  

  def turnOnOff(): Unit = {
    this.isPowerOn = !isPowerOn
  }

  def volumeUp(): Unit = {
    if(volume < MAX_VOLUME) volume = volume + 1
  }

  def volumeDown(): Unit =  {
    if(volume > MIN_VOLUME) volume = volume - 1 
  }

  def channerUp(): Unit =  {
    if(channel == MAX_CHANNEL) channel = MIN_CHANNEL else channel = channel + 1
  }

  def channerDown(): Unit =  {
    if(channel == MIN_CHANNEL) channel = MAX_CHANNEL else channel = channel - 1
  }

}