package com.ksdc.traning.usecase.Tea;

public class Hotel {
	public static void orderTea(String teaType){
		 
		if(teaType.equalsIgnoreCase("Gingertea")){
			 GingerTea g= new GingerTea(teaType);
			g.teaPrice();
		}else if(teaType.equalsIgnoreCase("LemonTea")){
			LemonTea l=new LemonTea(teaType);
			l.teaPrice();
		
		}else{
			System.out.println("Sorry "+teaType+"is not available");
		}
	}
}
