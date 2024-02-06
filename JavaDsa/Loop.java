package JavaDsa;

import java.util.Scanner;

public class Loop {
    // 1> Print the sum Of first n natural Numbers using loop

   /*  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i<=n; i++ ){
           sum = sum + i;
           System.out.println(i);
        }
        System.out.println(sum);

    }*/

    // 2> print the tabel number input by the user using while loop
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int i = 1;
        while (i<11) {
            System.out.println(i*n);
            i++;
        }
    }


}

/*Loops
A loop is used for executing a block of statements repeatedly until a particular  condition is satisfied. A loop consists of an initialization statement, a test condition and an increment statement.

For Loop
The syntax of the for loop is  :

for (initialization; condition; update) { 
 // body of-loop 
}

for (int i=1; i<=20; i++) {
   System.out.println(i);
}

While Loop
The syntax for while loop is :
while(condition) { 
 // body of the loop 
}

int i = 0;
while(i<=20) {
   System.out.println(i);
   i++;
}

Do-While Loop
The syntax for the do-while loop is :
do { 
 // body of loop; 
} 
while (condition);

int i = 0;
do {
   System.out.println(i);
      i++;
} while(i<=20);
 */
