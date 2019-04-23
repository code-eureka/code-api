package com.eureka.helloworld.api.resources;

public class DemoResourceTO {
     String resourceName;
     int resourceId;
     
     public DemoResourceTO(String resourceName, int resourceId) {
    	 this.resourceId = resourceId;
    	 this.resourceName = resourceName;
     }

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}
     
     
}
