package edu.pitt.sis.infsci2711.query.server.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrestoCmdManager {
	//you can pass "" or null to use the default
	public static boolean deepRestart(String prestoRoot)
	{
		String cmd=prestoRoot;
		if(cmd==null||cmd.equals(""))
		{
			cmd=SingletonConfig.getPrestoRoot()+"bin/launcher restart";
		}
	    Process p=null;
	    String s=null;
	    try{
	        p=Runtime.getRuntime().exec(cmd);
	        p.waitFor();
	        BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));
	        
	        while((s=br.readLine())!=null)
	            System.out.println("line: "+s);
	        p.waitFor();
	        System.out.println("exit: "+p.exitValue());
	        Thread.sleep(8000);
	        //p.destroy();  
	        
	        return true;
	    }
	    catch(Exception e)
	    {
	    	System.out.println("error restarting presto");
	    	return false;
	    }	
	}
	//you can pass "" or null to use the default
		public static boolean restart(String prestoRoot)
		{
			String cmd=prestoRoot;
			if(cmd==null||cmd.equals(""))
			{
				cmd=SingletonConfig.getPrestoRoot()+"bin/launcher restart";
			}
		    Process p=null;
		    String s=null;
		    try{
		        p=Runtime.getRuntime().exec(cmd);
		        p.waitFor();
		        BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));
		        
		        while((s=br.readLine())!=null)
		            System.out.println("line: "+s);
		        p.waitFor();
		        System.out.println("exit: "+p.exitValue());
		        //Thread.sleep(7000);
		        //p.destroy();  
		        
		        return true;
		    }
		    catch(Exception e)
		    {
		    	System.out.println("error restarting presto");
		    	return false;
		    }
			
		}
		
		public static boolean start(String prestoRoot)
		{
			String cmd=prestoRoot;
			if(cmd==null||cmd.equals(""))
			{
				cmd=SingletonConfig.getPrestoRoot()+"bin/launcher start";
			}
		    Process p=null;
		    String s=null;
		    try{
		        p=Runtime.getRuntime().exec(cmd);
		        p.waitFor();
		        BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));
		        
		        while((s=br.readLine())!=null)
		            System.out.println("line: "+s);
		        p.waitFor();
		        System.out.println("exit: "+p.exitValue());
		       //p.destroy();  
		        return true;
		    }
		    catch(Exception e)
		    {
		    	System.out.println("error starting presto");
		    	return false;
		    }
		}

		public static boolean deepStart(String prestoRoot)
		{
			String cmd=prestoRoot;
			if(cmd==null||cmd.equals(""))
			{
				cmd=SingletonConfig.getPrestoRoot()+"bin/launcher start";
			}
		    Process p=null;
		    String s=null;
		    try{
		        p=Runtime.getRuntime().exec(cmd);
		        p.waitFor();
		        BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));
		        
		        while((s=br.readLine())!=null)
		            System.out.println("line: "+s);
		        p.waitFor();
		        System.out.println("exit: "+p.exitValue());
		        Thread.sleep(8000);
		       //p.destroy();  
		        return true;
		    }
		    catch(Exception e)
		    {
		    	System.out.println("error starting presto");
		    	return false;
		    }
		}
		
		public static boolean stop(String prestoRoot)
		{
			String cmd=prestoRoot;
			if(cmd==null||cmd.equals(""))
			{
				cmd=SingletonConfig.getPrestoRoot()+"bin/launcher stop";
			}
		    Process p=null;
		    String s=null;
		    try{
		        p=Runtime.getRuntime().exec(cmd);
		        p.waitFor();
		        BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));
		        
		        while((s=br.readLine())!=null)
		            System.out.println("line: "+s);
		        p.waitFor();
		        System.out.println("exit: "+p.exitValue());
		        //p.destroy();  
		        return true;
		    }
		    catch(Exception e)
		    {
		    	System.out.println("error stopping presto");
		    	return false;
		    }
		}
}