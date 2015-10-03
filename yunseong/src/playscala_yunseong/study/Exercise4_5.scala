package study20151003

/**
 * @author Yunseong
 */
object Exercise4_5 {
    def main(args: Array[String]): Unit = {
        oddSum(100)
    }
    
    def printOddSum(count: Int, total: Int): Unit = {
        System.out.println(count + "까지 더해야 총합이 " + total + "이 됩니다.");
    }
    
    def oddSum(limit: Int): Unit = {
        var total = 0;
        var count = 1;
        
        while(limit > total) {
            total += convertValue(count)
            count += 1
        }
        
        printOddSum(count - 1, total)
    }
    
    def convertValue(number: Int): Int = {
        if(number % 2 == 0) -number else number
    }
}