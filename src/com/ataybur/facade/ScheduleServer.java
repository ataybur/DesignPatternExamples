package com.ataybur.facade;

public class ScheduleServer {
	public void startBooting(){System.out.println("startBooting");}
	public void readSystemConfigFile(){System.out.println("readSystemConfigFile");}
	public void init(){System.out.println("init");}
	public void initializeContext(){System.out.println("initializeContext");}
	public void initializeListeners(){System.out.println("initializeListeners");}
	public void createSystemObjects(){System.out.println("createSystemObjects");}
	public void releaseProcesses(){System.out.println("releaseProcesses");}
	public void destory(){System.out.println("destory");}
	public void destroySystemObjects(){System.out.println("destroySystemObjects");}
	public void destoryListeners(){System.out.println("destoryListeners");}
	public void destoryContext(){System.out.println("destoryContext");}
	public void shutdown(){System.out.println("shutdown");}
}
