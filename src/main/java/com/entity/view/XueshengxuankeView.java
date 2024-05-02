package com.entity.view;

import com.entity.XueshengxuankeEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 学生选课
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xueshengxuanke")
public class XueshengxuankeView extends XueshengxuankeEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 审核情况的值
		*/
		private String xueshengxuankeYesnoValue;



		//级联表 kecheng
			/**
			* 课程 的 教师
			*/
			private Integer kechengJiaoshiId;
			/**
			* 课程标题
			*/
			private String kechengName;
			/**
			* 封面
			*/
			private String kechengPhoto;
			/**
			* 课程类型
			*/
			private Integer kechengTypes;
				/**
				* 课程类型的值
				*/
				private String kechengValue;
			/**
			* 上课时间
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			private Date kechengTime;
			/**
			* 详情
			*/
			private String kechengContent;

		//级联表 yonghu
			/**
			* 学生姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 学生手机号
			*/
			private String yonghuPhone;
			/**
			* 学生身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public XueshengxuankeView() {

	}

	public XueshengxuankeView(XueshengxuankeEntity xueshengxuankeEntity) {
		try {
			BeanUtils.copyProperties(this, xueshengxuankeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 审核情况的值
			*/
			public String getXueshengxuankeYesnoValue() {
				return xueshengxuankeYesnoValue;
			}
			/**
			* 设置： 审核情况的值
			*/
			public void setXueshengxuankeYesnoValue(String xueshengxuankeYesnoValue) {
				this.xueshengxuankeYesnoValue = xueshengxuankeYesnoValue;
			}














				//级联表的get和set kecheng
					/**
					* 获取：课程 的 教师
					*/
					public Integer getKechengJiaoshiId() {
						return kechengJiaoshiId;
					}
					/**
					* 设置：课程 的 教师
					*/
					public void setKechengJiaoshiId(Integer kechengJiaoshiId) {
						this.kechengJiaoshiId = kechengJiaoshiId;
					}

					/**
					* 获取： 课程标题
					*/
					public String getKechengName() {
						return kechengName;
					}
					/**
					* 设置： 课程标题
					*/
					public void setKechengName(String kechengName) {
						this.kechengName = kechengName;
					}
					/**
					* 获取： 封面
					*/
					public String getKechengPhoto() {
						return kechengPhoto;
					}
					/**
					* 设置： 封面
					*/
					public void setKechengPhoto(String kechengPhoto) {
						this.kechengPhoto = kechengPhoto;
					}
					/**
					* 获取： 课程类型
					*/
					public Integer getKechengTypes() {
						return kechengTypes;
					}
					/**
					* 设置： 课程类型
					*/
					public void setKechengTypes(Integer kechengTypes) {
						this.kechengTypes = kechengTypes;
					}


						/**
						* 获取： 课程类型的值
						*/
						public String getKechengValue() {
							return kechengValue;
						}
						/**
						* 设置： 课程类型的值
						*/
						public void setKechengValue(String kechengValue) {
							this.kechengValue = kechengValue;
						}
					/**
					* 获取： 上课时间
					*/
					public Date getKechengTime() {
						return kechengTime;
					}
					/**
					* 设置： 上课时间
					*/
					public void setKechengTime(Date kechengTime) {
						this.kechengTime = kechengTime;
					}
					/**
					* 获取： 详情
					*/
					public String getKechengContent() {
						return kechengContent;
					}
					/**
					* 设置： 详情
					*/
					public void setKechengContent(String kechengContent) {
						this.kechengContent = kechengContent;
					}








				//级联表的get和set yonghu
					/**
					* 获取： 学生姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 学生手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 学生手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 学生身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 学生身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}




}
