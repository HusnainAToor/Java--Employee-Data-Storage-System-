import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Vector;





public class myMAIN {
	
	// ......................................................GLOBAL VARIABLES.................................
	Vector empvector=new Vector();
	Vector empvector2 =new Vector();
	

	myMAIN() throws IOException{
		
		IT employee1=new IT();
		IT employee2=new IT();
		IT employee3=new IT();                      
		
		
		
		
		Finance employee4=new Finance();
		Finance employee5=new Finance();
		
		//Enter data of Employees1................................................................
		employee1.setName("Alex kerrigan");
		employee1.setAge(45);
		employee1.setId(30222123);
		employee1.setDepartment("IT");
		empvector.add(employee1);
		
		//Enter data of Employees2................................................................
		employee2.setName("Vincent Price");
		employee2.setAge(20);
		employee2.setId(2003);
		employee2.setDepartment("IT");
		empvector.add(employee2);
		
		//Enter data of Employees3................................................................
		
		employee3.setName("Will Smith");
		employee3.setAge(35);
		employee3.setId(301127);
		employee3.setDepartment("IT");
		empvector.add(employee3);
		
		//Enter data of FINANCE Employees1 ................................................................
		employee4.setName("John Smith");
		employee4.setAge(18);
		employee4.setId(306589);
		employee4.setDepartment("Finance");
		empvector2.add(employee4);
		
		
		//Enter data of FINANCEEmployees2................................................................
		employee5.setName("Dermot Johnson");
		employee5.setAge(27);
		employee5.setId(8051652);
		employee5.setDepartment("Finance");
		empvector2.add(employee5);
		
		
		menu();

		
	}
	
	
	
	
	public void menu() throws IOException{
		
		
		
	
		
		
		
		
		
		
		System.out.println("                     ........*****************.........");
		System.out.println("                     ........*****WELCOME*****.........");
		System.out.println("                     ........*****************.........");
		
		System.out.println("");
		
		
		System.out.println("...Select A to add employee And B to view employees List in Record....");
		
        BufferedReader emp =new BufferedReader(new InputStreamReader(System.in));	
        
        String option =emp.readLine();
        if(option.equals("A")){
        	
        	System.out.println("..Select A to add employee in Finance Dept And  Select B to add employee in IT Dept..");
       
        	  String option3 =emp.readLine();
              if(option3.equals("A")){
            	 	System.out.println("employee can be added in FINANCE DEPT");
        	
            AddbussFinance();  // CALL METHODE TO ENTER NEW EMPLOYEE
         
               
            	System.out.println("");   
             	   menu();
              }
              else if(option3.equals("B")){
              
        	System.out.println("employee can be added in IT DEPT");
        Addbuss();   // CALL METHODE TO ENTER NEW IT EMPLOYEE
     
           
        	System.out.println("");   
         	   menu();
            
        }
        }
        
        else if(option.equals("B")){
        	
        	System.out.println(" Enter A for ascending order & B for descending order & C for search by name ");
        	               String option1 =emp.readLine();
        	               
        	               
        	               
        	         //.............................................................................. 
        	               if(option1.equals("A")){
        	            	   
        	            	   //........................................Ascending>>>>>>>>
        	            	   System.out.println("Business Ascending order");
        	            	   BAscending();
        	            	   System.out.println(" IT Ascending order");

        	            	   ITAscending();
        	            	   
        	            	   System.out.println("");
        	            	   System.out.println("");
        	            	  menu();
        	               }
        	               
        	               //.......................................Descending Order>>>>>>>>>>>>>>
        	               
        	               else if(option1.equals("B")){
        	            	   
        	            	   System.out.println("Business Descending order"); 
        	            	
        	            	   BDescending();
        	            	   System.out.println(" IT Descending order");

        	            	   ITDescending();
        	            	   
        	            	   System.out.println("");
        	            	   System.out.println("");
        	            	   menu();
        	            	   
        	               }
        	               
        	               //..........................EMPLOYEE search >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>......
        	               else if (option1.equals("C")){  
        	            	   
        	            	 	System.out.println(" Enter A for Business Employees & B for IT Employees to search them by name ");
             	               String option2 =emp.readLine();
             	            //.....................................Option--A ..........Business....EMPLOYEE
             	              if(option2.equals("A")){
             	            	  Search();
             	            	  
             	          	   
           	            	   System.out.println("");
           	            	   System.out.println("");
           	            	   menu();
             	              }
             	              
             	              
             	           //....................................>>>>>>>>>>>>>>>>>>
             	              else if(option2.equals("B")){
             	            	  Search1();
             	            	  
             	          	   
           	            	   System.out.println("");
           	            	   System.out.println("");
           	            	menu();
            	            	  
            	              }
             	              else{
             	            	    
                 	            	   
                 	            	   menu();
                 	                 
             	              }
             	              
             	               
             	              
             	            	   
        	               }
        	               
        	               else{
        	            	   
        	            	   menu();
        	               }           
        	               
        	               
        	               
        	               
        	               }
    	
    	
    	  else{
    		  System.out.println("");
       	  menu();
          }           
          
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void Addbuss() throws  IOException {
		// TODO Auto-generated method stub
		

		IT nextemployee = new IT();

		Scanner br=new Scanner(System.in);
		String name = "";
		int age = 0;
		int id = 0;
		String dep = "";

		

			
			
			
			 //.....................................NameInput....................................................... 
			 	
					 boolean Namecorrect=true;
					 
					  do {
						       System.out.println("Enter Your Name");
							 name = br.nextLine();
							 
						      if (name.length()>0&&name.matches("[a-zA-Z]+(\\s+[a-zA-Z]+)*") )
							     {
								  Namecorrect= true;
							     }
							  else {
								 Namecorrect=false;
								   }
						 }
					  
				         while (Namecorrect!=true);
					  boolean Namecorrect1=true;
						 
					  do {
						       System.out.println("Enter Your dpt");
						   	dep = br.nextLine();
							 
						      if (dep.length()>0&&dep.matches("[a-zA-Z]+(\\s+[a-zA-Z]+)*") )
							     {
								  Namecorrect1= true;
							     }
							  else {
								 Namecorrect1=false;
								   }
						 }
					  
				         while (Namecorrect1!=true);

		

			System.out.println("Enter your id");
			id = br.nextInt();

			System.out.println("Enter your age");
			age =br.nextInt();

	

		nextemployee.setName(name);
		nextemployee.setAge(age);	
		nextemployee.setDepartment(dep);
		nextemployee.setId(id);

		empvector.add(nextemployee);
		
		
		System.out.println(empvector.size());
		
		
		
		
	}




	public void AddbussFinance() throws  IOException {
		// TODO Auto-generated method stub
		

		Finance nextemployee1 = new Finance();

		Scanner br=new Scanner(System.in);
		String name = "";
		int age = 0;
		int id = 0;
		String dep = "";

		

		 boolean Namecorrect=true;
		 
		  do {
			       System.out.println("Enter Your Name");
				 name = br.nextLine();
				 
			      if (name.length()>0&&name.matches("[a-zA-Z]+(\\s+[a-zA-Z]+)*") )
				     {
					  Namecorrect= true;
				     }
				  else {
					 Namecorrect=false;
					   }
			 }
		  
	         while (Namecorrect!=true);
		  boolean Namecorrect1=true;
			 
		  do {
			       System.out.println("Enter Your dpt");
			   	dep = br.nextLine();
				 
			      if (dep.length()>0&&dep.matches("[a-zA-Z]+(\\s+[a-zA-Z]+)*") )
				     {
					  Namecorrect1= true;
				     }
				  else {
					 Namecorrect1=false;
					   }
			 }
		  
	         while (Namecorrect1!=true);



			System.out.println("Enter your id");
			id = br.nextInt();

			System.out.println(" Enter your age");
			age =br.nextInt();

	

		nextemployee1.setName(name);
		nextemployee1.setAge(age);	
		nextemployee1.setDepartment(dep);
		nextemployee1.setId(id);

		empvector2.add(nextemployee1);
		
		
		System.out.println(empvector2.size());
		
		
		
		
	}
















	public void ITDescending() {
		// TODO Auto-generated method stub
		
		
		
int[] emp=new int[empvector.size()];
		
		
		for(int y=0;y<empvector.size();y++){
			
		
			
		IT temp=(IT)empvector.get(y);
		emp[y]=temp.getId();
		
		
		}
		
		
		boolean flag =true;
		int temp1=0;
		
		
		while(flag){
			
			flag=false;
			for(int z=0;z<empvector.size()-1;z++){
				
				if (emp[z]<emp[z+1]){
					temp1=emp[z];
					emp[z]=emp[z+1];    //SWAPING
					emp[z+1]=temp1;
					
					flag=true;
					
				}
				
				
				
				
					
					
					
				
				
			}
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		for(int i=0; i<empvector.size(); i++){
			// take one id down at a time
			int currentId = emp[i];
			
			for(int y=0; y< empvector.size(); y++){
				
				IT temp2 = (IT)empvector.get(y);
			    if(currentId==temp2.getId() ){
			  	
				  System.out.println("Name:"+temp2.getName());
				 
				  System.out.println("Id:"+temp2.getId());
					System.out.println("Age:"+temp2.getAge());				
					System.out.println("Dept:"+temp2.getDepartment());
					 System.out.println(""); 
					 System.out.println("");
			    }
			}
		}
		
		
		
		
		
		
	}


















// ........................................................ENTER NAME TO SEARCH IT EMPLOYEE.......................................

	public void Search1() throws IOException {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("Enter the name of the employee you want to search");
		  BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		  String lookingFor = b.readLine();
		
		  
			  for(int i = 0; i< empvector.size(); i++){
				 IT temp3 = (IT)empvector.get(i);
				  if(temp3.getName().equals(lookingFor)){
					  System.out.println("");
					  System.out.println("");
						
					  System.out.println("Id:"+temp3.getId());
					  System.out.println("Name:"+temp3.getName());
						System.out.println("Age:"+temp3.getAge());				
						System.out.println("Dept:"+temp3.getDepartment());}}
		
		
	}




















	public void Search() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the name of the employee you want to search");
		  BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		  String lookingFor = b.readLine();
		
		  
			  for(int i = 0; i< empvector2.size(); i++){
				  Finance temp3 = (Finance)empvector2.get(i);
				  if(temp3.getName().equals(lookingFor)){
					  System.out.println("");
					  System.out.println("");
						
					  System.out.println("Id:"+temp3.getId());
					  System.out.println("Name:"+temp3.getName());
						System.out.println("Age:"+temp3.getAge());				
						System.out.println("Dept:"+temp3.getDepartment());}}
		
		
	}




















	public void BDescending() {
		// TODO Auto-generated method stub
int[] emp=new int[empvector2.size()];
		
		
		for(int y=0;y<empvector2.size();y++){
			
		
			
	Finance temp=(Finance)empvector2.get(y);
		emp[y]=temp.getId();
		
		
		}
		
		
		boolean flag =true;
		int temp1=0;
		
		
		while(flag){
			
			flag=false;
			for(int z=0;z<empvector2.size()-1;z++){
				
				if (emp[z]<emp[z+1]){
					temp1=emp[z];
					emp[z]=emp[z+1];  //SWAPING.............................
					emp[z+1]=temp1;
					
					flag=true;
					
				}
				
				
				
				
					
					
					
				
				
			}
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		for(int i=0; i<empvector2.size(); i++){
			// take one id down at a time
			int currentId = emp[i];
			
			for(int y=0; y< empvector2.size(); y++){
				
				Finance temp2 = (Finance)empvector2.get(y);
			    if(currentId==temp2.getId() ){
			  	
				  System.out.println("Name:"+temp2.getName());
				 
				  System.out.println("Id:"+temp2.getId());        //PRINT EMPLOYEE DATA
					System.out.println("Age:"+temp2.getAge());				
					System.out.println("Dept:"+temp2.getDepartment());
					 System.out.println(""); 
					 System.out.println("");
			    }
			}}
		
		
	
	}
















//................................................IT ASCENDING..........................................



	public void ITAscending() {
		// TODO Auto-generated method stub
		
int[] emp=new int[empvector.size()];
		
		
		for(int y=0;y<empvector.size();y++){
			
		
			
		IT temp=(IT)empvector.get(y);
		emp[y]=temp.getId();
		
		
		}
		
		
		boolean flag =true;
		int temp1=0;
		
		
		while(flag){
			
			flag=false;
			for(int z=0;z<empvector.size()-1;z++){
				
				if (emp[z]>emp[z+1]){
					temp1=emp[z];     //SWAPING..................
					emp[z]=emp[z+1];
					emp[z+1]=temp1;
					
					flag=true;
					
				}
				
				
				
				
					
					
					
				
				
			}
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		for(int i=0; i<empvector.size(); i++){
			// take one id down at a time
			int currentId = emp[i];
			
			for(int y=0; y< empvector.size(); y++){
				
				IT temp2 = (IT)empvector.get(y);
			    if(currentId==temp2.getId() ){
			  	
				  System.out.println("Name:"+temp2.getName());  //PRINT LIST
				 
				  System.out.println("Id:"+temp2.getId());
					System.out.println("Age:"+temp2.getAge());				
					System.out.println("Dept:"+temp2.getDepartment());
					 System.out.println(""); 
					 System.out.println("");
			    }
			}
		}
		
		
		
		
		
		
		
		
		
	}
		
		
		
		
	

















//.................................................FINANCE ASCENDING.......................................


	public void BAscending() {
	
int[] emp=new int[empvector2.size()];
		
		
		for(int y=0;y<empvector2.size();y++){
			
		
			
	Finance temp=(Finance)empvector2.get(y);
		emp[y]=temp.getId();
		
		
		}
		
		
		boolean flag =true;
		int temp1=0;
		
		
		while(flag){
			
			flag=false;
			for(int z=0;z<empvector2.size()-1;z++){
				
				if (emp[z]>emp[z+1]){
					temp1=emp[z];     //SWAPING
					emp[z]=emp[z+1];
					emp[z+1]=temp1;
					
					flag=true;
					
				}
				
				
				
				
					
					
					
				
				
			}
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		for(int i=0; i<empvector2.size(); i++){
			// take one id down at a time
			int currentId = emp[i];
			
			for(int y=0; y< empvector2.size(); y++){
				
				Finance temp2 = (Finance)empvector2.get(y);
			    if(currentId==temp2.getId() ){
			  	
				  System.out.println("Name:"+temp2.getName());
				                                                            //ENTER LIST
				  System.out.println("Id:"+temp2.getId());
					System.out.println("Age:"+temp2.getAge());				
					System.out.println("Dept:"+temp2.getDepartment());
					 System.out.println(""); 
					 System.out.println("");
			    }
			}}
		
		
	}




















	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       new myMAIN();
	}

}
