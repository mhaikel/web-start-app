package com.esc.webstart;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WebStartApp extends JFrame {
	private static final long serialVersionUID = 1234567889L;

    private JLabel label = new JLabel("Welcome To My Web Start App");

    public WebStartApp(){
        super("Java Web Start App");
        this.setSize(350, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
    }

    public void addButtons(){
        label.setSize(200, 30);
        label.setLocation(80, 50);
        this.getContentPane().add(label);
    }

    public static void main(String[] args){
        WebStartApp webStartApp = new WebStartApp();
        webStartApp.addButtons();
        webStartApp.setVisible(true);
    }
}
