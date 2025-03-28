package org.com.campushikingai.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.com.campushikingai.domain.Activity;
import org.com.campushikingai.mapper.ActivityMapper;
import org.com.campushikingai.service.ActivityService;
import org.springframework.stereotype.Service;

/**
* @author NWT
* @description 针对表【activity(活动表)】的数据库操作Service实现
* @createDate 2025-03-28 20:34:19
*/
@Service
public class ActivityServiceImpl extends ServiceImpl<ActivityMapper, Activity>
    implements ActivityService{

}




