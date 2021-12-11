import java.util.Scanner;
class Palindrome{
    public static void main(String[] args){
    int rem,rev=0,onum;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num=input.nextInt();
	onum=num;
	while(num>0){
		rem=num%10;
		rev=(rev*10)+rem;
		num=num/10;
	}
	if(onum==rev){
		System.out.println(onum +" is palindrome number.");
	}
	else{
		 System.out.println(onum +" is not palindrome number.");
	}
    }
}