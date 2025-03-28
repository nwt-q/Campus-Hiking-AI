package org.com.campushikingai.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 用户每日碳排放与健康数据表
 * @TableName user_daily_carbon
 */
@TableName(value ="user_daily_carbon")
@Data
public class UserDailyCarbon {
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
     * 运动步数（碳足迹计算依据）
     */
    private Integer step;

    /**
     * 体重（单位：kg，如 65.50）
     */
    private BigDecimal weight;

    /**
     * 运动心率（单位：次/分钟）
     */
    private Integer heartRate;

    /**
     * 最高血糖（单位：mmol/L，如 5.3）
     */
    private BigDecimal maxBloodSugar;

    /**
     * 最高血压（格式：收缩压/舒张压，如 140/90）
     */
    private String maxBloodPressure;

    /**
     * 最大摄氧量（单位：mL/min/kg）
     */
    private BigDecimal maximalOxygenUptake;

    /**
     * 今日总碳排放（单位：kg CO₂）
     */
    private BigDecimal maxCarbonEmission;

    /**
     * 运动碳排放
     */
    private BigDecimal motionCarbonEmission;

    /**
     * 活动碳排放
     */
    private BigDecimal activityCarbonEmission;

    /**
     * 公益碳排放量
     */
    private BigDecimal welfareCarbonEmission;

    /**
     * 消耗最大卡路里（单位：kcal）
     */
    private BigDecimal maxCalorie;

    /**
     * 活力值（PAI 指数，如 100）
     */
    private Integer motionPai;

    /**
     * 运动公里数（单位：km）
     */
    private BigDecimal motionKm;

    /**
     * 记录日期（格式：YYYY-MM-DD）
     */
    private Date dayTime;

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
        UserDailyCarbon other = (UserDailyCarbon) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getStep() == null ? other.getStep() == null : this.getStep().equals(other.getStep()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getHeartRate() == null ? other.getHeartRate() == null : this.getHeartRate().equals(other.getHeartRate()))
            && (this.getMaxBloodSugar() == null ? other.getMaxBloodSugar() == null : this.getMaxBloodSugar().equals(other.getMaxBloodSugar()))
            && (this.getMaxBloodPressure() == null ? other.getMaxBloodPressure() == null : this.getMaxBloodPressure().equals(other.getMaxBloodPressure()))
            && (this.getMaximalOxygenUptake() == null ? other.getMaximalOxygenUptake() == null : this.getMaximalOxygenUptake().equals(other.getMaximalOxygenUptake()))
            && (this.getMaxCarbonEmission() == null ? other.getMaxCarbonEmission() == null : this.getMaxCarbonEmission().equals(other.getMaxCarbonEmission()))
            && (this.getMotionCarbonEmission() == null ? other.getMotionCarbonEmission() == null : this.getMotionCarbonEmission().equals(other.getMotionCarbonEmission()))
            && (this.getActivityCarbonEmission() == null ? other.getActivityCarbonEmission() == null : this.getActivityCarbonEmission().equals(other.getActivityCarbonEmission()))
            && (this.getWelfareCarbonEmission() == null ? other.getWelfareCarbonEmission() == null : this.getWelfareCarbonEmission().equals(other.getWelfareCarbonEmission()))
            && (this.getMaxCalorie() == null ? other.getMaxCalorie() == null : this.getMaxCalorie().equals(other.getMaxCalorie()))
            && (this.getMotionPai() == null ? other.getMotionPai() == null : this.getMotionPai().equals(other.getMotionPai()))
            && (this.getMotionKm() == null ? other.getMotionKm() == null : this.getMotionKm().equals(other.getMotionKm()))
            && (this.getDayTime() == null ? other.getDayTime() == null : this.getDayTime().equals(other.getDayTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getStep() == null) ? 0 : getStep().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getHeartRate() == null) ? 0 : getHeartRate().hashCode());
        result = prime * result + ((getMaxBloodSugar() == null) ? 0 : getMaxBloodSugar().hashCode());
        result = prime * result + ((getMaxBloodPressure() == null) ? 0 : getMaxBloodPressure().hashCode());
        result = prime * result + ((getMaximalOxygenUptake() == null) ? 0 : getMaximalOxygenUptake().hashCode());
        result = prime * result + ((getMaxCarbonEmission() == null) ? 0 : getMaxCarbonEmission().hashCode());
        result = prime * result + ((getMotionCarbonEmission() == null) ? 0 : getMotionCarbonEmission().hashCode());
        result = prime * result + ((getActivityCarbonEmission() == null) ? 0 : getActivityCarbonEmission().hashCode());
        result = prime * result + ((getWelfareCarbonEmission() == null) ? 0 : getWelfareCarbonEmission().hashCode());
        result = prime * result + ((getMaxCalorie() == null) ? 0 : getMaxCalorie().hashCode());
        result = prime * result + ((getMotionPai() == null) ? 0 : getMotionPai().hashCode());
        result = prime * result + ((getMotionKm() == null) ? 0 : getMotionKm().hashCode());
        result = prime * result + ((getDayTime() == null) ? 0 : getDayTime().hashCode());
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
        sb.append(", step=").append(step);
        sb.append(", weight=").append(weight);
        sb.append(", heartRate=").append(heartRate);
        sb.append(", maxBloodSugar=").append(maxBloodSugar);
        sb.append(", maxBloodPressure=").append(maxBloodPressure);
        sb.append(", maximalOxygenUptake=").append(maximalOxygenUptake);
        sb.append(", maxCarbonEmission=").append(maxCarbonEmission);
        sb.append(", motionCarbonEmission=").append(motionCarbonEmission);
        sb.append(", activityCarbonEmission=").append(activityCarbonEmission);
        sb.append(", welfareCarbonEmission=").append(welfareCarbonEmission);
        sb.append(", maxCalorie=").append(maxCalorie);
        sb.append(", motionPai=").append(motionPai);
        sb.append(", motionKm=").append(motionKm);
        sb.append(", dayTime=").append(dayTime);
        sb.append("]");
        return sb.toString();
    }
}