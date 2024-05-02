package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 学生选课
 *
 * @author 
 * @email
 */
@TableName("xueshengxuanke")
public class XueshengxuankeEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XueshengxuankeEntity() {

	}

	public XueshengxuankeEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 学生
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 课程
     */
    @TableField(value = "kecheng_id")

    private Integer kechengId;


    /**
     * 审核情况
     */
    @TableField(value = "xueshengxuanke_yesno_types")

    private Integer xueshengxuankeYesnoTypes;


    /**
     * 详情
     */
    @TableField(value = "kecheng_content")

    private String kechengContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：课程
	 */
    public Integer getKechengId() {
        return kechengId;
    }


    /**
	 * 获取：课程
	 */

    public void setKechengId(Integer kechengId) {
        this.kechengId = kechengId;
    }
    /**
	 * 设置：审核情况
	 */
    public Integer getXueshengxuankeYesnoTypes() {
        return xueshengxuankeYesnoTypes;
    }


    /**
	 * 获取：审核情况
	 */

    public void setXueshengxuankeYesnoTypes(Integer xueshengxuankeYesnoTypes) {
        this.xueshengxuankeYesnoTypes = xueshengxuankeYesnoTypes;
    }
    /**
	 * 设置：详情
	 */
    public String getKechengContent() {
        return kechengContent;
    }


    /**
	 * 获取：详情
	 */

    public void setKechengContent(String kechengContent) {
        this.kechengContent = kechengContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xueshengxuanke{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", kechengId=" + kechengId +
            ", xueshengxuankeYesnoTypes=" + xueshengxuankeYesnoTypes +
            ", kechengContent=" + kechengContent +
            ", createTime=" + createTime +
        "}";
    }
}
