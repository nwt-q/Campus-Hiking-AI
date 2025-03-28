package org.com.campushikingai.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.com.campushikingai.domain.Station;
import org.com.campushikingai.mapper.StationMapper;
import org.com.campushikingai.service.StationService;
import org.springframework.stereotype.Service;

/**
* @author NWT
* @description 针对表【station(站点地理信息)】的数据库操作Service实现
* @createDate 2025-03-28 20:34:19
*/
@Service
public class StationServiceImpl extends ServiceImpl<StationMapper, Station>
    implements StationService{

}




