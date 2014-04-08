import java.util.ArrayList;

public class find{
	public int[] findConsecutiveRuns(int[] input){
		ArrayList<Integer> tmp= new ArrayList<Integer>();
		for(int i=0;i<input.length-2;i++){
			if((input[i]==input[i+1]+1 && input[i+1]==input[i+2]+1) || (input[i]==input[i+1]-1 && input[i+1]==input[i+2]-1) ){
					tmp.add(i);
			}
		}
		int[] a = new int[tmp.size()];
		for(int i=0;i<a.length;i++)
			a[i]=tmp.get(i);
	    return a;
	}
}