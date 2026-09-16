class Parent {
    String name = "Parent";

    void display() {
        System.out.println("This is Parent class");
    }
}

class Child extends Parent {
    String name = "Child";

    void show() {
        System.out.println("Child name: " + this.name);
        System.out.println("Parent name: " + super.name);

        this.displayChild();
        super.display();
    }

    void displayChild() {
        System.out.println("This is Child class");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
