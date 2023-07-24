import java.util.Scanner;
import java.util.Stack;
public class Balancing{
public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stk = new Stack<>();
        
        while (sc.hasNext()) {
            String input=sc.next();
            Boolean flag = true;
            
            for(Character c : input.toCharArray()){
                if((c==')' || c=='}' || c==']') && (!stk.isEmpty())){
                    int p = stk.pop();
                    if((p == '(' && c!=')') || (p == '{' && c!='}') || (p == '[' && c!=']')){
                        flag=false;
                        break;
                    }    
                }
                else{
                    if(c==')' || c=='}' ||c==']'){
                flag=false;
                        break;
            }
                    stk.push(c);
                }
            }
            if(stk.isEmpty() && flag){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
            stk.clear();
        }
        
    }
}
