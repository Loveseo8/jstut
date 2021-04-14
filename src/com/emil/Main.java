package com.emil;

import com.alee.laf.WebLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaLookAndFeel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    JLabel label = new JLabel("nothing special", SwingConstants.LEADING);
    JButton button = new JButton("Click!");
    JTextField textField = new JTextField("Enter smth...", 60);

    public Main(){

        super("Smth strange...");
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));


        panel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(button.getActionCommand().equals("Click!")){

                    label.setText("OMG! You did it!!!");

                }
            }
        });


        panel.add(label);
        panel.add(textField);
        add(panel);

        setVisible(true);

    }

    private static void setLookAndFeel(){

        try {

            //"com.jtattoo.plaf.texture.TextureLookAndFeel"
            // "de.javasoft.plaf.synthetica.SyntheticaStandardLookAndFeel"
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaOrangeMetallicLookAndFeel");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        setLookAndFeel();
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

