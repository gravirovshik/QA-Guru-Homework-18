package models.auth;

import lombok.Data;

@Data
public class LoginRequestModel {

    private String userName, password;
}