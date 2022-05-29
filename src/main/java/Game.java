//요구사항
//숫자는 4자리, 숫자 중복 없음
//정답 숫자, 기회 몇번이 주어짐
//기회만큼 테스트 숫자를 입력할 수 있음
//매번 테스트 숫자를 입력할 때,
// 1. 숫자&위치 일치 여부 확인 후 strike 적립
// 2. 1이 끝나고, 1에 속하지 않는 수 중에(visit==0) 수만 일치하는 거 확인 후 ball 적립

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Game {

    private int answer ;
    private int chances;
    private int testNum;
    private int strike=0;
    private int ball=0;

    int[] digits1 = Stream.of(String.valueOf(answer).split("")).mapToInt(Integer::parseInt).toArray();
    int[] digits2 = Stream.of(String.valueOf(testNum).split("")).mapToInt(Integer::parseInt).toArray();
    private int[] visit= new int[4]; //길이 4인 0 리스트

    public String mathBaseball(int[] digits1,int[] digits2,int chances) {
        for (int i = 0; i < chances; i++) {
                for (int j = 0; j < 4; j++) {

                    if (digits1[i] == digits2[i]) {
                        strike += 1;
                        visit[i] = 1;

                    if (digits1[i] == digits2[j] && visit[i] == 0) {
                        ball += 1;
                        visit[i] = 1;
                    }
                }
            }
        }
        String name = "스트라이크: " + strike + "볼: " + ball; //이렇게 하면 매번 테스트마다 출력을 못함
        return name;

    }
}
