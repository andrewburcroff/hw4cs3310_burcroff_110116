package Mainclass;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import burcroffLinkedList.Node;
import burcroffLinkedList.burcroffLinkedListClass;

public class mainClassLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String fileName = "NameList.txt";
		Node first = new Node(null);
		Node last = new Node(null);
		burcroffLinkedListClass start = new burcroffLinkedListClass();
		String line = null;
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			int x =0;
			while ((line = bufferedReader.readLine()) != null) {
				start.add(line);
				//System.out.println(line);
				/*
				if (x == 0){
					first.setValue(line);
					last = first;
				}
				else{
					Node temp = new Node(line);
					last.add(last, temp);
					last= temp;
				}
				x = x+ 1;	*/
				}			
	
			start.bubbleSort(first);
			start.show();
			//start.insertNode(line);
			//start.show();
			//start.mergeSort();
			//start.show();
			//start.selectionSort();
			//start.show();
			
			bufferedReader.close();
		
	
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
		}

	}

}
