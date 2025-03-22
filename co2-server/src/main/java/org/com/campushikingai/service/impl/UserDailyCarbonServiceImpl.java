package org.com.campushikingai.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.com.campushikingai.domain.UserDailyCarbon;
import org.com.campushikingai.service.UserDailyCarbonService;
import org.com.campushikingai.mapper.UserDailyCarbonMapper;
import org.springframework.stereotype.Service;

/**
* @author NWT
* @description 针对表【user_daily_carbon(用户每日碳排放与健康数据表)】的数据库操作Service实现
* @createDate 2025-03-22 14:31:10
*/
@Service
public class UserDailyCarbonServiceImpl extends ServiceImpl<UserDailyCarbonMapper, UserDailyCarbon>
implements UserDailyCarbonService{

}
