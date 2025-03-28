package org.com.campushikingai.controller.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.com.campushikingai.context.JwtClaimsConstant;
import org.com.campushikingai.domain.Co2user;
import org.com.campushikingai.dto.UserLoginDTO;
import org.com.campushikingai.properties.JwtProperties;
import org.com.campushikingai.result.Result;
import org.com.campushikingai.service.impl.Co2userServiceImpl;
import org.com.campushikingai.utils.JwtUtil;
import org.com.campushikingai.vo.UserLoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
@Slf4j
@Tag(name = "Accept")
//https://www.cnblogs.com/30go/p/17343541.html
public class LoginController {

    @Autowired
    private Co2userServiceImpl co2userService;
    @Autowired
    private JwtProperties jwtProperties;
    //登入接口
    @Operation(summary = "测试Accept",description = "GitHub:https://github.com/xiaoymin/knife4j/issues/597")
    @PostMapping("/login")
    public Result<UserLoginVO> login(@RequestBody UserLoginDTO userLoginDTO) {
        // 获取用户uid. 根据ID查询出对应表中的数据, 返回数据
        QueryWrapper<Co2user> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name",userLoginDTO.getName()).eq("password",userLoginDTO.getPassword());

        final Co2user user = co2userService.getOne(queryWrapper);
        if (user == null) {
            return Result.error("用户名或密码错误");
        }
        //登录成功后，生成jwt令牌
        Map<String, Object> claims = new HashMap<>();
        claims.put(JwtClaimsConstant.U_ID, user.getUid());
        String token = JwtUtil.createJWT(
                jwtProperties.getUserSecretKey(),
                jwtProperties.getUserTtl(),
                claims);

        UserLoginVO userLoginVO = UserLoginVO.builder()
                .id(Long.valueOf(1))
                .userName(user.getUname())
                .name(user.getName())
                .token(token)
                .build();
        /// 返回前端
        return Result.success(userLoginVO);
    }
}
