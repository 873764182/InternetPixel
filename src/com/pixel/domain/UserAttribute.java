package com.pixel.domain;

/**
 * 用户特有属性
 * 
 * @author Administrator
 *
 */
public class UserAttribute {
	/* 唯一编号 */
	private String _id;
	/* 对应的用户ID */
	private String user_id;
	/* 属性名 */
	private String attribute;
	/* 属性值 */
	private String value;

	public UserAttribute() {
		super();
	}

	public UserAttribute(String _id, String user_id, String attribute, String value) {
		super();
		this._id = _id;
		this.user_id = user_id;
		this.attribute = attribute;
		this.value = value;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "UserAttribute [_id=" + _id + ", user_id=" + user_id + ", attribute=" + attribute + ", value=" + value
				+ "]";
	}

}
