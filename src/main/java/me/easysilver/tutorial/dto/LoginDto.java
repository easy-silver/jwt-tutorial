package me.easysilver.tutorial.dto;

import lombok.*;

import javax.validation.constraints.Size;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto {

    @NonNull
    @Size(min = 3, max = 50)
    private String username;

    @NonNull
    @Size(min = 3, max = 100)
    private String password;
}
