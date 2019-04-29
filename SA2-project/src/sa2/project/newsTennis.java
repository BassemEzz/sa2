/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa2.project;

import java.util.Scanner;
import static sa2.project.SA2Project.msg;
import static sa2.project.SA2Project.s;
import static sa2.project.SA2Project.playerN;
/**
 *
 * @author vip1
 */
public abstract class newsTennis implements Strategy {
    public void addNews(String playerName)
    {
        Scanner sc5 =new Scanner(System.in);
        System.out.println("Enter the news: ");
        msg=sc5.nextLine();
        playerN=playerName;
        s.changeState(true);
    }

    
}
