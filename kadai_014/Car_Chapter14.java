
package kadai_014;

public class Car_Chapter14 {

    private int gear  = 1;
    private int speed = 30;

    // コンストラクタ（初期化処理）
    public Car_Chapter14(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    // 【メソッド】ギアをチェンジする
    public void gearChange(final int afterGear) {
        if (afterGear >= 1 && afterGear <= 5) {
            speed = afterGear * 10;
            System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
            gear = afterGear;
        } else {
            System.out.println(afterGear + "はギアとして使用できません");
        }
    }

    public void run() {
        System.out.println("速度は時速" + this.speed + "kmです");
    }
}
