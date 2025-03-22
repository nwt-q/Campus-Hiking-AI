package org.com.campushikingai.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.com.campushikingai.domain.PlateAuditLog;
import org.com.campushikingai.service.PlateAuditLogService;
import org.com.campushikingai.mapper.PlateAuditLogMapper;
import org.springframework.stereotype.Service;

/**
* @author NWT
* @description 针对表【plate_audit_log(用户光盘行动打卡记录表)】的数据库操作Service实现
* @createDate 2025-03-22 14:31:10
*/
@Service
public class PlateAuditLogServiceImpl extends ServiceImpl<PlateAuditLogMapper, PlateAuditLog>
implements PlateAuditLogService{

}
