class Propagation {
    void methodB() {
        try {
            int x = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Number format error handled in methodB");
        }
        String s = null;
        System.out.println(s.length());
    }
    void methodA() {
        try {
            methodB();
        } catch (Exception e) {
            System.out.println("Exception propagated to methodA: " + e);
        }
    }
    public static void main(String[] args) {
        new Propagation().methodA();
    }
}
