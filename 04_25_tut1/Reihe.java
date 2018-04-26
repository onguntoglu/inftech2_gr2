public class Reihe{
    public static boolean istdoppelt(char[] arr, int i){
        if(i > arr.length - 1){
            return false;
        }

        if (arr[i] == arr[i+1]){
            return true;
        }

        return istdoppelt(arr, i+1);
    }
}