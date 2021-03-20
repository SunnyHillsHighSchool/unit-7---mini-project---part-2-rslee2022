//From Mini-Project Part 1
//Programmer - Rachel Lee

import java.util.ArrayList;

public class Loan
{
  //instance variables
  private int ID; //loan ID number
  private double loanAmount; //value of the loan
  private String country; //country the loan is from
  private int daysToFund; //number of days it took to fund the loan
  private int numLenders; //number of lenders for the loan

  //constructor
  public Loan(int ID, double loanAmount, String country, int daysToFund, int numLenders)
  {
    //intialize private instance variables
    this.ID = ID; //initialize ID
    this.loanAmount = loanAmount; //initialize loanAmount
    this.country = country; //initialize country
    this.daysToFund = daysToFund; //initialize daysToFund
    this.numLenders = numLenders; //initialize numLenders
  }


  //accessor methods
  //return private instance variable ID
  public int getID()
  {
    return ID;
  }

  //return private instance variable loanAmount
  public double getLoanAmount()
  {
    return loanAmount;
  }

  //return private instance variable country
  public String getCountry()
  {
    return country;
  }

  //return private instance variable daysToFund
  public int getDaysToFund()
  {
    return daysToFund;
  }

  //return private instance variable numLenders
  public int getNumLenders()
  {
    return numLenders;
  }

  //toString method
  public String toString()
  {
    return "ID: " + ID + " loan amount: " + loanAmount + " country: " + country + " days to fund: " + daysToFund + " num lenders: " + numLenders;
  }



  //modifier methods
  //set private instance variable ID to new ID
  public void setID(int ID)
  {
    this.ID = ID;
  }

  //set private instance variable loanAmount to new loanAmount
  public void setLoanAmount(double loanAmount)
  {
    this.loanAmount = loanAmount;
  }

  //set private instance variable country to new country
  public void setCountry(String country)
  {
    this.country = country;
  }

  //set private instance variable daysToFund to new daysToFund
  public void setDaysToFund(int daysToFund)
  {
    this.daysToFund = daysToFund;
  }

  //set private instance variable numLenders to new numLenders
  public void setNumLenders(int numLenders)
  {
    this.numLenders = numLenders;
  }
}