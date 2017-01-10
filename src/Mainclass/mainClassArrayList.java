package Mainclass;

import java.io.*;
import java.util.ArrayList;

import burcroffArrayList.burcroffArrayListClass;
import burcroffArrayList.burcroffArrayListClass.*;;

public class mainClassArrayList {

	/**
	 * This is my main method where it will read a file and put the elements of the file 
	 * into a array list and sort them out by which type of sorting the user wants to use.
	 */
	public static void main(String[] args) {
		String fileName = "NameList.txt";//Setting the filename of string file of a text.
		ArrayList<String> start = new ArrayList<String>();//Creating a new array list.
		String line = null;//Setting the line to null.
		try {
			FileReader fileReader = new FileReader(fileName);//Initializing the file reader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);//Read the file.
			while ((line = bufferedReader.readLine()) != null) {
				start.add(line);//Adds the elements to line.
			}
			burcroffArrayListClass.bubbleSort(start);//Completes bubble sort.
			System.out.println("This line is bubble sort:");//Prints out this is bubble sorting.
			System.out.println(start);//Prints out the array list after bubble sort
			burcroffArrayListClass.insertionSort(start);//Completes insertion sort.
			System.out.println("This line is insertion sort:");//Prints out this is insertion sort.
			System.out.println(start);//Prints out the array list after insertion sort
			burcroffArrayListClass.sort(start);//Completes merge sort.
			System.out.print("This line is merge sort:");//Print out this is merge sort.
			System.out.println(start);//Prints out the array list after merge sort
			burcroffArrayListClass.selectionSort(start);//Completes selection sort.
			System.out.println("This line is selection sort:");//Prints this is selection sort.
			System.out.println(start);//Prints out the array after it completes after selection sort.
			bufferedReader.close();//Closes the buffer reader.
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");// If there is no file to read.
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");//A file IO exception if file exists but can not read.
		}
	}
}
