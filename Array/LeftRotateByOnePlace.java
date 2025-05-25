import java.util.Arrays;
public class Main
{
    public static void leftRotateByOnePlace(int[] arr){
        int firstElement = arr[0];
        for(int i = 1; i < arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length -1] = firstElement;
        System.out.println(Arrays.toString(arr));
    }
	public static void main(String[] args) {
	    int[] arr = {1,2,3,7,5};
		leftRotateByOnePlace(arr);
	}
}
