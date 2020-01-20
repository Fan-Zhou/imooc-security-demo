package cn.zhou.dto;

import cn.zhou.annotation.MyAnnotation;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;

@Data
@ToString
public class User {
    @MyAnnotation
    private String id;

    @ApiModelProperty("用户姓名")
    private String username;
    @NotBlank
    @ApiModelProperty("用户密码")
    private String password;
}
