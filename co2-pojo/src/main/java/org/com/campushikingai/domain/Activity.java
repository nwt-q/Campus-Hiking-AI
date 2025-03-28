package org.com.campushikingai.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Arrays;
import lombok.Data;

/**
 * 活动表
 * @TableName activity
 */
@TableName(value ="activity")
@Data
public class Activity {
    /**
     * 活动表id
     */
    @TableId
    private Long activityId;

    /**
     * 活动名
     */
    private String activityName;

    /**
     * 活动状态
     */
    private Long activityStatus;

    /**
     * 活动相关的介绍
     */
    private String activityRemark;

    /**
     * 活动参与人数限制
     */
    private Long activityLogin;

    /**
     * 活动素材图片
     */
    private byte[] activityImage;

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
        Activity other = (Activity) that;
        return (this.getActivityId() == null ? other.getActivityId() == null : this.getActivityId().equals(other.getActivityId()))
            && (this.getActivityName() == null ? other.getActivityName() == null : this.getActivityName().equals(other.getActivityName()))
            && (this.getActivityStatus() == null ? other.getActivityStatus() == null : this.getActivityStatus().equals(other.getActivityStatus()))
            && (this.getActivityRemark() == null ? other.getActivityRemark() == null : this.getActivityRemark().equals(other.getActivityRemark()))
            && (this.getActivityLogin() == null ? other.getActivityLogin() == null : this.getActivityLogin().equals(other.getActivityLogin()))
            && (Arrays.equals(this.getActivityImage(), other.getActivityImage()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getActivityId() == null) ? 0 : getActivityId().hashCode());
        result = prime * result + ((getActivityName() == null) ? 0 : getActivityName().hashCode());
        result = prime * result + ((getActivityStatus() == null) ? 0 : getActivityStatus().hashCode());
        result = prime * result + ((getActivityRemark() == null) ? 0 : getActivityRemark().hashCode());
        result = prime * result + ((getActivityLogin() == null) ? 0 : getActivityLogin().hashCode());
        result = prime * result + (Arrays.hashCode(getActivityImage()));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", activityId=").append(activityId);
        sb.append(", activityName=").append(activityName);
        sb.append(", activityStatus=").append(activityStatus);
        sb.append(", activityRemark=").append(activityRemark);
        sb.append(", activityLogin=").append(activityLogin);
        sb.append(", activityImage=").append(activityImage);
        sb.append("]");
        return sb.toString();
    }
}