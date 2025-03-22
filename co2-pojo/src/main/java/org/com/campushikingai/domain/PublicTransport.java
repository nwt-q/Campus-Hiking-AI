package org.com.campushikingai.domain;

import lombok.Data;

/**
 * 公共交通基础信息表
 * @TableName public_transport
 */
@Data
public class PublicTransport {
    /**
     * 自增主键
     */
    private Integer id;

    /**
     * 车辆唯一标识（如车牌号或线路ID）
     */
    private String rideId;

    /**
     * 车辆编号（如公交线路号：B102）
     */
    private String rideNumber;

    /**
     * 交通类型
     */
    private Object rideType;

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
        PublicTransport other = (PublicTransport) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRideId() == null ? other.getRideId() == null : this.getRideId().equals(other.getRideId()))
            && (this.getRideNumber() == null ? other.getRideNumber() == null : this.getRideNumber().equals(other.getRideNumber()))
            && (this.getRideType() == null ? other.getRideType() == null : this.getRideType().equals(other.getRideType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRideId() == null) ? 0 : getRideId().hashCode());
        result = prime * result + ((getRideNumber() == null) ? 0 : getRideNumber().hashCode());
        result = prime * result + ((getRideType() == null) ? 0 : getRideType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", rideId=").append(rideId);
        sb.append(", rideNumber=").append(rideNumber);
        sb.append(", rideType=").append(rideType);
        sb.append("]");
        return sb.toString();
    }
}