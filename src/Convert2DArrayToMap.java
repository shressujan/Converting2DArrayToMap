import java.util.HashMap;
import java.util.Map;

public class Convert2DArrayToMap {


  public static void main(String[] args) {

  String[][] array = new String[5][5];
  Map<String, Map<String, String>> arrayMap = new HashMap<>();

    System.out.println("\n\n**INITIALIZE ARRAY**\n\n");

    for (int i = 0; i < array.length; i++) {
      Map<String, String> secondMap = new HashMap<>();
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = i + "" + j;
        secondMap.put(j + "", array[i][j]);
      }
      arrayMap.put(i + "", secondMap);
    }

    System.out.println("\n\n**PRINT ARRAY**\n\n");

    for (String[] secondDimArray: array
         ) {
      for (String value : secondDimArray
           ) {
        System.out.println(value);
      }
      System.out.println();
    }

    System.out.println("\n\n**PRINT MAP**\n\n");

    for (String i : arrayMap.keySet()
         ) {
      System.out.println("keySet: "+ i);
      Map<String, String> secondMap = arrayMap.get(i);
      System.out.println("Second Map: "+ secondMap);
      System.out.println();

      for (String j: secondMap.keySet()
           ) {
        System.out.println("Second Map Key: " + j);
        System.out.println("Value: " + secondMap.get(j));
      }
      System.out.println();
    }

  }
}
