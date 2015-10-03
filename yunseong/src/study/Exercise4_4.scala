package study

/**
 * @author Yunseong
 */
object Exercise4_4 {
    def main(args: Array[String]): Unit = {
        oddSum(100)
    }
    
    /**
     * 반복된 횟수와 총합을 출력한다.
     * 
     * @author Yunseong
     */
    def printOddSum(count: Int, total: Int): Unit = {
        System.out.println(count + "까지 더해야 총합이 " + total + "이 됩니다.");
    }
    
    /**
     * while문으로 limit까지 계속 반복하면서 count값을 더한다.
     * 더한 값이 limit를 초과할 때 반복이 끝나고, printOddSum에 값을 전달한다.
     * 
     * @author Yunseong
     */
    def oddSum(limit: Int): Unit = {
        var total = 0;
        var count = 1;
        
        while(limit > total) {
            total += convertValue(count)
            count += 1
        }
        
        printOddSum(count - 1, total)
    }
    
    /**
     * number가 짝수면 양수/음수를 변환하여 리턴하고
     * 홀수면 그대로 리턴함
     * 
     * @return
     * @author Yunseong
     */
    def convertValue(number: Int): Int = {
        if(number % 2 == 0) -number else number
    }
}