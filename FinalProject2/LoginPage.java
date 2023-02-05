package FinalProject2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class LoginPage implements ActionListener{
	JFrame frame = new JFrame("JABILLEE");
	JButton log = new JButton("Log In");
	JLabel welcome = new JLabel("Welcome to");
	JLabel title = new JLabel("JABILLEE");
	JLabel user = new JLabel("Username:");
	JTextField username = new JTextField();
	JLabel pass = new JLabel("Password:");
	JPasswordField password = new JPasswordField();
LoginPage(){
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(500, 280);
	frame.getContentPane().setBackground(Color.yellow);
	frame.setLayout(null);

	welcome.setFont(new Font("Calibri", Font.BOLD, 30));
	welcome.setBounds(160,30,150,25);
	frame.add(welcome);
	title.setFont(new Font("Calibri", Font.ITALIC, 50));
	title.setBounds(150,55,200,50);
	frame.add(title);

	user.setBounds(20, 120, 100, 20);
	frame.add(user);
	username.setBounds(90, 120, 140, 20);
	frame.add(username);
	pass.setBounds(250, 120, 100, 20);
	frame.add(pass);
	password.setBounds(320, 120, 140, 20);
	frame.add(password);
	
	log.setBounds(190, 160, 100, 25);
	log.addActionListener(this);
	frame.add(log);
	frame.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) {
	String holder = password.getText();
	if(holder.equals("12345")) {
	frame.dispose();
	OrderPage orderPage = new OrderPage();
}
else {
	JOptionPane.showMessageDialog(null, "Your password is invalid");
}
}
}


