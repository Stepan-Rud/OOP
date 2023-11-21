package cw.sem3.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game {
    private Integer sizeWord;
    private Integer maxTry;
    private GameStatus status;
    private String word;
    private List<String> moveHistory;

    @Override
    public void start(Integer sizeWord, Integer maxTry) {
        this.sizeWord = sizeWord;
        this.maxTry = maxTry;
        this.status = GameStatus.ACTIVE;
        this.word = generateWord(sizeWord);
    }

    private String generateWord(Integer sizeWord) {
        List<String> alf = generateCharList();
        String resultWord = "";
        for (int i = 0; i < sizeWord; i++) {
            Integer index = new Random().nextInt(alf.size());
            resultWord += alf.get(index);
            alf.remove(index);
        }
        return resultWord;
    }

    protected abstract List<String> generateCharList();

    @Override
    public Answer inputValue(String value) {
        maxTry--;
        Integer countCow = 0;
        Integer countBool = 0;
        moveHistory = new ArrayList<>();
        moveHistory.add(value);
        for (int i = 0; i < value.length(); i++) {
            if (word.contains(((Character) (value.charAt(i))).toString())) {
                countCow++;
                if (((Character) (value.charAt(i))).equals(word.charAt(i))) {
                    countBool++;
                }
            }
        }
        if (countBool.equals(word.length())) {
            status = GameStatus.WIN;
            return new Answer(maxTry, countBool, countCow);
        }
        if (maxTry == 0){
            status = GameStatus.LOSE;
            return new Answer(maxTry, countBool, countCow);
        }
        return new Answer(maxTry, countBool, countCow);

    }

    @Override
    public GameStatus getGameStatus() {
        return status;
    }

    public List<String> getMoveHistory() {
//        this.moveHistory = new ArrayList<String>();
        return moveHistory;
    }
}
