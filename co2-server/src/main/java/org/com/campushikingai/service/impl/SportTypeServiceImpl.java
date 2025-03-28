package org.com.campushikingai.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.com.campushikingai.domain.SportType;
import org.com.campushikingai.mapper.SportTypeMapper;
import org.com.campushikingai.service.SportTypeService;
import org.springframework.stereotype.Service;

/**
* @author NWT
* @description 针对表【sport_type(运动类型表)】的数据库操作Service实现
* @createDate 2025-03-28 20:34:19
*/
@Service
public class SportTypeServiceImpl extends ServiceImpl<SportTypeMapper, SportType>
    implements SportTypeService{

}




