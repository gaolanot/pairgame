package com.poderosasqueinspiran.pairgame.game;

public enum GameLevel {
    LEVEL_1(8),
    LEVEL_2(12),
    LEVEL_3(16),
    LEVEL_4(20),
    LEVEL_5(24),
    LEVEL_6(28),
    LEVEL_7(32),
    LEVEL_8(36),
    LEVEL_9(40),
    LEVEL_10(44),
    LEVEL_11(48),
    LEVEL_12(52);

    private final int cardCount;

    GameLevel(int cardCount){
        this.cardCount = cardCount;
    }

    public int getCardCount(){
        return cardCount;
    }
    
    /** Un par = 2 cartas iguales. Aciertos posibles = mitad de las cartas. */
    public int getPairCount(){
        return cardCount/2;
    }
}
