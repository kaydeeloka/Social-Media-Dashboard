package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class login {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Login Form");
        frame.setSize(360, 470);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null); // Use absolute positioning
        frame.setLocationRelativeTo(null); // Set center

        // Create a JLabel for the title
        JLabel lblLogin = new JLabel("Login");
        lblLogin.setFont(new Font("STXinwei", Font.BOLD, 25));
        lblLogin.setBounds(129, 24, 86, 34);
        frame.getContentPane().add(lblLogin);

        // Create a JLabel for username
        JLabel lblUser = new JLabel("Username:");
        lblUser.setBounds(50, 80, 100, 25);
        frame.getContentPane().add(lblUser);

        // Create a JTextField for username with placeholder
        JTextField txtUser = new JTextField("username");
        txtUser.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
        		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    txtUser.transferFocus(); // Move focus to the next component (password field)
                }
        	}
        });
        txtUser.setForeground(Color.GRAY); // Placeholder color
        txtUser.setFont(new Font("Arial", Font.ITALIC, 12)); // Placeholder font
        txtUser.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtUser.getText().equals("username")) {
                    txtUser.setText("");
                    txtUser.setForeground(Color.BLACK); // Regular text color
                    txtUser.setFont(new Font("Arial", Font.PLAIN, 12)); // Regular font
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtUser.getText().isEmpty()) {
                    txtUser.setText("username");
                    txtUser.setForeground(Color.GRAY); // Placeholder color
                    txtUser.setFont(new Font("Arial", Font.ITALIC, 12)); // Placeholder font
                }
            }
        });
        txtUser.setBounds(50, 123, 232, 42);
        frame.getContentPane().add(txtUser);

        // Create a JLabel for password
        JLabel lblPass = new JLabel("Password:");
        lblPass.setBounds(50, 200, 100, 25);
        frame.getContentPane().add(lblPass);

        // Create a JPasswordField for password with placeholder
        JPasswordField txtPass = new JPasswordField("*********");
        txtPass.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyPressed(KeyEvent e) {
        		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    loginAction(frame, txtUser.getText(), new String(txtPass.getPassword()));
                }
        	}
        });
        txtPass.setForeground(Color.GRAY); // Placeholder color
        txtPass.setFont(new Font("Arial", Font.ITALIC, 12)); // Placeholder font
        txtPass.setEchoChar((char) 0); // Disable masking for placeholder
        txtPass.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (new String(txtPass.getPassword()).equals("*********")) {
                    txtPass.setText("");
                    txtPass.setForeground(Color.BLACK); // Regular text color
                    txtPass.setFont(new Font("Arial", Font.PLAIN, 12)); // Regular font
                    txtPass.setEchoChar('*'); // Enable masking
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (new String(txtPass.getPassword()).isEmpty()) {
                    txtPass.setText("*********");
                    txtPass.setForeground(Color.GRAY); // Placeholder color
                    txtPass.setFont(new Font("Arial", Font.ITALIC, 12)); // Placeholder font
                    txtPass.setEchoChar((char) 0); // Disable masking for placeholder
                }
            }
        });
        txtPass.setBounds(50, 236, 232, 42);
        frame.getContentPane().add(txtPass);

        // Create a JButton for login
        JButton loginButton = new JButton("Login");
        loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        loginButton.setFont(new Font("STXinwei", Font.PLAIN, 15));
        loginButton.setBackground(new Color(255, 255, 204));
        loginButton.setForeground(new Color(153, 153, 255));
        loginButton.setBounds(109, 322, 124, 42);
        frame.getContentPane().add(loginButton);
        
     // Add an ActionListener to the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginAction(frame, txtUser.getText(), new String(txtPass.getPassword()));
            }
        });
        

     // Make the frame visible
        frame.setVisible(true);
    }

    // Login action to handle validation
    private static void loginAction(JFrame frame, String username, String password) {
        // Simulate a login check
        if (username.equals("kaydee") && password.equals("1234")) {
            JOptionPane.showMessageDialog(frame, "Login successful!");

            // Simulate opening the main menu
            mainMenu openMenu = new mainMenu();
            openMenu.setVisible(true);
			openMenu.setLocationRelativeTo(null); //set center

            frame.dispose(); // Close the login form
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid username or password.", "Login Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
