package org.com.campushikingai.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 打卡记录表
 * @TableName use_punch_log
 */
@TableName(value ="use_punch_log")
@Data
public class UsePunchLog {
    /**
     * 打卡记录主键
     */
    @TableId(type = IdType.AUTO)
    private Long punchId;

    /**
     * 打卡类型（1代表上班 2代表下班）
     */
    private String punchType;

    /**
     * 打卡记录备注
     */
    private String punchRemark;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    private String delFlag;

    /**
     * 用户ID
     */
    private Long uid;

    /**
     * 记录创建者
     */
    private String createBy;

    /**
     * 记录创建时间
     */
    private Date createTime;

    /**
     * 记录更新者
     */
    private String updateBy;

    /**
     * 记录更新时间
     */
    private Date updateTime;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UsePunchLog other = (UsePunchLog) that;
        return (this.getPunchId() == null ? other.getPunchId() == null : this.getPunchId().equals(other.getPunchId()))
            && (this.getPunchType() == null ? other.getPunchType() == null : this.getPunchType().equals(other.getPunchType()))
            && (this.getPunchRemark() == null ? other.getPunchRemark() == null : this.getPunchRemark().equals(other.getPunchRemark()))
            && (this.getDelFlag() == null ? other.getDelFlag() == null : this.getDelFlag().equals(other.getDelFlag()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPunchId() == null) ? 0 : getPunchId().hashCode());
        result = prime * result + ((getPunchType() == null) ? 0 : getPunchType().hashCode());
        result = prime * result + ((getPunchRemark() == null) ? 0 : getPunchRemark().hashCode());
        result = prime * result + ((getDelFlag() == null) ? 0 : getDelFlag().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", punchId=").append(punchId);
        sb.append(", punchType=").append(punchType);
        sb.append(", punchRemark=").append(punchRemark);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", uid=").append(uid);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}