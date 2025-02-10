package dynamicprogramming;
import java.util.*;

public class UniquePaths {
	    public int uniquePaths(int m, int n) {
	        HashMap<String,Integer> hp=new HashMap<>();
	        return noOfPaths(0,0,m,n,hp);
	    }
	    public int noOfPaths(int currentRow,int currentCol,int m, int n,HashMap<String,Integer> hp){
	        if(currentRow==m-1 && currentCol==n-1){
	            return 1;
	        }
	        int rightPath=0;
	        int downPath=0;
	        String currentKey=Integer.toString(currentRow)+"-"+Integer.toString(currentCol);
	        if(hp.containsKey(currentKey)){
	            return hp.get(currentKey);
	        }
	        if(currentCol+1<n){
	             rightPath=noOfPaths(currentRow,currentCol+1,m,n,hp);
	        }
	        if(currentRow+1<m){
	             downPath=noOfPaths(currentRow+1,currentCol,m,n,hp);
	        }
	        hp.put(currentKey,rightPath+downPath);
	        return rightPath+downPath;
	    }
	}

// Time Complexity id O(m*n)
// Space Complexity is O(m*n)