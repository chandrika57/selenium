package JavaBasics;

public class SuperKeyword {// Superclass (parent)
        int x = 20;
        void m1(){
            System.out.println("parent class");
        }
    }
    class Child extends SuperKeyword{// Subclass (child)
        int x=10;
        void m1(){
            super.m1();// Call the superclass method
            int x=30;
            System.out.println("local variable : "+x);// Call local variable
            System.out.println("instance variable : "+this.x);// Call the instance variable
            System.out.println("parent class  variable : " +super.x);// Call the superclass variable
        }

        public static void main(String[] args) {

            Child c =new Child();//create object
            c.m1();//call child class method

        }
  }


