import java.text.SimpleDateFormat;  
import java.util.*;
public class SpeedTest {
      public static void main(String[] ags )throws Exception{
 int BeforeMin,BeforeSec, AfterMin,AfterSec ;
 Scanner scan= new Scanner(System.in);
 //System.out.println("Enter 1 to Start Program");
 //int start=scan.nextInt();
String ComputerPara = "Java is a programming language and computing platform first released by Sun Microsystems in 1995";//, class-based, object-oriented programming language 
System.out.println(ComputerPara);



// time before input 
 SimpleDateFormat Min = new SimpleDateFormat("mm");
SimpleDateFormat Sec = new SimpleDateFormat("ss");
Date Before = new Date();  
BeforeMin = Integer.parseInt(Min.format(Before));  
BeforeSec = Integer.parseInt(Sec.format(Before));
//System.out.println(BeforeMin);
//System.out.println(BeforeSec); 



//------------------------
 String UserPara = scan.nextLine();

 //time after input taken 
Date After = new Date();  
AfterMin = Integer.parseInt(Min.format(After));  
AfterSec = Integer.parseInt(Sec.format(After)); 


//------------------------
 //int correct = 0 ;
 int incorrect = 0 ;
for(int i =0 ; i<ComputerPara.length(); i++){
    if(i >= UserPara.length()-1)
    break ;


  
if(ComputerPara.charAt(i)==UserPara.charAt(i)){
    //correct++;
}
    else {
        incorrect++;
    }
}



float time ;
time =(AfterMin-BeforeMin) +((AfterSec/60.0f)-(BeforeSec/60.0f)) ;
if (time <=0) time= 0.01f;
float Gross = (UserPara.length()/5.0f)/time;
//Gross= (all type entries /5 )/ time 
       // Net Wpm = Gross Wpm - ( uncorrected Error / Time)
    // Accuracy = (Net Wpm / Gross Wpm)*100
    //Net  Wpm = [(All Typed Entries /5 )-Uncorrected Errors]/Time (min)

float NetWpm  = Gross  - (incorrect/time) ;

if( NetWpm <= 0 )
System.out.println("YOUR WPD = 0");
else 
System.out.println("YOUR WPD =" +NetWpm);
float accuracy = (NetWpm/Gross)  * 100;
System.out.println("YOUR ACCURACY =" + accuracy);
 scan.close();
    }
}