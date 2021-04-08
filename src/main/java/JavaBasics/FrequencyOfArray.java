package JavaBasics;

public class FrequencyOfArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        int[] fr = new int[a.length];
        int repeat = -1;    //we will take any negative value
        for (int i =0; i<a.length; i++) {
            int count=1;
            for(int j=i+1;j<a.length;j++){
                if(a[j]==a[i]){
                    count++;
                    fr[j]=repeat;
                    fr[i]=count;
                }

            }
            if(fr[i]!=repeat){
                fr[i]=count;

            }
            System.out.println(i +" index  frequency  is "+fr[i]);
        }
    }
}

