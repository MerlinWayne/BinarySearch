/**
 * Created by behi_ on 08.12.2016.
 */
public class BinaryS {
    public static int binarySearch(short[] a, short e){
        int low = 0;
        int high = a.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;
            short midVal = a[mid];
            if(e < midVal) high = midVal-1;
            else if(e > midVal) low = midVal+1;
            else return mid;
        }

        return -1;
    }

    public static void main(String[] args){
        System.out.println("");
    }
}
