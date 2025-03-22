package org.com.campushikingai.domain;

import java.util.Date;
import lombok.Data;

/**
 * 用户光盘行动打卡记录表
 * @TableName clean_plate_action
 */
@Data
public class CleanPlateAction {
    /**
     * 自增主键
     */
    private Integer id;

    /**
     * 用户ID（关联 co2user.uid）
     */
    private Long uid;

    /**
     * 图片路径（OSS Key 或 URL）
     */
    private String image;

    /**
     * 状态（0-未通过 1-已通过 2-审核中）
     */
    private Integer status;

    /**
     * 上传时间
     */
    private Date createTime;

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
        CleanPlateAction other = (CleanPlateAction) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getImage() == null ? other.getImage() == null : this.getImage().equals(other.getImage()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getImage() == null) ? 0 : getImage().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uid=").append(uid);
        sb.append(", image=").append(image);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}