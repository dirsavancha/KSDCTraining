// Polymorphism

def: An action can be performed in many ways is know as Polymorphism


Types :

1.CompileTime Poly--> static poly-->early Binding

1 how you acheview static poly--
  static poly can be achevied through methodoverloading
  
2.Runtime poly--> Dynamic poly-->
 we can acheive through method Overriding
 
 
 1.MethodOveloading:
 
  A method which has more than one method and it is declared with the same method name and with 1.diffrent parameter list 
                                                                                                2.order of parameter               
																								3.diffrent data type of param
																								
Note : we can perform methodOverloading only inside a class																								
																								
																								
 class A{
	 
	 void add(int a,float b){  // diffrent par
		 
	 }
	  void add(float a,int b){ // order pa
		 
	 }
	  void add(int a,int b){
		 
	 }
	  void add(int a,float b){
		 
	 }
 }