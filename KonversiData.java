import java.util.*;

public class KonversiData {
    public static void main(String[] args) {
      
      // a.
      int a = 30;
      String b = "2.5";
      double b_dub = Double.parseDouble(b);
      
      Double hasil_a = a + b_dub;
      System.out.println(hasil_a);
      
      // b.
      String a2 = "100";
      String b2 = "20";
      int a_int = Integer.parseInt(a2);
      int b_int = Integer.parseInt(b2);
      System.out.println(a_int < b_int);
      
      // c
      System.out.println(true && true || !true);
      
      // d
      System.out.println(true || (true && !true) && true && true);
      
      
  }
}