package com.java.sample.core.oops.inheritance.examples.e001;

public class DiamondProblemExample_001 {
    public void display(){
        System.out.println("Super class display() method called");
    }
}
class ChildOfDiamond extends DiamondProblemExample_001{
    @Override
    public void display(){
        System.out.println("child's display() method called");
    }
}
class SecondChildOfDiamond extends DiamondProblemExample_001{
    @Override
    public void display(){
        System.out.println("2nd child's display() method called");
    }
}
//Below throws Compilation Error
/*class GrandChild extends ChildOfDiamond, SecondChildOfDiamond{
    public static void main(String[] args) {
       GrandChild grandChild = new GrandChild();
        //creates ambiguity which display() method to call
        grandChild.display();
    }
}*/
