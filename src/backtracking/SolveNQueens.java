package backtracking;
import java.util.*;

public class SolveNQueens {

	    public List<List<String>> solveNQueens(int n) {
	        List<List<String>> al=new ArrayList<>();
	        char[][] board=new char[n][n];
	        for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                board[i][j]='.';
	            }
	        }
	        constructQueens(board,0,n,al);
	        return al;
	    }
	    private void constructQueens(char[][] board,int currentRow,int n, List<List<String>> al){
	        if(currentRow==n){
	            al.add(constructAns(board,n));
	            return;
	        }
	        for(int currentCol=0;currentCol<n;currentCol++){
	            if(isValid(board,currentRow,currentCol,n)){
	                board[currentRow][currentCol]='Q';
	                constructQueens(board,currentRow+1,n,al);
	                board[currentRow][currentCol]='.';
	            }
	        }
	        return;
	    }
	    private List<String> constructAns(char[][] board,int n){
	        List<String> current=new ArrayList<>();
	        for(int i=0;i<n;i++){
	            String currentRow="";
	            for(int j=0;j<n;j++){
	                currentRow=currentRow+board[i][j];
	            }
	            current.add(currentRow);
	        }
	        return current;
	    }
	    private boolean isValid(char[][] board,int currentRow,int currentCol,int n){
	        return isRowValid(board,currentRow,n) && isColumnValid(board,currentCol,n) && isDiagonalValid(board,currentRow,currentCol,n);
	    }
	    private boolean isRowValid(char[][] board,int currentRow,int n){
	        for(int currentCol=0;currentCol<n;currentCol++){
	            if(board[currentRow][currentCol]=='Q'){
	                return false;
	            }
	        }
	        return true;
	    }
	    private boolean isColumnValid(char[][] board,int currentCol,int n){
	        for(int currentRow=0;currentRow<n;currentRow++){
	            if(board[currentRow][currentCol]=='Q'){
	                return false;
	            }
	        }
	        return true;
	    }
	    private boolean isDiagonalValid(char[][] board,int currentRow,int currentCol,int n){
	        int x=currentRow;
	        int y=currentCol;
	        while(x>=0 && y>=0){
	            if(board[x][y]=='Q'){
	                return false;
	            }
	            x--;
	            y--;
	        }
	        x=currentRow;
	        y=currentCol;
	        while(x>=0 && y<n){
	             if(board[x][y]=='Q'){
	                return false;
	            }
	            x--;
	            y++;
	        }
	        return true;
	    }
	}
