package org.com.campushikingai.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.com.campushikingai.domain.ClassInfo;

/**
* @author NWT
* @description 针对表【class_info(班级信息表)】的数据库操作Mapper
* @createDate 2025-03-22 14:31:10
* @Entity generator.domain.ClassInfo
*/
@Mapper
public interface ClassInfoMapper extends BaseMapper<ClassInfo> {

}
