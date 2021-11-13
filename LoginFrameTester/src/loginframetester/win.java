
package loginframetester;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;


public class win extends JFrame implements ActionListener{
    
    private JLabel lblMessage;
    private JButton btnCalc;
    private JPanel panel;
    private JTextField txt;

    public win()
    {
        setSize(400,200);
        setTitle("login in system");
        lblMessage = new JLabel("Sign in");
        this.add(this.lblMessage, BorderLayout.NORTH);
        this.setLayout( new BorderLayout()    );
        txt = new JTextField();
        
        panel = new JPanel();
        this.add(this.panel, BorderLayout.NORTH);
        
        panel.setLayout( new BorderLayout()   );
        panel.add(txt, BorderLayout.CENTER);
        
        btnCalc = new JButton("login");
        this.add(this.btnCalc, BorderLayout.SOUTH);
        btnCalc.addActionListener(this);
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
