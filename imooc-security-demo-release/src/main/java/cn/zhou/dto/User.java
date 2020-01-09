package cn.zhou.dto;

import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;

@Data
@ToString
public class User {
    private String id;
    private String username;
    @NotBlank
    private String password;
}
