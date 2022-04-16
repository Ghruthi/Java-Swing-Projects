import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form 
{
    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() 
        {
        public void run() 
        {
            try 
            {
                Form window = new Form();
                window.frame.setVisible(true);
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
    });
}

public Form() 
{
    initialize();
}

private void initialize() 
{
frame = new JFrame(); //obj creatation

frame.setBounds(100, 100, 730, 489);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

textField = new JTextField();

textField.setBounds(128, 28, 86, 20);
frame.getContentPane().add(textField);
textField.setColumns(10);

JLabel lblName = new JLabel("Name");
lblName.setBounds(65, 31, 46, 14);
frame.getContentPane().add(lblName);

JLabel lblRollno = new JLabel("Roll.No");
lblRollno.setBounds(65, 68, 46, 14);
frame.getContentPane().add(lblRollno);
textField_1 = new JTextField();
textField_1.setBounds(128, 65, 86, 20);
frame.getContentPane().add(textField_1);
textField_1.setColumns(10);

JLabel lblEmailId = new JLabel("Email Id");
lblEmailId.setBounds(65, 115, 46, 14);
frame.getContentPane().add(lblEmailId);
textField_2 = new JTextField();
textField_2.setBounds(128, 112, 247, 17);
frame.getContentPane().add(textField_2);
textField_2.setColumns(10);

JLabel lblAddress = new JLabel("Address");
lblAddress.setBounds(65, 162, 46, 14);
frame.getContentPane().add(lblAddress);
JTextArea textArea_1 = new JTextArea();
textArea_1.setBounds(126, 157, 212, 40);
frame.getContentPane().add(textArea_1);

JButton btnClear = new JButton("Clear");
btnClear.setBounds(312, 387, 89, 23);
frame.getContentPane().add(btnClear);

JLabel lblSex = new JLabel("Sex");
lblSex.setBounds(65, 228, 46, 14);
frame.getContentPane().add(lblSex);

JLabel lblMale = new JLabel("Male");
lblMale.setBounds(128, 228, 46, 14);
frame.getContentPane().add(lblMale);

JLabel lblFemale = new JLabel("Female");
lblFemale.setBounds(292, 228, 46, 14);
frame.getContentPane().add(lblFemale);
JRadioButton radioButton = new JRadioButton("");
radioButton.setBounds(337, 224, 109, 23);
frame.getContentPane().add(radioButton);
JRadioButton radioButton_1 = new JRadioButton("");
radioButton_1.setBounds(162, 224, 109, 23);
frame.getContentPane().add(radioButton_1);

JLabel lblBranch = new JLabel("Branch");
lblBranch.setBounds(65, 288, 67, 14);
frame.getContentPane().add(lblBranch);

JComboBox<String> comboBox = new JComboBox<String>();
comboBox.addItem("Select");
comboBox.addItem("CSE");
comboBox.addItem("IT");
comboBox.addItem("EIE");
comboBox.addItem("EC");
comboBox.addItem("Others");

comboBox.addActionListener(new ActionListener() 
{
    public void actionPerformed(ActionEvent arg0) {
}
});

comboBox.setBounds(180, 285, 91, 20);
frame.getContentPane().add(comboBox);

JButton btnSubmit = new JButton("submit");
btnSubmit.setBackground(Color.BLUE);
btnSubmit.setForeground(Color.MAGENTA);
btnSubmit.setBounds(65, 387, 89, 23);
frame.getContentPane().add(btnSubmit);

btnSubmit.addActionListener(new ActionListener() 
{
    public void actionPerformed(ActionEvent arg0) 
    {
    if((textField.getText().isEmpty()) || (textField_1.getText().isEmpty()) || (textField_2.getText().isEmpty()) || (textArea_1.getText().isEmpty()) || 
        ((radioButton_1.isSelected()) && (radioButton.isSelected()) ||(comboBox.getSelectedItem().equals("Select"))))
        JOptionPane.showMessageDialog(null, "Data Missing");

    else
        JOptionPane.showMessageDialog(null, "Data Submitted");
    }
});

btnClear.addActionListener(new ActionListener() 
{
    public void actionPerformed(ActionEvent e) 
    {
        textField_1.setText(null);
        textField_2.setText(null);
        textField.setText(null);
        textArea_1.setText(null);
        radioButton.setSelected(false);
        radioButton_1.setSelected(false);
        comboBox.setSelectedItem("Select");
    }
});
}
}