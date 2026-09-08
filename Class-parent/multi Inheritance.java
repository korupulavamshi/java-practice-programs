class Parent1 {
    void display1() {
        System.out.println("This is Parent 1");
    }
}

class Parent2 {
    void display2() {
        System.out.println("This is Parent 2");
    }
}

// Trying to inherit from two classes
class Child extends Parent1, Parent2 {
    public static void main(String[] args) {
        Child obj = new Child();

        obj.display1();
        obj.display2();
    }
}
