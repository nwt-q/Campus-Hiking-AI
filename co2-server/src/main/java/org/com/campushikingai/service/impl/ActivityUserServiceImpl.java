package org.com.campushikingai.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.com.campushikingai.domain.ActivityUser;
import org.com.campushikingai.mapper.ActivityUserMapper;
import org.com.campushikingai.service.ActivityUserService;
import org.springframework.stereotype.Service;

/**
* @author NWT
* @description 针对表【activity_user(活动参与人信息表)】的数据库操作Service实现
* @createDate 2025-03-28 20:34:19
*/
@Service
public class ActivityUserServiceImpl extends ServiceImpl<ActivityUserMapper, ActivityUser>
    implements ActivityUserService{

}




