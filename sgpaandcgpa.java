

import java.util.*;
import java.text.DecimalFormat;


public class sgpaandcgpa {
public static void main(String ar[]){
int i,n,j,k,l,n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
float c,s;
double r;
while(true){
System.out.println("\n Welcome to SPGA Calculator and CGPA Calculator\n");
System.out.println("Enter Option 1 For SGPA Calculator");
System.out.println("Enter Option 2 For CGPA Calculator");
System.out.println("Enter Option 3 For Exit\n");
System.out.println("Enter Your Option: ");
Scanner sc= new Scanner(System.in);
l = sc.nextInt();
switch(l){
case 1:
       System.out.println("Enter the number of subjects you have in semester: ");
       System.out.println("\nAfter giving the number of subjects in semester the remaining will be put it as '0' credits & '0' points \n");
       
       System.out.println("Subject 1 credits:");
       n1 = sc.nextInt();
       System.out.println("Subject 1 points:");
       p1 = sc.nextInt();

       System.out.println("Subject 2 credits:");
       n2 = sc.nextInt();
       System.out.println("Subject 2 points:");
       p2 = sc.nextInt();

       System.out.println("Subject 3 credits:");
       n3 = sc.nextInt();
       System.out.println("Subject 3 points:");
       p3 = sc.nextInt();

       System.out.println("Subject 4 credits:");
       n4 = sc.nextInt();
       System.out.println("Subject 4 points:");
       p4 = sc.nextInt();
       System.out.println("Subject 5 credits:");
       n5 = sc.nextInt();
       System.out.println("Subject 5 points:");
       p5 = sc.nextInt();
       System.out.println("Subject 6 credits:");
       n6 = sc.nextInt();
       System.out.println("Subject 6 points:");
       p6 = sc.nextInt();
       System.out.println("Subject 7 credits:");
       n7 = sc.nextInt();
       System.out.println("Subject 7 points:");
       p7 = sc.nextInt();
       System.out.println("Subject 8 credits:");
       n8 = sc.nextInt();
       System.out.println("Subject 8 points:");
       p8 = sc.nextInt();
       System.out.println("Subject 9 credits:");
       n9 = sc.nextInt();
       System.out.println("Subject 9 points:");
       p9 = sc.nextInt();
       System.out.println("Subject 10 credits:");
       n10 = sc.nextInt();
       System.out.println("Subject 10 points:");
       p10 = sc.nextInt();
       c1=n1*p1;
       c2=n2*p2;
       c3=n3*p3;
       c4=n4*p4;
       c5=n5*p5;
       c6=n6*p6;
       c7=n7*p7;
       c8=n8*p8;
       c9=n9*p9;
       c10=n10*p10;
       c=c1+c2+c3+c4+c5+c6+c7+c8+c9+c10;
       System.out.println("sum of points * creadits IS:"+c);
       s=n1+n2+n3+n4+n5+n6+n7+n8;
       System.out.println("sum of credits is :"+s);
       r=c/s;
       System.out.println("FINAL SGPA IS :"+r);
       
       double per1= (r-0.75)*10;
       System.out.println("PERCENTAGE : "+per1);
if(per1<60){
System.out.println("Try To Improve");}
if(per1>60){
System.out.println("Great Keep It Up");}
       break;
case 2:
       float sem,sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8;
       System.out.println("Incompleted semesters Filled With Zero's");
      
       System.out.println("enter semester 1 SGPA: ");
       sem1 = sc.nextFloat();
       System.out.println("enter semester 2 SGPA: ");
       sem2 = sc.nextFloat();
       System.out.println("enter semester 3 SGPA: ");
       sem3 = sc.nextFloat();
       System.out.println("enter semester 4 SGPA: ");
       sem4 = sc.nextFloat();
       System.out.println("enter semester 5 SGPA: ");
       sem5 = sc.nextFloat();
       System.out.println("enter semester 6 SGPA: ");
       sem6 = sc.nextFloat();
       System.out.println("enter semester 7 SGPA: ");
       sem7 = sc.nextFloat();
       System.out.println("enter semester 8 SGPA: ");
       sem8 = sc.nextFloat();
       System.out.println("enter no of semester you enter :");
       int e = sc.nextInt();
       sem = (sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8)/e;
       System.out.println("CGPA is: "+sem);
       double per= (sem-0.75)*10;
       System.out.println("PERCENTAGE : "+per);
       if(per<60){
           System.out.println("Try To Improve");}
       if(per>60){
           System.out.println("Great Keep It Up");}
      if(sem>=7.75){
System.out.println("According to JNTUH R16 Regulation Your Class Award is DISTINCTION");}
else{
if(sem>=6.75){
System.out.println("According to JNTUH R16 Regulation your Class Award is FIRST CLASS");}
else{ 
if(sem>=5.75){
System.out.println("According to JNTUH R16 Regulation Your Class Award is SECOND CLASS");}
else{
if(sem>=4.75){
System.out.println("According to JNTUH R16 Regulation Your Class Award is PASS CLASS");}
else{
if(sem<4.75){
System.out.println("According to JNTUH R16 Regulation Your Class Award is FAIL");}}}}}
break;
case 3: 
        System.out.println("Bye Bye");
        System.exit(0);
default: System.out.println("You Enter Wrong Option!");
} 
}
}
}
        
    
    
