import java.util.Arrays;



// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int a[] = { 0, 1 , 3 , 5, 7 };
        String b[] = {"drimesh" , "kiran", "inshwar" ," ndira"};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        System.out.println(Arrays.asList(a));
        System.out.println(Arrays.asList(b));


        System.out.println(Arrays.deepToString(b));



    }
}