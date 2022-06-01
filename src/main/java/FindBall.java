import java.lang.reflect.Array;
import java.util.ArrayList;

public class FindBall {


    public int findBall(int[] answer, int[] visit, Round round){

        int[] nthTestNum = round.getTestNum();
        int ball = round.getBall();

        for (int i=0; i<4; i++){
            for( int j=0; j<4 ;j++){
                if (answer[i]==nthTestNum[j] && visit[i]==0){
                    ball+=1;
                    visit[i]=1;
                }
            }

        }

        return ball;
    }
}
