import java.util.*;
class ArraySort{
public static void main(String args[]){
int a[]=new int[5];
Scanner ele=new Scanner(System.in);
System.out.println("Ente the Elements = ");
for(int i=0;i<a.length;i++){
a[i]=ele.nextInt();}
System.out.println("Current Array");
for(int i=0;i<a.length;i++){
System.out.println(a[i]);
}
for(int i=0;i<a.length;i++){
for(int j=0;j<a.length;j++){
if(a[i]<a[j]){
a[i]=a[i]+a[j];
a[j]=a[i]-a[j];
a[i]=a[i]-a[j];
}
}
}
System.out.println("Sorted Array");
for(int i=0;i<a.length;i++){
System.out.print(a[i]+" ");
}
}
}
