class Student {

    static String college = "MVSR Engineering College";
    final int rollNo = 101;

    public static void main(String[] args) {

        Student s = new Student();

        System.out.println("College: " + Student.college);
        System.out.println("Roll No: " + s.rollNo);
    }
}
