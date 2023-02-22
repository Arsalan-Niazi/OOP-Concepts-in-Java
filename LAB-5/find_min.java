public class find_min {
public static void main(String[] args) {
int my_array[]= {4,5,74,46,22,4,9,10,33};
20-SE-56 MUHAMMAD ARSALAN
int min_val=my_array[0];//CREATED A VARIABLE TO STORE MINIMUM VALUE
int length= my_array.length;//ARRAY LENGTH IS STORED IN length VARIABLE
System.out.println(" Elements of Array are:");
//displaying elements of array
for (int i=0;i<length;i++) {
System.out.print(my_array[i]+" ");
}
//checking for smallest element of given array
for(int i=1;i<length;i++){
if(my_array[i]<min_val) {
min_val = my_array[i];
}
}
System.out.println("\n MINIMUM VALUE IN ARRAY IS="+ min_val);
}}