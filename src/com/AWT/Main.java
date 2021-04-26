package com.AWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Arc2D;

public class Main extends Frame {

    public Main(){
        super("Java AWT Graphics"); // вызов фрейма от которого наследуем
        prepareGUI(); // вызов функции
    }

    public static void main(String[] args){
        Main  mainGraphics = new Main(); // созданиеп нашего Main
        mainGraphics.setVisible(true); // делаем окно выидимым
    }

    private void prepareGUI(){
        setSize(400,400); // размеры
        addWindowListener(new WindowAdapter() { // действие на закрытие окна
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        Arc2D.Float arc = new Arc2D.Float(Arc2D.PIE); // ------------------------------ создание Arc2D
        arc.setFrame(70, 200, 150, 150);// размеры
        arc.setAngleStart(0);
        arc.setAngleExtent(145);

        Graphics2D g2 = (Graphics2D) g; // создание рисунка
        g2.setColor(Color.gray); // цвет
        g2.draw(arc); // граница
        g2.setColor(Color.red);
        g2.fill(arc); // заливка
        g2.setColor(Color.black);

        Font font = new Font("Serif", Font.PLAIN, 24);// шрифт
        g2.setFont(font);
        
        // наши заголовки
        g.drawString("Фигуры:", 50, 70);
        g2.drawString("Arc2D.PIE", 100, 120);
    }
}
