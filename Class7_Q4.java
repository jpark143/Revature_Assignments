package com.company.Assignment;

// create abstract class
abstract class Marks{
    // create abstract method
    abstract void getPercentage();
}
// create class A
class A extends Marks{
    int subject1;
    int subject2;
    int subject3;

    public A(int subject1, int subject2, int subject3){
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    void getPercentage() {
        // display all three marks
        System.out.println("Student A marks: " + subject1 + "%, " + subject2 + "%, " + subject3 + "%");
    }
}
// create class B
class B extends Marks{
    int subject1;
    int subject2;
    int subject3;
    int subject4;

    public B(int subject1, int subject2, int subject3, int subject4){
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;

    }

    @Override
    void getPercentage() {
        // display all four marks
        System.out.println("Student B marks: " + subject1 + "%, " + subject2 + "%, " + subject3 + "%, " + subject4 + "%");

    }
}

public class Class7_Q4 {
    public static void main(String[] args) {
        // three marks for student A
        A studentA = new A(70,80,90);
        // four marks for student B
        B studentB = new B(70,80,85,95);

        studentA.getPercentage();
        studentB.getPercentage();
    }
}
