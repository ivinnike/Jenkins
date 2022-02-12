package Lesson5and6;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.With;
import ru.geekbrains.java4.lesson6.db.model.Products;

import java.util.ArrayList;
import java.util.List;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Getter
    @With
    @NoArgsConstructor
    @AllArgsConstructor
    public class Product{
        @JsonProperty("id")
        private Integer id;
        @JsonProperty("title")
        private String title;
        @JsonProperty("price")
        private Integer price;
        @JsonProperty("categoryTitle")
        private String categoryTitle;
         @JsonProperty("products")
        private List<Products> products = new ArrayList<>();
    }

