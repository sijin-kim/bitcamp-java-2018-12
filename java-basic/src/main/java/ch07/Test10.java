// 클래스 공개 비공개
package ch07;
      
public class Test10 {
  
  public static void main(String[] args) throws Exception {
      //같은 패키기에 있는 클래스를 사용할 떄는
    // 공개 비공개 모두 사용할수있다/
    Score10 s1= new Score10();
    Score11 s2= new Score11();

    ch07.sub.Score12 s3 =new ch07.sub.Score12();
    
//    ch07.sub.Score13 s4 =new ch07.sub.Score13();
    

    }

}


  
  


















