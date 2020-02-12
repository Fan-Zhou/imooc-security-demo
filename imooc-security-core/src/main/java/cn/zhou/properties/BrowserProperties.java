package cn.zhou.properties;

import lombok.Data;

@Data
public class BrowserProperties {
    private String loginPage = "/userLogin.html";
    private int rememberMeSeconds = 3600;
}
