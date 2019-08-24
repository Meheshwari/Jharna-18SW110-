
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class LoginFrame extends JFrame implements ActionListener 
{

    Container Container=getContentPane();
    JLabel userLabel=new JLabel("Name");
    JLabel rollnoLabel=new JLabel("Roll No:");
    JLabel emailLabel=new JLabel("Email");
    JLabel passwordLabel=new JLabel("PASSWORD");
    JLabel cityLabel=new JLabel("City");
    JTextField userTextField=new JTextField();
    JTextField rollnoTextField=new JTextField();
    JTextField emailTextField=new JTextField();
    JPasswordField passwordField=new JPasswordField();
    JTextField cityTextField=new JTextField();
    JButton saveButton=new JButton("SAVE");
    JButton clearButton=new JButton("CLEAR");
    JCheckBox showPassword=new JCheckBox("Show Password");


    LoginFrame()
    {
       //Calling methods inside constructor.
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();


    }
   public void setLayoutManager()
   {
       Container.setLayout(null);
   }
   public void setLocationAndSize()
   {
       //Setting location and Size of each components using setBounds() method.
       userLabel.setBounds(50,150,100,40);
       rollnoLabel.setBounds(50,190,120,40);
       emailLabel.setBounds(50,220,140,40);
       passwordLabel.setBounds(50,250,160,40);
       cityLabel.setBounds(50,320,180,40);
       userTextField.setBounds(150,150,150,30);
       rollnoTextField.setBounds(150,190,100,30);
       emailTextField.setBounds(150,230,100,30);
       passwordField.setBounds(150,260,100,30);
       showPassword.setBounds(150,290,100,30);
       cityTextField.setBounds(160,330,100,30);
       saveButton.setBounds(30,370,100,30);
       clearButton.setBounds(230,370,100,30);


   }
   public void addComponentsToContainer()
   {
      //Adding each components to the Container
       Container.add(userLabel);
       Container.add(rollnoLabel);
       Container.add(emailLabel);
       Container.add(passwordLabel);
       Container.add(cityLabel);
       Container.add(userTextField);
       Container.add(rollnoTextField);
       Container.add(emailTextField);
       Container.add(passwordField);
       Container.add(showPassword);
       Container.add(cityTextField);
       Container.add(saveButton);
       Container.add(clearButton);
   }

}
 
