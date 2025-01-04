package com.arraysandhashing;
import java.util.*;

public class ValidSudoku {

	    public boolean isValidSudoku(char[][] board) {
	        HashSet<Character>[] rows=new HashSet[9];
	        HashSet<Character>[] cols=new HashSet[9];
	        HashSet<Character>[] boxs=new HashSet[9];
	        for(int i=0;i<9;i++){
	            rows[i]=new HashSet<>();
	            cols[i]=new HashSet<>();
	            boxs[i]=new HashSet<>();
	        }
	        for(int i=0;i<9;i++){
	              for(int j=0;j<9;j++){
	                char num = board[i][j];
	                if (num == '.') {
	                    continue;
	                }

	                if(rows[i].contains(num)){
	                    return false;
	                }else{
	                    rows[i].add(num);
	                }
	                if(cols[j].contains(num)){
	                    return false;
	                }else{
	                    cols[j].add(num);
	                }
	                int boxIndex=(i/3)*3+(j/3);
	                if(boxs[boxIndex].contains(num)){
	                    return false;
	                }else{
	                    boxs[boxIndex].add(num);
	                }
	            }
	        }
	        return true;
	    }
	}

// Time Complexity is O(1)
// Space Complexity is O(1)
