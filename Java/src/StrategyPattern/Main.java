package StrategyPattern;

public class Main {
    public static void main(String[]args){

    GameCharacter character = new GameCharacter();

    character.attack();

    character.setWeapon(new Knife());
    character.attack();

    character.setWeapon(new Sword());
    character.attack();

    //무기 추가하는데 굉장히 효율적이다.
    //알고리즘이 추가되어도 유지보수가 어렵지 않다.
    character.setWeapon(new Ax());
    character.attack();

    }
}

