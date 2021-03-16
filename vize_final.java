package javaapplication1;

import java.util.Scanner;
public class JavaApplication1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String harf = new String();
        int vize = sc.nextInt();
        int Final = sc.nextInt();
        
        double ortalama = Math.round(vize*0.4 + Final*0.6);
        //100-85-70-55-40
        
        if((vize>100)||Final>100||vize<0||Final<0)
        {
            System.out.println("Please enter a valid value.");
        }
        else if(ortalama >=85)
        {
            harf="AA";
        }
        else if(ortalama >=70)
        {
            harf="BB";
        }
        else if(ortalama >=55)
        {
            harf="CC";
        }
        else if(ortalama >=40)
        {
            harf="DD";
        }
        else if(ortalama <40)
        {
            harf="FF";
        }
        
        switch(harf){
            case "AA":
                System.out.println("Your grade is AA");
            break;
            case "BB":
                System.out.println("Your grade is BB");
            break;
            case "CC":
                System.out.println("Your grade is CC");
            break;
            case "DD":
                System.out.println("Your grade is DD");
            break;
            case "FF":
                System.out.println("Your grade is FF");
            break;
            default:
                System.out.println("Your grade could not calculated.");
            break;
         
        }
                
    }   
}
