package cn.zhou.properties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "imooc.security")
@Data
@Component
public class SecurityPropertis {
    BrowserProperties browser = new BrowserProperties();
}
