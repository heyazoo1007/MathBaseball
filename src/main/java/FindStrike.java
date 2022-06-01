import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindStrike {

    private FindBall findBall;


    public int findStrike(int[] answer, Round round, int[] visit){

        //입력 받은 테스트 숫자 배열로 바꾸기
        int strike = round.getStrike();
        int ball = round.getBall();
        int[] nthTestNum = round.getTestNum();

        for (int i = 0; i < 4; i++) {
            if (answer[i] == nthTestNum[i]){
                strike+=1;
                visit[i]=1;
            }
        }
        findBall.findBall(answer,visit,round);
        return strike;
    }
}
