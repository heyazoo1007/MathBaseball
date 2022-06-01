import java.util.ArrayList;

public class Print {

    private FindStrike findStrike;
    private FindBall findBall;

    public String finalPrint(int[] answer,int[] visit, Round round){
        int strike= findStrike.findStrike(answer, round,visit);
        int ball= findBall.findBall(answer, visit, round);
        return "스트라이크: "+strike +"볼: "+ball;
    }
}
