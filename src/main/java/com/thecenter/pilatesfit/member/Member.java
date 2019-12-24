package com.thecenter.pilatesfit.member;

public class Member {
	private String memId;
	private String memName;
	private String memPwd;
	private String place;
	private String memNick;
	private String memEmail;
	private String zipcode;
	private String addr;
	private String addrDetail;
	private String memTel;
	private String memHp;
	private String memBirth;
	private String memAuthCd;
	private String memPoint;

	public Member() {
	}

	public Member(String memId, String memName, String memPwd, String place, String memNick, String memEmail,
			String zipcode, String addr, String addrDetail, String memTel, String memHp, String memBirth,
			String memAuthCd, String memPoint) {
		super();
		this.memId = memId;
		this.memName = memName;
		this.memPwd = memPwd;
		this.place = place;
		this.memNick = memNick;
		this.memEmail = memEmail;
		this.zipcode = zipcode;
		this.addr = addr;
		this.addrDetail = addrDetail;
		this.memTel = memTel;
		this.memHp = memHp;
		this.memBirth = memBirth;
		this.memAuthCd = memAuthCd;
		this.memPoint = memPoint;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getMemPwd() {
		return memPwd;
	}

	public void setMemPwd(String memPwd) {
		this.memPwd = memPwd;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getMemNick() {
		return memNick;
	}

	public void setMemNick(String memNick) {
		this.memNick = memNick;
	}

	public String getMemEmail() {
		return memEmail;
	}

	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getAddrDetail() {
		return addrDetail;
	}

	public void setAddrDetail(String addrDetail) {
		this.addrDetail = addrDetail;
	}

	public String getMemTel() {
		return memTel;
	}

	public void setMemTel(String memTel) {
		this.memTel = memTel;
	}

	public String getMemHp() {
		return memHp;
	}

	public void setMemHp(String memHp) {
		this.memHp = memHp;
	}

	public String getMemBirth() {
		return memBirth;
	}

	public void setMemBirth(String memBirth) {
		this.memBirth = memBirth;
	}

	public String getMemAuthCd() {
		return memAuthCd;
	}

	public void setMemAuthCd(String memAuthCd) {
		this.memAuthCd = memAuthCd;
	}

	public String getMemPoint() {
		return memPoint;
	}

	public void setMemPoint(String memPoint) {
		this.memPoint = memPoint;
	}

	@Override
	public String toString() {
		return "Member [memId=" + memId + ", memName=" + memName + ", memPwd=" + memPwd + ", place=" + place
				+ ", memNick=" + memNick + ", memEmail=" + memEmail + ", zipcode=" + zipcode + ", addr=" + addr
				+ ", addrDetail=" + addrDetail + ", memTel=" + memTel + ", memHp=" + memHp + ", memBirth=" + memBirth
				+ ", memAuthCd=" + memAuthCd + ", memPoint=" + memPoint + "]";
	}

}
