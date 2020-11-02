import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

class Bracket {
    Bracket(char type, int position) {
        this.type = type;
        this.position = position;
    }

    boolean Match(char c) {
        if (this.type == '[' && c == ']')
            return true;
        if (this.type == '{' && c == '}')
            return true;
        if (this.type == '(' && c == ')')
            return true;
        return false;
    }

    char type;
    int position;
}
//anonomus class
class check_brackets {
    public static void main(String[] args) throws IOException {
        InputStreamReader input_stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input_stream);
        String text = reader.readLine();

        Stack<Bracket> opening_brackets_stack = new Stack<Bracket>();
        Stack<Bracket> closing_brackets_stack = new Stack<Bracket>();
        for (int position = 0; position < text.length(); ++position) {
            char next = text.charAt(position);

            if (next == '(' || next == '[' || next == '{') {
            // Process opening bracket, write your code here
            	//Bracket a = new Bracket(next, position +1);
            	Bracket bracket1 = new bracket();
            	opening_brackets_stack.push(1);
            	continue;
            }

            if (next == ')' || next == ']' || next == '}') {
                // Push the element in the stack
            	if(opening_brackets_stack.empty());
            		return false;
            

            }
           

            	public static void main(String  [] args) {
            		String expr = "([{}])";
            		if(check_brackets(expr))
            			System.out.println("Balanced ");
            		else
            			System.out.println("Not Balanced ");
            	}

        // Printing answer, write your code here
        //driver code
       
        	//Functional Call
        }
    }
}
