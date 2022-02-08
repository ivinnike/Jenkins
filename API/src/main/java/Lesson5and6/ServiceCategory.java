package Lesson5and6;

import retrofit2.Call;
import retrofit2.http.*;


public interface ServiceCategory {

    @GET("categories/{id}")
    Call<Category> getCategory(@Path("id") int id);

}
