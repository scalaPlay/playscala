package study.homework.day4

/**
 * @author Yunseong
 */
object Exercise7_11 {
  def main(args: Array[String]): Unit = {
    val myTv3: MyTv3 = new MyTv3(0, 0)
    
    myTv3.channel = 10
    println("채널 : " + myTv3.channel)
    
    myTv3.channel = 20
    println("채널 : " + myTv3.channel)
    
    myTv3.gotoPrevChannel()
    println("채널 : " + myTv3.channel)
    
    myTv3.gotoPrevChannel()
    println("채널 : " + myTv3.channel)
  }
}

class MyTv3(private var _channel: Int, private var _volume: Int) {
  private var _isPowerOn: Boolean = false
  val MAX_VOLUME: Int = 100
  val MIN_VOLUME: Int = 0
  val MAX_CHANNEL: Int = 100
  val MIN_CHANNEL: Int = 0
  
  private[this] var _prevChannel: Int = _channel
  
  def channel = _channel
  def channel_=(channelNumber: Int): Unit = {
    savePrevChannel(_channel)
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
  
  def gotoPrevChannel(): Unit = {
    val prevChannel:Int = _prevChannel;
    
    savePrevChannel(_channel);
    
    channel = prevChannel
  }
  
  private def savePrevChannel(currentChannel: Int): Unit = {
    _prevChannel = currentChannel
  }

  def turnOnOff(): Unit = {
    this.isPowerOn = !isPowerOn
  }

  def volumeUp(): Unit = {
    if(volume < MAX_VOLUME) volume = volume + 1
  }

  def volumeDown(): Unit = {
    if(volume > MIN_VOLUME) volume = volume - 1 
  }

  def channerUp(): Unit =  {
    if(channel == MAX_CHANNEL) channel = MIN_CHANNEL else channel = channel + 1
  }

  def channerDown(): Unit =  {
    if(channel == MIN_CHANNEL) channel = MAX_CHANNEL else channel = channel - 1
  }

}