package com.epam.getmans;

import com.epam.Wealth;
import com.epam.company.Campaign;

/**
 * Created by Maksym_Mazurkevych on 3/29/2016.
 */
public class Getman {

    private String name;

    public Campaign getCampaign() {
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

    private Campaign campaign;

    public Getman(String name) {
        this.name = name;
    }

    public Wealth GoToCampaign() throws Exception{
        System.out.println("Гетьман пошел в поход");
        return campaign.GoToCampaign();
    }

}
