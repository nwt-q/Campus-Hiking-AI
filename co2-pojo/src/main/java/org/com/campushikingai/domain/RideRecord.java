package org.com.campushikingai.domain;

import java.util.Date;
import lombok.Data;

/**
 * 用户乘车记录表
 * @TableName ride_record
 */
@Data
public class RideRecord {
    /**
     * 自增主键
     */
    private Integer id;

    /**
     * 用户ID（关联 co2user.uid）
     */
    private Long uid;

    /**
     * 车辆ID（关联 public_transport.ride_id）
     */
    private String rideId;

    /**
     * 上车站点名称
     */
    private String boardingStation;

    /**
     * 下车站点名称
     */
    private String alightingStation;

    /**
     * 乘车状态（0-未上车 1-已上车 2-已下车）
     */
    private Integer boardingStatus;

    /**
     * 上车时间
     */
    private Date boardingTime;

    /**
     * 下车时间
     */
    private Date alightingTime;

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
        RideRecord other = (RideRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getRideId() == null ? other.getRideId() == null : this.getRideId().equals(other.getRideId()))
            && (this.getBoardingStation() == null ? other.getBoardingStation() == null : this.getBoardingStation().equals(other.getBoardingStation()))
            && (this.getAlightingStation() == null ? other.getAlightingStation() == null : this.getAlightingStation().equals(other.getAlightingStation()))
            && (this.getBoardingStatus() == null ? other.getBoardingStatus() == null : this.getBoardingStatus().equals(other.getBoardingStatus()))
            && (this.getBoardingTime() == null ? other.getBoardingTime() == null : this.getBoardingTime().equals(other.getBoardingTime()))
            && (this.getAlightingTime() == null ? other.getAlightingTime() == null : this.getAlightingTime().equals(other.getAlightingTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getRideId() == null) ? 0 : getRideId().hashCode());
        result = prime * result + ((getBoardingStation() == null) ? 0 : getBoardingStation().hashCode());
        result = prime * result + ((getAlightingStation() == null) ? 0 : getAlightingStation().hashCode());
        result = prime * result + ((getBoardingStatus() == null) ? 0 : getBoardingStatus().hashCode());
        result = prime * result + ((getBoardingTime() == null) ? 0 : getBoardingTime().hashCode());
        result = prime * result + ((getAlightingTime() == null) ? 0 : getAlightingTime().hashCode());
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
        sb.append(", rideId=").append(rideId);
        sb.append(", boardingStation=").append(boardingStation);
        sb.append(", alightingStation=").append(alightingStation);
        sb.append(", boardingStatus=").append(boardingStatus);
        sb.append(", boardingTime=").append(boardingTime);
        sb.append(", alightingTime=").append(alightingTime);
        sb.append("]");
        return sb.toString();
    }
}