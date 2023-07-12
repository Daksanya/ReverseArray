import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        reverseArray(array,0,n-1);
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }
    }
    static void reverseArray(int array[],int start,int end){
        int i=start,j=end,temp;
        while(i<j){
            temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;j--;
        }
    }
}
