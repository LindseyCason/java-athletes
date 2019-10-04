package com.lambdaschool.solution;

public class MyApplication implements Processor
{
    private AthleteCreation athleteCreation;
    public MyApplication(AthleteCreation athleteCreation){this.athleteCreation = athleteCreation;}

    @Override
    public void displayAthlete()
    {
        System.out.println("************");
        athleteCreation.displayAthlete();
        System.out.println("************");

    }

}
