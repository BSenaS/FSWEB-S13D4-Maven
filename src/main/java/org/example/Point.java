package org.example;
//org.example paketi altında Point isimli bir sınıf tanımlayınız. +
//Sınıfın 2 tane değişkeni olmalı x ve y ikisinin de değeri int olmalı. +
//Bu iki değişkene sadece bu sınıf içerisinden erişilebilinmeli. +  -> instance variablelar priv olacak
//Point sınıfı için bir adet constructor tanımlayınız. İki değeri de set edebilmeli. -> +
//İlgili iki değişken için getter ve setter metodlarını tanımlayınız. +
//Point sınıfı içerisinde bir tane distance isminde metod tanımlayınız.
//distance metodu iki nokta arasındaki uzaklığı bulmaya yarar.
//Bu işlemin matematiksel olarak yapımı: √ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA) şeklindedir.
//√ işlemi karekök işlemini tanımlar. Math.sqrt bu işlem için kullanılmalıdır.
//distance metodu için 3 farklı overloading istenmektedir
//distance() hiçbir değer almazsa (0,0) noktasına göre uzaklık hesaplanmalı.
//distance(Point p) şeklinde başka bir Point objesi alırsa verilen noktaya göre uzaklık hesaplanmalı.
//distance(int a, int b) şeklinde 2 farklı int parametresi alınırsa (a,b) ye göre uzaklık bulunmalı.
public class Point {
    //Sınıfın 2 tane değişkeni olmalı x ve y -> int. (Bu 2 değişkene sadece bu sınıf içerisinden erişilebilmeli.)
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    //Bu işlemin matematiksel olarak yapımı: √ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA) şeklindedir.
    //√ işlemi karekök işlemini tanımlar. Math.sqrt bu işlem için kullanılmalıdır.
    //0,0 Noktası için hesaplama , herhangi bir parametre olmadıgı kosulda.
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    //distance(Point p) şeklinde başka bir Point objesi alırsa verilen noktaya göre uzaklık hesaplanmalı.
    public double distance(Point p) {
        int deltaX = this.x - p.getX();
        int deltaY = this.y - p.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
    //distance(int a, int b) şeklinde 2 farklı int parametresi alınırsa (a,b) ye göre uzaklık bulunmalı.
    public double distance(int a, int b) {
        int deltaX = this.x - a;
        int deltaY = this.y - b;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    };


}
