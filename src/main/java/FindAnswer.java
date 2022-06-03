import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindAnswer {

    private Print print;

    protected int[] findStrike(int[] answer,int[] nthTestNum, int strike, int ball){

        int[] visit= new int[4];
        for (int i = 0; i < 4; i++) {
            if (answer[i] == nthTestNum[i]){
                strike+=1;
                visit[i]=1;
            }
            for( int j=0; j<4 ;j++){
                if (answer[i]==nthTestNum[j] && visit[i]==0){
                    ball+=1;
                    visit[i]=1;
                }
            }
        }
        return print.printAnswer(strike,ball);
    }
}
