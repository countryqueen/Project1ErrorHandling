/*//
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/** /* Class Name: Calculation‘***  
    Class Author: Angelica Jones
    Purpose of the class: To create the calculation for the mean and standard deviation
    Date: 9/5/17
 * @author Owner
 */
public class Calculation {

    /**
     * @param args the command line arguments
     */
    private double mean;
    private double standardDeviation;
    private double[] container;
    //these are private class variables
    
    
    public Calculation(double[] arrFromTextBox)
            //this is a constructor
            //holds the parameter of the array (in double type format)
    {
        container=arrFromTextBox;
        //holds the array from the user input aka text box. 
        
        //these two are methods
        mean = MeanCalculation();
        standardDeviation = StandardDeviationCalculation();
    }
    
    //this is a getter
    public double getMean()
    {
        return mean;
    }
    
    //this is a getter
    public double getStandardDeviation()
    {
        return standardDeviation;
    }
    /*method: MeanCalculation
    Author: Angelica Jones
    Purpose: To calculate the mean
    Returns: the answer from this method so it can be printed in the GUI
    Parameters: None
    */
    private double MeanCalculation()
    {
        double[] box = this.container;
        double sum = 0;
        //use a for loop because we know how many times we want to loop through the array (ten times)
        for(int i = 0;i<box.length;i++)
        {
            sum+=box[i];
        }
        //takes the total of the user's numbers and divides it by the index of the array which is 10
        double meanCalc = (sum / box.length);
        
        return meanCalc;
      
    }
   
  /*method: StandardDeviationCalculation
    Author: Angelica Jones
    Purpose: To calculate the standard deviation
    Returns: the answer from this method so it can be printed in the GUI
    Parameters: None
    */
    public double StandardDeviationCalculation()
    {
        double[] box = this.container;
        double dblMean = this.mean;
        double sum=0;
        
        //a for loop is used because we know how many times we want this to run
        for(int i=0;i<box.length;i++)
        {
            sum+=(box[i]- dblMean)*(box[i]- dblMean);
            //this squares each number in ten elements and then is subtracted from the mean (this is the variance)
        }
        //this square roots the final answer which is the standard deviatino
        double standardDeviationCalc = Math.sqrt(sum/box.length);
        
        return standardDeviationCalc;
    }
    
    
    
    
    
    
    
    
}
