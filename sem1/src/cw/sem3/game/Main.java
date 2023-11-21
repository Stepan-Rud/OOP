package cw.sem3.game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu.printUserMenu();
        NumberGame numberGame = new NumberGame();
        numberGame.start(4,6);
        Scanner scanner = new Scanner(System.in);
//        String vallue = scanner.nextLine();
        while (numberGame.getGameStatus().equals(GameStatus.ACTIVE)){
            Answer answer = numberGame.inputValue(scanner.nextLine());
//            numberGame.getMoveHistory().add(vallue);
            System.out.println("answer = " + answer);
        }
        if (numberGame.getGameStatus().equals(GameStatus.WIN)){
            System.out.println("Вы победили");
        }
        else System.out.println("Вы проиграли");
        System.out.println(numberGame.getMoveHistory());
    }
}
