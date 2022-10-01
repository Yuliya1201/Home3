package com.javacourse.se.home3;

public class Main {
    public static void main(String[] args) {
        var dog=8;
        System.out.println(dog);
        var cat=3.6;
        System.out.println(cat);
        var paper=763789;
        System.out.println(paper);
        dog=dog+4;
        System.out.println(dog);
        cat=cat+4;
        System.out.println(cat);
        paper=paper+4;
        System.out.println(paper);
        cat=cat-1.6;
        System.out.println(cat);
        dog=dog-3;
        System.out.println(dog);
        paper=paper-7639;
        System.out.println(paper);
        var friend=19;
        System.out.println(friend);
        friend=friend*2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);
        var boxer1=78.2;
        System.out.println(boxer1);
        var boxerweight1=78.2;
        var boxerweight2=82.7;
        var boxerweight=boxerweight1+boxerweight2;
        System.out.println("Общий вес спортсменов "+boxerweight);
        var boxerweightA=78.2;
        var boxerweightS=82.7;
        var boxerweightAS=boxerweightS-boxerweightA;
        System.out.println("Разница между весами "+boxerweightAS);
        var overload=(boxerweightA+boxerweightS)%boxerweightAS;
        System.out.println("Разница на "+overload+"кг!");
        var worktime=640;
        var everyWorker=8;
        var workers=worktime/everyWorker;
        System.out.println("Всего работников в компании "+workers);
        workers=workers+94;
        System.out.println(workers);
        everyWorker=worktime/workers;
        System.out.println("Если в компании работает 174человек,то всего часов работы может быть поделено между сотрудниками "+everyWorker );




    }
}
