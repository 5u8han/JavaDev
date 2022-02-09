// Test driver for the RecursiveMethods class
// Do not make any changes to this file!
// Xiwei Wang

import java.util.Arrays;

public class TestRecursiveMethods
{
    public static void main(String[] args)
    {
        RecursiveMethods myMethods = new RecursiveMethods();
        
        int numPassedTests = 0;
        int numTotalTests = 0;
        String testResult;
        
        // Test 1
        numTotalTests++;
        double dReturn = -1;
        testResult = "[Failed]";
        String eMsg = "N/A";
        try
        {
            dReturn = myMethods.computePI(1);
            
            if (dReturn == 1)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": computePI(1) ==> " + testResult + "\n Expected: 1" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + dReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 2
        numTotalTests++;
        dReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            dReturn = myMethods.computePI(4);
            dReturn = Math.round(dReturn * 10000D) / 10000D;
            
            if (dReturn == 0.7238)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": computePI(4) ==> " + testResult + "\n Expected: 0.7238" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + dReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 3
        numTotalTests++;
        dReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            dReturn = myMethods.computePI(7);
            dReturn = Math.round(dReturn * 10000D) / 10000D;
            
            if (dReturn == 0.8209)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": computePI(7) ==> " + testResult + "\n Expected: 0.8209" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + dReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");      

        // Test 4
        numTotalTests++;
        dReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            dReturn = myMethods.computePI(1000);
            dReturn = Math.round(dReturn * 10000D) / 10000D;
            
            if (dReturn == 0.7851)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": computePI(1000) ==> " + testResult + "\n Expected: 0.7851" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + dReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 5
        numTotalTests++;
        CharStack s = new CharStack(5);
        String sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            s.push('a');
            myMethods.upperStackRec(s);
            sReturn = s.toString();
            
            if (sReturn.equals("A"))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": upperStackRec(\"a\" (from top to bottom)) ==> " + testResult + "\n Expected: \"A\" (from top to bottom)" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: \"" + sReturn + "\" (from top to bottom)\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 6
        numTotalTests++;
        s = new CharStack(5);
        sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            s.push('7');
            s.push('?');
            s.push('p');
            myMethods.upperStackRec(s);
            sReturn = s.toString();
            
            if (sReturn.equals("P?7"))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": upperStackRec(\"p?7\" (from top to bottom)) ==> " + testResult + "\n Expected: \"P?7\" (from top to bottom)" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: \"" + sReturn + "\" (from top to bottom)\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");        
        
        // Test 7
        numTotalTests++;
        s = new CharStack(5);
        sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            s.push('4');
            s.push('K');
            s.push('3');
            s.push('s');
            s.push('c');
            
            myMethods.upperStackRec(s);
            sReturn = s.toString();
            
            if (sReturn.equals("CS3K4"))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": upperStackRec(\"cs3K4\" (from top to bottom)) ==> " + testResult + "\n Expected: \"CS3K4\" (from top to bottom)" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: \"" + sReturn + "\" (from top to bottom)\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 8
        numTotalTests++;
        s = new CharStack(9);
        sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            s.push('Z');
            s.push('y');
            s.push('X');
            s.push('|');
            s.push('E');
            s.push('d');
            s.push('C');
            s.push('b');
            s.push('A');
            
            myMethods.upperStackRec(s);
            sReturn = s.toString();
            
            if (sReturn.equals("ABCDE|XYZ"))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": upperStackRec(\"AbCdE|XyZ\" (from top to bottom)) ==> " + testResult + "\n Expected: \"ABCDE|XYZ\" (from top to bottom)" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: \"" + sReturn + "\" (from top to bottom)\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");        
        
        // Test 9
        numTotalTests++;
        sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            String myString = "";
            sReturn = myMethods.reverseStringRec(myString);
            
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
        
        System.out.println("Test " + numTotalTests + ": reverseStringRec(\"\") ==> " + testResult + "\n Expected: \"\"" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: \"" + sReturn + "\"\n");
        else
            System.out.println(" Yours: " + eMsg + "\n"); 
        
        // Test 10
        numTotalTests++;
        sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            String myString = "a";
            sReturn = myMethods.reverseStringRec(myString);
            
            if (sReturn.equals("a"))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": reverseStringRec(\"a\") ==> " + testResult + "\n Expected: \"a\"" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: \"" + sReturn + "\"\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");    
        
        // Test 11
        numTotalTests++;
        sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            String myString = "abc";
            sReturn = myMethods.reverseStringRec(myString);
            
            if (sReturn.equals("cba"))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": reverseStringRec(\"abc\") ==> " + testResult + "\n Expected: \"cba\"" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: \"" + sReturn + "\"\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 12
        numTotalTests++;
        sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            String myString = "Hello, Data Structures!";
            sReturn = myMethods.reverseStringRec(myString);
            
            if (sReturn.equals("!serutcurtS ataD ,olleH"))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": reverseStringRec(\"Hello, Data Structures!\") ==> " + testResult + "\n Expected: \"!serutcurtS ataD ,olleH\"" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: \"" + sReturn + "\"\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");    
        
        // Test 13
        numTotalTests++;
        int iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            LNode myNode = null;
            iReturn = myMethods.numOccurrencesRec(myNode, 0, 10);
            
            if (iReturn == 0)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": numOccurrencesRec(null, 0, 10) ==> " + testResult + "\n Expected: 0" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n"); 
        
        // Test 14
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            LNode myNode = new LNode(20);
            iReturn = myMethods.numOccurrencesRec(myNode, 0, 10);
            
            if (iReturn == 0)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": numOccurrencesRec([20], 0, 10) ==> " + testResult + "\n Expected: 0" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");  
        
        // Test 15
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            LNode myNode = new LNode(20);
            iReturn = myMethods.numOccurrencesRec(myNode, 0, 20);
            
            if (iReturn == 1)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": numOccurrencesRec([20], 0, 20) ==> " + testResult + "\n Expected: 1" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");         
        
        // Test 16
        numTotalTests++;
        sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            LNode myNode = new LNode(45);
            LNode myNode1 = new LNode(25);
            LNode myNode2 = new LNode(73);
            LNode myNode3 = new LNode(45); 
            LNode myNode4 = new LNode(19); 
            LNode myNode5 = new LNode(57); 
            LNode myNode6 = new LNode(45); 
            myNode.setLink(myNode1);
            myNode1.setLink(myNode2);
            myNode2.setLink(myNode3);
            myNode3.setLink(myNode4);
            myNode4.setLink(myNode5);
            myNode5.setLink(myNode6);
            iReturn = myMethods.numOccurrencesRec(myNode, 0, 45);
            
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
        
        System.out.println("Test " + numTotalTests + ": numOccurrencesRec([45->25->73->45->19->57->45], 0, 45) ==> " + testResult + "\n Expected: 3" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");  
        
        // Test 17
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            LNode myNode = new LNode(45);
            LNode myNode1 = new LNode(25);
            LNode myNode2 = new LNode(73);
            LNode myNode3 = new LNode(25); 
            LNode myNode4 = new LNode(19); 
            LNode myNode5 = new LNode(25); 
            LNode myNode6 = new LNode(43); 
            LNode myNode7 = new LNode(25); 
            myNode.setLink(myNode1);
            myNode1.setLink(myNode2);
            myNode2.setLink(myNode3);
            myNode3.setLink(myNode4);
            myNode4.setLink(myNode5);
            myNode5.setLink(myNode6);
            myNode6.setLink(myNode7);
            iReturn = myMethods.numOccurrencesRec(myNode, 1, 25);
            
            if (iReturn == 4)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": numOccurrencesRec([45->25->73->25->19->25->43->25], 1, 25) ==> " + testResult + "\n Expected: 4" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");  

        // Test 18
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            LNode myNode = new LNode(45);
            LNode myNode1 = new LNode(25);
            LNode myNode2 = new LNode(73);
            LNode myNode3 = new LNode(25); 
            LNode myNode4 = new LNode(19); 
            LNode myNode5 = new LNode(25); 
            LNode myNode6 = new LNode(19); 
            LNode myNode7 = new LNode(45); 
            myNode.setLink(myNode1);
            myNode1.setLink(myNode2);
            myNode2.setLink(myNode3);
            myNode3.setLink(myNode4);
            myNode4.setLink(myNode5);
            myNode5.setLink(myNode6);
            myNode6.setLink(myNode7);
            iReturn = myMethods.numOccurrencesRec(myNode, 4, 19);
            
            if (iReturn == 2)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": numOccurrencesRec([45->25->73->25->19->25->19->45], 4, 19) ==> " + testResult + "\n Expected: 2" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");  
        
        System.out.println("Total test cases: " + numTotalTests + "\nCorrect: " + numPassedTests + "\nWrong: " + (numTotalTests - numPassedTests));		
    }    
}
