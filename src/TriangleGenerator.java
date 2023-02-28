import java.lang.reflect.Type;
import java.util.Scanner;
public class TriangleGenerator {
    private static void DuzUcgen(int size){
        for(int i = 1; i < size + 1; i++){
            for(int j = 0; j < size - i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < (i * 2) - 1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void DikUcgen(int size){
        for(int i = 1; i < size + 1; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    private static void TersUcgen(int size){
        for(int i = size; i > 0; i--){
            for(int j = 0; j < size - i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < (i * 2) - 1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void TersDikUcgen(int size){
        for(int i = size; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int TypedSize = Integer.parseInt(myObj.nextLine());
        DuzUcgen(TypedSize);
        System.out.println("");
        TersUcgen(TypedSize);
        System.out.println("");
        DikUcgen(TypedSize);
        System.out.println("");
        TersDikUcgen(TypedSize);
    }
}
/**
   *
  ***
 *****
*******

*****
 ***
  *


*
**
***
*/