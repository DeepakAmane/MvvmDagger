// Generated by Dagger (https://dagger.dev).
package com.example.mvvmdagger;

import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PlayerRepository_Factory implements Factory<PlayerRepository> {
  private final Provider<Player> playerProvider;

  public PlayerRepository_Factory(Provider<Player> playerProvider) {
    this.playerProvider = playerProvider;
  }

  @Override
  public PlayerRepository get() {
    return new PlayerRepository(playerProvider.get());
  }

  public static PlayerRepository_Factory create(Provider<Player> playerProvider) {
    return new PlayerRepository_Factory(playerProvider);
  }

  public static PlayerRepository newInstance(Player player) {
    return new PlayerRepository(player);
  }
}
