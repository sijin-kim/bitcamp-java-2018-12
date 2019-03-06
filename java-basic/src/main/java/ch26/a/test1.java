package ch26.a;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class test1 {

  public static void main(String[] args) throws IOException {

    InputStream inputStream = Resources.getResourceAsStream("ch26/a/mybatis-config.xml");
    
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    
    List<Board> list =sqlSession.selectList("board.select1");
    
    for(Board lists: list) {
      System.out.printf("%d,%s,%s,%s,%d\n",
           
         lists.getBoard_id(),
         lists.getTitle(),
         lists.getContents(),
         lists.getCreated_date(),
         lists.getView_count()
          );
     
    }
    
    
    
    
    
    
  }

}
