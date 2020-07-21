package com.ksdc.traning.abstraction;

interface WholeSale{
	
	void goldDesign();
}
abstract class Gold{
	
	void goldQuality() {
		System.out.println("24 crt gold");
	}
}
class GoldShop_1 extends Gold implements WholeSale{
	@Override
	public void goldDesign() {
		System.out.println("GoldShop_1 design");
		
	}
	void goldQuality() {
		System.out.println("24 crt gold");
	}
}
class GoldShop_2 implements WholeSale{
	@Override
	public void goldDesign() {
		System.out.println("GoldShop_2 design");
		
	}
}



public class WholeSaleGoldShop {

}
