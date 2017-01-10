package burcroffArrayList;

import java.util.ArrayList;

public class burcroffArrayListClass {

	private static ArrayList<String> strList;
	
	/*
	 * This method sets the attribute is equal to the input as a reference of Array List.
	 */

    public burcroffArrayListClass(ArrayList<String> input) {
        strList = input;//Setting the parameter equal to the reference.
    }
    
    /*
     * This method will sort as a merge sort and the reference will merge the data inputed.
     */
  
    public static void sort(ArrayList<String> data) {
        strList = mergeSort(data);//Setting the parameter equal to the reference. 
    }
 
    /*
     * This method will separate the given array List into given certain elements and determine 
     * what to do next if the elements are greater than each other, equal or less than. 
     */
    
    public static ArrayList<String> mergeSort(ArrayList<String> whole) {
        ArrayList<String> left = new ArrayList<String>();//Creating a new array List called left.
        ArrayList<String> right = new ArrayList<String>();//Creating a new array list called right.
        int center;//intailize the center.
        if (whole.size() == 1) {    //if there is only one element in the array list
            return whole;// Then return the element.
        } else {
            center = whole.size()/2;//The center part is getting the size and dividing by two.
            for (int i=0; i<center; i++) {//Beginning of the FOR Loop
                    left.add(whole.get(i));//Adding the element to the left arrayList.
            }
            for (int i=center; i<whole.size(); i++) {//Beginning of FOR Loop
                    right.add(whole.get(i));// Adding the element to the Right array list.
            }
            left  = mergeSort(left);//Merge the left with the left array list
            right = mergeSort(right);//Merge the right with the right array list.
            merge(left, right, whole);//Merge the left and right array list with the whole list. 
        }
        return whole;//Returning the whole elements.
    }
 
    /*
     * This method will merge the elements together and determine which elements are bigger, smaller or equal and 
     * put them in the new array list while sorting. 
     */
    
    private static void merge(ArrayList<String> left, ArrayList<String> right, ArrayList<String> whole) {
        int leftIndex = 0;//Initialize leftIndex to 0.
        int rightIndex = 0;//Initialize rightIndex to 0
        int wholeIndex = 0;//Initialize whole index to 0
        while (leftIndex < left.size() && rightIndex < right.size()) {
            if ( (left.get(leftIndex).compareTo(right.get(rightIndex))) < 0) {// Comparing to elements if a and < 0.
                whole.set(wholeIndex, left.get(leftIndex));//The array list will set the left array list to the left array list.
                leftIndex++;//Increasing the leftIndex.
            } else {
                whole.set(wholeIndex, right.get(rightIndex));// Dealing the left side and geting the index of the right with the orginal.
                rightIndex++;//Increasing the right Index.
            }
            wholeIndex++;//Increasing the whole index.
        }
        ArrayList<String> rest;//Initializing a new array list.
        int restIndex;//Initializing restIndex.
        if (leftIndex >= left.size()) {
            rest = right;//Setting the rest to the right.
            restIndex = rightIndex;// Setting the restIndex to the rightIndex.
        } else {
            rest = left;//Setting the rest to the left.
            restIndex = leftIndex;//Setting the restIndex to the left index.
        }
        for (int i=restIndex; i<rest.size(); i++) {//For Loop
            whole.set(wholeIndex, rest.get(i));//Setting the whole array list to the rest array list.
            wholeIndex++;//Increasing the Whole Index.
        }
    }
    
    /*
     * This will show the given array list and print out the new sorted array list.
     */
 
    public static void show(ArrayList<String> data) {
        for (int i=0; i< data.size();i++) {
            System.out.println(data.get(i));//Printing out the data of array list at given point.
        }
    }
    
    /*
     * This method is the bubble sort where it compares the two elements and compares the two elements 
     * and swaps them with a parameter of array list. This will go through the loop the size of elements time.
     */

	public static void bubbleSort(ArrayList<String> list) {
		String temp;//Initializing a string called temp.
		if (list.size() > 1) {//if size is greater than one
			for (int x = 0; x < list.size(); x++) {//First for loop
				for (int i = 0; i < list.size() - i; i++) {//Second for loop.
					if (list.get(i).compareTo(list.get(i + 1)) > 0) {//Compares the two elements that are next to each other.
						temp = list.get(i);//Sets the temp to i.
						list.set(i, list.get(i + 1));//moves the element that plus one to the i.
						list.set(i + 1, temp);//Sets the new array with b , a elements.
					}
				}
			}
		}
	}
	
	/*
	 * This method will use insertion method.
	 */

	public static void insertionSort(ArrayList<String> list) {
		Comparable temp;//Initializing a temp.
		int previousIndex;//Initializing previousIndex statement.
		for (int i = 1; i < list.size(); i++) {//For loop
			temp = list.get(i);//Setting the temp to the parameter list of i.
			previousIndex = i - 1;//Setting the previous index to i -1.
			while ((list.get(previousIndex).compareTo((String) temp)) > 0 && (previousIndex > 0)) {
				list.set(previousIndex + 1, list.get(previousIndex));//Setting the list of previous i +1  and the orginal i value
				previousIndex -= 1;//Incrementing the previous index values.
			}
			if (list.get(previousIndex).compareTo((String) temp) > 0) {
				list.set(previousIndex + 1, list.get(previousIndex));//Setting the previous Index plus one to the list of previous index.
				list.set(previousIndex, (String) temp);//Setting the previous index to the string of the temp.
			} else {
				list.set(previousIndex + 1, (String) temp);//Setting the previous index plus one to the string of the temp.
			}
		}
	}

	
	/*
	 * This method is the selection sort.
	 */
	
	public static void selectionSort(ArrayList<String> data) {
		if (data == null)//Determining if the data parameter is null.
			return;//Then  return that element
		if (data.size() == 0 || data.size() == 1)//if the size of data is 0 or 1.
			return;//Return data.
		int smallestIndex;//Initializing the smallestindex.
		String smallest;//Initializing the string smallest.
		for (int curIndex = 0; curIndex < data.size(); curIndex++) {
			smallest = data.get(curIndex);//Setting the smallest to the data of the current value.
			smallestIndex = curIndex;//Setting the smallest to the current values.
			for (int i = curIndex + 1; i < data.size(); i++) {
				if (smallest.compareTo(data.get(i)) > 0) {
					smallest = data.get(i);//smallest equals the data of i.
					smallestIndex = i;//Setting the smallest index to i.
				} else if ((smallest.compareTo(data.get(i)) == 0)|| (smallest.compareTo(data.get(i)) < 0)) {
					;//Do nothing.
				}
			}

			if (smallestIndex == curIndex)
				;//Do nothing.
			else {
				String temp = data.get(curIndex);
				data.set(curIndex, data.get(smallestIndex));//Setting the data of the current and smallest index.
				data.set(smallestIndex, temp);//Setting the data with smallest and a temp.
			}
		}
	}
}
