package org.com.campushikingai.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.com.campushikingai.domain.SportRecord;
import org.com.campushikingai.service.SportRecordService;
import org.com.campushikingai.mapper.SportRecordMapper;
import org.springframework.stereotype.Service;

/**
* @author NWT
* @description 针对表【sport_record(用户单次运动记录表)】的数据库操作Service实现
* @createDate 2025-03-22 14:31:10
*/
@Service
public class SportRecordServiceImpl extends ServiceImpl<SportRecordMapper, SportRecord>
implements SportRecordService{

}
