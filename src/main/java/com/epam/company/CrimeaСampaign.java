package com.epam.company;

import com.epam.Wealth;

/**
 * Created by Maksym_Mazurkevych on 3/29/2016.
 */
public class CrimeaСampaign implements Campaign{

    Wealth b;
    private Wealth booWealth;

    public Wealth GoToCampaign(){
        prepare();
        comeTo();
        winTheBattle();
        b = takeWealth();
        return b;
    }

    public Wealth takeWealth() {
        return booWealth;
    }

    public void winTheBattle() {
    }

    public void comeTo() {
    }

    public void prepare() {
    }

}
