# Графика
-------------------------------------
# Arc2D

Вступление:
Класс Arc2D является суперклассом для всех объектов, которые хранят двумерную дугу, определяемую рамочным прямоугольником, начальным углом, угловой протяженностью (длиной дуги) и типом замыкания (OPEN, CHORD или PIE).

Объявление класса
Ниже приводится объявление класса java.awt.Arc2D :
------------------------

public abstract class Arc2D

   extends RectangularShape
----------------------------
Поле
Ниже приведены поля для класса java.awt.geom.Arc2D :

static int CHORD - Тип замыкания для дуги, замкнутой путем рисования сегмента прямой линии от начала сегмента дуги до конца сегмента дуги.

static int OPEN - Тип замыкания для открытой дуги без сегментов пути, соединяющих два конца сегмента дуги.

static int PIE - тип замыкания для дуги, замкнутой путем рисования отрезков прямой линии от начала сегмента дуги до центра полного эллипса и от этой точки до конца сегмента дуги.

-------------------------------------
# CubicCurve2D

Вступление
Класс CubicCurve2D устанавливает сегмент кубической параметрической кривой в координатном пространстве (x, y).

Объявление класса
Ниже приводится объявление класса java.awt.geom.CubicCurve2D :
------------------------

public abstract class CubicCurve2D
   extends Object
      implements Shape, Cloneable
      
-------------------------------------
# Ellipse2D

Вступление
Класс Ellipse2D определяет эллипс, который определяется обрамляющим прямоугольником.

Объявление класса
Ниже приводится объявление класса java.awt.geom.Ellipse2D :
------------------------

public abstract class Ellipse2D
   extends RectangularShape
 
-------------------------------------
# Ellipse2D

Вступление
Класс Ellipse2D определяет эллипс, который определяется обрамляющим прямоугольником.

Объявление класса
Ниже приводится объявление класса java.awt.geom.Ellipse2D :
------------------------

public abstract class Ellipse2D
   extends RectangularShape
 
-------------------------------------
# Rectangle2D

Вступление
Класс Rectangle2D определяет прямоугольник, определяемый местоположением (x, y) и размером (wxh).

Объявление класса
Ниже приводится объявление класса java.awt.geom.Rectangle2D :
------------------------

public abstract class Rectangle2D
   extends RectangularShape
 
-------------------------------------
# Line2D 

Вступление
Класс Line2D устанавливает сегмент линии в координатном пространстве (x, y).

Объявление класса
Ниже приводится объявление класса java.awt.geom.Line2D :
------------------------

public abstract class Line2D
   extends Object
      implements Shape, Cloneable
 
-------------------------------------
# Font  

Вступление
Класс Font устанавливает шрифты, которые используются для визуализации текста видимым образом.

Объявление класса
Ниже приводится объявление класса java.awt.Font :
------------------------

public class Font
   extends Object
      implements Serializable
 
-------------------------------------
# Color 

Вступление
Класс Color устанавливает цвета в цветовом пространстве sRGB по умолчанию или цвета в произвольных цветовых пространствах, идентифицированных ColorSpace.

Объявление класса
Ниже приводится объявление класса java.awt.Color:

------------------------

public class Color
   extends Object
      implements Paint, Serializable
      
------------------------