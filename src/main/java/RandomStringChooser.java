import java.util.*;
public class RandomStringChooser
{
private List<string> words;
  public RandomStringChooser (String [] wordArray)
  {
    words = new ArrayList<String>();
    for (String singleWord : wordArray){
         words.add(singleWord);
    }
  }

  public string getNext()
  {
    if (words.size > 0)
      return words.remove((int) (Math.random * words.size()));
    return "NONE";
}
