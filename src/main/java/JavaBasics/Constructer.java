package JavaBasics;

public class Constructer {
    int a, b;

    Constructer(int a,int b) {
        System.out.println("addiion : " + (a + b));
        System.out.println("subtraction : " + (a - b));
    }
    Constructer(int a, int b,int c){
        int salary = a;
        int allowences = b;
        int bonus = c;
         int totalsalary=salary+allowences+ bonus;
        System.out.println(totalsalary);
    }
    Constructer(int a,String b) {
        System.out.println(b+" salary is : "+a);
    }

    public static void main(String[] args) {
        Constructer c = new Constructer(20,10);
        Constructer c1= new Constructer(2000,10000,5000);
        Constructer c2 = new Constructer(200000,"ramu");

    }


}
