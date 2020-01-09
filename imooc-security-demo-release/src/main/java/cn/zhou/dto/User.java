package cn.zhou.dto;

import cn.zhou.annotation.MyAnnotation;
import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;

@Data
@ToString
public class User {
    @MyAnnotation
    private String id;
    private String username;
    @NotBlank
    private String password;
}
