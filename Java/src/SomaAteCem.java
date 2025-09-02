public class SomaAteCem {
    public static void main(String[] args) {
        Integer total = 0;

        for (int i = 1 ; i <= 100 ; i++){
            if(i % 2 == 0){
                total += i;
            }
        }
        System.out.printf("A soma foi %d", total);
    }
}
