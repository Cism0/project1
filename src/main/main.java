package main;
import javax.swing.JOptionPane;

public class main {
		//Instance Variables
	    static int correct = 0; 
	    static int num = 1;
	    static int questions = 0; 
	    
	    //This method is the main method, it introduces the player and asks how many questions would they like to answer, if its not a number an exception is thrown.
	    //Every question is randomly designated either addition/subtraction/multiplication/division. Once they answer all the questions a screen with their results shows.
	    public static void main(String args[]){
	        try {
	        questions = Integer.parseInt(JOptionPane.showInputDialog("Welcome to the Arithmetic Problem Generator! How many questions would you like to answer?"));
	        }
	        catch(Exception e) {
	            JOptionPane.showMessageDialog(null, "Come on dude you're getting things wrong already and you're not even on the actual quiz... Come back when you can TYPE A FREAKING NUMBER.");
	        }
	        int a = 0;
	        int b = 0;
	        int type = 0; 
	        
	    for(int i = 0; i < questions; i++) {
	        a = (int) (Math.random() * 10);
	        b = (int) (Math.random() * 10);
	        type = (int) (Math.random() * 4);
	        
	        if(type == 0) {
	            add(a, b); 
	        }
	        else if(type == 1) {
	            sub(a, b);
	        }
	        else if(type == 2) {
	            mult(a, b);
	        }
	        else {
	            div(a, b);
	        }
	        num++; 
	    }
	    JOptionPane.showMessageDialog(null, "You got " + correct + " / " + questions + " questions correct!");
	    
	    
	}
	    //This method creates the addition problem and checks the response to see if its correct or wrong, if the answer response is not a number an exception is thrown
	    private static void add(int a, int b) {
	        int answer = a + b;
	        String q = JOptionPane.showInputDialog("Question " + num + ": " + a + " + " + b);
	        try {
	        if(q.equalsIgnoreCase("exit")) {
	            questions = num;
	        }
	        else if(Integer.parseInt(q) == answer) {
	            JOptionPane.showMessageDialog(null, "Ding ding ding!! You are correct!");
	            correct++;
	        }
	        else {    
	        JOptionPane.showMessageDialog(null, "You are wrong...");
	        }
	        }
	        catch(Exception e) {
	            JOptionPane.showMessageDialog(null, "You are wrong...");
	        }
	    }
	    
	  //This method creates the subtraction problem and checks the response to see if its correct or wrong, if the answer response is not a number an exception is thrown
	    private static void sub(int a, int b) {
	        while(b > a) {
	            b = (int) (Math.random() * 10);
	            a = (int) (Math.random() * 10);
	        }
	        int answer = a - b; 
	        String q = JOptionPane.showInputDialog("question " + num + ": " + a + " - " + b);
	        try {
	        if(q.equalsIgnoreCase("exit")) {
	            questions = num;
	        }
	        else if(Integer.parseInt(q) == answer) {
	            JOptionPane.showMessageDialog(null, "Ding ding ding!! You are correct!");
	            correct++;
	        }
	        else {
	        JOptionPane.showMessageDialog(null, "You are wrong...");
	        }
	        }
	        catch(Exception e) {
	            JOptionPane.showMessageDialog(null, "You are wrong...");
	        }
	    }
	    
	  //This method creates the multiplication problem and checks the response to see if its correct or wrong, if the answer response is not a number an exception is thrown
	    private static void mult(int a, int b) {
	        int answer = a * b; 
	        String q = JOptionPane.showInputDialog("question " + num + ": " + a + " * " + b);
	        try {
	        if(q.equalsIgnoreCase("exit")) {
	            questions = num;
	        }
	        else if(Integer.parseInt(q) == answer) {
	            JOptionPane.showMessageDialog(null, "Ding ding ding!! You are correct!");
	            correct++;
	        }
	        else {    
	        JOptionPane.showMessageDialog(null, "You are wrong...");
	        }
	        }
	        catch(Exception e) {
	            JOptionPane.showMessageDialog(null, "You are wrong...");
	        }
	    }
	    
	  //This method creates the division problem and checks the response to see if its correct or wrong, if the answer response is not a number an exception is thrown
	    private static void div(int a, int b) {
	        while(b == 0) {
	            b = (int) (Math.random() * 10);
	        }
	        int answer = a*b / b;
	        String q = JOptionPane.showInputDialog("question " + num + ": " + a*b + " / " + b);
	        try {
	        if(q.equalsIgnoreCase("exit")) {
	            questions = num;
	        }
	        else if(Integer.parseInt(q) == answer) {
	            JOptionPane.showMessageDialog(null, "Ding ding ding!! You are correct!");
	            correct++;
	        }
	        else {    
	        JOptionPane.showMessageDialog(null, "You are wrong...");
	        }
	        }
	        catch(Exception e) {
	            JOptionPane.showMessageDialog(null, "You are wrong...");
	        }
	    }
	}


