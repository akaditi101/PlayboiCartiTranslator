import java.util.*;
/**
 * Write a description of class Translator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Translator
{
    public static void main(String[] args)
    {
        System.out.println("🖤");
        int decider = (int) (Math.random() *4);
        String temp = "";
        ArrayList<String> arr = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to translate to Carti language ;0");
        String words = sc.nextLine();
        
        ArrayList<String> adds = new ArrayList<String>();
        adds.add(" :)🖤 ");
        adds.add(" :( ");
        adds.add(" ++ ");
        adds.add(" & ++ ");
        adds.add(" ** - ");
        adds.add(" **** ");
        int rand = 0;
        
        if (decider == 0)
        {
            System.out.println("+* ok !");
            
        }
        else if (decider ==1)
        {
            System.out.println("* slatt _ !");
        }
        else if (decider ==2)
        {
            System.out.println("++ :)?#love *");
            
        }
        else if (decider ==3)
        {
            System.out.println("*  *");
        }
        else if(decider ==4)
        {
            System.out.println("ok ! * + :) :(");
        }
        
        for (int i = 0; i <words.length(); i++)
        {
            if (words.charAt(i) != ' ')
                temp +=words.charAt(i);
            else{
                arr.add(temp);
                temp = "";
            }
        }
        arr.add(temp);
        
        for (String x :arr)
        {
            System.out.print(x);
            rand = (int) (Math.random() *5);
            System.out.print(adds.get(rand));
        }
        System.out.println();
        decider = (int) (Math.random() *4);
        if (decider == 0)
        {
            System.out.println("+* ok !");
            
        }
        else if (decider ==1)
        {
            System.out.println("* slatt _ !");
        }
        else if (decider ==2)
        {
            System.out.println("++ :)?#love *");
            
        }
        else if (decider ==3)
        {
            System.out.println("*  *");
        }
        else if(decider ==4)
        {
            System.out.println("ok ! * + :) :(");
        }
        
        
    }
}
