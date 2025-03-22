package org.com.campushikingai.domain;

import lombok.Data;

/**
 * 班级信息表
 * @TableName class_info
 */
@Data
public class ClassInfo {
    /**
     * 自增主键
     */
    private Integer id;

    /**
     * 隶属机构/组织ID（如学校、学院）
     */
    private Integer uoinId;

    /**
     * 班级唯一标识ID
     */
    private Integer classId;

    /**
     * 班级名称（如"计算机1班"）
     */
    private String clazz;

    /**
     * 年级（如2023表示2023级）
     */
    private Integer gradeYear;

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
        ClassInfo other = (ClassInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUoinId() == null ? other.getUoinId() == null : this.getUoinId().equals(other.getUoinId()))
            && (this.getClassId() == null ? other.getClassId() == null : this.getClassId().equals(other.getClassId()))
            && (this.getClass() == null ? other.getClass() == null : this.getClass().equals(other.getClass()))
            && (this.getGradeYear() == null ? other.getGradeYear() == null : this.getGradeYear().equals(other.getGradeYear()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUoinId() == null) ? 0 : getUoinId().hashCode());
        result = prime * result + ((getClassId() == null) ? 0 : getClassId().hashCode());
        result = prime * result + ((getClass() == null) ? 0 : getClass().hashCode());
        result = prime * result + ((getGradeYear() == null) ? 0 : getGradeYear().hashCode());
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
        sb.append(", classId=").append(classId);
        sb.append(", class=").append(clazz);
        sb.append(", gradeYear=").append(gradeYear);
        sb.append("]");
        return sb.toString();
    }
}