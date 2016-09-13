package com.ironyard.avn;

import com.ironyard.avn.data.players.Ability;
import com.ironyard.avn.data.players.Player;
import com.ironyard.avn.service.AbilityService;
import com.ironyard.avn.service.PlayerService;
import com.ironyard.avn.service.UserInputService;

import java.util.List;

/**
 * Created by reeva on 9/12/16.
 */
public class Game
{
    /**
     * This is how you run my cool game!
     * @param args not used
     */
    public static void main(String[] args) {
        // print out game intro
        System.out.println("Welcome to my game.");
        System.out.println("Rules go here haha.");

        //player selection
        Player playerOne = null;
        PlayerService pService = new PlayerService();
        UserInputService uiService = new UserInputService();

        List<Player> allPlayers = pService.getAllPlayers();
        playerOne = uiService.choosePlayer(allPlayers);


        System.out.println("Congrats! You are a " + playerOne);


        //abilities selection
        Ability a1 = null;
        AbilityService aService = new AbilityService();



        List<Ability> allAbilities = aService.getAllAbilites();
        a1 = uiService.chooseAbility(allAbilities);


        System.out.println("Congrats! You chose  " + a1);

    }
}