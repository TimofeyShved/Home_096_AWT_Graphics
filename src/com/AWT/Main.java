package com.AWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Arc2D;
import java.awt.geom.CubicCurve2D;

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
        setSize(800,400); // размеры
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
        g2.draw(arc); // прорисовка Arc2D
        g2.setColor(Color.red);
        g2.fill(arc); // заливка
        g2.setColor(Color.black);

        CubicCurve2D сubicCurve2D = new CubicCurve2D.Float(); // ------------------------------ создание CubicCurve2D
        сubicCurve2D.setCurve(250F,270F,320F,220F,340F,170F,370F,230F); // размеры
        g2.draw (сubicCurve2D); // прорисовка CubicCurve2D

        Font font = new Font("Serif", Font.PLAIN, 24);// шрифт
        g2.setFont(font);

        // наши заголовки
        g.drawString("Фигуры:", 50, 70);
        g2.drawString("Arc2D.PIE", 100, 120);
        g2.drawString("CubicCurve2D.PIE", 250, 120);
    }
}
