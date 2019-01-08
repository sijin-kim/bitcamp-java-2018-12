
package ch05;

public class Test06{
 static enum UserType{
    MAANGER,MEMBER ,GUEST
  };

  public static void main(String[] args){
    UserType type = UserType.MAANGER;
    

        switch(type) {
          case MEMBER:
            System.out.println(" 일반회");
            break;
          case MAANGER:
            System.out.println("관리");
              break;
          case GUEST:
            System.out.println("손님");
              break;
              
              default:
              System.out.println("????");
        }
    
    
  }
       
}

