import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class GameGui extends JFrame {
    JButton buttons[][];
    JPanel game,southNerdPanel,northNerdPanel;
    JButton southNerd,northNerd;
    GameGui(){
        this.setLayout(new BorderLayout());
        game=new JPanel(new GridLayout(15,15));
        buttons=new JButton[15][15];
        for(int i=0;i<15;i++){
            for(int j=0;j<15;j++){
                buttons[i][j]=new JButton();
                if((i==7 && j>=1 && j<=5) || (i==6 && j==1)) buttons[i][j].setBackground(Color.red);
                else if((i==7 && j>=9 && j<=13) || (i==8 && j==13)) buttons[i][j].setBackground(Color.YELLOW);
                else if((j==7 && i>=1 && i<=5) || (i==1 && j==8)) buttons[i][j].setBackground(Color.green);
                else if((j==7 && i>=9 && i<=13) || (i==13 && j==6)) buttons[i][j].setBackground(Color.blue);
                    //////////////////////////////////////////////////////////////
                else if((i==1 && (j==1 || j==4)) || (i==4 &&( j==1 | j==4)) || (i==8 && j==2))buttons[i][j].setBackground(Color.red);
                else if ((i==0 && j<=5) || (i<=5 && j==0) || (i==5 && j<=5) || (i<=5 && j==5))
                    buttons[i][j].setBackground(new Color(100,0,40));
        //////////////////////////////////////////////////////////////
                else if((i==1 && (j==13 || j==10)) || (i==4 && (j==13 || j==10)) || (i==2 && j==6))buttons[i][j].setBackground(Color.green);
                else if(((i==0 || i==5) && j>=9) || (i<=5 && (j==9 || j==14)))
                    buttons[i][j].setBackground(new Color(0,100,0));
        //////////////////////////////////////////////////////////////
                else if((i==10 && (j==1 || j==4)) || (i==13 &&( j==1 || j==4)) || (i==12 && j==8))buttons[i][j].setBackground(Color.blue);
                else if ((i==14 && j<=5) || (i==9 && j<=5) || (i>=9 && j==0) || (i>=10 && j==5))
                    buttons[i][j].setBackground(new Color(40,0,100));
        //////////////////////////////////////////////////////////////
                else if((i==13 && (j==13 || j==10)) || (i==10 && (j==10 || j==13))||(i==6 && j==12))buttons[i][j].setBackground(Color.yellow);
                else if ((i==14 && j>=9) || (i==9 && j>=9) || (i>=9 && j==14) || (i>=9 && j==9))
                    buttons[i][j].setBackground(new Color(150,150,0));
        //////////////////////////////////////////////////////////////

                else if(i>=6 && i<=8 && j>=6 && j<=8) buttons[i][j].setBackground(Color.black);
                else buttons[i][j].setBackground(Color.WHITE);

                if(((i>=6 && i<=8 ) || (j>=6 && j<=8)) && !(i>=6 && i<=8 && j>=6 && j<=8) ) buttons[i][j].setBorder(new LineBorder(Color.GRAY,4));
                buttons[i][j].setFocusable(false);
                buttons[i][j].setSize(30,30);
                game.add(buttons[i][j]);

            }
        }
        game.setBounds(0,40,15*30,15*30);
        northNerdPanel=new JPanel(new FlowLayout());
        northNerdPanel.setBounds(20,0,15*30,20);
        southNerdPanel=new JPanel(new FlowLayout());
        southNerdPanel.setBounds(15*30+20,0,15*30,20);
        southNerd=new JButton();
        southNerd.setBackground(Color.white);
        southNerd.setBounds(15*15,0,20,20);
        southNerd.setSize(20,20);
        northNerd=new JButton();
        northNerd.setBackground(Color.white);
        northNerd.setSize(20,20);
            northNerdPanel.add(northNerd);
            southNerdPanel.add(southNerd);

        this.add(northNerdPanel,BorderLayout.NORTH);
        this.add(southNerdPanel,BorderLayout.SOUTH);
        this.add(game,BorderLayout.CENTER);
        this.setBounds(200,0,15*30,15*30+20*2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


    public void changeNerd(int ran,boolean x){
        switch (ran){
            case 1:
            {
                if(x==false) northNerd.setBackground(Color.white);
                else southNerd.setBackground(Color.white);
                break;
            }

            case 2:
            {
                if(x==false) northNerd.setBackground(Color.BLACK);
                else southNerd.setBackground(Color.white);
                break;
            }

            case 3: {
                if (x == false) northNerd.setBackground(Color.BLUE);
                else southNerd.setBackground(Color.white);
                break;
            }

            case 4:
            {
                if(x==false) northNerd.setBackground(Color.white);
                else southNerd.setBackground(Color.blue);
                break;
            }
            case 5:
            {
                if(x==false) northNerd.setBackground(Color.white);
                else southNerd.setBackground(Color.black);
                break;
            }
            case 6:
            {
                if(x==false) northNerd.setBackground(Color.white);
                else southNerd.setBackground(Color.pink);
                break;
            }
            default:
                break;
        }
    }
}
