package org.com.campushikingai.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.com.campushikingai.domain.ClassInfo;
import org.com.campushikingai.service.ClassInfoService;
import org.com.campushikingai.mapper.ClassInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author NWT
* @description 针对表【class_info(班级信息表)】的数据库操作Service实现
* @createDate 2025-03-22 14:31:10
*/
@Service
public class ClassInfoServiceImpl extends ServiceImpl<ClassInfoMapper, ClassInfo>
implements ClassInfoService{

}
