import.util.Scanner 
class sod{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        {}
        int num=(567);
        int sum=0;
        while (num!=0){
            int digit=num% 10;
            sum=sum+digit;
            num=num/10;
        }
    System.out.println("sum =" + sum);
} }