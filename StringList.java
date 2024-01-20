import java.util.Arrays;

public class StringList {
    StringNode first;
    StringNode last; 
    int length;


    //Creating a new head node
    public StringList(){
        StringNode n = new StringNode (); 
            first = n;
            last = n; 
            length = 0; 
    }

    //Creating a prepend method that adds a new stirng value before the first node
    public void prepend (String value){
        StringNode n = new StringNode(value);
        n.next = first.next;                    // Whatever n is pointing to is now set to whatever first was pointing to
        first.next = n;
        if (last == first) last = n;                          // first is not pointing to the new n node created
        length++;                               // increase the length of the LinkedList
    }

    //Creating a boolean method called equals that tests if two lists are equal if they have the same length
    public boolean equals(StringList other){
        if (length == other.length) return false; 
        StringNode p = new StringNode(null);
        StringNode q = new StringNode(null);
        p = first.next; 
        while(p!=null){
            if(!p.data.equals(q.data)) return false;
            p = p.next;
            q = q.next;
        }
        return true;
    }

    //Creating countStirngs that will count of how many Strings in the list have the length i
    public int countLengthStrings(int i){
        StringNode n = new StringNode(null);        //Creating a new dummy node
         int c = 0;                                       //Creating a new counter int to count the number of strings with the length i
        n = first.next;                                   //Initialize the new node to be the first.next of the existing code
        while(n!= null){                                  //Creating the while loop while n is not nulll (or at the end)
            String curr = n.data;                         //Create a String to copy off the data to compare later
            if(curr.length() == i) c++;               //compare the current string length to the count given 
            n = n.next;                                   //Iterate to the next node 
        }
        return c;                                         //Return the count c
    }
    
    //mehtod called countStrings(String s) which will return a count of how many Strings in the list are equal to String s 
    public int countWordStrings(String s){
        StringNode n = new StringNode(null);
        int count = 0; 
        int length = s.length();
        n = first.next;
        while(n!=null){
            if(length == n.data.length()) count++;
            n = n.next; 
        }
        return count;

    }

    //method called countLetterStrings (char a) which returns the number of Strings that contain the given char
    public int countLetterStrings(char a){
        StringNode n = new StringNode(null);
        int count = 0; 
        n = first.next;
        while(n!=null){
            for(int i = 0; i < n.data.length(); i++){
                if(Character.toLowerCase(n.data.charAt(i)) == Character.toLowerCase(a)) {System.out.println(a);count++;}
            }
            n = n.next; 
        }
        return count;

    }

    //method printStringList prints the whole list to a String array and resizes it accordingly
    public String[] printStringList() {
        String[] output = new String[1];  // Start with an array of length 1
        int count = 0;
        StringNode n = first.next;

        while (n != null) {
            if (count >= output.length) {
            // Resize the array if needed
                output = Arrays.copyOf(output, output.length * 2);
            }

            output[count] = n.data;
            n = n.next;
            count++;
        }

    // Trim the array to the actual size
        output = Arrays.copyOf(output, count);

        return output;
    }


    //method called printString() which will print the Strings in the list that have an odd length 
    public void printOddString(){
        StringNode n = new StringNode();
        n = first.next; 
        while(n!= null){
        if (n.data.length() %2 == 1) System.out.println(n.data); 
            n = n.next; 
        }
    }

    public void printString2(int theLength){
        StringNode n; 
        n = first.next;                         // initialize the dummy node for the first.next node 
        while(n!=null){
            if(n.data.length() == theLength) System.out.println(n.data); 
            n = n.next;                         // <-- forgot about this on the exam 
        }
    }

    // Creating a append method that adds a new stirng value before the last node
    public void append(String s){
        StringNode n = new StringNode(s); 
        last.next = n;                      //new node after last points to n
        last = n;                           //update last to be new node 
        if(first == last) first = last = n;
        length++;         
    } 
}
