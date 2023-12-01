package application;



public class projectClass {
	private String Start;
	private String endTime;
	private String project;
	private String LCS; 
	private String EffortCategory;
	private String plan;
	
	
	public String getPlan() {
		return plan;
	}


	public String getEc() {
		return EffortCategory;
	}


	public String getLCS() {
		return LCS;
	}


	public String getProject() {
		return project;
	}


	public String getEnd() {
		return endTime;
	}


	public String getStart() {
		return Start;
	}
	
	public void setStart(String Start) { this.Start = Start;}
	public void setEnd(String endTime) { this.endTime = endTime;}
	public void setProject(String project) { this.project = project;}
	public void setLCS(String LCS) { this.LCS = LCS;}
	public void setEffortCategory(String EffortCategory) { this.EffortCategory = EffortCategory;}
	public void setPlan(String plan) { this.plan = plan;}
	

	
	public projectClass(String Start, String endTime, String project, String LCS, String EffortCategory, String plan) {
		this.Start = Start;
		this.endTime = endTime;
		this.project = project;
		this.LCS = LCS;
		this.EffortCategory = EffortCategory;
		this.plan = plan;
	}
}
