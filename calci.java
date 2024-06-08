import java.awt.*;
import java.awt.event.*;

public class calci extends Frame implements ActionListener {

  Label l1, l2, l3, l4;
  TextField t1, t2;
  Button b1, b2;

  public calci() {
    super("Addition of two numbers");

    // Use FlowLayout for horizontal layout with some spacing
    setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));

    l1 = new Label("Enter the first no:");
    l2 = new Label("Enter the second no:");
    l3 = new Label("The sum is:");
    l4 = new Label(null);
    t1 = new TextField();
    t2 = new TextField();
    b1 = new Button("ADD");
    b2 = new Button("Clear");

    // Add components to the frame
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(l3);
    add(l4);
    add(b1);
    add(b2);

    b1.addActionListener(this);
    b2.addActionListener(this);

    setVisible(true);

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
  }

  // ... rest of the code for actionPerformed and main method remains the same
  public void actionPerformed(ActionEvent ae){
    int a,b,c;
    if(ae.getSource()==b1){
        a=Integer.parseInt(t1.getText());
        b=Integer.parseInt(t2.getText());
        c=a+b;
        l4.setText(Integer.toString(c));
    }
    else{
        t1.setText(null);
        t2.setText(null);
        l4.setText(null);
    }
  }
  public static void main(String args[]){
    new calci();
  }

}
