package package2;

import package1.PaperPublication;

class ChildrenBook extends Book 
{

	//--------------------------------------------------------------- 
	//Assignment 1  
	//Question: Part 1  
	//Written by: Steven Pohl 27172877, Andrew Di Miele 29606831 Bacisor Claudiu Dumitru 27735332
	//Rohan Sarda 27725930
	//Summary:  This class will be used to control if a children book has been purchased. It will
	//generate the proper information about the children book. It could even combine all the information
	//and compare two children book to see if they are the same or different.
	//--------------------------------------------------------------- 

	private int MinAge;


	//Parameterized constructor
	public ChildrenBook (double pr, int npg, long BN, int yr, String bk, String ANa, int Mage) //parameterized constructor

	{
		super(pr,npg,BN,yr,bk,ANa);
		MinAge=Mage;
	}


	//Copy constructor
	public ChildrenBook(PaperPublication pub, Book bk, ChildrenBook CB) //copy constructor

	{
		super(pub, bk);
		MinAge=CB.MinAge;
	}

    //This will get the minimum age for the book
	public int getMinAge()
	{
		return MinAge;
	}

    //This will set the minimum age for the book
	public void setMinAge(int Mage)
	{
		MinAge=Mage;
	}
    
	//This combine all information together for the children's book
	public String toString()
	{
		return "ChildrenBook:\nThe title is: " + gettitle() + " writen by " +getAuthorName()+ " in the year " +getyear()+
				". It has " + getnumOfPages()+ " number of pages and its price is " + getprice () + "$. The minumum reading age is " +MinAge+ ".\n";
	}
	
	//This will compare two children's book
	public boolean equals(ChildrenBook CB)
	{{if (CB==null)
		return false;
	else
		
	
		return(MinAge == CB.getMinAge()); 
	}
}
}