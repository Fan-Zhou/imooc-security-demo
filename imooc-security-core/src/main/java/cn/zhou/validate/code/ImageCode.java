package cn.zhou.validate.code;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class ImageCode {
    private BufferedImage image;
    private String code;
    //过期时间
    private LocalDateTime expireTime;

    public ImageCode(BufferedImage image, String code, int expireSeconds) {
        this.image = image;
        this.code = code;
        this.expireTime = LocalDateTime.now().plusSeconds(expireSeconds);
    }

    public boolean isExpired(){
        return LocalDateTime.now().isAfter(expireTime);
    }
}
