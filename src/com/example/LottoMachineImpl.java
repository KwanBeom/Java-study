package com.example;

public class LottoMachineImpl implements LottoMachine {
    private Ball[] balls;

    @Override
    public void mix() {
        for (int i = 0; i < 10000; i++) {
            int random1 = (int) (Math.random() * MAX_BALL_COUNT);
            int random2 = (int) (Math.random() * MAX_BALL_COUNT);
            if (random1 != random2) {
                Ball tmp = balls[random1];
                balls[random1] = balls[random2];
                balls[random2] = tmp;
            }
        }
    }

    @Override
    public Ball[] getBalls() {
        Ball[] result = new Ball[RETURN_BALL_COUNT];
        System.arraycopy(balls, 0, result, 0, RETURN_BALL_COUNT);
        return result;
    }

    @Override
    public void setBalls(Ball[] balls) {
        this.balls = balls;
    }
}
