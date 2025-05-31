import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StopWatch implements ActionListener {

    JFrame frame = new JFrame("Stopwatch");
    JButton startButton = new JButton("Start");
    JButton stopButton = new JButton("Stop");
    JButton resetButton = new JButton("Reset");
    JLabel timeLabel = new JLabel();

    int elapsedTime = 0;
    int seconds = 0;
    int minutes = 0;
    int hours = 0;
    boolean isRunning = false;

    Timer timer = new Timer(1000, this);

    public StopWatch() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        timeLabel.setText(formatTime(0, 0, 0));
        timeLabel.setFont(new Font("Verdana", Font.PLAIN, 30));
        timeLabel.setPreferredSize(new Dimension(250, 50));
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        startButton.setFocusable(false);
        stopButton.setFocusable(false);
        resetButton.setFocusable(false);

        startButton.addActionListener(e -> start());
        stopButton.addActionListener(e -> stop());
        resetButton.addActionListener(e -> reset());

        frame.add(timeLabel);
        frame.add(startButton);
        frame.add(stopButton);
        frame.add(resetButton);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        elapsedTime += 1000;
        hours = elapsedTime / 3600000;
        minutes = (elapsedTime / 60000) % 60;
        seconds = (elapsedTime / 1000) % 60;

        timeLabel.setText(formatTime(hours, minutes, seconds));
    }

    public void start() {
        if (!isRunning) {
            timer.start();
            isRunning = true;
        }
    }

    public void stop() {
        if (isRunning) {
            timer.stop();
            isRunning = false;
        }
    }

    public void reset() {
        timer.stop();
        isRunning = false;
        elapsedTime = 0;
        seconds = 0;
        minutes = 0;
        hours = 0;
        timeLabel.setText(formatTime(0, 0, 0));
    }

    private String formatTime(int hrs, int mins, int secs) {
        return String.format("%02d:%02d:%02d", hrs, mins, secs);
    }

    public static void main(String[] args) {
        new StopWatch();
    }
}
