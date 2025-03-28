package org.com.campushikingai.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 超级管理员信息表
 * @TableName co2superadmin
 */
@TableName(value ="co2superadmin")
@Data
public class Co2superadmin {
    /**
     * 自增主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 用户ID（正数大范围）
     */
    private Long uid;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱地址
     */
    private String email;

    /**
     * 学号/教师编号/社会组织号
     */
    private String uscid;

    /**
     * 头像存储路径
     */
    private String image;

    /**
     * 姓名/组织名
     */
    private String name;

    /**
     * 民族
     */
    private String nationality;

    /**
     * 身份证号
     */
    private String identity;

    /**
     * 地址
     */
    private String address;

    /**
     * 用户昵称
     */
    private String uname;

    /**
     * 加密后的登录密码
     */
    private String password;

    /**
     * 班级信息数组
     */
    private String classId;

    /**
     * 个性签名
     */
    private String signature;

    /**
     * 最后一次登入时间
     */
    private Date lastLogin;

    /**
     * 连续登录失败次数
     */
    private Integer failedAttempts;

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
        Co2superadmin other = (Co2superadmin) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getUscid() == null ? other.getUscid() == null : this.getUscid().equals(other.getUscid()))
            && (this.getImage() == null ? other.getImage() == null : this.getImage().equals(other.getImage()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getNationality() == null ? other.getNationality() == null : this.getNationality().equals(other.getNationality()))
            && (this.getIdentity() == null ? other.getIdentity() == null : this.getIdentity().equals(other.getIdentity()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getUname() == null ? other.getUname() == null : this.getUname().equals(other.getUname()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getClassId() == null ? other.getClassId() == null : this.getClassId().equals(other.getClassId()))
            && (this.getSignature() == null ? other.getSignature() == null : this.getSignature().equals(other.getSignature()))
            && (this.getLastLogin() == null ? other.getLastLogin() == null : this.getLastLogin().equals(other.getLastLogin()))
            && (this.getFailedAttempts() == null ? other.getFailedAttempts() == null : this.getFailedAttempts().equals(other.getFailedAttempts()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getUscid() == null) ? 0 : getUscid().hashCode());
        result = prime * result + ((getImage() == null) ? 0 : getImage().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getNationality() == null) ? 0 : getNationality().hashCode());
        result = prime * result + ((getIdentity() == null) ? 0 : getIdentity().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getUname() == null) ? 0 : getUname().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getClassId() == null) ? 0 : getClassId().hashCode());
        result = prime * result + ((getSignature() == null) ? 0 : getSignature().hashCode());
        result = prime * result + ((getLastLogin() == null) ? 0 : getLastLogin().hashCode());
        result = prime * result + ((getFailedAttempts() == null) ? 0 : getFailedAttempts().hashCode());
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
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", uscid=").append(uscid);
        sb.append(", image=").append(image);
        sb.append(", name=").append(name);
        sb.append(", nationality=").append(nationality);
        sb.append(", identity=").append(identity);
        sb.append(", address=").append(address);
        sb.append(", uname=").append(uname);
        sb.append(", password=").append(password);
        sb.append(", classId=").append(classId);
        sb.append(", signature=").append(signature);
        sb.append(", lastLogin=").append(lastLogin);
        sb.append(", failedAttempts=").append(failedAttempts);
        sb.append("]");
        return sb.toString();
    }
}