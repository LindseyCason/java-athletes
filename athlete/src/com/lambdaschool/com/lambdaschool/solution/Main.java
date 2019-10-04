package com.lambdaschool.solution;

//import solution.AthleteCreationInjector;
//import solution.Processor;
//I DON'T THINK I NEED THESE IMPORTS, MUST NEED TO EXTEND
public class Main
{
    public static void main(String[] args)
    {
        AthleteCreationInjector injector;
        Processor app;

        // Create a Track Athlete
        injector = new TrackAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();

        // Create a Hockey Athlete
        injector = new HockyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();


        // Create a Rugby Athlete
        injector = new RugbyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();

        // Create a Baseball Athlete
        injector = new BaseballAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();

    }
}
