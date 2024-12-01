package models.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LoginResponseModel {

    private String userId, username, password, token, expires;

    @JsonProperty("created_date")
    private String createdDate;

    private Boolean isActive;
}