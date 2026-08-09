public class prgm1{
    public static void main(String[] args) {
        int arr[]={12,7,25,18,30};
        int min=arr[0];
for(int i=1;i<arr.length;i++)
{
    if (arr[i]<min)
    {
        min=arr[i];
    }
}    
System.out.println("smallest element of array =" + min);
}
}