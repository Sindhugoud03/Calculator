


import java.util. *;

public class calculator {

public static void main(String[ ]args){

Scanner sc = new Scanner (System.in);



while (true){

System.out.println("1.Addition\n 2. Subraction\n 3. Multiplication\n 4.Division\n5.stop");

System.out.println("Select one option: ");

int opt = sc.nextInt();

if (opt ==5){

break;

}

System.out.print("Enter two variable: ");

int a = sc.nextInt();

int b = sc.nextInt();

switch(opt) {

case 1:

System.out.printf("%d +%d = %d\n",a,b,a+b);

break;




case 2:

System.out.printf("%d-%d = %d \n",a,b,a-b);

break;

case 3:

System.out.printf ("%d* %d = %d\n",a,b,a*b);
break;

case 4:

if (b!=0) {

System.out.printf ("%d/%d=%d\n",a,b,a/b);


}else{

System.out.println("Division by zero is not allowed.");



}

break;

default:

System. out.println (" Invalid option ");
}
}
sc.close();
}

}