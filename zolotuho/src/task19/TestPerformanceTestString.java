package task19;

public class TestPerformanceTestString {
    public static void main(String[] args) {
        int loopLimit = 10000;
        PerformanceTestString test = new PerformanceTestString();
        long timeString = test.calculateExecutionTimeString(loopLimit);
        long timeStringBuilder = test.calculateExecutionTimeStringBuilder(loopLimit);
        long timeStringBuffer = test.calculateExecutionTimeStringBuffer(loopLimit);
        System.out.println("Execution time of string concatenating =     " + timeString);
        System.out.println("Execution time of stringBuilder appending =  " + timeStringBuilder);
        System.out.println("Execution time of stringBuffer appending =   " + timeStringBuffer);
    }
}
