package package3;

import package1.PaperPublication;

//--------------------------------------------------------------- 
//Assignment 1  
//Question: Part 1  
//Written by: Steven Pohl 27172877, Andrew Di Miele 29606831 Bacisor Claudiu Dumitru 27735332
//Rohan Sarda 27725930
//Summary:  This class will be used to control if a journal has been purchased. It will
//generate the proper information about the journal. It could even combine all the information
//and compare two journal to see if they are the same or different.
//--------------------------------------------------------------- 


public class Journal extends PaperPublication {

	//Declaration of variables
	private int IssNr;
	private String SpecFld;


	//parameterized constructor
	public Journal (double pr, int npg, int INr, String SF) 
	{
		super(pr,npg);
		IssNr=INr;
		SpecFld=SF;
	}

	//copy constructor
	public Journal (PaperPublication pub, Journal EB) 
	{
		super(pub);
		IssNr=EB.IssNr;
		SpecFld=EB.SpecFld;
	}

    //This will get the issue number of the journal
	public int getIssNr()
	{
		return IssNr;
	}
    
	//This will set the issue number of the journal
	public void setIssNr(int INr)

	{
		IssNr=INr;
	}
    
	//This will get the speciality field of the journal
	public String getSpecFld()
	{ return SpecFld;
	}
    
	
	//This will set the speciality field of the journal
	public void setSpecFld(String SF)
	{
		SpecFld=SF;
	}
    
	// This will combine all the information about the journal
	public String toString()
	{
		return "Journal:\nHas " + getnumOfPages() + " number of pages and its price is " + getprice() + " $. The issue number is "
				+IssNr+ " and the speciality field " +SpecFld+ ".\n";
	}
	
	//This will compare the journals
	public boolean equals(Journal EB)
	{{if (EB==null) return false;
	else
			
		return(IssNr==EB.getIssNr()&& SpecFld==EB.getSpecFld()); 
	}

}
}