package org.com.campushikingai.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
/* config of jwt */
@ConfigurationProperties(prefix = "co2.jwt")
@Data
public class JwtProperties {

    /**
     * 管理端员工生成jwt令牌相关配置
     */
    private String adminSecretKey;
    private long adminTtl;
    private String adminTokenName;

    /**
     * 用于手机端用户生成JWT令牌
     */
    private String userSecretKey;
    private long userTtl;
    private String userTokenName;

}
