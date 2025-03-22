package org.com.campushikingai.domain;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 用户健康与低碳行为数据表
 * @TableName user_co2_data
 */
@Data
public class UserCo2Data {
    /**
     * 自增主键
     */
    private Integer id;

    /**
     * 用户ID（关联 co2user.uid）
     */
    private Long uid;

    /**
     * 保留俩位小数 体重（单位：kg，如 65.50）
     */
    private BigDecimal weight;

    /**
     * 心率（单位：次/分钟）
     */
    private Integer balanceRate;

    /**
     * 血糖（单位：mmol/L，如 5.3）
     */
    private BigDecimal blanceBloodSugar;

    /**
     * 血压（格式：收缩压/舒张压，如 120/80）
     */
    private String blanceBloodPressure;

    /**
     * 摄氧量（单位：mL/min/kg）
     */
    private BigDecimal allOxygenUptake;

    /**
     * 总碳排放（单位：kg CO₂）
     */
    private BigDecimal allCarbonEmission;

    /**
     * 总运动碳排放
     */
    private BigDecimal allMotionCarbonEmission;

    /**
     * 总活动碳排放
     */
    private BigDecimal allActivityCarbonEmission;

    /**
     * 总公益碳排放量
     */
    private BigDecimal allWelfareCarbonEmission;

    /**
     * 总数据记录时
     */
    private Date recordTime;

    /**
     * 最大卡路里（单位：kcal）
     */
    private BigDecimal allCalorie;

    /**
     * 活力值（PAI 指数）
     */
    private Integer blancenPai;

    /**
     * 运动公里转换（单位：km）
     */
    private BigDecimal allKm;

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
        UserCo2Data other = (UserCo2Data) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getBalanceRate() == null ? other.getBalanceRate() == null : this.getBalanceRate().equals(other.getBalanceRate()))
            && (this.getBlanceBloodSugar() == null ? other.getBlanceBloodSugar() == null : this.getBlanceBloodSugar().equals(other.getBlanceBloodSugar()))
            && (this.getBlanceBloodPressure() == null ? other.getBlanceBloodPressure() == null : this.getBlanceBloodPressure().equals(other.getBlanceBloodPressure()))
            && (this.getAllOxygenUptake() == null ? other.getAllOxygenUptake() == null : this.getAllOxygenUptake().equals(other.getAllOxygenUptake()))
            && (this.getAllCarbonEmission() == null ? other.getAllCarbonEmission() == null : this.getAllCarbonEmission().equals(other.getAllCarbonEmission()))
            && (this.getAllMotionCarbonEmission() == null ? other.getAllMotionCarbonEmission() == null : this.getAllMotionCarbonEmission().equals(other.getAllMotionCarbonEmission()))
            && (this.getAllActivityCarbonEmission() == null ? other.getAllActivityCarbonEmission() == null : this.getAllActivityCarbonEmission().equals(other.getAllActivityCarbonEmission()))
            && (this.getAllWelfareCarbonEmission() == null ? other.getAllWelfareCarbonEmission() == null : this.getAllWelfareCarbonEmission().equals(other.getAllWelfareCarbonEmission()))
            && (this.getRecordTime() == null ? other.getRecordTime() == null : this.getRecordTime().equals(other.getRecordTime()))
            && (this.getAllCalorie() == null ? other.getAllCalorie() == null : this.getAllCalorie().equals(other.getAllCalorie()))
            && (this.getBlancenPai() == null ? other.getBlancenPai() == null : this.getBlancenPai().equals(other.getBlancenPai()))
            && (this.getAllKm() == null ? other.getAllKm() == null : this.getAllKm().equals(other.getAllKm()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getBalanceRate() == null) ? 0 : getBalanceRate().hashCode());
        result = prime * result + ((getBlanceBloodSugar() == null) ? 0 : getBlanceBloodSugar().hashCode());
        result = prime * result + ((getBlanceBloodPressure() == null) ? 0 : getBlanceBloodPressure().hashCode());
        result = prime * result + ((getAllOxygenUptake() == null) ? 0 : getAllOxygenUptake().hashCode());
        result = prime * result + ((getAllCarbonEmission() == null) ? 0 : getAllCarbonEmission().hashCode());
        result = prime * result + ((getAllMotionCarbonEmission() == null) ? 0 : getAllMotionCarbonEmission().hashCode());
        result = prime * result + ((getAllActivityCarbonEmission() == null) ? 0 : getAllActivityCarbonEmission().hashCode());
        result = prime * result + ((getAllWelfareCarbonEmission() == null) ? 0 : getAllWelfareCarbonEmission().hashCode());
        result = prime * result + ((getRecordTime() == null) ? 0 : getRecordTime().hashCode());
        result = prime * result + ((getAllCalorie() == null) ? 0 : getAllCalorie().hashCode());
        result = prime * result + ((getBlancenPai() == null) ? 0 : getBlancenPai().hashCode());
        result = prime * result + ((getAllKm() == null) ? 0 : getAllKm().hashCode());
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
        sb.append(", weight=").append(weight);
        sb.append(", balanceRate=").append(balanceRate);
        sb.append(", blanceBloodSugar=").append(blanceBloodSugar);
        sb.append(", blanceBloodPressure=").append(blanceBloodPressure);
        sb.append(", allOxygenUptake=").append(allOxygenUptake);
        sb.append(", allCarbonEmission=").append(allCarbonEmission);
        sb.append(", allMotionCarbonEmission=").append(allMotionCarbonEmission);
        sb.append(", allActivityCarbonEmission=").append(allActivityCarbonEmission);
        sb.append(", allWelfareCarbonEmission=").append(allWelfareCarbonEmission);
        sb.append(", recordTime=").append(recordTime);
        sb.append(", allCalorie=").append(allCalorie);
        sb.append(", blancenPai=").append(blancenPai);
        sb.append(", allKm=").append(allKm);
        sb.append("]");
        return sb.toString();
    }
}