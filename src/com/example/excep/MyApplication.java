package com.example.excep;

import java.util.ArrayList;

import android.app.Activity;
import android.app.Application;

public class MyApplication extends Application{
	private ArrayList<Activity> list = new ArrayList<Activity>();  
	@Override
	public void onCreate() {
		init();
	}
	//private MyApplication(){};
	public static MyApplication instance;
	public static MyApplication getInstance(){
		return instance==null?new MyApplication():instance;
	}
	
    public void init(){  
        //���ø�CrashHandlerΪ�����Ĭ�ϴ�����    
        UnCeHandler catchExcep = new UnCeHandler(this);  
        Thread.setDefaultUncaughtExceptionHandler(catchExcep);   
    }  
      
    /** 
     * Activity�ر�ʱ��ɾ��Activity�б��е�Activity����*/  
    public void removeActivity(Activity a){  
        list.remove(a);  
    }  
      
    /** 
     * ��Activity�б������Activity����*/  
    public void addActivity(Activity a){  
        list.add(a);  
    }  
      
    /** 
     * �ر�Activity�б��е�����Activity*/  
    public void finishActivity(){  
        for (Activity activity : list) {    
            if (null != activity) {    
                activity.finish();    
            }    
        }  
        //ɱ����Ӧ�ý���  
       android.os.Process.killProcess(android.os.Process.myPid());    
    }  
}
