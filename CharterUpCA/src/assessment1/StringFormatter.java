package assessment1;

import java.util.Scanner;

public class StringFormatter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string to be formatted:");
        String temp = input.nextLine();
        System.out.println("Enter maximum character repitiions:");
        int temp2 = Integer.parseInt(input.nextLine());
        System.out.println(formatString(temp, temp2));
        input.close();
    }
    
    public static String formatString(String input, int maxRepeat) 
    {
        char [] counter = input.toCharArray();
        int count = 0;
        int i = 0;
        String temp = "";
        while (i+1 < input.length())
        {
            if (counter[i] == counter[i+1] && count <= maxRepeat)
            {
                temp.concat(Character.toString(counter[i]));
                count++;
                i++;
            }
            if(counter[i] != counter[i+1] && count <= maxRepeat)
            {
                temp.concat(Character.toString(counter[i]));
                count = 0;
                i++;
            }
            if (count > maxRepeat)
            {
                i++;
            }            
        }
        return temp;
                
    }
    

}
