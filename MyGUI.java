
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/*
 * @ 96emisun
 * 2014
 *
 */
 
 class MyGUI extends JFrame{
     
    private JMenuBar meny;
    private JMenu arkiv;
    private JMenu om;
    private JMenuItem avsluta;
    private JMenuItem omSkaparen;
    private JMenuItem hjalp;
 
    public MyGUI(){
        this.initGUI();
    }
    
    /*
        Inställningarna för JFramen
    */
    private void initGUI(){
        this.setTitle("MyGUI");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        /*
            Skapar menyerna
        */
        this.meny = new JMenuBar();
        this.arkiv = new JMenu("Arkiv");
        this.om = new JMenu("Om");
        this.avsluta = new JMenuItem("Avsluta programmet");
        this.omSkaparen = new JMenuItem("Om skaparen");
        this.hjalp = new JMenuItem("Hjälp");
        
        this.setJMenuBar(meny);
        this.meny.add(arkiv);
        this.meny.add(om);
        this.arkiv.add(avsluta);
        this.om.add(omSkaparen);
        this.om.add(hjalp);
        
        this.avsluta.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        
        this.omSkaparen.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, 
                        "Copyright:\nEmil Sundqvist\n2014");
            }
        });
        
        this.hjalp.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Detta program kan"
                        + " vi använda när vi jobbar med GUI");
            }
        });
        
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater( new Runnable() {
            public void run() {
                new MyGUI().setVisible(true);
            }
        });
    }
 
 
 }
