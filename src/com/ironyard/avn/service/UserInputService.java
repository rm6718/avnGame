package com.ironyard.avn.service;

import com.ironyard.avn.data.players.Ability;
import com.ironyard.avn.data.players.Player;

import java.util.List;
import java.util.Scanner;

/**
 * Created by sam on 9/12/16.
 */
public class UserInputService {

    public Player choosePlayer(List<Player> allPlayers) {
        Player playerOne = null;
        System.out.println("Please select your player type.");
        System.out.println(allPlayers);

        Scanner input = new Scanner(System.in);
        while (playerOne == null) {
            String userChoseThis = input.nextLine();
            for (Player tmp : allPlayers) {
                if (userChoseThis.equalsIgnoreCase(tmp.getType())) {
                    playerOne = tmp;
                }
            }
            if (playerOne == null) {
                System.out.println("Choose a proper type, Example [bear,lion] you type: lion.");
            }
        }
        return playerOne;
    }

    public Ability chooseAbility(List<Ability> allAbilities) {
        Ability playerOne = null;
        System.out.println("Please select your special ability.");
        System.out.println(allAbilities);

        Scanner input = new Scanner(System.in);
        while (playerOne == null) {
            String userChoseThis = input.nextLine();
            for (Ability abi : allAbilities) {
                if (userChoseThis.equalsIgnoreCase(abi.getAbility())) {
                    playerOne = abi;
                }
            }
            if (playerOne == null) {
                System.out.println("Choose a proper ability, Example [strength,weather control] you type: strength.");
            }
        }
        return playerOne;
    }
}
