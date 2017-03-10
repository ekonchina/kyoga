package ekonchina.kyoga;

import android.os.CountDownTimer;

/**
 * Created by cat on 08.03.2017.
 */

public class Timer {
    public void startTimer(){
        int oneMinitute = 1;
        CountDownTimer countDownTimer = new CountDownTimer(oneMinitute*1000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {

            }
        }.start();
    }
}
