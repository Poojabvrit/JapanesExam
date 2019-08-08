import java.util.*;
class pro{
public static void main(String args[]){
int n1,n2;
Scanner sc = new Scanner(System.in);
n1=sc.nextInt();
int arr[] = new int[100];
int temp,sum,t;
sum=0;
n2=sc.nextInt();
int i=0;
int c=0;
while(t>=1){
 temp=n1*(n2/100);
t=n1-temp;
arr[i++] = t;
t=0;
c++;
}

for(int j=0;j<c;j++){
sum=sum+arr[j];
}
System.out.println(sum);
}
}

