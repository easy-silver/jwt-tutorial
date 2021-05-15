package me.easysilver.tutorial.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NonNull;

import javax.validation.constraints.Size;

public class UserDto {

    @NonNull
    @Size(min = 3, max = 50)
    private String username;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NonNull
    @Size(min = 3, max = 100)
    private String password;

    @NonNull
    @Size(min = 3, max = 50)
    private String nickname;

}
