package com.btcag.bootcamp;

public class MovePlayer {
    static public long[] movePlayer(long relX, long relY, long[] playerPos, long[] playfieldSize) {
        long x = playerPos[0] + relX;
        long y = playerPos[1] + relY;
        if (x >= 0 && y >= 0 && x < playfieldSize[0] && y < playfieldSize[1]) {
            return new long[] {x, y};
        } else {
            return playerPos;
        }
    }
}
