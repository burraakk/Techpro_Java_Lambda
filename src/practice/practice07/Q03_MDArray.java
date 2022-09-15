package practice.practice07;

public class Q03_MDArray {

    /*
     * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
     * yaziniz
     * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
     *
     * OUTPUT : Arraydeki cift sayilarin toplami : 30
     */
    public static void main(String[] args) {
        int[][] arr = {{1,3,6},{2,8},{5,7,9,14}};

        System.out.println("Arraydeki cift sayilarin toplami : "+ciftElemanlariTopla(arr));
    }

    public static int ciftElemanlariTopla(int[][] arr) {
        int toplam = 0;

        for (int[] each : arr) {
            for (int j : each) {
                if (j%2 == 0) {
                    toplam += j;
                }
            }
        }
        return toplam;
    }
}
