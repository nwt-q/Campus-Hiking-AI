package org.com.campushikingai.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.com.campushikingai.domain.PublicTransport;
import org.com.campushikingai.mapper.PublicTransportMapper;
import org.com.campushikingai.service.PublicTransportService;
import org.springframework.stereotype.Service;

/**
* @author NWT
* @description 针对表【public_transport(公共交通基础信息表)】的数据库操作Service实现
* @createDate 2025-03-28 20:34:19
*/
@Service
public class PublicTransportServiceImpl extends ServiceImpl<PublicTransportMapper, PublicTransport>
    implements PublicTransportService{

}




