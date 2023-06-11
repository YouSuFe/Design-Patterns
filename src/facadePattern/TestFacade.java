package facadePattern;

import facadePattern.classes.*;

public class TestFacade {
    public static void main(String[] args) {
        System.out.println("*****************The Facade Pattern Demo*****************");
        Amplifier amp = new Amplifier();
        CdPlayer cd = new CdPlayer();
        DvdPlayer dvd = new DvdPlayer();
        PopcornPopper popper = new PopcornPopper();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();
        Tuner tuner = new Tuner();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);
        homeTheater.watchMovie("Raiders of the Lost Ark");
        System.out.println("----------------------------------------------------");
        homeTheater.endMovie();

    }
}
