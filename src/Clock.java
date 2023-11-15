
public class Clock {

    public static void main(String[] args) {
        int secondsSum = getSeconds(20, 33, 30);
        System.out.println(secondsSum);

    }

    static int getSeconds(int h, int m, int s) {
        int secondsSum = h * 60 * 60 + m * 60 + s;
        return secondsSum;
    }

}
