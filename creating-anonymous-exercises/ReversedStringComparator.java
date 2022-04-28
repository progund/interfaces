import java.util.Comparator;

public class ReversedStringComparator implements Comparator<String> {
  
  @Override
  public int compare(String first, String other) {
    return other.toLowerCase().compareTo(first.toLowerCase());
  }

}
