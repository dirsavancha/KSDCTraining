package com.ksdc.traning.exceptions;

public class UsingMultipleCatches {

	public static void main(String[] args) {

		int a = 10;
		try {
			// Exception
			int b = a / 0;//----Arithem
			
			System.out.println(b);
		} catch (ArithmeticException e) {

			e.printStackTrace();
              throw e;
              
		} catch(ArrayIndexOutOfBoundsException e) {
			
		}catch (IndexOutOfBoundsException e) {
		}
		catch (Exception e) {
			e.printStackTrace();
		}
      
	}   
}
