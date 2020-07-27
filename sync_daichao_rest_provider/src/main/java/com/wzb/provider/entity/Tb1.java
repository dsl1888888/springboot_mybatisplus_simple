package com.wzb.provider.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 用作调试使用， 前后端， 或者日志很难查找的，先直接记录下来这里找。
 * @author Administrator
 *
 */
@TableName("tb1")
public class Tb1 extends Model<Tb1> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
 
    @TableField("type")
    private String type;
    
    @TableField("val")
    private String val;
    

    @TableField("phone")
    private String phone;
  
    
    public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	public Long getId() {
        return id;
    }

    public Tb1 setId(Long id) {
        this.id = id;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

	@Override
	public String toString() {
		return "Tb1 [id=" + id + ", type=" + type + ", val=" + val + "]";
	}
    
}
