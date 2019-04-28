/*
Author: Cody Kovar
IDE: NetBeans IDE 8.2
School: McMurry University
Senior Honors Thesis
Creating a Framework for Voting Power

subGroup.java
This file creates the subGroup class. This is needed so that we can store data other than
integers in the list of permutations. The subGroup is complete with all necessary variable
declarations and with all necessary accessors and mutators
*/

package sspicalculator;

public class subGroup
{
    String group_name;
    String region_name;
    double effective_voting_power;
    int population;
    int pivot_count;
    int og_position;

    public subGroup(String gn, int pop, String rn, int o)
    {
        group_name = gn;
        population = pop;
        region_name = rn;
        pivot_count = 0;
        effective_voting_power = 0.0;
        og_position = o;
    }

    subGroup isPivotVoter()
    {
        pivot_count++;
        return this;
    }

    int getPopulation()
    {
        return population;
    }

    String getGroupName()
    {
        return group_name;
    }

    int getPivotCount()
    {
        return pivot_count;
    }

    String getRegionName()
    {
        return region_name;
    }

    void setEffectiveVotingPower(double evp)
    {
        effective_voting_power = evp;
    }

    double getEffectiveVotingPower()
    {
        return effective_voting_power;
    }

    int getOGPosition()
    {
        return og_position;
    }

}
