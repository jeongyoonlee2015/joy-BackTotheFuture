package StrategyPattern;

public class GameCharacter {

    //접근점-추상적인 접근점을 만든다.
    private Weapon weapon;

    //교환가능하도록 만든다
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    //왜 만드는가? 기능을 사용하고자 만든다.
    public void attack(){
        if(weapon == null){
            System.out.println("맨손공격");
        }else{
            //델리게이트
            weapon.attack();
        }
    }
}

