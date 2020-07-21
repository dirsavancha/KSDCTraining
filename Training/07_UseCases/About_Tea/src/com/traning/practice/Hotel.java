package com.traning.practice;
public class Hotel{
	public static orderTea(String teaType){
		static Hotel tea=null;
		if(teaType.equalsIgnoreCase("Gingertea")){
			tea_ginger=new GingerTea(teaType);
			tea_ginger.price();
		}else if(teaType.equalsIgnoreCase("LemonTea")){
			tea_lemon=new LemonTea(teaType);
			tea_lemon.price();
		}else{
			System.out.println("Sorry "+teaType+"is not available");
		}
	}
}