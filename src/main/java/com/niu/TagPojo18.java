package com.niu;

public class TagPojo18 {
	private int tagId;
	  private int status;
	  private int antenna1Id;
	  private int antenna2Id;
	  private int antenna1Rssi;
	  private int antenna2Rssi;
	  private int antennaSN;
	  private int tagSN;
	  private int masterRssi;
	  private int slaveRssi;
	  private int deviceId;
	  private int deviceSN;

	  public TagPojo18(int tagId)
	  {
	    this.tagId = tagId;
	  }

	  public int getDeviceId() {
	    return this.deviceId;
	  }

	  public void setDeviceId(int deviceId) {
	    this.deviceId = deviceId;
	  }

	  public int getDeviceSN() {
	    return this.deviceSN;
	  }

	  public void setDeviceSN(int deviceSN) {
	    this.deviceSN = deviceSN;
	  }

	  public int getTagId() {
	    return this.tagId;
	  }

	  public void setTagId(int tagId) {
	    this.tagId = tagId;
	  }

	  public int getStatus() {
	    return this.status;
	  }

	  public void setStatus(int status) {
	    this.status = status;
	  }

	  public int getAntenna1Id() {
	    return this.antenna1Id;
	  }

	  public void setAntenna1Id(int antenna1Id) {
	    this.antenna1Id = antenna1Id;
	  }

	  public int getAntenna2Id() {
	    return this.antenna2Id;
	  }

	  public void setAntenna2Id(int antenna2Id) {
	    this.antenna2Id = antenna2Id;
	  }

	  public int getAntenna1Rssi() {
	    return this.antenna1Rssi;
	  }

	  public void setAntenna1Rssi(int antenna1Rssi) {
	    this.antenna1Rssi = antenna1Rssi;
	  }

	  public int getAntenna2Rssi() {
	    return this.antenna2Rssi;
	  }

	  public void setAntenna2Rssi(int antenna2Rssi) {
	    this.antenna2Rssi = antenna2Rssi;
	  }

	  public int getAntennaSN() {
	    return this.antennaSN;
	  }

	  public void setAntennaSN(int antennaSN) {
	    this.antennaSN = antennaSN;
	  }

	  public int getTagSN() {
	    return this.tagSN;
	  }

	  public void setTagSN(int tagSN) {
	    this.tagSN = tagSN;
	  }

	  public int getMasterRssi() {
	    return this.masterRssi;
	  }

	  public void setMasterRssi(int masterRssi) {
	    this.masterRssi = masterRssi;
	  }

	  public int getSlaveRssi() {
	    return this.slaveRssi;
	  }

	  public void setSlaveRssi(int slaveRssi) {
	    this.slaveRssi = slaveRssi;
	  }
}
