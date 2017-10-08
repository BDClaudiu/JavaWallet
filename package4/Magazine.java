package package4;

//import java.awt.print.Book;

import package1.PaperPublication;
//--------------------------------------------------------------- 
//Assignment 1  
//Question: Part 1  
//Written by: Steven Pohl 27172877, Andrew Di Miele 29606831 Bacisor Claudiu Dumitru 27735332
//Rohan Sarda 27725930
//Summary:  This class will be used to control if a magazine has been purchased. It will
//generate the proper information about the magazine. It could even combine all the information
//and compare two magazines to see if they are the same or different.
//--------------------------------------------------------------- 


public class Magazine extends PaperPublication {

    //Declaration of variables
	public enum PaperQuality {High, Normal, Low};
	public PaperQuality PQ;

	public enum IssueFreq {Weekly, Monthly, Yearly};
	public IssueFreq IF;

	//parameterized constructor
	public Magazine (double pr, int npg, PaperQuality pq, IssueFreq If)   

	{
		super(pr,npg);
		this.PQ = pq;
		this.IF = If;
	}
	
	//This will get the frequent issue of the magazine
	public IssueFreq getIssueFreq()

	{
		return IF;
	}
    
	// This will set the frequent issue of the magazine
	public void setIssueFreq(IssueFreq If)

	{
		IF=If;
	}

	//This will get the paper quality of the magazine
	public PaperQuality getPaperQual()

	{
		return PQ;
	}
    
	//This will set the paper quality of the magazine
	public void setPaperQual(PaperQuality pq)

	{
		PQ = pq;
	}

	//This will combine all the information about the magazine
	public String toString()
	{
		return "Magazine:\nIt has: " + getnumOfPages() + 
				" number of pages and its price is " + getprice() + "$. The paper quality is "+
				PQ+ " and the issue frequency is " +IF+ ".\n";
	}
	
	//This will compare magazines to see if they are the same or not the same
	public boolean equals(Object x)
	{
		if (x == null || this.getClass() != x.getClass())
			return false;
		else
		{
			Magazine m = (Magazine)x;
			return (this.PQ == m.PQ && this.IF == m.IF);
		}
	}
}
