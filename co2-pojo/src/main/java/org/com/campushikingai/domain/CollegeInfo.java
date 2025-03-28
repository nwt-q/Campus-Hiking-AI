package org.com.campushikingai.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 学院信息表
 * @TableName college_info
 */
@TableName(value ="college_info")
@Data
public class CollegeInfo {
    /**
     * 自增主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 学院id
     */
    private Integer uoinId;

    /**
     * 学院名
     */
    private String uoinName;

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
        CollegeInfo other = (CollegeInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUoinId() == null ? other.getUoinId() == null : this.getUoinId().equals(other.getUoinId()))
            && (this.getUoinName() == null ? other.getUoinName() == null : this.getUoinName().equals(other.getUoinName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUoinId() == null) ? 0 : getUoinId().hashCode());
        result = prime * result + ((getUoinName() == null) ? 0 : getUoinName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uoinId=").append(uoinId);
        sb.append(", uoinName=").append(uoinName);
        sb.append("]");
        return sb.toString();
    }
}