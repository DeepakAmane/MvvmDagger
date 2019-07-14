package com.example.mvvmdagger;

import androidx.lifecycle.MutableLiveData;

import javax.inject.Inject;

public class PlayerRepository {

    private MutableLiveData<Player> playerMutableLiveData = new MutableLiveData<>();

    private Player player;

    
    @Inject
    public PlayerRepository(Player player) {
        this.player = player;
    }

    public MutableLiveData<Player> getPlayerMutableLiveData() {
        playerMutableLiveData.setValue(player);
        return playerMutableLiveData;
    }
}
