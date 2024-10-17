package AssignmentDS;
import java.util.Scanner;

public class ReverseMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ReverseClass obj = new ReverseClass();
        System.out.println("Enter word");
        String word=in.next();
        obj.create_Stack(word.length());
        for(int i=0;i<word.length();i++)
            obj.push(word.charAt(i));
        String r_word="";
        while(obj.is_Empty()!=true)
            r_word+=obj.pop();

        System.out.println("Reverse is:"+r_word);
    }
}