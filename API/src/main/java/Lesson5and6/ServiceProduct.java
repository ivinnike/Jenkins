package Lesson5and6;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;


public interface ServiceProduct {
    @GET("products")
    Call<Category> getProduct(@Body Category FoodResponseRequest);

    @POST("products")
    Call<Product> createProduct(@Body Product createProductRequest);

    @PUT("products")
    Call<Product> modifyProduct(@Body Product modifyProductRequest);

    @GET("products/{id}")
    Call<Category> returnsProduct(@Path("id") int id);

    @DELETE("products/{id}")
    Call<ResponseBody> deleteProduct(@Path("id") int id);

}
