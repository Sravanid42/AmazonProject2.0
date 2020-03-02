package Search;

import java.util.ArrayList;
import java.util.Scanner;

import Linked_List.*;
import UI.mainUI;


import java.io.*;

public class methodsearch
{  
	 private  boolean Found;
	 private  ArrayList<String> Lines;   	//Each element of ArrayList contains a line from file
	 private  ArrayList<String> Methods;	//methods matched will be added to methods ArrayList
	 private  String TextField;
	
	 private  String Log;

	/*
	public static void main (String[] args)
    {
        //method name to be searched
        scan ("Vow");
    }  
    */ 
    
    public methodsearch()
    {
    	Found = true;
    	Lines = new ArrayList<String>();
        Methods = new ArrayList<String>();
        Log = "";
    }
    
    public static void main(String textField)
    {
        System.out.println("In methodsearch Main");
    	methodsearch test = new methodsearch();
    	test.setTerms(textField);
    	test.scan();
    }
    
    public static ArrayList<String> getMethods(String textField)	// Business logic driver
    {
        System.out.println("In methodsearch getMethods");
    	methodsearch test = new methodsearch();
    	test.setTerms(textField);
    	test.scan();
        return test.Methods;
    }
    
    private void setTerms(String textField) {
    	TextField = textField;
	}
    
    private void scan ()
    {
        System.out.println("In methodsearch Scan" + TextField);
        Scanner sc = null;

        try 
        {
            sc = new Scanner(new File(TextField));
            //Scanner reads every line and adds to ArrayList Lines
            while (sc.hasNextLine()) 
            {   
                Lines.add(sc.nextLine());
            }
            
            //Every word in each line is compared to passed in method
            for (int j=0; j<Lines.size(); j++) 
            {
                //splitting array list by spaces
                String[] splitted = Lines.get(j).split(" |\\(");
                
                
            }
            sc.close(); 
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File Not found");
        }
        System.out.println("In methodsearch Scan" + Methods);
    }

}