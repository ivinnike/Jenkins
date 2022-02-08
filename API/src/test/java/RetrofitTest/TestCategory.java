package RetrofitTest;

import Lesson5and6.Category;
import Lesson5and6.RetrofitUtils;
import Lesson5and6.ServiceCategory;
import lombok.SneakyThrows;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import retrofit2.Response;

import static org.hamcrest.MatcherAssert.assertThat;

public class TestCategory {
    static ServiceCategory service;
    @BeforeAll
    static void beforeALL(){

        service = RetrofitUtils.getRetrofit().create(ServiceCategory.class);
    }
    @SneakyThrows
    @Test
   void TestGet(){
       Response<Category> response = service.getCategory(1).execute();
            assertThat(response.isSuccessful(),CoreMatchers.is(true));


    }



}
