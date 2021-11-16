import java.util.Random;

public class massiv {
    public static void main(String[] args){
        int[] array = new int[20];
        for(int i=0; i < array.length; i++){
            array[i]=i;
            Random rnd= new Random();
            System.out.println(rnd.nextInt());
        }
        System.out.println(summamassiv(array));
        if(summamassiv(array) % 2 == 0){
            System.out.println("ЧЕТНО");
        }
        else {
            System.out.println("НЕЧЕТНО");
        }
    }
    private static float summamassiv(int[] a){
        int b = 0;
        for(int j = 0; j<a.length; j++){
            b += a[j];
        }
        return (float) b/a.length;
    }
}
