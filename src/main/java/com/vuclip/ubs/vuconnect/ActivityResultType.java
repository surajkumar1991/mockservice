package com.vuclip.ubs.vuconnect;
public enum ActivityResultType {

	SUCCESS("SUCCESS"), FAILURE("FAILURE"), ERROR("ERROR"), ACCEPTED("ACCEPTED"), CANCEL("CANCEL"),CG_BYPASS("CG_BYPASS"),LOW_BALANCE("LOW_BALANCE");
	
	private final String activityResultType;

	public String getActivityResultType() {
		return activityResultType;
	}

	ActivityResultType(String activityResultType) {
		this.activityResultType = activityResultType;
	}
	
	public static ActivityResultType fromValue(String activityResultType) {
		for(ActivityResultType activityResultTypeEnum :ActivityResultType.values()) {
			if(activityResultTypeEnum.toString().equalsIgnoreCase(activityResultType)) {
				return activityResultTypeEnum;
			}
		}
		return null;
	}

}
