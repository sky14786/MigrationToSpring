package com.themembers.member;

import java.sql.Date;

public class Member {
	private int code;
	private String name;
	private String id;
	private String pwd;
	private String phone;
	private String gender;
	private Date birth;
	private int type;
	private Date regDate;
	private String useYn;
	private String updUser;
	private Date updDate;
	private String mailYn;
	private String snsYn;
	private String nickName;

	public Member() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getUseYn() {
		return useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

	public String getUpdUser() {
		return updUser;
	}

	public void setUpdUser(String updUser) {
		this.updUser = updUser;
	}

	public Date getUpdDate() {
		return updDate;
	}

	public void setUpdDate(Date updDate) {
		this.updDate = updDate;
	}

	public String getMailYn() {
		return mailYn;
	}

	public void setMailYn(String mailYn) {
		this.mailYn = mailYn;
	}

	public String getSnsYn() {
		return snsYn;
	}

	public void setSnsYn(String snsYn) {
		this.snsYn = snsYn;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Member(int code, String name, String id, String pwd, String phone, String gender, Date birth, int type,
			Date regDate, String useYn, String updUser, Date updDate, String mailYn, String snsYn, String nickName) {
		super();
		this.code = code;
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.phone = phone;
		this.gender = gender;
		this.birth = birth;
		this.type = type;
		this.regDate = regDate;
		this.useYn = useYn;
		this.updUser = updUser;
		this.updDate = updDate;
		this.mailYn = mailYn;
		this.snsYn = snsYn;
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "Member [code=" + code + ", name=" + name + ", id=" + id + ", pwd=" + pwd + ", phone=" + phone
				+ ", gender=" + gender + ", birth=" + birth + ", type=" + type + ", regDate=" + regDate + ", useYn="
				+ useYn + ", updUser=" + updUser + ", updDate=" + updDate + ", mailYn=" + mailYn + ", snsYn=" + snsYn
				+ ", nickName=" + nickName + "]";
	}

}
