class Main extends SuperClass {
    void hello() {
        System.out.println("This is the main class");
    }
    public static void main(String[] args) {
        System.out.println("Shivam Singh\n07313302720\nCSE-5A\n");
        //calling the constructor
        Main ob = new Main();
        //calling the inherited name class
        ob.name();
    }
}

class SuperClass {
    SuperClass() {
        System.out.println("This is the constructor");
    }
    void name() {
        System.out.println("hello world");
    }
}
