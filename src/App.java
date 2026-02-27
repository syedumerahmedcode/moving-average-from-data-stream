public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /**
         * You need to implement a class that calculates the moving average of a stream of integers within a sliding window of a fixed size.
        
        The MovingAverage class should support two operations:
        
        Constructor MovingAverage(int size): Initializes the object with a window size. This window will hold at most size recent values from the stream.
        
        Method next(int val): Adds a new integer val to the stream and returns the average of the most recent values in the window. If the total number of values seen so far is less than the window size, it returns the average of all values seen so far.
        
        For example, if the window size is 3:
        
        After adding the first value, the average is just that value
        After adding the second value, the average is of those two values
        After adding the third value, the average is of all three values
        After adding the fourth value, the window slides - it drops the first value and keeps only the most recent three values, then calculates their average
         */
        MovingAverage ma1 = new MovingAverage(3);
        System.out.println(ma1.next(1)); // Expected output: 1.0
        System.out.println(ma1.next(10)); // Expected output: 5.5
        System.out.println(ma1.next(3)); // Expected output: 4.67
        System.out.println(ma1.next(5)); // Expected output: 6.0
    }
}
