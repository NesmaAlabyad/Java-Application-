package app;

/**
 
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class marketing  extends JFrame  implements ActionListener {
    // declaration of objects components in marketing part 
    
    JPanel base,p1,p2,p3,p4,image;
    JLabel marketing, rNum, reach,aNum,IEEE_logo;
    JComboBox registerationNum;
    JTextField attendee,reachNum;
    String[]objects={"30-40","50-60","70-80","90-100","100-110","120-150"};
    JRadioButton explain;
    JButton next;
    JScrollPane scroll;
    
    // declaration of objects components in venue part 
    JPanel p5,p6,p7,p8,NextPanel;
    JTextField whereField;
    JRadioButton onlineButton,offlineButton;
    JLabel online,offline,where ;

   // declaration of objects components in Rating part 
    JButton next1;
    JLabel rate1,rate2,rate3,rate;
    JSlider rate11,rate22,rate33;
    JPanel ratep,pres,pra1,pra2,pra3,pnext1;
    
   // declaration of objects components in objectives part 
    JTextArea ObjecTextArea;
    JLabel Objectives;
    JPanel panel,pnext3;
    JButton next3;
   
   //declaration of objects components in speakers part 

    JButton nextButton =new JButton("Enter speaker's number");
    JButton next4 =new JButton("Next");
    JPanel jPanel=new JPanel();
    JPanel jPanel1=new JPanel();
    JLabel sp1,sp2;
    JTextField speaker1, speaker2;
    String text1;
    JComboBox cb;
    Container container=getContentPane();
   
    
//declaration of objects components in postArea and banner part 
    JTextArea postArea;
    JPanel ppost,pnext2,pimage,next5p;
    JLabel post;
    JButton next2,next5;
    Label Label1 ;  
    Button select; 
    Image Image1;    
    FileDialog fd; 
    
 //declaration of objects components in feedback part
     JPanel feedbackp,DOWNLOADP;
     JLabel feedback;
     JTextField feedback_field;
     JButton download;

    
    
    
    public marketing(){
        
      
       base=new JPanel(); // main base panel containing whole programe panels
       base.setLayout(new GridLayout(21, 1));
       base.setBackground(Color.WHITE);
        
// seting back and foregrounds, font, color, size and strings for marketing part components
       
        marketing=new JLabel("  Marketing");
        marketing.setFont(new Font("Arial", Font.BOLD, 50));
        marketing.setForeground(new Color(0,97,169));
        
        explain=new JRadioButton("?");
        explain.setForeground(new Color(0,97,169));
        explain.setBackground(Color.WHITE);
        explain.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
        
        IEEE_logo=new JLabel();
        IEEE_logo.setIcon(new ImageIcon("C:\\Users\\Nada\\Downloads\\IEEE1.jpg"));
       
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        p4=new JPanel();
        image=new JPanel();
        // first next button
        NextPanel=new JPanel();
        next=new JButton("Next");
        NextPanel.add(next);
        NextPanel.setBackground(Color.WHITE);
        
        p1.setLayout(new FlowLayout());
        p2.setLayout(new FlowLayout(10, 10, 10));
        p3.setLayout(new FlowLayout(10, 10, 10));
        p4.setLayout(new FlowLayout(10, 10, 10));
        image.setLayout(new GridLayout(1, 1));
        
        rNum=new JLabel("► Number of registered individuals:");
        rNum.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
        
        aNum=new JLabel("► Number of attendee:");
        aNum.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
        
        attendee=new JTextField(" Enter attendee number", 20);
        attendee.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
        attendee.setForeground(new Color(0,97,169));
        
        reach=new JLabel("► Reach on Social media:");
        reach.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
        
        reachNum=new JTextField(" Enter attendee number", 20);
        reachNum.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
        reachNum.setForeground(new Color(0,97,169));
        
        registerationNum=new JComboBox(objects);
        registerationNum.setForeground(new Color(0,97,169));
        registerationNum.setFont(new Font("Arial", Font.PLAIN, 20));
        
        // adding components to the panels
        p2.add(rNum);
        p2.add(registerationNum);
        p3.add(aNum);
        p3.add(attendee);
        p4.add(reach);
        p4.add(reachNum);
        p1.add(marketing);
        p1.add(explain);
        image.add(IEEE_logo);
        image.setBackground(Color.WHITE);
        validate();
       
        //adding panels to the main bass panel
        base.add(image);
        base.add(p1);
        base.add(p2);
        base.add(p3);
        base.add(p4);
        base.add(NextPanel);
        
        p4.setBackground(Color.white);
        p1.setBackground(Color.white);
        p2.setBackground(Color.white);
        p3.setBackground(Color.white);
        
        //applying actions to the buttons
        explain.addActionListener(this);
        next.addActionListener(this);
        
        
        
// seting back and foregrounds, font, color, size and strings for venue part components
        
       p5=new JPanel();
       p5.setBackground(Color.WHITE);
       p6=new JPanel();
       p6.setLayout(new GridLayout(1,1));
       p6.setBackground(Color.WHITE);
       p7=new JPanel();
       p7.setLayout(new FlowLayout(10, 10, 10));
       p8=new JPanel();
       p8.setLayout(new FlowLayout(10, 10, 10));
       
       online=new JLabel("VENUE");
       online.setFont(new Font("Arial", Font.BOLD, 50));
       online.setForeground(new Color(0,97,169));
       where=new JLabel();
       
       onlineButton=new JRadioButton("online");
       onlineButton.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
       offlineButton=new JRadioButton("offline");
       offlineButton.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
       onlineButton.setBackground(Color.WHITE);
       offlineButton.setBackground(Color.white);
       whereField=new JTextField(30);
       whereField.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
       
       //applying actions to the buttons
       onlineButton.addActionListener(this);
       offlineButton.addActionListener(this);
       // adding components to the panels
       p5.add(online);
       p6.add(onlineButton);
       p6.add(offlineButton);
       p7.add(where);
       p8.add(whereField);
        
       
// seting back and foregrounds, font, color, size and strings for rating part components
       
       ratep=new JPanel(new GridLayout(5, 1)); //main panel
       
       rate=new JLabel();
       rate.setText("Results and Rates ");
       rate.setFont(new Font("Arial", Font.BOLD, 50));
       rate.setForeground(new Color(0,97,169));
       
       pres=new JPanel(new FlowLayout()); //panel for label1
       pres.add(rate);
       
       rate1=new JLabel();
       rate1.setText("Marketing Campaign:                ");
       rate1.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
       
       rate11=new JSlider(0,10);
       rate11.setPaintLabels(true); //for painting numbers
       rate11.setPaintTicks(true);  //for painting ticks
       rate11.setMajorTickSpacing(1);
       rate11.setBackground(Color.white);
       rate11.setForeground(new Color(0,97,169));
       
       pra1=new JPanel(new FlowLayout(10,10,10)); //panel for label2 and slider1
       pra1.add(rate1);
       pra1.add(rate11);
       
       rate2=new JLabel();
       rate2.setText("Event organization:                   ");
       rate2.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
       
       rate22=new JSlider(0,10);
       rate22.setPaintLabels(true);
       rate22.setMajorTickSpacing(1);
       rate22.setBackground(Color.white);
       rate22.setForeground(new Color(0,97,169));
       
       pra2=new JPanel(new FlowLayout(10,10,10));//panel for label3 and slider2
       pra2.add(rate2);
       pra2.add(rate22);
        
       rate3=new JLabel();
       rate3.setText("Event objectives Fulfiled:        ");
       rate3.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
       
       rate33=new JSlider(0,10);
       rate33.setPaintLabels(true);
       rate33.setPaintTicks(true);
       rate33.setMajorTickSpacing(1);
       rate33.setBackground(Color.white);
       rate33.setForeground(new Color(0,97,169));
        
       pra3=new JPanel(new FlowLayout(10,10,10)); //panel for label4 and slider3
       pra3.add(rate3);
       pra3.add(rate33);
    
       next1=new JButton("next");  
       pnext1=new JPanel(); //panel for the next button
       pnext1.add(next1);
       next1.addActionListener(this);
       
        ratep.add(pres);
        ratep.add(pra1);
        ratep.add(pra2);
        ratep.add(pra3);
        ratep.add(pnext1);
 
         
        
// seting back and foregrounds, font, color, size and strings for speakers part components
        
        ArrayList<Integer> number = new ArrayList<Integer>(); //number of possible speakers
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);
        number.add(7);
        number.add(8);
        number.add(9);
        number.add(10);

        text1="";
        sp1=new JLabel("Enter number of speakers: ");
        sp2=new JLabel("Spearker's Name: ");
        sp2.setFont(new Font("Arial", Font.BOLD, 50));
        sp2.setForeground(new Color(0,97,169));
        
        cb = new JComboBox(number.toArray());
        cb.setForeground(new Color(0,97,169));
        cb.setFont(new Font("Arial", Font.PLAIN, 20));
        
        speaker1=new JTextField(20);
        speaker2=new JTextField(20);

        jPanel1.setLayout(new FlowLayout(10,10,10));
        jPanel1.add(sp2);
        jPanel1.add(cb);
        jPanel1.add(nextButton);
        jPanel1.setBackground(Color.WHITE);
        
        jPanel.setLayout(new FlowLayout(10,10,10));
        jPanel.add(jPanel1);
        jPanel.setBackground(Color.WHITE);
        
        container.add(jPanel);
        next4.addActionListener(this);
        nextButton.addActionListener(this);

   
     
 // seting back and foregrounds, font, color, size and strings for objectives part part components
         
        ObjecTextArea= new JTextArea("event objectives ",5,5);
        ObjecTextArea.setFont(new Font("Arial", Font.PLAIN, 30));
        
        Objectives  = new JLabel ("Objectives: ");
        Objectives.setFont(new Font("Arial", Font.BOLD, 50));
        Objectives.setForeground(new Color(0,97,169));
        
        panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));
        pnext3 = new JPanel();
        
        next3=new JButton("next");
        next3.addActionListener(this);
        // adding components to the panels
        pnext3.add(next3);
        panel.add(Objectives);
        panel.add(ObjecTextArea);

        
    
 // seting back and foregrounds, font, color, size and strings for post and banner part part components
        
        //post part
        postArea = new JTextArea("add postArea", 5, 5);
        postArea.setBackground(Color.white);
        postArea.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
        
        post=new JLabel("BANNER AND POST");
        post.setFont(new Font("Arial", Font.BOLD, 50));
        post.setForeground(new Color(0,97,169));
        
        next2= new JButton("next");
        next2.addActionListener(this);
        
        pnext2=new JPanel();
        pnext2.add(next2);
        
        ppost=new JPanel();
        ppost.setLayout(new GridLayout(2, 1));
        ppost.setBackground(Color.white);
        
        ppost.add(postArea);
        ppost.add(postArea);
        
        next5p=new JPanel();
        next5p.setBackground(Color.WHITE);
        //image part
        Label1 = new Label("Choose your image");
        Label1.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
        select = new Button("select");
        next5=new JButton("next");
        next5p.add(next5);
        
        fd = new FileDialog(this, "Open", FileDialog.LOAD);
        select.addActionListener(this);
        
        pimage=new JPanel();
        pimage.setLayout(new FlowLayout(10, 10, 10));
        pimage.add(Label1);
        pimage.add(select);
        pimage.setBackground(Color.WHITE);
//        Canvas1 = new imageLoad(null);  
//        Canvas1.setSize(1000, 1000);
        this.show(); 
  // seting back and foregrounds, font, color, size and strings for Audience feedback part part components      
        DOWNLOADP=new JPanel();
        DOWNLOADP.setBackground(Color.WHITE);
        
        feedbackp=new JPanel();
        feedbackp.setBackground(Color.WHITE);
        
        feedback = new JLabel("Audience feedback");
        feedback.setBackground(Color.WHITE);
        feedback.setFont(new Font("Arial", Font.BOLD, 50));
        feedback.setForeground(new Color(0,97,169));
        
        feedback_field = new JTextField(50);
        feedback_field.setFont(new Font("Arial", Font.PLAIN, 30));
        feedback_field.setForeground(new Color(0,97,169));
       // feedback_field.
        
        download=new JButton("Download");
        download.setFont(new Font("Arial", Font.PLAIN, 40));
        download.setForeground(new Color(0,97,169));
        DOWNLOADP.add(download);
        feedbackp.add(feedback);
        feedbackp.setLayout(new FlowLayout(10,10,10));
        feedbackp.add(feedback_field);
        next5.addActionListener(this);
        
        
// adding the main base panel to the programe frame
        this.add(base);
         
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     /* if the user clicked on the ? for the first time, 
        the explanation "important data from the marketing campaign" will appear */
    if(e.getSource()==explain&&marketing.getText()=="  Marketing"){
           
           marketing.setText("important data from the marketing campaign");
           marketing.setFont(new Font("Arial", Font.BOLD, 30));
           marketing.setForeground(Color.GRAY);
           
           explain.setFont(new Font("Arial", Font.BOLD, 30));
           explain.setForeground(Color.GRAY);
           
           attendee.setText("");
           reachNum.setText("");
        
       }
      /* if user clicked on the ? for the second time,
        the explanation will return to the label "  Marketing"*/
     else if(e.getSource()==explain&&marketing.getText()=="important data from the marketing campaign"){
               marketing.setText("  Marketing");
               marketing.setFont(new Font("Arial", Font.BOLD, 50));
               marketing.setForeground(new Color(0,97,169));
               explain.setForeground(new Color(0,97,169));
               explain.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));

           }
      // when user click next,the venue part will appear                   
    if(e.getSource()==next){
            base.add(p5);
            base.add(p6);
            base.add(p7);
            p6.setBackground(Color.WHITE);
            p7.setBackground(Color.WHITE);
            p8.setBackground(Color.WHITE);
            next.setEnabled(false); //user can't click on next twice
            this.setVisible(true);
        }
     /* if the user chose online,
       label " where" will appear and textfield to write where*/
    if(e.getSource()==onlineButton){
            where.setText("where?");
            offlineButton.setEnabled(false);//user can't choose offline 
            base.add(p8);
            where.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
            base.add(pnext1);
            pnext1.setBackground(Color.white);

    }
             /* if the user chose offline,
               label " where" will appear and textfield to write where*/
         else if(e.getSource()==offlineButton){
                 where.setText("where?");
                 where.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
                 onlineButton.setEnabled(false);//user can't choose online
                 base.add(p8);
                 base.add(pnext1);
                 pnext1.setBackground(Color.white);
            }
     // when user click next,the rating part and scrollbar will appear  
     if(e.getSource()==next1){
             base.add(ratep);
             //scrollbar
             scroll=new JScrollPane(base);
             this.add(scroll);
             scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
             scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
             this.getContentPane(); 
             this.getContentPane().add(scroll);
             scroll.setSize(20, 100);
             
             ratep.setBackground(Color.WHITE);
             pra1.setBackground(Color.WHITE);
             pra2.setBackground(Color.WHITE);
             pra3.setBackground(Color.white);
             pres.setBackground(Color.white);
             pnext3.setBackground(Color.white);
             
             base.add(pnext3);
             next1.setEnabled(false);
             this.setVisible(true);
        }
     // when user click next,the objectives part will appear
       if (e.getSource()==next3){
             base.add(panel);
             next3.setEnabled(false);
             panel.setBackground(Color.white);
             base.add(pnext2);
             pnext2.setBackground(Color.white);
 
  }
    // when user click next,the speakers part will appear
   if (e.getSource()==next2){
         base.add(jPanel);
         next2.setEnabled(false);
}
   /* after choosing speakers number, 
   text fields and labels will appear, they number will be the same chosen number */
   if(e.getSource()==nextButton) {

      int o= (int) cb.getSelectedItem();
      nextButton.setEnabled(false);
      next4.setVisible(true);
      jPanel1.setVisible(false);
          // JPanel bb ;
          for(int IEEE_logo=1; IEEE_logo<=o; IEEE_logo++) {
              speaker2 =new JTextField(20);
              speaker2.setFont(new Font("Arial", Font.PLAIN, 30));
              speaker2.setBackground(Color.white);
              
              JPanel bb=new JPanel();
              bb.setLayout(new FlowLayout(10,10,10));
              
              JLabel sp=new JLabel();
              sp.setBackground(Color.white);
              sp.setText("Enter Speaker name "+ IEEE_logo +" : ");
              sp.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
            
              bb.add(sp);
              bb.add(speaker2);
          
              jPanel.add(bb);
              jPanel.setBackground(Color.white);

          }
            jPanel.add(next4);
            
        }
//        else { super.dispose(); }
  
     
    // when user click next,the banner and post part will appear    
   if(e.getSource()==next4){
        next4.setEnabled(false);
        base.add(ppost);
        base.add(pimage);
        postArea.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
        base.add(next5p);
             
        }
         
   /* when user press on select button, 
   file dialog will appear
    */
  if (e.getSource()==select){             
          fd.show();  
          /* if user didn't select image,
          "You have not select" massege will appear*/
          if (fd.getFile() == null)  
          {  
           Label1.setText("You have not select");  
          } else  
               /*  image selected,
          "Selected successfully" massege will appear*/
          {  
            Label1.setText("Selected successfully");
           String d = (fd.getDirectory() + fd.getFile());  
           Toolkit toolkit = Toolkit.getDefaultToolkit();  
           Image1 = toolkit.getImage(d);  
//   Canvas1.setImage(Image1);  
//   Canvas1.repaint();  
  }  }
       // when user click next,the speakers part will appear
   if (e.getSource()==next5){
         base.add(feedbackp);
         base.add(DOWNLOADP);
         next5.setEnabled(false);
} 
   String s=feedback_field.getText();  
        if(s==null){}  
        else{  
            try{  
            URL u=new URL(s);  
            URLConnection uc=u.openConnection();  
          
            InputStream is=uc.getInputStream();  
            int i;  
            StringBuilder sb=new StringBuilder();  
            while((i=is.read())!=-1){  
                sb.append((char)i);  
            }  
              
            }catch(Exception ex){System.out.println(e);}  
        }  
    
    
    
    
    
    
    
    
    }   
  {  
  
    class imageLoad extends Canvas  
    {  
     Image img;  
     public imageLoad(Image img)  
     {  
      this.img = img;  
     }  
     public void paint(Graphics g)  
     {  
      if (img != null)  
      {  
       g.drawImage(img, 100, 400, this);  
      }  
     }  
     public void setImage(Image img)  
     {  
      this.img = img;  
     }  

     public void windowClosing(WindowEvent e)  
     {  
      System.exit(0);  
     }  
     public void windowActivated(WindowEvent e)  
     {  
     }  
     public void windowClosed(WindowEvent e)  
     {  
     }  
     public void windowDeactivated(WindowEvent e)  
     {  
     }  
     public void windowDeiconified(WindowEvent e)  
     {  
     }  
     public void windowIconified(WindowEvent e)  
     {  
     }  
     public void windowOpened(WindowEvent e) 

     { 
     }  
 
 }
}
  }
