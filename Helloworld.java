import java.io.*;
class HelloWorld 
{

public static void main(String args[]) throws IOException
{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//taking input from user
System.out.println("Enter your favourite number");
int a=Integer.parseInt(br.readLine());
System.out.println("Your number is"+ a);
//taking string as an input form user
System.out.println("Enter name you want to display");
String b=br.readLine();
System.out.println("Your name is "+b);
//System.out.println("Hello world");
}
}
