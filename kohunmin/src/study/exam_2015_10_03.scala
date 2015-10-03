package study

object exam_2015_10_03 {
    def main(args: Array[String]): Unit = {
       println (exam4_3(10))
       println (exam4_4(100))
    }
    def exam4_3(index: Int): Int = {
        var temp = 0
        for (i <- 1 to index)
          for(j <- 1 to i)
            temp += j
        temp
    } 
    def exam4_4(max: Int): Int = {
      var sumNum = 0
      var index = 0
      while(sumNum >= max) {
        index += 1;
        if(index % 2 == 0)
          sumNum -= index
        else
          sumNum += index
      }
      return index
    }
}



