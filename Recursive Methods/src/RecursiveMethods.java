// Subhan Noeman
public class RecursiveMethods {
    /*  public double computePI(int n) {
          //Base Case
          double pi = 0.0;
          if (n == 1) {
              return 1;
          }
          else if (n % 2 == 1) {
              pi = 1*(1 / ((2*n)-1));
              n-=1;
          }
          else if (n % 2 == 0) {
              pi = -1*(1 / ((2*n)-1));
              n-=1;
          }

          return pi+computePI(n);
      }*/
    public double computePI(int n) {
        if (n == 1) {
            return 1;
        }
        if (n % 2 == 0) {
            return computePI(n - 1) - (1 / (double)((2 * n) - 1));
        }
        else return ((1 / (double)((2 * n) - 1))) + computePI(n - 1);
    }
    /*  public void upperStackRec2(CharStack s) {
  // run thru the character stack as long as there is nothing left
  if (s.isEmpty())
    {
    return;
     }
    //pop
    char character = s.pop();
    //process
    if (character >= 97 && character <= 122) {
        character = (char) (character - 32);
        //ascii conversion
        s.push(character);
        upperStackRec(s); //recursion
    }
  }*/
    //SECOND METHOD OF IMPLEMENTING
    public void upperStackRec(CharStack s) {
        // run thru the character stack as long as there is nothing left
        if (s.isEmpty()) {
            return;
        } else {
            char character = s.pop();
            character = Character.toUpperCase(character);
            upperStackRec(s);
            s.push(character);
        }
    }
    public String reverseStringRec(String s) {
        //Base Case
        if (s == null || s.length() <= 1) {
            return s;
        }
        else return reverseStringRec(s.substring(1)) + s.charAt(0);
    }
    //Second Implementation
  /*
char lastchar = s.charAt(s.length()-1);
String smaller = s.substring(0,s.length()-1);
return lastchar +reverseStringRec(smaller);
*/
    public int numOccurrencesRec(LNode node, int n, int key) {
        int count = 0;
        //Base Case
        if (node == null) {
            return 0;
        }
        if (node.getInfo() == key && n == 0) {
            return 1;
        }
        if (n > 0) {
            return numOccurrencesRec(node.getLink(), n - 1, key);
        }
        else {
            if (node.getInfo() == key) {
                count++;
                node = node.getLink();
            }
        }
        return count;

    }
}