import java.util.Scanner;
class Arr {
    public static void main(String[] args) {
        int a[][]=new int[20][20];
        int b[][]=new int[20][20];
        int c[][]=new int[20][20];
        int i,j,n,m;
	Scanner inp=new Scanner(System.in);
        System.out.println("enter the size of row:");        
        m=inp.nextInt();
	System.out.println("enter the size of column:");
	n=inp.nextInt();
        System.out.println("enter the elements of first matrix:");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
            a[i][j]=inp.nextInt();
            }
        }
        
        System.out.println("enter the elements of second matrix:");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
            b[i][j]=inp.nextInt();
            }
        }
        System.out.println("the first matrix is:");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("the second matrix is:");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(b[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("addition of matrix:");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
