package package1;

import package4.Magazine;

//--------------------------------------------------------------- 
//Assignment 1  
//Question: Part 1  
//Written by: Steven Pohl 27172877, Andrew Di Miele 29606831 Bacisor Claudiu Dumitru 27735332
//Rohan Sarda 27725930
//Summary: This will set the following prices, number of pages,
//needed for when a paper publication is created. It will also compare to paper publications by using
//the numbers of pages as well as the price of the paper publication.
//
//--------------------------------------------------------------- 

public  class PaperPublication  
{
	//Declaration of variables
	private double price;
	private int numOfPages;

	//Constructor with parameter
	public PaperPublication (double pr, int npg)
	{
		price = pr;
		numOfPages=npg;
	}
	//Copy constructor
	public PaperPublication (PaperPublication pub) 
	{
		price = pub.price;
		numOfPages=pub.numOfPages;
		
	}
    //Get a price
	public double getprice()
	{
		return price;
	}
   //Set a price
	public void setprice(int pr)
	{
		price=pr;
	}
   //Get the number of pages
	public int getnumOfPages()

	{
		return numOfPages;
	}
    //Set the number of pages
	public void setnumOfPages(int npg)
	{
		numOfPages=npg;
	}
    // This will combine all the information that is stored for the Paper Publication
	public String toString()
	{
		return "Paper Publication:\n" + numOfPages + 
				" number of pages and its price is " + price +"$. \n";
	}
	public boolean equals(PaperPublication pub)
	{{if (pub==null)
		return false;
	else
		return(numOfPages==pub.getnumOfPages()&& price==pub.getprice()); 
	}
}

}