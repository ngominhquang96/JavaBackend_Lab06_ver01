package model;

public enum Gender {
	NAM(1,"NAM"),NU(-1,"NU"),KHONG_XAC_DINH(-1,"KHONG_XAC_DINH");
	private int code;
	private String name;
	private Gender(int code, String name) {
		this.code = code;
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
