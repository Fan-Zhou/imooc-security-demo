package cn.zhou.properties;


import cn.zhou.validate.properties.ValidateCodeProperties;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/**
 * 该注解表示 可以读取配置中的属性  需要在配置类中开启  @EnableConfigurationProperties
 */
@ConfigurationProperties(prefix = "imooc.security")
@Component
@Data
public class SecurityPropertis {
    BrowserProperties browser = new BrowserProperties();

    ValidateCodeProperties code = new ValidateCodeProperties();
}
