import java.util.ArrayList;
import java.util.Locale;

public class ArrayListAlgorithms
{
    /** Returns true if any of the elements in stringList contain
     *  target as a substring; false otherwise.  Use indexOf instead of contains
     *  for AP practice! (although in reality, contains is preferred)
     *
     *  Does NOT mutate (modify) elements of stringList.
     *  PRECONDITION: stringList.size() > 0
     *
     *  @param stringList  original arraylist of Strings
     *  @return  true if target is found in any of the strings, false otherwise
     */
    public static boolean containsTarget(ArrayList<String> stringList, String target){
    for(String str: stringList){
        if(str.contains(target)){
            return true;
        }
    }
    return false;
    }
    /** Returns number of elements in intList that are less than the
     *  average of all elements.
     *
     *  Does NOT mutate (modify) elements of intList.
     *  PRECONDITION: intList.size() > 0
     *
     *  @param intList  original arraylist of Integers
     *  @return  the number of ints in intList that are less than the average
     */
    public static int belowAverage(ArrayList<Integer> intList){
        int total = 0;
        double average = 0.0;
        for(int i = 0; i < intList.size(); i++){
            average += intList.get(i);
        }
        average = average * 1.0/intList.size();
        for(int z: intList){
            if(z < average){
                total++;
            }
        }
        return total;
    }
    /** Replaces all words in wordList that end in "s" with the all-uppercase
     *  version of the word.  For example, "apples" should be replaced with "APPLES".
     *  Assume all letters of all words in wordList are lowercase initially (no need
     *  to worry about checking for case or converting first to lowercase)
     *
     *  DOES mutate (modify) elements of wordList.
     *  PRECONDITION: wordList.size() > 0
     *
     *  @param wordList  original arraylist of words
     */
    public static void replaceWithCaps(ArrayList<String> wordList){
        for(int i = 0; i < wordList.size(); i++)
        {
            int length = wordList.get(i).length();
            if(wordList.get(i).substring(length - 1).equals("s"))
            {
                wordList.set(i, wordList.get(i).toUpperCase());
            }
        }
    }
    public static int indexOfMinimum(ArrayList<Integer> intList)

    {
        int minimum = Integer.MAX_VALUE;
        int idx = 0;
        int finalIdx = 0;
        for(int num : intList)
        {
            if(num < minimum)
            {
                finalIdx = idx;
                minimum = num;
            }
            idx++;
        }
        return finalIdx;
    }


    public static boolean areIdentical(ArrayList<Integer> numList1, ArrayList<Integer> numList2)
    {
        boolean identical = true;
        for(int i = 0; i < numList1.size(); i++)
        {
            if(!(numList1.get(i) == numList2.get(i)))
            {
                identical = false;
            }
        }
        return identical;
    }

    public static void removeOdds(ArrayList<Integer> numList)
    {
        for(int i = 0; i < numList.size(); i++)
        {
            if(numList.get(i) % 2 != 0)
            {
                numList.remove(i);
                i--;
            }
        }
    }
    public static void wackyVowels(ArrayList<String> wordList)
{
    for(int i = 0; i < wordList.size(); i++)
    {
        String word = wordList.get(i);
        boolean containsVowels = (word.indexOf("a") != -1 || word.indexOf("e") != -1 ||word.indexOf("i") != -1 ||word.indexOf("o") != -1);
        if(containsVowels)
        {
            wordList.remove(i);
            i--;
        }
        else
        {
            wordList.add(i, word);
            i++;
        }
    }
}

    public static void removeDuplicates(ArrayList<Integer> intList)
    {
        for(int i = 0; i < intList.size(); i++)
        {
            for(int j = i; j < intList.size(); j++)
            {
                if(j != i)
                {
                    if(intList.get(j) == intList.get(i))
                    {
                        intList.remove(j);
                        j--;
                    }
                }

            }
        }
    }







    /** Adds an uppercase version of each string directly AFTER the string
     *  in wordList; for example, if wordList is ["hello", "my", "best", "friend"]
     *  this this method modifies wordList to be:
     *  ["hello", "HELLO", "my", "MY", "best", "BEST", "friend", "FRIEND"]
     *
     *  Assume all words have lowercase letters originally
     *
     *  DOES mutate (modify) elements in wordList
     *  PRECONDITION: wordList.size() > 0
     *
     *  @param wordList  arraylist of Strings
     */
    public static void duplicateUpperAfter(ArrayList<String> wordList){
        for(int i = 0; i < wordList.size(); i++){
            String insert = wordList.get(i).toUpperCase();
            wordList.add(i+1, insert);
            i++;
            }
        }
    /** Appends an uppercase version of each string to the END of of wordList;
     *  the uppercase versions appear in the same order as the lowercase versions
     *  for example, if wordList is ["hello", "my", "best", "friend"]
     *  this this method modifies wordList to be:
     *  ["hello", "my", "best", "friend", "HELLO", "MY", "BEST", "FRIEND"]
     *
     *  Assume all words have lowercase letters originally
     *
     *  DOES mutate (modify) elements in wordList
     *  PRECONDITION: wordList.size() > 0
     *
     *  @param wordList  arraylist of Strings
     */
    public static void duplicateUpperEnd(ArrayList<String> wordList){
        int last = wordList.size();
        for(int i = 0; i < last; i++){
            wordList.add((last + i),wordList.get(i).toUpperCase());
        }
    }

    public static ArrayList<String> parseWordsAndReverse(String sentence)
    {
        ArrayList<String> returnList = new ArrayList<String>();
        String updatedSentence = sentence;

        int idx = 0;
        while(updatedSentence.indexOf(" ") != -1)
        {
            idx = updatedSentence.indexOf(" ");
            String word = updatedSentence.substring(0, idx);
            returnList.add(0, word);
            updatedSentence = updatedSentence.substring(idx + 1);
        }
        returnList.add(0, updatedSentence);
        return returnList;
    }
    public static void moveBWords(ArrayList<String> wordList)
    {
        int numOfBWords = 0;
        for(int i = 0; i < wordList.size(); i++)
        {
            if(wordList.get(i).substring(0, 1).equals("b"))
            {
                String temp = wordList.get(i);
                wordList.remove(i);
                wordList.add(0 + numOfBWords, temp);
                numOfBWords++;
            }
        }
    }
    public static ArrayList<Integer> modes(int[] numList)
    {
        ArrayList<Integer> newList = new ArrayList<>();
        int max = 1;
        for (int i = 0; i < numList.length; i++)
        {
            int repeats = 1;
            for (int x = i + 1; x < numList.length; x++)
            {
                if (numList[i] == numList[x])
                {
                    repeats++;
                }
            }
            if (repeats > max)
            {
                max = repeats;
                newList = new ArrayList<>();
                newList.add(numList[i]);
            }
            else if (repeats == max && max != 1)
            {
                newList.add(numList[i]);
            }
        }
        return newList;
    }
    }






