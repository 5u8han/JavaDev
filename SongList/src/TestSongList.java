// Test driver for the SongList class
// Do not make any changes to this file!
// Xiwei Wang

public class TestSongList 
{
    public static void main(String[] args)
    {
        SongList mylist = new SongList();
        SongList builtlist = null;
        int numPassedTests = 0;
        int numTotalTests = 0;
        String testResult;

        // Test 1
        numTotalTests++;
        boolean bReturn = false;
        testResult = "[Failed]";
        String eMsg = "N/A";
        try
        {
            mylist.add("Lewis Capaldi", "Someone You Loved");
            bReturn = mylist.isEmpty();
            
            if (bReturn == false)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": " + testResult + "\n  add(\"Lewis Capaldi\", \"Someone You Loved\")\n Expected return of isEmpty(): false" );
        if (eMsg.equals("N/A"))
            System.out.println(" Your isEmpty() returns: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
              
        // Test 2
        numTotalTests++;
        int iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            mylist.add("Lil Nas X", "Old Town Road");
            mylist.add("Ed Sheeran & Justin Bieber", "I Don't Care");
            iReturn = mylist.size();
            
            if (iReturn == 3)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": " + testResult + "\n  add(\"Lil Nas X\", \"Old Town Road\")\n  add(\"Ed Sheeran & Justin Bieber\", \"I Don't Care\")\n Expected return of size(): 3" );
        if (eMsg.equals("N/A"))
            System.out.println(" Your size() returns: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
                
        // Test 3
        numTotalTests++;
        String sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            sReturn = mylist.toString();
            
            if (sReturn.equals("  [Ed Sheeran & Justin Bieber - I Don't Care]\n  [Lil Nas X - Old Town Road]\n  [Lewis Capaldi - Someone You Loved]\n"))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": " + testResult + "\n Expected return of toString():\n  [Ed Sheeran & Justin Bieber - I Don't Care]\n  [Lil Nas X - Old Town Road]\n  [Lewis Capaldi - Someone You Loved]\n");
        if (eMsg.equals("N/A"))
            System.out.println(" Your toString() returns:\n" + sReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 4
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            bReturn = mylist.remove("Ava Max", "Sweet But Psycho");
            
            if (bReturn == false)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": " + testResult +"\n  remove(\"Ava Max\", \"Sweet But Psycho\")\n Expected: false" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");   

        // Test 5
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            mylist.add("Ava Max", "Sweet But Psycho");
            mylist.add("Billie Eilish", "Bad Guy");
            mylist.add("Mabel", "Don't Call Me Up");
            mylist.add("Lewis Capaldi", "Hold Me While You Wait");
            iReturn = mylist.size();
            
            if (iReturn == 7)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": " + testResult + "\n  add(\"Ava Max\", \"Sweet But Psycho\")\n  add(\"Billie Eilish\", \"Bad Guy\")\n  add(\"Mabel\", \"Don't Call Me Up\")\n  add(\"Lewis Capaldi\", \"Hold Me While You Wait\")\n Expected return of size(): 7" );
        if (eMsg.equals("N/A"))
            System.out.println(" Your size() returns: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");       
        System.out.println(mylist);
        
        // Test 6
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            bReturn = mylist.remove("Billie Eilish", "Bad Guy");
            
            if (bReturn == true)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": " + testResult +"\n  remove(\"Billie Eilish\", \"Bad Guy\")\n Expected: true" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");    
        
        // Test 7
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            bReturn = mylist.remove("Ava Max", "Sweet But Psycho");
            
            if (bReturn == true)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": " + testResult +"\n  remove(\"Ava Max\", \"Sweet But Psycho\")\n Expected: true" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");    
        
        // Test 8
        numTotalTests++;
        sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            mylist.add("Billie Eilish", "Bury A Friend");
            mylist.add("Lewis Capaldi", "Grace");
            sReturn = mylist.toString();
            
            if (sReturn.equals("  [Billie Eilish - Bury A Friend]\n  [Mabel - Don't Call Me Up]\n  [Lewis Capaldi - Grace]\n  [Lewis Capaldi - Hold Me While You Wait]\n  [Ed Sheeran & Justin Bieber - I Don't Care]\n  [Lil Nas X - Old Town Road]\n  [Lewis Capaldi - Someone You Loved]\n"))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": " + testResult + "\n  add(\"Billie Eilish\", \"Bury A Friend\")\n  add(\"Lewis Capaldi\", \"Grace\")\n Expected return of toString():\n"
                + "  [Billie Eilish - Bury A Friend]\n  [Mabel - Don't Call Me Up]\n  [Lewis Capaldi - Grace]\n  [Lewis Capaldi - Hold Me While You Wait]\n"
                + "  [Ed Sheeran & Justin Bieber - I Don't Care]\n  [Lil Nas X - Old Town Road]\n  [Lewis Capaldi - Someone You Loved]\n");
        if (eMsg.equals("N/A"))
            System.out.println(" Your toString() returns:\n" + sReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");           
        
        // Test 9
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            bReturn = mylist.remove("Mabel", "Don't Call Me Up");
            
            if (bReturn == true)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": " + testResult +"\n  remove(\"Mabel\", \"Don't Call Me Up\")\n Expected: true" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 10
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            iReturn = mylist.size();
            
            if (iReturn == 6)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": " + testResult + "\n Expected return of size(): 6" );
        if (eMsg.equals("N/A"))
            System.out.println(" Your size() returns: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 11
        numTotalTests++;
        builtlist = null;
        sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            builtlist = mylist.buildList("Lewis Capaldi");
            sReturn = builtlist.toString();
            
            if (sReturn.equals("  [Lewis Capaldi - Grace]\n  [Lewis Capaldi - Hold Me While You Wait]\n  [Lewis Capaldi - Someone You Loved]\n"))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": " + testResult + "\n  mylist.buildList(\"Lewis Capaldi\")\n Expected return of toString() on the new list:\n"
                + "  [Lewis Capaldi - Grace]\n  [Lewis Capaldi - Hold Me While You Wait]\n  [Lewis Capaldi - Someone You Loved]\n");
        if (eMsg.equals("N/A"))
            System.out.println(" Your toString() returns:\n" + sReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 12
        numTotalTests++;
        builtlist = null;
        sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            builtlist = mylist.buildList("Lil Nas X");
            sReturn = builtlist.toString();
            
            if (sReturn.equals("  [Lil Nas X - Old Town Road]\n"))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": " + testResult + "\n  mylist.buildList(\"Lil Nas X\")\n Expected return of toString() on the new list:\n"
                + "  [Lil Nas X - Old Town Road]\n");
        if (eMsg.equals("N/A"))
            System.out.println(" Your toString() returns:\n" + sReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 13
        numTotalTests++;
        builtlist = null;
        sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            builtlist = mylist.buildList("Ava Max");
            sReturn = builtlist.toString();
            
            if (sReturn.equals(""))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": " + testResult + "\n  mylist.buildList(\"Ava Max\")\n Expected return of toString() on the new list:\n  An empty list\n");
        if (eMsg.equals("N/A"))
            System.out.println(" Your toString() returns:\n" + (sReturn.equals("") ? "  An empty list\n" : sReturn));
        else
            System.out.println(" Yours: " + eMsg + "\n"); 
        
        System.out.println("Total test cases: " + numTotalTests + "\nCorrect: " + numPassedTests + "\nWrong: " + (numTotalTests - numPassedTests));  
    }    
}
