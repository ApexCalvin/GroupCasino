package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.Player;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.casinoaccount.CasinoAccount;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsPlayer extends Player implements PlayerInterface {
    @Override
    public CasinoAccount getCasinoAccount() {
        return null;
    }

    @Override
    public <SomeReturnType> SomeReturnType play() {
        return null;
    }
}