class q1 {

    public static void main(String[] args) {
        System.out.println("main");
        double a = 0;
        try {
            a = mul(23, 4);
        } catch (ArithmeticException e) {
            System.out.println(e);

        }

        System.out.println(a);

    }

    public static double mul(double a, double b) throws ArithmeticException {
        if (a == 0 || b == 0) {
            throw new ArithmeticException();
        } else {
            return a * b;
        }
    }

}