package GUI;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    // text fields
    private JTextArea angleText; //private to protect the state of your objects #encapsulation
    private JTextField areaText; // single line text 
    private JTextArea edgeText; // multi line text editor
    // main frame constructor used to create instance
    public MainFrame(){
        // Frame
        JFrame frame = new JFrame("𝗣𝗢𝗟𝗬𝗚𝗢𝗡 𝗔𝗥𝗘𝗔 𝗖𝗔𝗟𝗖𝗨𝗟𝗔𝗧𝗢𝗥");
        frame.setSize(850, 800);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);//Sets the location of the window relative to the specified component.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// setDefault is method for close operation and exit on close is an option here to exit the window other ones are hide_on_close
        // container // contain other AWT components
        Container c = frame.getContentPane();
        c.setBackground(Color.decode("#810544"));
    // placing text in a container #single line of read only text. Text cannot be edited
        JLabel heading = new JLabel("𝗣𝗢𝗟𝗬𝗚𝗢𝗡 𝗔𝗥𝗘𝗔 𝗖𝗔𝗟𝗖𝗨𝗟𝗔𝗧𝗢𝗥");
        c.add(heading);

        // Menu bar
        JLabel text = new JLabel("░Drag & Drop vertices░"); 
        text.setBounds(200, 0, 500, 50);
        Font fontt = new Font("Arial", Font.BOLD, 25);
        text.setForeground(Color.white);
        text.setFont(fontt);
        c.add(text);

        // areaText.setFont(font2);
        // areaText.setBounds(580, 100, 220, 70);
        // areaText.setBackground(Color.decode("#bbd2d8"));
        // areaText.setBorder(new BevelBorder(BevelBorder.LOWERED));
        // c.add(areaText);
        // Middle Panel

        angleText = new JTextArea("A : " + 90 +"°"+ "\nB : " + 90 +"°"+ "\nC : " + 90 +"°"+ "\nD : " + 90 +"°");
        areaText = new JTextField("250000.00 cm2");
        edgeText = new JTextArea("AB : " + 500 +" cm"+ "\nBC : " + 500 +" cm"+ "\nCD : " + 500 +" cm"+ "\nDA : " + 500 +" cm");

        ResizablePolygon panel = new ResizablePolygon(areaText, edgeText, angleText);
        panel.setBackground(Color.white);
        panel.setBounds(0, 55, 580, 750);
        panel.setLayout(new GridBagLayout());
        c.add(panel);

        //ImageIcon icon1 = new ImageIcon(MainFrame.class.getResource("images/logo.png"));
        //JButton back = new JButton(icon1);
        // back.setBounds(0, 0, 50, 55);
        // back.setBorder(new EtchedBorder(EtchedBorder.RAISED));
        // back.setBackground(Color.decode("#61E7C8"));
        // back.setBorderPainted(false);
        // c.add(back);

        JPopupMenu menu = new JPopupMenu();
        menu.setPopupSize(150, 60);

        // ImageIcon share1 = new ImageIcon(MainFrame.class.getResource("images/share.png"));
        // Image image1 = share1.getImage(); // transform it
        // Image new2 = image1.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH); // scale it smoothly
        // ImageIcon newImageIcon1 = new ImageIcon(new2);
        // JMenuItem share = new JMenuItem("Share", newImageIcon1);
        // share.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent ev) {
        //         try {
        //             String url = "https://github.com/narayanaditya1007/PolygonAreaCalculator";
        //             java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        //         } catch (java.io.IOException e) {
        //             System.out.println(e.getMessage());
        //         }
        //     }
        // });

        // menu.add(share);

        // back.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         menu.show(back, 0, 0);
        //         menu.setBorderPainted(true);

        //     }
        // });

        // Side Panel
        JPanel side = new JPanel();
        side.setBackground(Color.decode("#61E7C7"));
        side.setBounds(580, 0, 220, 800);

        // Reset Button
        JButton Reset = new JButton("RESET");
        Font font1 = new Font("Arial", Font.BOLD,40);
        Reset.setFont(font1);
        Reset.setFocusPainted(false);
        Reset.setBackground(Color.decode("#04aa6d"));
        Reset.setForeground(Color.white);
        Reset.setBounds(580, 560, 220, 80);
        frame.add(Reset);

        Reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new MainFrame();
            }
        });

        // AREA TEXT FIELD
        JLabel area = new JLabel("AREA");
        area.setBounds(600, 60, 200, 50);
        Font font2 = new Font("Arial", Font.BOLD, 24);
        area.setForeground(Color.white);
        area.setFont(font2);
        c.add(area);

        areaText.setFont(font2);
        areaText.setBounds(580, 100, 220, 70);
        areaText.setBackground(Color.decode("#bbd2d8"));
        areaText.setBorder(new BevelBorder(BevelBorder.LOWERED));
        c.add(areaText);

        // EDGE TEXT FIELD
        JLabel edge = new JLabel("EDGE LENGTH");
        edge.setBounds(590, 180, 220, 50);
        edge.setFont(font2);
        edge.setForeground(Color.white);
        c.add(edge);

        edgeText.setFont(font2);
        edgeText.setBounds(580, 220, 220, 140);
        edgeText.setBackground(Color.decode("#bbd2d8"));
        edgeText.setBorder(new BevelBorder(BevelBorder.LOWERED));
        c.add(edgeText);

        // ANGLE TEXT FIELD
        JLabel angle = new JLabel("ANGLES");
        angle.setBounds(600, 370, 220, 50);
        angle.setFont(font2);
        angle.setForeground(Color.white);
        c.add(angle);

        angleText.setFont(font2);
        angleText.setBounds(580, 410, 220, 140);
        angleText.setBackground(Color.decode("#bbd2d8"));
        angleText.setBorder(new BevelBorder(BevelBorder.LOWERED));
        c.add(angleText);

        frame.setLayout(null);
        frame.setVisible(true);
    }
}
