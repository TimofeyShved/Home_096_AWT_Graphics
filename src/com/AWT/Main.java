package com.AWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.*;

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
        setSize(1200,800); // размеры
        addWindowListener(new WindowAdapter() { // действие на закрытие окна
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        Arc2D.Float arc = new Arc2D.Float(Arc2D.PIE); // ---------------------------------------- создание Arc2D
        arc.setFrame(70, 150, 150, 150);// размеры
        arc.setAngleStart(0);
        arc.setAngleExtent(145);

        Graphics2D g2 = (Graphics2D) g; // создание рисунка
        g2.setColor(Color.gray); // цвет
        g2.draw(arc); // прорисовка Arc2D
        g2.setColor(Color.red);
        g2.fill(arc); // заливка
        g2.setColor(Color.black);

        CubicCurve2D сubicCurve2D = new CubicCurve2D.Float(); // ------------------------------ создание CubicCurve2D
        сubicCurve2D.setCurve(250F,170F,320F,220F,340F,150F,400F,180F); // размеры
        g2.draw (сubicCurve2D); // прорисовка CubicCurve2D

        Ellipse2D ellipse2D = new Ellipse2D.Float(); // ---------------------------------------- создание Ellipse2D
        ellipse2D.setFrame(470, 150, 100,100); // размеры
        g2.draw (ellipse2D); // прорисовка Ellipse2D

        Rectangle2D rectangle2D = new Rectangle2D.Float();// ---------------------------------------- создание Rectangle2D
        rectangle2D.setFrame(650, 150, 100,100);  // размеры
        g2.draw (rectangle2D); // прорисовка Rectangle2D

        RoundRectangle2D rectangle2D2 = new RoundRectangle2D.Double();// ----------------------------- создание RoundRectangle2D
        rectangle2D2.setRoundRect(850, 150, 100,100, 100, 35);  // размеры
        g2.draw (rectangle2D2); // прорисовка Rectangle2D

        Line2D line = new Line2D.Double();// ---------------------------------------------------------- создание Line2D
        line.setLine(100,320,200,350);// размеры
        g2.draw (line); // прорисовка Line2D

        Font plainFont = new Font("Serif", Font.PLAIN, 24); // ---------------------------- создание Font
        g2.setFont(plainFont);
        g2.drawString("Font PLAIN", 250, 300);
        Font italicFont = new Font("Serif", Font.ITALIC, 24);
        g2.setFont(italicFont);
        g2.drawString("Font ITALIC", 250, 325);
        Font boldFont = new Font("Serif", Font.BOLD, 24);
        g2.setFont(boldFont);
        g2.drawString("Fon BOLD", 250, 350);
        Font boldItalicFont = new Font("Serif", Font.BOLD+Font.ITALIC, 24);
        g2.setFont(boldItalicFont);
        g2.drawString("BOLD + ITALIC", 250, 375);

        g2.setColor(Color.red); // ---------------------------------------- установка цвета - Color
        g2.drawString("Color.red", 470, 325);
        g2.setColor(Color.green);
        g2.drawString("Color.green", 470, 350);
        g2.setColor(Color.getHSBColor(2,2,2));
        g2.drawString("Color.getHSBColor(2,2,2)", 470, 375);

        Font font = new Font("Serif", Font.PLAIN, 24);// шрифт
        g2.setFont(font);

        // наши заголовки
        g2.setColor(Color.black);
        g.drawString("Фигуры:", 50, 70);
        g2.drawString("Arc2D.PIE", 100, 120);
        g2.drawString("CubicCurve2D.PIE", 250, 120);
        g2.drawString("Ellipse2D.PIE", 475, 120);
        g2.drawString("Rectangle2D.PIE", 650, 120);
        g2.drawString("Line2D.PIE", 100, 300);
        g2.drawString("Color", 470, 300);

        //-------------------------------------------------------------------------------Area-----------------------------------------------------------

        g.drawString("Area:", 50, 450);

        Area area1 = new Area( //создание Area
                new Rectangle2D.Double(50, 500, 100, 100)  // размеры
        );
        area1.add(new Area(new Ellipse2D.Double(100, 550, 100, 100)));// размеры
        g2.draw (area1); // прорисовка Area

    }
}
