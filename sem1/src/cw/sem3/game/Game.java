package cw.sem3.game;

public interface Game {
//    должны быть описаны сигнатуры методов start, inputValue,getGameStatus
    void start(Integer sizeWorld, Integer maxTry);
    Answer inputValue(String value);
    GameStatus getGameStatus();
}
