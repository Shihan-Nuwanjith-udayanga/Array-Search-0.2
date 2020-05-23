import java.util.*;
class SearchArray{
	public static int lastIndexOf(int[]x,int key){
		int index=-1;
		for(int i=0; i<x.length; i++){
			if(x[i]==key){
				index=i;
			}
		}
		return index;
	}
	public static void main(String args[]){
		int[] x={12,23,43,54,32,55,76,12,43,98};
		System.out.println(Arrays.toString(x));
		
		int index;
		index=lastIndexOf(x,12);
		System.out.println("Index of 12 :"+index);
		
		index=lastIndexOf(x,43);
		System.out.println("Index of 43 :"+index);
		
	}
}
		
