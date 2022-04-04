package TaskModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Task {
	int cl;        //计算负载
	int inputdata; //输入数据量
	int trel;      //任务发布时间
	
	int taskrank;  //任务优先级
	int deviceid;  //任务生成的设备 
	int offdevice; //任务部分卸载的设备
	
	public Task(int taskid,int cl,int inputdata,int trel) {
		this.taskrank=taskid;
		this.cl=cl;
		this.inputdata=inputdata;
		this.trel=trel;
	}
	
	public int getCl()
	{
		return cl;
	}
	public int getInputdata()
	{
		return inputdata;
	}
	public int getTrel()
	{
		return trel;
	}
	
	public int getTaskrank()
	{
		return taskrank;
	}
	public void setTaskrank(int trank)
	{
		this.taskrank=trank;
	}

	public int getdeviceid()
	{
		return deviceid;
	}
	public void setDeviceid(int did)
	{
		this.deviceid=did;
	}
	
	public int getOffdevice()
	{
		return offdevice;
	}
	public void setOffdevice(int offid)
	{
		this.offdevice=offid;
	}
	
	
}
