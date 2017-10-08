package package2;




import package1.PaperPublication;
import package2.ChildrenBook;
import package3.Journal;
import package4.Magazine;


public class Driver  {
	public static void main (String[] Args){
		System.out.println("Using the driver class....\n");
		System.out.println("Creating various objects....\n");
		

		PaperPublication p1 = new PaperPublication(120.5,267); // new paper pub
		
		PaperPublication p2 = new PaperPublication(250.99,300);// new paper pub
		
		Book b1= new Book(10.5,100,9876543210l,2001,"Rock","Smith"); // new book
		
		ChildrenBook cb1=new ChildrenBook(20.5,100,9444321l,2001,"Rock","Smith",15);// new children book
		
		Journal j1 = new Journal(21.2, 12, 14, "Nature");// new journal
		Journal j2 = new Journal (25.7,15,20,"Military");
		Journal j3 = new Journal (25.7,15,20,"Military");
		PaperPublication p3 = new PaperPublication(120.5,267); // new paper pub
		
		Magazine mg1=new Magazine(150.50,500,package4.Magazine.PaperQuality.High,package4.Magazine.IssueFreq.Weekly);	
		// new magazine
		
		EducationalBook eb1 = new EducationalBook(21.2, 12, 1231231, 1992, "bad", "good", 2, "okay");
		//new Educational Book
		
		PaperPublication p4 = new PaperPublication(125.5,300);
		
		PaperPublication p5 = new PaperPublication(12.1,312);
			
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(j1.toString());
		System.out.println(j2.toString());
		System.out.println(j3.toString());
		System.out.println(cb1.toString());
		System.out.println(b1.toString());
		System.out.println(p3.toString());
		System.out.println(mg1.toString());

		System.out.println("Testing equality....");
		boolean b = p3.equals(mg1.toString());
		System.out.println(b);
		System.out.println(p3.equals(p5));
		System.out.println(j2.equals(j1));
		System.out.println(j3.equals(j2));
		System.out.println();
		System.out.println("Finding the cheepest book....");
		PaperPublication  Pubarray [] =new PaperPublication[10]; //array of paper publications
		Pubarray[0] = p1;
		Pubarray[1] = p2;
		Pubarray[2] = p3;
		Pubarray[3] = p4;
		Pubarray[4] = p5;
		Pubarray[5] = eb1;
		Pubarray[6] = cb1;
		Pubarray[7] = j1;
		Pubarray[8] = mg1;
		Pubarray[9] = b1;
		
		double Pricearray [] = new double[10]; // get prices of paper pubs
		
		for(int k = 0;k<Pricearray.length;k++ ){
			
			Pricearray[k] = Pubarray[k].getprice();
			
			
			
		}
		
		if (Pricearray.length == 0)
		    return;
		double small = Pricearray[0];             		// put prices in an array
		int index = 0;
		for (int i = 0; i < Pricearray.length; i++)
		    if (Pricearray[i] < small)
		    {
		        small = Pricearray[i];
		        index = i;
		    }
		
		System.out.println("The cheapest book is "+ small + " and it is located in position " + index);
		System.out.println(b1);                         //show info for cheapest book



		   
		
		}
		
		
		
		
	}