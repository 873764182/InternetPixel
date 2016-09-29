package com.pixel.domain;

/**
 * 用户
 * 
 * @author Administrator
 *
 */
public class User {
	/* 用户唯一编号 */
	private String _id;
	/* 用户账号 */
	private String account;
	/* 用户昵称 */
	private String nickname;
	/* 用户密码 */
	private String password;

	public User() {
		super();
	}

	public User(String _id, String account, String nickname, String password) {
		super();
		this._id = _id;
		this.account = account;
		this.nickname = nickname;
		this.password = password;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [_id=" + _id + ", account=" + account + ", nickname=" + nickname + ", password=" + password + "]";
	}

}
