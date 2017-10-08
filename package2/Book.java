package package2;

import package1.PaperPublication;


//--------------------------------------------------------------- 
//Assignment 1  
//Question: Part 1 
//Written by: Steven Pohl 27172877, Andrew Di Miele 29606831 Bacisor Claudiu Dumitru 27735332
//Rohan Sarda 27725930
//Summary: This will set a book object that will take in the ISBN number, the year, the title
//and the authors name. It can compare two book objects and display the information in the
//object.
//
//--------------------------------------------------------------- 



class Book extends PaperPublication {

	//Declaration of variables
	private long ISBN;
	private int year;
	private String title;
	private String AuthorName;

	//Parameterized constructor
	public Book (double pr, int npg, long BN, int yr, String bk, String ANa)   

	{
		super(pr,npg);
		ISBN=BN;
		year=yr;
		title=bk;
		AuthorName=ANa;

	}
	//Copy constructor
	public Book(PaperPublication pub, Book bk)   
	{
		super(pub);

		ISBN=bk.ISBN;
		year=bk.year;
		title=bk.title;
		AuthorName=bk.AuthorName;
	}
    //This will get the ISBN number of the book
	public long getISBN()

	{
		return ISBN;
	}
    
	// This will set the ISBN number of the book
	public void setISBN(long BN)
	{
		ISBN=BN;
	}

    //This will get the year of the book
	public int getyear()
	{
		return year;
	}
    
	//This will set the year of the book
	public void setyear(int yr)
	{
		year=yr;
	}
    
	//This will get the title of the book
	public String gettitle()
	{
		return title;
	}
    
	//This will set the title of the book
	public void settitle(String bk)

	{
		title=bk;
	}

	//This will get the authors name of the book
	public String getAuthorName()
	{
		return AuthorName;	
	}
    
	//This will set the authors name of the book
	public void setAuthorName (String ANa)
	{
		
		AuthorName=ANa;
	}

    // This will display all information of the book
	public String toString()
	{
		return "Book:\nThe title is " + title + " writen by " +AuthorName+ " in the year " +year+
				 ". It has " + getnumOfPages()+ " number of pages and its price is " + getprice() + "$.\n ";
	}
	
	// This will compare two books to see if they contain the same information
	public boolean equals(Book bk)
	{{if (bk==null)
		return false;
	else
		
		return(AuthorName==bk.getAuthorName()&& ISBN == bk.getISBN() && title == bk.gettitle()&& year == bk.getyear()); 
	}
}

}