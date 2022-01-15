package AirlinesEnum;

import org.springframework.stereotype.Component;


public enum Airlines {

	EMIRATES(1, "EMIRATES", 17, "INSERVICE"),
	PIA(2, "PIA", 11, "INSERVICE"),
	AIRMAX(3, "AIRMAX", 9, "INSERVICE"),
	AIRNEW(4, "AIRNEW", 13, "INSERVICE"),
	QATARAIRWAYS(5, "QATARAIRWAYS", 55, "INSERVICE");
	
	private int id;
	private String Name;
	private int totalPlanes;
	private String Status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getTotalPlanes() {
		return totalPlanes;
	}
	public void setTotalPlanes(int totalPlanes) {
		this.totalPlanes = totalPlanes;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	private Airlines(int id, String name, int totalPlanes, String status) {
		this.id = id;
		Name = name;
		this.totalPlanes = totalPlanes;
		Status = status;
	}
	
	
	
	private static Airlines UNKONWN;

	public static Airlines getById(int enumid) {
	    for(Airlines e : Airlines.values()) {
	        if(e.getId() == enumid) {
	        	System.out.println(e.getName());
	        	System.out.println(e.getStatus());
	        	return e;
	        	
	        }
	    }
	    return UNKONWN;
	}

	public static Airlines getBytotalPlanes(int planes) {
	    for(Airlines e : Airlines.values()) {
	        if(e.getTotalPlanes() == planes) {
	        	System.out.println(e.getName());
	        	System.out.println(e.getStatus());
	        	return e;
	        	
	        }
	    }
	    return UNKONWN;
	}

	
	
}
