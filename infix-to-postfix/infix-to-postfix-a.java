import java.util.*;

class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int totalTestCases = sc.nextInt();
    sc.nextLine();
    sc.nextLine();
    
    for (int i=0; i<totalTestCases; i++) {

        String currLine = sc.nextLine();
        if (currLine.isEmpty()) {
            sc.nextLine();
        }
  
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        while (!currLine.equals("")) {
            char c = currLine.charAt(0);

            // If the scanned character is an operand, add it to output. 
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
                
            // If the scanned character is an '(', push it to the stack. 
            } else if (c == '(') {
                stack.push(c); 
                
            // If the scanned character is an ')', pop and output from the stack  
            // until an '(' is encountered. 
            } else if (c == ')')  {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop()); 
                }
                
                stack.pop();
    
            // an operator is encountered 
            } else { 
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) {
                    result.append(stack.pop()); 
                }
                stack.push(c); 
            } 
                
            if (!sc.hasNext()) {
                break;
            } else {
                currLine = sc.nextLine();
            }        
        }
        
         while (!stack.isEmpty()) {
             result.append(stack.pop());
         }
        
        System.out.print(result);

        if (i!=totalTestCases-1) {
            System.out.println("\n");
        } else {
            System.out.print("\n");
        }
    }
    sc.close();
  }
  
 
    public static int Prec(char ch) { 
        switch (ch) { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        } 
        return -1; 
    } 
}