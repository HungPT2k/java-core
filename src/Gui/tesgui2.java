package Gui;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tesgui2 extends JFrame implements ActionListener , DocumentListener {
    private JLabel lb1 , lb2,lb3;
    private JTextField tx1,tx2;
    private JButton bt1,bt2;
    public tesgui2(){
        GuiInit();
    }
    private void GuiInit()
    {
        setTitle("Trang chủ");
        setSize(500,600);
        setDefaultLookAndFeelDecorated(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        setLayout(null);
        // khởi tạo
         lb1 = new JLabel("Nhập số 1:");
         lb2 = new JLabel("Nhập số 2:");
         lb3 = new JLabel("Kết quả :");
        lb1.setBounds(50,50,120,20);
        lb2.setBounds(50,100,120,20);
        lb3.setBounds(100,150,120,20);
        add(lb1);add(lb2);add(lb3);
        tx1 =new JTextField();
        tx2=new JTextField();
        add(tx1);add(tx2);
        tx1.setBounds(200,50,150,20);
        tx2.setBounds(200,100,150,20);
        bt1=new JButton("Nhập lại");
        bt2=new JButton("Tính toán");
        bt1.setBounds(100,200,150,20);
        bt2.setBounds(300,200,150,20);
        add(bt1);add(bt2);
        bt1.setEnabled(false);
        bt2.setEnabled(false);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        tx1.getDocument().addDocumentListener(this);
        tx2.getDocument().addDocumentListener(this);

    }

    private void setDefaultLookAndFeelDecorated(int exitOnClose) {
    }

    public static void main (String[] args){
        tesgui2 m= new  tesgui2();
        m.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bt1){
            tx1.setText("");
            tx2.setText("");
        }
        if(e.getSource()==bt2){

           int t1=Integer.parseInt(tx1.getText());
           int t2=Integer.parseInt(tx2.getText());
            lb3.setText("Tong:"+(t1+t2));
        }

    }
    private void check(){
        String s1= tx1.getText();
        String s2= tx2.getText();
        if(s1.isEmpty() && s2.isEmpty()) bt1.setEnabled(false);
        if(!s1.isEmpty() || !s2.isEmpty()) bt1.setEnabled(true);
        String regx="\\d+";
        if(s1.matches(regx) && s2.matches(regx))
        {bt2.setEnabled(true);}
        else bt2.setEnabled(false);
    }


    @Override
    public void insertUpdate(DocumentEvent e) {
      check();

    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        check();

    }

    @Override
    public void changedUpdate(DocumentEvent e) {

    }
}
