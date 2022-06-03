public class Calculate {

    private FindAnswer findStrike;


    public void collectAnswer(int[] answer, Round round) {

        int[] nthTestNum = round.getTestNum();
        int strike = round.getStrike();
        int ball = round.getBall();

        findStrike.findStrike(answer, nthTestNum, strike, ball);


    }

}
