package com.ClassObjectInterface;

public class ClassImplementsAbstractClass extends AbstractClass {

    public ClassImplementsAbstractClass(int numOfMonth) {
        super(numOfMonth);
    }

    @Override
    void printPhrase() {
        System.out.println("Print random phrase 1");
    }

}
