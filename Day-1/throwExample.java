class ThrowExample {

    static void checkNumber(int num) {
        if (num < 0) {
            throw new ArithmeticException("Number is negative");
        }

        System.out.println("Number is positive");
    }

    public static void main(String[] args) {
        checkNumber(-5);
    }
}
