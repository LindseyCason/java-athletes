package com.lambdaschool.solution;

public class HockyAthleteCreationInjector implements AthleteCreationInjector
{
    @Override
    public Processor getProcess()
    {
        return new MyApplication(new HockyAthleteImpl());
    }
}