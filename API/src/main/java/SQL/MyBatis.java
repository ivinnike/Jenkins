package SQL;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import ru.geekbrains.java4.lesson6.db.dao.CategoriesMapper;
import ru.geekbrains.java4.lesson6.db.model.Categories;
import ru.geekbrains.java4.lesson6.db.model.CategoriesExample;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatis {


    public static void main(String[] args) throws IOException {
        String resourse = "mybatis-config.xml";

        InputStream inputStream = Resources.getResourceAsStream(resourse);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        CategoriesMapper categoriesMapper = session.getMapper(CategoriesMapper.class);
        CategoriesExample example = new CategoriesExample();

        example.createCriteria().andIdEqualTo(34);
        example.setOrderByClause("title");
        List<Categories> list = categoriesMapper.selectByExample(example);

        System.out.println(categoriesMapper.countByExample(example));
        System.out.println(list);

    }

}
