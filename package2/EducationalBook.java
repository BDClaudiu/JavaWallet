package package2;

import package1.PaperPublication;

//--------------------------------------------------------------- 
//Assignment 1  
//Question: Part 1  
//Written by: Steven Pohl 27172877, Andrew Di Miele 29606831 Bacisor Claudiu Dumitru 27735332
//Rohan Sarda 27725930
//Summary:  This class will be used to control if a educational book has been purchased. It will
//generate the proper information about the educational book. It could even combine all the information
//and compare two educational book to see if they are the same or different.
//--------------------------------------------------------------- 


class EducationalBook extends Book 
{
	//Declaration of Variables
	private int EditNr;
	private String SpecFld;


	//Parameterized constructor
	public EducationalBook (double pr, int npg, long BN, int yr, String bk, String ANa, int ENr, String SF) 

	{
		super(pr,npg,BN,yr,bk,ANa);
		EditNr=ENr;
		SpecFld=SF;
	}
	//Copy constructor
	public EducationalBook (PaperPublication pub, Book bk, EducationalBook EB) 

	{	super(pub,bk);
	EditNr=EB.EditNr;
	SpecFld=EB.SpecFld;
	}

	//This will get the editorial number of the book
	public int getEditNr()

	{
		return EditNr;
	}

	//This will set the editorial number of the book
	public void setEditNr(int ENr)

	{
		EditNr=ENr;
	}

	//This will get the specialty field of the book
	public String getSpecFld()

	{
		return SpecFld;
	}
	//This will set the specialty field of the book
	public void setSpecFld(String SF)

	{
		SpecFld=SF;
	}

	//This will combine all the information about the educational book
	public String toString()
	{
		return "EducationalBook:\nThe title is: " + gettitle() + " writen by " +getAuthorName()+ " in the year " +getyear()+
				". It has "+ getnumOfPages()+ " number of pages, its price is " + getprice() + "$, its editorial number is " + EditNr + " and belongs to the field " +SpecFld+ ".\n";
	}

	// This will compare the educational books
	public boolean equals(EducationalBook EB)
	{if (EB==null)
		return false;
	else
		return(EditNr == EB.getEditNr()&& SpecFld == EB.getSpecFld()); 
	}
}



