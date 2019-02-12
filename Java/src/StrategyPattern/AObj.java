package StrategyPattern;

public class AObj {

    Ainterface ainterface;

    //Ainterface할당 for Maintest
    public AObj(){
        ainterface = new AinterfaceIMPLE();
    }
    public void funcAA() {
        //훨씬 더 복잡한 기능이겠지만
        ainterface.funcA();
        ainterface.funcA();
        //~기능이 필요합니다. 개발해주세요.
    }
}

