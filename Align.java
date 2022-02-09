package ghjkl;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Align extends JFrame
{
        JCheckBox snapToGrid, showGrid;
    JLabel xLabel, yLabel;
    JTextField xField, yField;
    JButton ok, cancel, help;
    public Align()
        {
             
                Container container = getContentPane();

                snapToGrid = new JCheckBox("Snap to Grid");
        showGrid = new JCheckBox("Show Grid");

        xLabel = new JLabel("X:");
        yLabel = new JLabel("Y:");
        xField = new JTextField(3);
        yField = new JTextField(3);

        ok = new JButton("OK");
        cancel = new JButton("Cancel");
        help = new JButton("Help");

        Box box1 = Box.createVerticalBox();

        Box box2 = Box.createVerticalBox();
        JPanel xPanel = new JPanel();
        JPanel yPanel = new JPanel();

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1,5,5));

        xPanel.setLayout(new FlowLayout());
        yPanel.setLayout(new FlowLayout());
        xPanel.add(xLabel);
        xPanel.add(xField);
        yPanel.add(yLabel);
        yPanel.add(yField);

        box1.add(snapToGrid);
        box1.add(showGrid);

        box2.add(xPanel);
        box2.add(yPanel);

        buttonPanel.add(ok);
        buttonPanel.add(cancel);
        buttonPanel.add(help);
        
        container.setLayout(new FlowLayout());
        container.add(box1);
        container.add(box2);
        container.add(buttonPanel);

                setSize(300, 135);
                setVisible(true);
        }

        public static void main(String args[])
        {
                Align window = new Align();
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}