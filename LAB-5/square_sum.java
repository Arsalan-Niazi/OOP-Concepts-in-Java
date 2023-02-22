public class square_sum {
public static void main(String[] args) {
//initialized two variables with zero starting values
int n1=0;
int sum=0;
while(n1<11) {
System.out.println(n1*n1);n1++;}
for(int i=1;i<n1;i++)
{sum = sum + (i*i);
}
System.out.println("Total is "+ sum);
}
}