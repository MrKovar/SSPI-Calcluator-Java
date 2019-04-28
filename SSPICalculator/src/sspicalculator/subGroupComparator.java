/*
Author: Cody Kovar
IDE: NetBeans IDE 8.2
School: McMurry University
Senior Honors Thesis
Creating a Framework for Voting Power

subGroupComparator.java
This file creates the subGroupComparator. This exists solely to sort the subgGroups by the
position in which they were first entered so that the output is sorted in a way that the
user recognizes.
*/

package sspicalculator;
import java.util.Comparator;

public class subGroupComparator implements Comparator<subGroup>
{
    @Override
    public int compare(subGroup sg1, subGroup sg2)
    {
        return sg1.getOGPosition() > sg2.getOGPosition() ? 1 : -1;
    }

}
