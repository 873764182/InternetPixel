package com.pixel.domain;

public class User {
	/* ������� */
	private String _id;
	/* �û��˺� */
	private String account;
	/* �û��ǳ� */
	private String nickname;
	/* �˺����� */
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
