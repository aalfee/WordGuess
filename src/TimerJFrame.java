package src;

import java.awt.*;
import javax.swing.*;

// the timer starts with an initial number of seconds to go then
// displays the seconds remainting
// decreases the seconds remaining by 1
// sleeps 1 second 


public class TimerJFrame extends JFrame implements Runnable {
  private int secondsRemaining; 
  private TextArea text = new TextArea();
  public TimerJFrame (int seconds, int row, int col) {
    secondsRemaining = seconds; 
    setTitle("Time Remaining ..." );
    setSize(150,150);
    setLocation (row, col); 
    Container cp = getContentPane(); 
    text.setFont(new Font("Serif", 5, 72));
    cp.add(text);
    text.append(Integer.toString(secondsRemaining));
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    Thread timer = new Thread(this); 
    timer.start(); 
  }
  public void run() {
    System.out.println( "The game has started..");
    while(secondsRemaining > 0){
      try {
        Thread.sleep(1000);         // (.sleep) puts the thread to sleep for 1000 miliseconds or 1 second
        secondsRemaining--; 
        text.setText(Integer.toString(secondsRemaining));
        setVisible(true);
      }
        catch (InterruptedException ie){
          System.out.println("Timer is interrupted");
        }
    }
        JOptionPane.showMessageDialog(null, "Time is up!");             // Wakes up after waiting
        System.exit(0);
  }
  /*public static void main(String[] args) {
    //TimerJFrame tjf1 = new TimerJFrame(5, 100, 200); 
    TimerJFrame tjf2 = new TimerJFrame(25, 650, 350);
    //TimerJFrame tjf3 = new TimerJFrame(30, 1290, 690);
  }*/
}
