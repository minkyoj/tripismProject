package com.kh.tripism.travelSpot.model.vo;

public class SpotFestival {
	private String contentid;				//콘텐츠ID
	private String contenttypeid;			//콘텐츠타입ID
	private String agelimit;				//관람가능연령
	private String bookingplace;			//예매처
	private String discountinfofestival;	//할인정보
	private String eventenddate;			//행사종료일
	private String eventhomepage;			//행사홈페이지
	private String eventplace;				//행사장소
	private String eventstartdate;			//행사시작일
	private String festivalgrade;			//축제등급
	private String placeinfo;				//행사장위치안내
	private String playtime;				//공연시간
	private String program;					//행사프로그램
	private String spendtimefestival;		//관람소요시간
	private String sponsor1;				//주최자정보
	private String sponsor1tel;				//주최자연락처
	private String sponsor2;				//주관사정보
	private String sponsor2tel;				//주관사연락처
	private String subevent;				//부대행사
	private String usetimefestival;			//이용요금
	
	public SpotFestival() {}

	public SpotFestival(String contentid, String contenttypeid, String agelimit, String bookingplace,
			String discountinfofestival, String eventenddate, String eventhomepage, String eventplace,
			String eventstartdate, String festivalgrade, String placeinfo, String playtime, String program,
			String spendtimefestival, String sponsor1, String sponsor1tel, String sponsor2, String sponsor2tel,
			String subevent, String usetimefestival) {
		super();
		this.contentid = contentid;
		this.contenttypeid = contenttypeid;
		this.agelimit = agelimit;
		this.bookingplace = bookingplace;
		this.discountinfofestival = discountinfofestival;
		this.eventenddate = eventenddate;
		this.eventhomepage = eventhomepage;
		this.eventplace = eventplace;
		this.eventstartdate = eventstartdate;
		this.festivalgrade = festivalgrade;
		this.placeinfo = placeinfo;
		this.playtime = playtime;
		this.program = program;
		this.spendtimefestival = spendtimefestival;
		this.sponsor1 = sponsor1;
		this.sponsor1tel = sponsor1tel;
		this.sponsor2 = sponsor2;
		this.sponsor2tel = sponsor2tel;
		this.subevent = subevent;
		this.usetimefestival = usetimefestival;
	}

	public String getContentid() {
		return contentid;
	}

	public void setContentid(String contentid) {
		this.contentid = contentid;
	}

	public String getContenttypeid() {
		return contenttypeid;
	}

	public void setContenttypeid(String contenttypeid) {
		this.contenttypeid = contenttypeid;
	}

	public String getAgelimit() {
		return agelimit;
	}

	public void setAgelimit(String agelimit) {
		this.agelimit = agelimit;
	}

	public String getBookingplace() {
		return bookingplace;
	}

	public void setBookingplace(String bookingplace) {
		this.bookingplace = bookingplace;
	}

	public String getDiscountinfofestival() {
		return discountinfofestival;
	}

	public void setDiscountinfofestival(String discountinfofestival) {
		this.discountinfofestival = discountinfofestival;
	}

	public String getEventenddate() {
		return eventenddate;
	}

	public void setEventenddate(String eventenddate) {
		this.eventenddate = eventenddate;
	}

	public String getEventhomepage() {
		return eventhomepage;
	}

	public void setEventhomepage(String eventhomepage) {
		this.eventhomepage = eventhomepage;
	}

	public String getEventplace() {
		return eventplace;
	}

	public void setEventplace(String eventplace) {
		this.eventplace = eventplace;
	}

	public String getEventstartdate() {
		return eventstartdate;
	}

	public void setEventstartdate(String eventstartdate) {
		this.eventstartdate = eventstartdate;
	}

	public String getFestivalgrade() {
		return festivalgrade;
	}

	public void setFestivalgrade(String festivalgrade) {
		this.festivalgrade = festivalgrade;
	}

	public String getPlaceinfo() {
		return placeinfo;
	}

	public void setPlaceinfo(String placeinfo) {
		this.placeinfo = placeinfo;
	}

	public String getPlaytime() {
		return playtime;
	}

	public void setPlaytime(String playtime) {
		this.playtime = playtime;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public String getSpendtimefestival() {
		return spendtimefestival;
	}

	public void setSpendtimefestival(String spendtimefestival) {
		this.spendtimefestival = spendtimefestival;
	}

	public String getSponsor1() {
		return sponsor1;
	}

	public void setSponsor1(String sponsor1) {
		this.sponsor1 = sponsor1;
	}

	public String getSponsor1tel() {
		return sponsor1tel;
	}

	public void setSponsor1tel(String sponsor1tel) {
		this.sponsor1tel = sponsor1tel;
	}

	public String getSponsor2() {
		return sponsor2;
	}

	public void setSponsor2(String sponsor2) {
		this.sponsor2 = sponsor2;
	}

	public String getSponsor2tel() {
		return sponsor2tel;
	}

	public void setSponsor2tel(String sponsor2tel) {
		this.sponsor2tel = sponsor2tel;
	}

	public String getSubevent() {
		return subevent;
	}

	public void setSubevent(String subevent) {
		this.subevent = subevent;
	}

	public String getUsetimefestival() {
		return usetimefestival;
	}

	public void setUsetimefestival(String usetimefestival) {
		this.usetimefestival = usetimefestival;
	}

	@Override
	public String toString() {
		return "SpotFestival [contentid=" + contentid + ", contenttypeid=" + contenttypeid + ", agelimit=" + agelimit
				+ ", bookingplace=" + bookingplace + ", discountinfofestival=" + discountinfofestival
				+ ", eventenddate=" + eventenddate + ", eventhomepage=" + eventhomepage + ", eventplace=" + eventplace
				+ ", eventstartdate=" + eventstartdate + ", festivalgrade=" + festivalgrade + ", placeinfo=" + placeinfo
				+ ", playtime=" + playtime + ", program=" + program + ", spendtimefestival=" + spendtimefestival
				+ ", sponsor1=" + sponsor1 + ", sponsor1tel=" + sponsor1tel + ", sponsor2=" + sponsor2
				+ ", sponsor2tel=" + sponsor2tel + ", subevent=" + subevent + ", usetimefestival=" + usetimefestival
				+ "]";
	}
	
	
	

}
