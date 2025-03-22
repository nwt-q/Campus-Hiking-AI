package org.com.campushikingai.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.com.campushikingai.domain.SportPlan;
import org.com.campushikingai.service.SportPlanService;
import org.com.campushikingai.mapper.SportPlanMapper;
import org.springframework.stereotype.Service;

/**
* @author NWT
* @description 针对表【sport_plan(用户运动计划表)】的数据库操作Service实现
* @createDate 2025-03-22 14:31:10
*/
@Service
public class SportPlanServiceImpl extends ServiceImpl<SportPlanMapper, SportPlan>
implements SportPlanService{

}
