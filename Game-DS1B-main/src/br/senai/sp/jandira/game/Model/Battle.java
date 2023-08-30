package br.senai.sp.jandira.game.Model;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Battle {

    Scanner teclado = new Scanner(System.in);

    Scenario scenario = new Scenario();

    public void ChoiceScenario(){

        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("Escolha um Cenario: ");
        System.out.println("1- Arabia  2- Grecia  3- Los Angeles");
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

        int userScenario = teclado.nextInt();

        String scenarioBattle = scenario.Scenario(userScenario);

        System.out.println(scenarioBattle);

    }

    public void Battle(Player player, Enemy enemy) {

        while (true) {

            int lifePlayer = player.GetLife();
            int lifeEnemy = player.GetLife();

            if (lifePlayer == 0) {
                System.out.println("O vencedor é o enemy" + enemy.name);
                break;
            } else if (lifeEnemy == 0) {
                System.out.println("O vencedor é o player" + player.name);
                break;

            }

            System.out.println("-----------BATTLE-----------");
            System.out.println("Ataque Player [R] -" + player.name + "life:" + lifePlayer);
            System.out.println("Ataque Enemy [Q] -" + enemy.name + "life:" + lifeEnemy);
            System.out.println("Defesa Enemy");
            System.out.println("----------------------------");

            String attack = teclado.next();
            if (attack.equalsIgnoreCase("R")) {
                System.out.println("-----------------");
                System.out.println("  PLAYER ATACOU  ");
                System.out.println("-----------------");

                int danoPlayer = (int) (Math.random() * 20) + 1;
                int danoEnemy  = (int) (Math.random() * 20) + 1;
                int numberDefesa = teclado.nextInt();
                int chanceDefesa = (int) (Math.random()* 5) + 1;

                System.out.println("Digite um número de [1] a [5]");

                if (numberDefesa == chanceDefesa){
                    int danoReal = danoPlayer - danoEnemy;

                }

                int defesaEnemy = 0;
                int danoReal = danoEnemy - defesaEnemy;

                if (danoReal < 0){
                    danoReal = 0;
                }
                enemy.SubtrairVida(danoPlayer);

                System.out.println("O ataque foi de" + danoPlayer);
            } else if (attack.equalsIgnoreCase("Q")) {

            } else {
                System.out.println("Tecla invalida!!!");
            }


            System.out.println("-----------BATTLE-----------");
            System.out.println("Ataque Player [R] -" + player.name);
            System.out.println("Ataque Enemy [Q] -" + enemy.name);
            System.out.println("----------------------------");

            String atack = teclado.next();
            if (attack.equalsIgnoreCase("R")) {
                System.out.println("-----------------");
                System.out.println("  PLAYER ATACOU  ");
                System.out.println("-----------------");

                int danoPlayer = (int) (Math.random() * 20) + 1;
                int defesaPlayer = (int) (Math.random() * 20) + 1;

                int danoReal = danoPlayer - defesaPlayer;

                int chanceDefesa = (int) (Math.random()* 5) + 1;

                int numberDefesa = teclado.nextInt();

                if (numberDefesa == chanceDefesa) {
                    danoReal = danoPlayer - defesaPlayer;
                }

                System.out.println("Digite um número de [1] a [5]");


                if (danoReal < 0){
                    danoReal = 0;
                }
                enemy.SubtrairVida(danoPlayer);

                System.out.println("O ataque foi de" + danoPlayer);
            } else if (attack.equalsIgnoreCase("Q")) {

            } else {
                System.out.println("Tecla invalida!!!");

            }
        }
    }
}