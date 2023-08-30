package br.senai.sp.jandira.game.Model;

public class Enemy {
    public String name;
    public String skin;
    private int life;

    public Enemy(){
        life = 100;
    }
   public int GetLife(){
        return life;
   }

    public void SubtrairVida(int danoEnemy) {
        life -= danoEnemy;

        if (life < 0) {
            life = 0;
                }

            }
        }


