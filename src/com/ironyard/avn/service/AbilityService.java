package com.ironyard.avn.service;

import com.ironyard.avn.data.players.Ability;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sam on 9/12/16.
 */
public class AbilityService {
    public List<Ability> getAllAbilities(){

        List<Ability> allAbilities = new ArrayList<>();
        allAbilities.add(new invisibility());
        allAbilities.add(new speed());
        return allAbilities;

    }

   

    private class invisibility extends Ability {
        @Override
        public String getAbility() {
            return invisibility;
        }
    }

    private class speed extends Ability {
        @Override
        public String getAbility() {
            return speed;
        }
    }
}


