/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa2.project;

import java.util.*;
import static sa2.project.SA2Project.msg;
import static sa2.project.SA2Project.playerN;

/**
 *
 * @author vip1
 */
public class Sport implements Subject {
    private String name;
    private String state;
    private List<Observer> observerlist;
    public Sport(String name)
    {
        this.name=name;
        this.observerlist=new ArrayList<>();
    }
    
    @Override
    public void add(Observer o) {
        observerlist.add(o);
    }

    @Override
    public void remove(Observer o) {
        observerlist.remove(o);
    }

    @Override
    public void notifyallObservers() {
        for(Observer ob: observerlist)
        {
            ob.update(state);
        }
    }
    
    public void changeState(boolean s)
    {
        state=this.name+(s?" Available "+msg+" about player: "+playerN :" Not Available");
        notifyallObservers();
    }
    
    public String getSportName()
    {
        return name;
    }
    public List<Observer> getallObs()
    {
        return observerlist;
    }
}
