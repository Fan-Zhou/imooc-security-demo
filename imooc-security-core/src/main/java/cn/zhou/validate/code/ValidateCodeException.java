package cn.zhou.validate.code;

import org.springframework.security.core.AuthenticationException;

/**
 *
 * @author zhoufan
 */

public class ValidateCodeException extends AuthenticationException {

    public ValidateCodeException(String msg) {
        super(msg);
    }
}
