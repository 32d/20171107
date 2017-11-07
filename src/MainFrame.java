import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PrivateKey;

public class MainFrame extends JFrame {
    private Container cp ;
    private JMenuBar JMB = new JMenuBar();
    private JMenu File = new JMenu("File");
    private JMenuItem HelloMI = new JMenuItem("Hello");
    private JMenuItem updownMI = new JMenuItem("updown");
    private int scW = Toolkit.getDefaultToolkit().getScreenSize().width;
    private int scH = Toolkit.getDefaultToolkit().getScreenSize().height;
    private int W = 800;
    private int H = 600;
    private int jblX = 100, jblY = 100 ,jblW=100 , jblH=100;
    private int text =24;
    private JLabel JLb = new JLabel("hello");
    private JPanel Jpl = new JPanel();
    private JButton upBtn =new JButton("↑");
    private JButton downBtn =new JButton("↓");
    private JButton rightBtn =new JButton("→");
    private JButton leftBtn =new JButton("←");
    private JButton bigBtn = new JButton("大");
    private JButton smallBtn = new JButton("小");



   public  MainFrame() {

       init();

   }

    private void init(){
    this.setBounds(scW/2-W/2,scH/2-H/2,W,H);
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.setJMenuBar(JMB);
    JLb.setLocation(jblX,jblY);
    JMB.add(File);
    File.add(HelloMI);
    File.add(updownMI);

    cp = this.getContentPane();
    cp.setLayout(new BorderLayout(2,1));
//    cp.add(JLb,BorderLayout.NORTH);
    cp.add(JLb);
    cp.add(Jpl,BorderLayout.SOUTH);



 // add(JLb);
    JLb.setHorizontalAlignment(SwingConstants.CENTER);
//    JLb.setSize(jblW,jblH);
//    JLb.setBackground(Color.blue);
    JLb.setOpaque(true);
    JLb.setFont(new Font(null,Font.BOLD+Font.ITALIC,text));

//  add(Jpl);
    Jpl.setLayout(new GridLayout(1,6,3,3));
    Jpl.add(upBtn);
    upBtn.setFont(new Font(null,Font.BOLD,24));
    Jpl.add(downBtn);
    downBtn.setFont(new Font(null,Font.BOLD,24));
    Jpl.add(leftBtn);
    leftBtn.setFont(new Font(null,Font.BOLD,24));
    Jpl.add(rightBtn);
    rightBtn.setFont(new Font(null,Font.BOLD,24));
    Jpl.add(bigBtn);
    bigBtn.setFont((new Font(null,Font.BOLD,24)));
    Jpl.add(smallBtn);
    smallBtn.setFont(new Font(null,Font.BOLD,24));

upBtn.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        jblY-=10;
        JLb.setLocation(jblX,jblY);
    }
});
downBtn.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        jblY+=10;
        JLb.setLocation(jblX,jblY);
    }
});
        leftBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jblX-=10;
                JLb.setLocation(jblX,jblY);
            }
        });
        rightBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jblX+=10;
                JLb.setLocation(jblX,jblY);
            }
        });

        bigBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jblW+=10;
                jblH+=10;
                text+=5;
                JLb.setSize(jblW,jblH);
                JLb.setFont(new Font(null,Font.BOLD+Font.ITALIC,text));
            }
        });
        smallBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jblW-=10;
                jblH-=10;
                text-=5;
                JLb.setSize(jblW,jblH);
                JLb.setFont(new Font(null,Font.BOLD+Font.ITALIC,text));
            }
        });
    }

}