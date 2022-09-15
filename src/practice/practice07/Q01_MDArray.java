package practice.practice07;

public class Q01_MDArray {

    /*
     * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
     *  2D arrayinden min number print et
     */
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {2,3,1} , {5,5,5} , {2,1}};

        int minTemp = arr[0][0];    //arraydeki ilk degeri gecici olarak minimum deger olarak atiyoruz
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"].length = "+arr[i].length);
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < minTemp) {
                    minTemp = arr[i][j];
                }
            }
        }
        System.out.println("Arraydeki minimum deger : "+minTemp);
    }
}
