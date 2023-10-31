import java.util.*;
class Leftrotate {
    public static void main(String[] args) {
        int np;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();
        int []arr = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i< size;i++){
            
            arr[i]=s.nextInt();
        }
        System.out.println("Orginal Array: "+Arrays.toString(arr));
        System.out.print("Enter the no.of shift postions to left: ");
        np=s.nextInt();
        for(int i = 0 ; i<np;i++){
            int temp = arr[0];
            for(int j =0;j<size-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[size-1]=temp;
        }
        System.out.println("Orginal Array: "+Arrays.toString(arr));
        System.out.println("Array after left rotate: "+Arrays.toString(arr));
        
    }
}