package org.com.campushikingai.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.com.campushikingai.domain.RideRecord;
import org.com.campushikingai.service.RideRecordService;
import org.com.campushikingai.mapper.RideRecordMapper;
import org.springframework.stereotype.Service;

/**
* @author NWT
* @description 针对表【ride_record(用户乘车记录表)】的数据库操作Service实现
* @createDate 2025-03-22 14:31:10
*/
@Service
public class RideRecordServiceImpl extends ServiceImpl<RideRecordMapper, RideRecord>
implements RideRecordService{

}
