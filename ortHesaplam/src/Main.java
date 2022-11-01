public class Main {
    public static void main(String[] args) {
        double harmonikAvarage,harmonikSeries=0;
        int[] array={1,5,9,6};
        for (int i=0;i<array.length;i++){
            harmonikSeries+=(1.0/array[i]);
        }
        harmonikAvarage= array.length/harmonikSeries;
        System.out.println("Harmonik ort:"+harmonikAvarage);
    }
}