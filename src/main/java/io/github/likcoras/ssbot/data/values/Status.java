package io.github.likcoras.ssbot.data.values;

public enum Status {
	
	COMPLETE("Complete"), ONGOING("Ongoing");
	
	private String desc;
	
	private Status(final String desc) {
		
		this.desc = desc;
		
	}
	
	public String getDesc() {
		
		return desc;
		
	}
	
}