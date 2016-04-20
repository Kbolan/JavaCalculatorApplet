/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kbolan
 */
import java.io.*;
import java.text.*;


public class Assignment1 implements Serializable{
    //
//SHOW NAME ON SCREENSHOTS OF OUTPUT  
    //
    private double result; 
    public Assignment1(){
        result = 0;
        //determineResult(char o, int num1, int num2);
        
    }
   
    public void determineResult(char operation, double num1, double num2){
        if (operation == '+'){
            addition(num1, num2);
        }            
        if (operation == '-'){
            subtraction(num1, num2);
        }            
        if (operation == '*'){
            multiplication(num1, num2);
        }            
        if (operation == '/'){
            division(num1, num2);
        }        
        //return result;
    }
    
    public double getResult(){
        NumberFormat nf = new DecimalFormat("##.#####");
        result = Double.parseDouble(nf.format(result));
        return result;
    }
    private void addition(double num1, double num2){
        result = num1 + num2;
        //return result;
    }
    private void subtraction(double num1, double num2){
        result = num1 - num2;
        //return result;
    }
    private void multiplication(double num1, double num2){
        result = num1 * num2;
        //return result;
    }
    private void division (double num1, double num2){
        result = num1 / num2;
        //return result;
    }
}
