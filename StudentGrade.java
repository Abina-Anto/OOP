import java.util.*;
class StudentGrade{
	public static void main(String args[]){
	char[][] a={{'D','B','A','C','B'},
		   {'A','B','C','A','A'},
		   {'B','B','C','A','B'},
		   {'D','D','A','C','B'},
		   {'D','C','B','A','A'}
		   };
	char k[]={'D','C','B','A','B'};
	int count=0;
	for(int i=0;i<5;i++){
		for(int j=0;j<5;j++){
			if(a[i][j]==k[j]){
			count=count+1;
			}
		}
	System.out.println("Score of student "+(i+1)+" is "+count);
	count=0;
	}
	}
}
	
