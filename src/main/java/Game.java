//요구사항
//숫자는 4자리, 숫자 중복 없음
//정답 숫자, 기회 몇번이 주어짐
//기회만큼 테스트 숫자를 입력할 수 있음
//매번 테스트 숫자를 입력할 때,
// 1. 숫자&위치 일치 여부 확인 후 strike 적립
// 2. 1이 끝나고, 1에 속하지 않는 수 중에(visit==0) 수만 일치하는 거 확인 후 ball 적립

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Game {

    private int[] answer= new int[4];
    private Calculate calculate;
    private int chances;
    private Print print;


    public String wholeRound(Round ... rounds){
        for (Round round : rounds) {
            calculate.collectAnswer(answer,round);
        }
        return "0";
    }

}
