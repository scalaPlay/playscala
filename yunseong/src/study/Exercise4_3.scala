package study

/**
 * @author Yunseong
 */
object Exercise4_3 {
    def main(args: Array[String]): Unit = {
        printSum(10)
    }
    
    /**
     * maxNumber까지의 합을 출력하는 메소드
     * 
     * @author Yunseong
     */
    def printSum(maxNumber: Int): Unit = {
        println("1부터 " + maxNumber + "까지의 총 합은 " + currentSum(maxNumber) + "입니다.")
    }
    
    /**
     * 1부터 maxNumber까지를 더하는 메소드
     * 
     * @author Yunseong
     * @return
     */
    def currentSum(maxNumber: Int): Int = {
        currentSum(1 to maxNumber)
    }
    
    /**
     * 1부터 maxNumber까지를 더하는 메소드
     * 
     * @author Yunseong
     * @return
     */
    def currentSum(list: Range): Int = {
        if(list.size > 0) {
        	var sum = 0;
        	
        	list.foreach { x => sum += x }
        	
        	sum + currentSum(list.dropRight(1))
        } else {
            0
        }
    }
    
}
