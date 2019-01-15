


package design_patten.singleton;

// 인스턴스를 딱 한개만 생성하여 고유하고 싶다면
// singleton  설계방식으로 클래스를 정의하라!
class Car2{
  String model;
  int cc;
  //인스턴스 주소를 받을 클래스 필드르 선언
  private static Car2  instance;
  private Car2() {}
   
  public  static Car2 getInstance() {
      if(Car2.instance ==null) {
        
        Car2.instance =new Car2();
      }
      
     return Car2.instance;
    
  }
  
}
public class Test02 {

 public static void main(String[] args) {
   
    //생성자가 존재하지만 private 으로 되어 있기 떄문에 직접 호출할 수없다.
   // 생성자를 호출할 수없으면 인스턴스를 생성할 수없다.
    //다른 메서드를 호출하여 인스턴스를 생성하라는 의미다.  
   
   Car2 c2 =Car2.getInstance();
   Car2 c3 =Car2.getInstance();

       if(c2!=c3) {
         System.out.println("다르다");
       }else {
         System.out.println("같다");
       }
       

     
   
 } 
  
}
