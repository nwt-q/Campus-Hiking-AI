package org.com.campushikingai.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.com.campushikingai.domain.LoginLog;
import org.com.campushikingai.service.LoginLogService;
import org.com.campushikingai.mapper.LoginLogMapper;
import org.springframework.stereotype.Service;

/**
* @author NWT
* @description 针对表【login_log(记录登入日志)】的数据库操作Service实现
* @createDate 2025-03-22 14:31:10
*/
@Service
public class LoginLogServiceImpl extends ServiceImpl<LoginLogMapper, LoginLog>
implements LoginLogService{

}
