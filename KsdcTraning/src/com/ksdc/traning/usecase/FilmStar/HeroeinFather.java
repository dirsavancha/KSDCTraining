package com.ksdc.traning.usecase.FilmStar;

public class HeroeinFather {
	public static void main(String[] args) {
		RamCharan rc=new RamCharan();
		System.out.println(rc.height);
		rc.airLines();
		rc.awards();
		rc.eyeBank();
		rc.hitMovie();
		System.out.println(((Chiranjeevi)rc).height);
		System.out.println("============");
		
		Chiranjeevi ch=new RamCharan();
		System.out.println(ch.height);
		ch.awards();
		ch.eyeBank();
		ch.hitMovie();
		ch.marriageOpinion();// RunTime 
		
	}

}
