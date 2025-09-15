public class SolutionReserveInteger {
    public int reverse(int x) {
        try{
            String number = Integer.toString(x);
            String reversed = new StringBuilder(number).reverse().toString();
        if (x < 0) {
            reversed = "-" + reversed.substring(0, reversed.length() - 1);
        }
        return Integer.parseInt(reversed);
        } catch (Exception e) {
            return 0;
        }
    }
}
