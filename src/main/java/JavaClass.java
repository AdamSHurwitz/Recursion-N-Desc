/**
 * Created by adamhurwitz on 3/10/16.
 */
public class JavaClass {
    static int n = 18;
    public static void main(String arg[]){
        nDesc(n);
        //System.out.println();
    }
    public static void nDesc(int n){
        System.out.println(n);
        if (n == 0){
         return;
        }
        nDesc(n-1);
    }
}
