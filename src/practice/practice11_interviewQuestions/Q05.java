package practice.practice11_interviewQuestions;

public class Q05 {
    //normal toplama methodu ve varrargs ile toplama methodu yaziniz

    public static void main(String[] args) {

        int[] arr = {17, 23, 33, 9, 20, 55};
        System.out.println("arrTopla(arr) = " + arrTopla(arr));
        varargsToplaList(25,55,63,21,20);
        System.out.println("varargsToplaArr(arr) = " + varargsToplaArr(arr));

        //varargs array gibi davrandigi icin herhangi bir arrayi parametre olarak verebiliriz
    }

    private static int varargsToplaArr(int... arr) {
        int toplam = 0;
        for (int each:arr) {
            toplam += each;
        }
        return toplam;
    }

    private static void varargsToplaList(int i, int i1, int i2, int i3, int i4) {

    }

    private static int arrTopla(int[] arr) {
        int toplam = 0;

        for (int each:arr) {
            toplam += each;
        }
        return toplam ;
    }
}
