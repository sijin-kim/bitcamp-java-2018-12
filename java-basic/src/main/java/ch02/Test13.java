
package ch02;

public class Test13{

  public static void main(String[] args){
     java.util.Date today =new java.util.Date();
    System.out.printf("%1$tY,%1$ty\n",today);
    System.out.printf("%1$tB,%1$tb\n",today);
    System.out.printf("%1$tm\n",today);
    System.out.printf("%1$td %1$te\n",today);
    System.out.printf("%1$tA %1$ta\n",today);
    System.out.printf("%1$tH %1$tI\n",today);
    System.out.printf("%1$tS %1$tL %1$tN\n",today);
    System.out.printf("%1$tp\n",today);
 //년 월 일 시:분:초를 출력하라!
    System.out.printf("%1$tY년 %1$tB %1$td일 %1$tA %1$tp %1$tH시 %1$tS분 %1$tL초",today);
    


    



    

    

    
   
  }
}



