public class MultiplicationTable {
    public static void main(String[] args) {
        for(int i=0; i<13; i++){
            for(int j=0; j<13; j++){
                System.out.printf("%2d * %2d = %3d\n", i, j, (i*j));
            }
        }
    }
}