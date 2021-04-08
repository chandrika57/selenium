package JavaBasics;

public class AcendingOrder {
    public static void main(String[] args) {
        int temp=0,i,j;
        int[] arr ={10,9,7,1,2,8,6,4};
        for(i=0;i< arr.length;i++){
            for(j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
            System.out.println(arr[i]);
        }

    }
}
