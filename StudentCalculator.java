import java.awt.*;
import java.awt.event.*;
class StudentCalculator implements ActionListener
{
Frame f=new Frame();

//label subject
Label l1=new Label("GRADE CALCULATION");
Label l2=new Label("ENGLISH");
Label l3=new Label("TAMIL");
Label l4=new Label("SCIENCE");
Label l5=new Label("SOCIAL SCIENCE");
Label l6=new Label("MATHEMATICS");
Label l7=new Label("RESULT");
Label l8=new Label("GRADE");

//textfield

TextField t2=new TextField();
TextField t3=new TextField();
TextField t4=new TextField();
TextField t5=new TextField();
TextField t6=new TextField();
TextField t7=new TextField();
TextField t8=new TextField();


//buttons
Button b1=new Button("SUM");
Button b2=new Button("AVERAGE");
Button b3=new Button("CANCEL");

StudentCalculator()
{
//setbound

l1.setBounds(300,50,150,20);
l2.setBounds(50,100,100,20);
l3.setBounds(50,140,100,20);
l4.setBounds(50,180,100,20);
l5.setBounds(50,220,100,20);
l6.setBounds(50,260,100,20);
l7.setBounds(50,300,100,20);
l8.setBounds(50,340,100,20);

t2.setBounds(200,100,100,20);
t3.setBounds(200,140,100,20);
t4.setBounds(200,180,100,20);
t5.setBounds(200,220,100,20);
t6.setBounds(200,260,100,20);
t7.setBounds(200,300,100,20);
t8.setBounds(200,340,100,20);


b1.setBounds(50,450,70,20);
b2.setBounds(110,450,90,20);
b3.setBounds(190,450,100,20);


//addlabel
f.add(l1);
f.add(l2);
f.add(l3);
f.add(l4);
f.add(l5);
f.add(l6);
f.add(l7);
f.add(l8);

//addtext
f.add(t2);
f.add(t3);
f.add(t4);
f.add(t5);
f.add(t6);
f.add(t7);
f.add(t8);

//addbutton
f.add(b1);
f.add(b2);
f.add(b3);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);


f.setLayout(null);
f.setVisible(true);
f.setSize(800,550);

}


public void actionPerformed(ActionEvent e) 
{
if (e.getSource() == b1 || e.getSource() == b2) 
{

// getting input for n1,n2,n3,n4,n5

int n1 = Integer.parseInt(t2.getText());
int n2 = Integer.parseInt(t3.getText());
int n3 = Integer.parseInt(t4.getText());
int n4 = Integer.parseInt(t5.getText());
int n5 = Integer.parseInt(t6.getText());

//sum of n
int sum = n1 + n2 + n3 + n4 + n5;

if (e.getSource() == b1) 
{
t7.setText(String.valueOf(sum));
} 
else 
{
t7.setText(String.valueOf(sum / 5));
}

//calculatoin of grade

calculateGrade(sum / 5); 
} 
else if (e.getSource() == b3) 
{
System.exit(0);
}
}

private void calculateGrade(int average) 
{
String grade;
if (average >= 90) 
{ 
grade = "S";
}
else if (average >= 80) 
{
grade = "A";
}
else if (average >= 70) 
{
grade = "B";
} 
else if (average >= 60)
{
grade = "C";
}
else if (average >= 50) 
{
grade = "D";
} 
else 
{
grade = "F";
}
t8.setText(grade);
}


public static void main(String[] args)
{
new StudentCalculator();
}
}