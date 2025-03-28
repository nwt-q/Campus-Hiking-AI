package org.com.campushikingai.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 用户单次运动记录表
 * @TableName sport_record
 */
@TableName(value ="sport_record")
@Data
public class SportRecord {
    /**
     * 自增主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 用户ID（关联 co2user.uid）
     */
    private Long uid;

    /**
     * 运动记录唯一标识（如UUID）
     */
    private String trainId;

    /**
     * 运动类型ID（关联 sport_type.id）
     */
    private Integer typeId;

    /**
     * 训练名称（如"晨跑训练"）
     */
    private String trainName;

    /**
     * 训练描述标签
     */
    private String trainDescription;

    /**
     * 运动时长（单位：小时，如 1.50）
     */
    private BigDecimal trainH;

    /**
     * 运动公里数（单位：km）
     */
    private BigDecimal tionKm;

    /**
     * 配速（单位：分钟/km，如 5.20）
     */
    private BigDecimal pace;

    /**
     * 平均心率（单位：次/分钟）
     */
    private Integer heartRate;

    /**
     * 血糖（单位：mmol/L，如 5.3）
     */
    private BigDecimal bloodSugar;

    /**
     * 血压（格式：收缩压/舒张压，如 120/80）
     */
    private String bloodPressure;

    /**
     * 摄氧量（单位：mL/min/kg）
     */
    private BigDecimal oxygenUptake;

    /**
     * 本次碳排放（单位：kg CO₂）
     */
    private BigDecimal carbonEmission;

    /**
     * 消耗卡路里（单位：kcal）
     */
    private BigDecimal calorie;

    /**
     * 运动开始时间
     */
    private Date createTime;

    /**
     * 运动结束时间
     */
    private Date endTime;

    /**
     * 扩展数据（如GPS轨迹、设备信息）
     */
    private Object extendData;

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
        SportRecord other = (SportRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getTrainId() == null ? other.getTrainId() == null : this.getTrainId().equals(other.getTrainId()))
            && (this.getTypeId() == null ? other.getTypeId() == null : this.getTypeId().equals(other.getTypeId()))
            && (this.getTrainName() == null ? other.getTrainName() == null : this.getTrainName().equals(other.getTrainName()))
            && (this.getTrainDescription() == null ? other.getTrainDescription() == null : this.getTrainDescription().equals(other.getTrainDescription()))
            && (this.getTrainH() == null ? other.getTrainH() == null : this.getTrainH().equals(other.getTrainH()))
            && (this.getTionKm() == null ? other.getTionKm() == null : this.getTionKm().equals(other.getTionKm()))
            && (this.getPace() == null ? other.getPace() == null : this.getPace().equals(other.getPace()))
            && (this.getHeartRate() == null ? other.getHeartRate() == null : this.getHeartRate().equals(other.getHeartRate()))
            && (this.getBloodSugar() == null ? other.getBloodSugar() == null : this.getBloodSugar().equals(other.getBloodSugar()))
            && (this.getBloodPressure() == null ? other.getBloodPressure() == null : this.getBloodPressure().equals(other.getBloodPressure()))
            && (this.getOxygenUptake() == null ? other.getOxygenUptake() == null : this.getOxygenUptake().equals(other.getOxygenUptake()))
            && (this.getCarbonEmission() == null ? other.getCarbonEmission() == null : this.getCarbonEmission().equals(other.getCarbonEmission()))
            && (this.getCalorie() == null ? other.getCalorie() == null : this.getCalorie().equals(other.getCalorie()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getExtendData() == null ? other.getExtendData() == null : this.getExtendData().equals(other.getExtendData()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getTrainId() == null) ? 0 : getTrainId().hashCode());
        result = prime * result + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
        result = prime * result + ((getTrainName() == null) ? 0 : getTrainName().hashCode());
        result = prime * result + ((getTrainDescription() == null) ? 0 : getTrainDescription().hashCode());
        result = prime * result + ((getTrainH() == null) ? 0 : getTrainH().hashCode());
        result = prime * result + ((getTionKm() == null) ? 0 : getTionKm().hashCode());
        result = prime * result + ((getPace() == null) ? 0 : getPace().hashCode());
        result = prime * result + ((getHeartRate() == null) ? 0 : getHeartRate().hashCode());
        result = prime * result + ((getBloodSugar() == null) ? 0 : getBloodSugar().hashCode());
        result = prime * result + ((getBloodPressure() == null) ? 0 : getBloodPressure().hashCode());
        result = prime * result + ((getOxygenUptake() == null) ? 0 : getOxygenUptake().hashCode());
        result = prime * result + ((getCarbonEmission() == null) ? 0 : getCarbonEmission().hashCode());
        result = prime * result + ((getCalorie() == null) ? 0 : getCalorie().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getExtendData() == null) ? 0 : getExtendData().hashCode());
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
        sb.append(", trainId=").append(trainId);
        sb.append(", typeId=").append(typeId);
        sb.append(", trainName=").append(trainName);
        sb.append(", trainDescription=").append(trainDescription);
        sb.append(", trainH=").append(trainH);
        sb.append(", tionKm=").append(tionKm);
        sb.append(", pace=").append(pace);
        sb.append(", heartRate=").append(heartRate);
        sb.append(", bloodSugar=").append(bloodSugar);
        sb.append(", bloodPressure=").append(bloodPressure);
        sb.append(", oxygenUptake=").append(oxygenUptake);
        sb.append(", carbonEmission=").append(carbonEmission);
        sb.append(", calorie=").append(calorie);
        sb.append(", createTime=").append(createTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", extendData=").append(extendData);
        sb.append("]");
        return sb.toString();
    }
}