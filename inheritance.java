import java.util.*;
class Employee
{
int empid;
long mobileno;
String name,addres,mailid;
Scanner get=new Scanner(System.in);
void getdata()
{
System.out.println("Enter the employee name:");
name=get.nextLine();
System.out.println("Enter mail id:");
mailid=get.nextLine();
System.out.println("Enter the employee's address:");
address=get.nextLine();
System.out.println("Enter the employee id:");
empid=get.nextInt();
System.out.println("Enter mobile number:");
mobileno=get.nextLong();
}
void display()
{
System.out.println("employee name:"+name);
System.out.println("employee id:"+empid);
System.out.println("mail id:"+mailid);
System.out.println("Address:"+address);
System.out.println("mobile number:"+mobileno);
}
}
class Programmer extends Employee
{
double salary,bp,da,hra,pf,club,net,gross;
void getprogrammer()
{
System.out.println("Enter the basic pay:");
bp=get.nextDouble();
}
void calculateprog()
{
da=(0.97*bp);
hra=(0.10*bp);
pf=(0.12*bp);
club=(0.1*bp);
gross=(bp+da+hra);
net=(gross-pf-club);
System.out.println("********PAYSLIP FOR PROGRAMMER**********");
System.out.println("Basic pay:Rs"+bp);
System.out.println("DA:Rs"+da);
System.out.println("HRA:Rs"+hra);
System.out.println("PF:Rs"+pf);
System.out.println("CLUB:Rs"+club);
System.out.println("GROSS PAY:Rs"+gross);
System.out.println("NET PAY:Rs"+net);
}
}
class Asstprofessor extends Employee
{
double salary,bp,da,hra,pf,club,net,gross;
void getasst()
{
System.out.println("enter the basic pay:");
bp=get.nextDouble();
}
void calculateasst()
{
da=(0.97*bp);
hra=(0.10*bp);
pf=(0.12*bp);
club=(0.1*bp);
gross=(bp+da+hra);
net=(gross-pf-club);
System.out.println("********PAYSLIP FOR ASSISTANT PROFESSOR********");
System.out.println("Basic Pay:Rs",+bp);
System.out.println("DA:Rs"+da);
System.out.println("HRA:Rs"+hra);
System.out.println("PF:Rs"+pf);
System.out.println("CLUB:Rs"+club);
System.out.println("GROSS PAY:Rs"+gross);
System.out.println("NET PAY:Rs"+net);
}
class Asstprofessor extends Employee
{
double salary,bp,da,hra,pf,club,net,gross;
void getassociate()
{
System.out.println("Enter the basic pay:");
bp=get.nextDouble();
}
void calculateassociate()
{
da=(0.97*bp);
hra=(0.10*bp);
pf=(0.12*bp);
club=(0.1*bp);
gross=(bp+da+hra);
net=(gross-pf-club);
System.out.println("********PAYSLIP FOR ASSOCIATE PROFESSOR********");
System.out.println("Basic Pay:Rs",+bp);
System.out.println("DA:Rs"+da);
System.out.println("HRA:Rs"+hra);
System.out.println("PF:Rs"+pf);
System.out.println("CLUB:Rs"+club);
System.out.println("GROSS PAY:Rs"+gross);
System.out.println("NET PAY:Rs"+net);
}
}
class professor extends Employee
{
double salary,bp,da,hra,pf,club,net,gross;
void getprofessor()
{
System.out.println("enter the basic pay:");
bp=get.nextDouble();
}
void calculateprofessor()
{
da=(0.97*bp);
hra=(0.10*bp);
pf=(0.12*bp);
club=(0.1*bp);
gross=(bp+da+hra);
net=(gross-pf-club);
System.out.println("********PAYSLIP FOR ASSOCIATE PROFESSOR********");
System.out.println("Basic Pay:Rs",+bp);
System.out.println("DA:Rs"+da);
System.out.println("HRA:Rs"+hra);
System.out.println("PF:Rs"+pf);
System.out.println("CLUB:Rs"+club);
System.out.println("GROSS PAY:Rs"+gross);
System.out.println("NET PAY:Rs"+net);
}
}
class Salary
{
public static void main(String[]args)
{
int choice,cont;
do
{
System.out.println("Payroll");
System.out.println("1.PROGRAMMER\t2.ASSISTANT PROFESSOR\t3.ASSOCIATE PROFESSOR\t4.PROFESSOR\t");
scanner c=new Scanner(System.in);
choice=c.nextInt();
switch(choice)
{
case 1:
{
Programmer p=new Programmer();
p.getdata();
p.getprogrammer();
p.display();
p.calculateprog();
break;
}
case 2:
{
Asstprofessor asst=new Asstprofessor();
asst.getdata();
asst.getasst();
asst.display();
asst.calculateasst();
break;
}
case 3:
{
Associateprofessor asso=new Associateprofessor();
asso.getdata();
asso.getassociate();
asso.display();
asso.calculateassociate();
break;
}
case 4:
{
Professor prof=new Professor();
prof.getdata();
prof.getprofessor();
prof.display();
prof.calculateprofessor();
break;
}
}
System.out.println("do you want to continue 0 to quit and 1 to continue");
cont=c.nextInt();
}
while(cont==1);
}
}