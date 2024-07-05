class Tester {
    
    public static int calculatePower(int num, int p) {
        if (p == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= p; i++) {
            result *= num;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(calculatePower(2, 3));
        System.out.println(calculatePower(0,10));
    }
}
