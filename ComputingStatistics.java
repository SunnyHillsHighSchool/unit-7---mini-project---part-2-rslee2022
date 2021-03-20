//Mini-Project Part 2
//Programmer - Rachel Lee

import java.util.ArrayList;
import java.lang.Math;

public class ComputingStatistics {
   /**
   * The ArrayList containing all of the loan data.
   */
   private ArrayList<Loan> data;
   
   /**
    * Creates a new ComputingStatistics object with an empty ArrayList 
    */
   public ComputingStatistics() {
      data = new ArrayList<Loan>();
   }
   
   /**
    * Creates a new ComputingStatistics object with the data passed in
    */
   public ComputingStatistics(ArrayList<Loan> d) {
      data = d;
   }
   
   /**
    * Calculates the total amount funded from all of the loans in the file.
    * @return the total loan amount.
    */
   public double totalAmount() {
      double amount = 0.0;
      for(int i = 0; i < data.size(); i++) {
         amount = amount + data.get(i).getLoanAmount();
      }
      return amount;
   }


   /**
    * Calculates the average amount funded from all of the loans in the file.
    * @return the average loan amount (total divided by number of loans).
    */
   public double avgLoan() {
      return totalAmount()/data.size();
   }

   /**
    * @return the largest loan amount.
    */
   public double largestLoan() {
     //create variable double max and set equal to Integer.MIN_VALUE
      double max = Integer.MIN_VALUE;
      //for each loop: have Loan i traverse through arraylist data
      for(Loan i : data)
      {
        //if loanAmount of i is greater than max
        if(i.getLoanAmount() > max)
        {
          //set int max equal to loanAmount of i
          max = i.getLoanAmount();
        }
      }
      //return max
      return max;
   }

   /**
    * @return the smallest loan amount.
    */
   public double smallestLoan() {
     //create variable double min and set equal to Integer.MAX_VALUE
      double min = Integer.MAX_VALUE;
      //for each loop: have Loan i traverse through arraylist data
      for(Loan i : data)
      {
        //if loanAmount of i is less than min
        if(i.getLoanAmount() < min)
        {
          //set int min equal to loanAmount i
          min = i.getLoanAmount();
        }
      }
      //return min
      return min;
   }

   /**
    * @return the country that got the largest loan.
    */
   public String largestLoanCountry() {
     //create variable integer maxIndex and set equal to 0
      int maxIndex = 0;
      //for loop: set loop control variable integer i equal to 0, condition - i is less than size of arraylist data, i increments by 1
      for(int i = 0; i < data.size(); i++)
      {
        //if loanAmount of Loan at index i is greater than loanAmount of Loan at index maxIndex
        if(data.get(i).getLoanAmount() > data.get(maxIndex).getLoanAmount())
        {
          //set maxIndex equal to i
          maxIndex = i;
        }
      }
      //return country of Loan object at index maxIndex of arraylist data
      return data.get(maxIndex).getCountry();
   }

   /**
    * @return the country that got the smallest loan.
    */
   public String smallestLoanCountry() {
     //create variable integer minIndex and set equal to 0
      int minIndex = 0;
      //for loop: set loop control variable integer i equal to 0, condition - i is less than size of arraylist data, i increments by 1
      for(int i = 0; i < data.size(); i++)
      {//if loanAmount of Loan at index i is less than loanAmount of Loan at index minIndex
        if(data.get(i).getLoanAmount() < data.get(minIndex).getLoanAmount())
        {//set minIndex equal to i
          minIndex = i;
        }
      }//return country of Loan object at index minIndex of arraylist data
      return data.get(minIndex).getCountry();
   }

   /**
    * Calculates the average days to fund for all the loans in the file.
    * @return the average number of days.
    */
   public double avgDaysToFund() {
     //create variable double sum and set equal to 0
      double sum = 0;
      //create variable double average and set equal to 0
      double average = 0;
      //for each loop: have Loan i traverse through arraylist data
      for(Loan i : data)
      {
        //set sum equal to sum plus daysToFund of i
        sum += i.getDaysToFund();
      }
      //set average equal to sum divided by size of arraylist data
      average = sum/data.size();
      //return average
      return average;
   }

   /**
    * @return the largest loan made to people in Kenya.
    */
   public double largestLoanKenya() {
     //create variable double max and set equal to Integer.MIN_VALUE
      double max = Integer.MIN_VALUE;
      //for each loop: have Loan i traverse through arraylist data
      for(Loan i : data)
      {
        //if country of i is equal to Kenya
        if(i.getCountry().equals("Kenya"))
        {
          //if loanAmount of i is greater than max
          if(i.getLoanAmount() > max)
          {
            //set int max equal to loanAmount of i
            max = i.getLoanAmount();
          }
        }
      }
      //return max
      return max;
   }

   /**
    * Calculates the average amount of loans made to people in the Philippines.
    * @return the average loan amount.
    */
   public double avgLoanPhilippines() {
     //create variable double sum and set equal to 0
      double sum = 0;
      //create variable double average and set equal to 0
      double average = 0;
      //create variable integer count for number of loans from Philippines and set equal to 0
      int count = 0;
      //for each loop: have Loan i traverse through arraylist data
      for(Loan i : data)
      {
        //if country of i is equal to Philippines
        if(i.getCountry().equals("Philippines"))
        {
          //increment count by 1
          count++;
          //set sum equal to sum plus loanAmount of i
          sum += i.getLoanAmount();
        }
      }
      //set average equal to sum divided by count
      average = sum/count;
      //return average
      return average;
   }

   /**
    * @return the loan granted that took the longest to fund.
    */
   public String longestToFundCountry() {
     //create variable integer mostDaysInd and set equal to 0
      int mostDaysInd = 0;
      //for loop: set loop control variable integer i equal to 0, condition - i is less than size of arraylist data, i increments by 1
      for(int i = 0; i < data.size(); i++)
      {
        //if daysToFund of Loan at index i is greater than daysToFund of Loan at index mostDaysInd
        if(data.get(i).getDaysToFund() > data.get(mostDaysInd).getDaysToFund())
        {
          //set mostDaysInd to i
          mostDaysInd = i;
        }
      }
      //return country of Loan at index mostDaysInd
      return data.get(mostDaysInd).getCountry();
   }

   /**
    * Calculates the variance with all the loans in the file.
    * @return variance.
    */
   public double variance() {
     //create variable double sumVals and set equal to 0
     double sumVals = 0;
     //create variable double variance and set equal to 0
     double variance = 0;
     //for each loop: have Loan i traverse through data
     for(Loan i : data)
     {
       //set sumVals equal to sumVals plus squared value of loanAmount of i minus average
       sumVals += Math.pow((i.getLoanAmount() - avgLoan()), 2);
     }
     //set variance equal to sumVals divided by size of arraylist data
     variance = sumVals/data.size();
     //return variance
     return variance;
   }

  /**
   * @return the standard deviation of the money loaned.
   */
  public double standardDeviation() {
    //create variable double stDev and set equal to square root of variance (using variance() method)
    double stDev = Math.sqrt(variance());
    //return stDev
    return stDev;
  }

  /**
   * Calculates if 68% of loans fall within 1 standard deviation.
   * @return whether or not empirical rule works.
   */
   public boolean empiricalRule() {
     //create variable double count and set equal to 0
     double count = 0;
     //create variable double stDev and set equal to standard deviation (using standardDeviation() method)
     double stDev = standardDeviation();
     //for each loop: have Loan i traverse through arraylist data
     for(Loan i : data)
     {
       //if the absolute value of loanAmount of i minus average is less than or equal to stDev
       if((Math.abs(i.getLoanAmount() - avgLoan())) <= standardDeviation())
       {
         //increment count by 1
         count++;
       }
     }
     System.out.println(count);
     System.out.println(data.size());
     //if count divided by size of arraylist data is equal to 0.68
     if(count/data.size() == 0.68)
     {
       //return true
       return true;
     }
     //otherwise, return false
     return false;
   }
}