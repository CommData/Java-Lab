class ExpTwo {
    public int sum(int a, int b) {
        System.out.println("Method with two arguments\n");
        return a+b;
    }

    public int sum(int a, int b, int c) {
        System.out.println("Method with three arguments\n");
        return a+b+c;
    }

    public float sum(float a, float b, float c, float d) {
        System.out.println("Method with four arguments\n");
        return a+b+c+d;
    }
    public static void main(String[] args) {
        System.out.println("Shivam Singh\n07313302720\nCSE-5A\n");
        ExpTwo obj1 = new ExpTwo();
        System.out.println(obj1.sum(5,2));
        System.out.println(obj1.sum(5,2, 3));
        System.out.println(obj1.sum(5.1f,2.3f, 3.3f, 1.5f));
    }
}