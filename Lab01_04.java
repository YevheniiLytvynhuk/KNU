-finput-charset=utf-8 -fexec-charset=cp866
package firstlab;

import java.util.Formatter;
import java.util.Scanner;

public class Lab01_04 {

	public static void main(String[] args)
	
	    {int counter=0; //Îãîëîøåííÿ ³íäèêàòîðà äëÿ öèêëó do-while
		do{   //Ïî÷àòîê öèêëó do-while. Ïðîãðàìà áóäå âèêîíóâàòèñü ïîêè êîðèñòóâà÷ íå âèáåðå ïóíêò "âèõ³ä"
			try { 
				System.out.println("Êîíâåðòàö³ÿ ç Öåëüñ³ÿ â Ôàðåíãåéòà."+ "\n");
	            Scanner in = new Scanner(System.in); //Êîðèñòóâà÷ ââîäèòü äâà ä³éñíèõ ÷èñëà ÷åðåç ïðîá³ë
	            System.out.print("Ââåä³òü ÷èñëî ãðàäóñ³â Öåëüñ³ÿ C:");
	            double number = in.nextDouble(); //Ç÷èòóâàííÿ ââåäåííÿ äî çì³ííî¿
                double F = (double)(9*number/5+32);
                int i=(int )(F+0.5);
                System.out.println("F="+i);//Ðåçóëüòàòè íà êîíñîë³
				
		       }catch(Exception ex) {System.out.println("Ñòàëàñÿ ïîìèëêà. Ñïðîáóéòå ùå");//Öåé áëîê ñïðàöþº ïðè ïîìèëö³ òà âèâåäå ïîâ³äîìëåííÿ
		       }
			try {
		    Scanner i = new Scanner(System.in);//Êîðèñòóâà÷ âèáèðàº ïðîäîâæèòè âèêîíàííÿ ÷è çóïèíèòè ðîáîòó ïðîãðàìè
            System.out.print("Áàæàºòå ïðîäîâæèòè âèêîðèñòàííÿ ïðîãðàìè? "+ "\n"+"Òàê (ââåä³òü 0)\r\n" + 
            		"Í³ (ââåä³òü áóäü-ÿêå ÷èñëî â³äì³ííå â³ä íóëÿ)");
            counter = i.nextInt();
			 }catch(Exception ex) {};
	    }while (counter==0);}



 
}
