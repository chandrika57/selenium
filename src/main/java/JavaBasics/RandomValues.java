package JavaBasics;
import java.util.Random;

public class RandomValues {
    public static void main(String[] args) {
        Random random = new Random();
        int a=random.nextInt();
        int b= random.nextInt(100);
        System.out.println("int values" + "A:" +a+"   "+"B:" +b);
        float c=random.nextFloat();
        float d= random.nextFloat();
        System.out.println("float values" + "A:"+ c + "  "+"B:"+d);
        double e = random.nextDouble();
        double f = random.nextDouble();
        System.out.println("Double values:"+" "+"A:"+e +" " +"B:"+f);
        long g = random.nextLong();
        long h = random.nextLong();
        System.out.println("long values:" +"A:" +g +" "+"B:" +h);
        boolean i =random.nextBoolean();
        boolean j = random.nextBoolean();
        System.out.println("boolean values:" +"A:" +i +"  " +"B:"+j);




    }
}
