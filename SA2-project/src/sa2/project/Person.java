/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa2.project;

import static sa2.project.SA2Project.playerN;

/**
 *
 * @author vip1
 */
public class Person implements Observer {
    private String name;
    public Person(String name)
    {
        this.name=name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name+" got new notification : "+" "+msg);
    }
    public String getPersonName()
    {
        return name;
    }
}
