package FinalProject2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class OrderPage implements ActionListener {
static double hol1=0, hol2=0, hol3=0, hol4=0, hol5=0, hol6=0, paay, total;
JFrame frame = new JFrame("JABILLEE ORDER MENU");
JLabel title = new JLabel("Menu:");
JButton item1 = new JButton("1pc Chicken");
JButton item2 = new JButton("2pc Chicken");
JButton item3 = new JButton("1pc Burger Steak");
JButton item4 = new JButton("2pc Burger Steak");
JButton item5 = new JButton("Large Fries");
JButton item6 = new JButton("Coke");
JLabel title2 = new JLabel("Total:");
JTextField status = new JTextField("0");
JLabel holder = new JLabel("0");
JLabel holder2 = new JLabel("0");
JLabel holder3 = new JLabel("0");
JLabel holder4 = new JLabel("0");
JLabel holder5 = new JLabel("0");
JLabel holder6 = new JLabel("0");
JButton button2 = new JButton("TOTAL");
JTextField totalview = new JTextField();
JButton clear = new JButton("CLEAR");
JButton pay = new JButton("PAY");
JTextField payment = new JTextField("0");
JLabel title3 = new JLabel("Payment:");
JTextField change3 = new JTextField();
JLabel title4 = new JLabel("Change:");
JLabel title5 = new JLabel("List of Items:");
JLabel chicken = new JLabel("1Pc ChickenJoy ----------- 75.75 pesos");
JLabel chicken2 = new JLabel("2Pc ChickenJoy ----------- 150.75 pesos");
JLabel burger = new JLabel("1Pc Burger Steak ----------- 50.75 pesos");
JLabel burger2 = new JLabel("2Pc Burger Steak ----------- 90.75 pesos");
JLabel fries = new JLabel("Large Fries ---------- 49.75 pesos");
JLabel coke = new JLabel("Coke ------------- 30 pesos");
OrderPage(){
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(600, 500);
frame.setLayout(null);
frame.setVisible(true);
frame.getContentPane().setBackground(Color.orange);
title.setBounds(20, 20, 100, 50);
title.setFont(new Font("Calibri", Font.ITALIC, 20));
frame.add(title);
item1.setBounds(30, 80, 150, 50);
item1.addActionListener(this);
frame.add(item1);
item2.setBounds(220, 80, 150, 50);
item2.addActionListener(this);
frame.add(item2);
item3.setBounds(30, 150, 150, 50);
item3.addActionListener(this);
frame.add(item3);
item4.setBounds(220, 150, 150, 50);
item4.addActionListener(this);
frame.add(item4);
item5.setBounds(410, 80, 150, 50);
item5.addActionListener(this);
frame.add(item5);
item6.setBounds(410, 150, 150, 50);
item6.addActionListener(this);
frame.add(item6);
title2.setBounds(150, 250, 100, 25);
frame.add(title2);
status.setBounds(190, 250, 100, 25);
status.setEditable(false);
frame.add(status);
button2.setBounds(30, 250, 100,25);
button2.addActionListener(this);
frame.add(button2);
payment.setBounds(190, 300, 100, 25);
frame.add(payment);
title3.setBounds(135, 300, 100, 25);
frame.add(title3);
title4.setBounds(140, 350, 100, 25);
frame.add(title4);
title5.setBounds(320, 210, 100, 50);
frame.add(title5);
chicken.setBounds(320, 240, 300, 50);
frame.add(chicken);
chicken2.setBounds(320, 260, 300, 50);
frame.add(chicken2);
burger.setBounds(320, 280, 300, 50);
frame.add(burger);
burger2.setBounds(320, 300, 300, 50);
frame.add(burger2);
fries.setBounds(320, 320, 300, 50);
frame.add(fries);
coke.setBounds(320, 340, 300, 50);
frame.add(coke);
pay.setBounds(30, 300, 100,25);
pay.addActionListener(this);
frame.add(pay);
clear.setBounds(30, 350, 100, 25);
clear.addActionListener(this);
frame.add(clear);
item1.setBounds(null);
}
@Override
public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub
String value, change2;
if(e.getSource()==item1) {
holder.setText("75.75");
}
if(e.getSource()==item2) {
holder2.setText("150.75");
}
if(e.getSource()==item3) {
holder3.setText("50.75");
}
if(e.getSource()==item4) {
holder4.setText("90.75");
}
if(e.getSource()==item5) {
holder5.setText("49.75");
System.out.println("hello");
}
if(e.getSource()==item6) {
holder6.setText("30");
System.out.println("hello");
}
hol1=Double.parseDouble(holder.getText());
hol2=Double.parseDouble(holder2.getText());
hol3=Double.parseDouble(holder3.getText());
hol4=Double.parseDouble(holder4.getText());
hol5=Double.parseDouble(holder5.getText());
hol6=Double.parseDouble(holder6.getText());
if(e.getSource()==button2) {
total = hol1 + hol2 + hol3 + hol4 + hol5 + hol6;
value=String.valueOf(total);
status.setText(value);
}
if(e.getSource()==clear) {
holder.setText("0");
                                         holder2.setText("0");
holder3.setText("0");
holder4.setText("0");
holder5.setText("0");
holder6.setText("0");
status.setText("0");
payment.setText("0");
}
paay = Double.parseDouble(payment.getText());
total = hol1 + hol2 + hol3 + hol4;
if(e.getSource()==pay) {
if(paay > total) {
double change = paay - total;
change2 = String.valueOf(change);
JOptionPane.showMessageDialog(null, "Thank you for ordering!your change is : " + change2 + " Pesos");
holder.setText("0");
holder2.setText("0");
holder3.setText("0");
holder4.setText("0");
holder5.setText("0");
holder6.setText("0");
status.setText("0");
payment.setText("0");
}
else if(paay<total) {
JOptionPane.showMessageDialog(null, "Your payment isinvalid");
}
}
}
}



