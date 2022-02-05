package org.example;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class DTO {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "data",
            "success",
            "status"
    })
    @lombok.Data
    public static class AccountInfoResponse {
        @JsonProperty("data")
        private AccountInfoData data;
        @JsonProperty("success")
        private Boolean success;
        @JsonProperty("status")
        private Integer status;
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @lombok.Data
        public class AccountInfoData {
            @JsonProperty("data")
            private Integer id;
            @JsonProperty("account_url")
            private String account_url;
            @JsonProperty("account_id")
            private String account_id;
            @JsonProperty("title")
            private String title;
            @JsonProperty("type")
            private String type;
            @JsonProperty("width")
            private String width;
            @JsonProperty("height")
            private String height;
        }

        @JsonInclude(JsonInclude.Include.NON_NULL)
        @lombok.Data
        public static class UserFollow {
            @JsonProperty("status")
            private Boolean status;
        }
    }
}
