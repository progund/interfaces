import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
public class TestAnonymous{
  public static void main(String[] args){
    ArrayList<String> strings = new ArrayList<>();
    strings.add("CEPA");
    strings.add("bepa");
    strings.add("APA");
    strings.add("ABBA");
    strings.add("DEPA");
    strings.add("Baba");
    System.out.println("Unsorted: ");
    System.out.println(strings);
    Collections.sort(strings, new Comparator<String>(){
        @Override
        public int compare(String first, String other){
          return first.toLowerCase().compareTo(other.toLowerCase());
        }
      });
    System.out.println("Sorted disregarding case:");
    System.out.println(strings);
    Collections.sort(strings);
    System.out.println("Sorted using String's default compareTo:");
    System.out.println(strings);
  }
}
