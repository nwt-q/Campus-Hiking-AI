package org.com.campushikingai.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.com.campushikingai.domain.CollegeInfo;
import org.com.campushikingai.service.CollegeInfoService;
import org.com.campushikingai.mapper.CollegeInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author NWT
* @description 针对表【college_info(学院信息表)】的数据库操作Service实现
* @createDate 2025-03-22 14:31:10
*/
@Service
public class CollegeInfoServiceImpl extends ServiceImpl<CollegeInfoMapper, CollegeInfo>
implements CollegeInfoService{

}
