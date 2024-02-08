public class Black extends Robot {

    private boolean isOn;
    private int move;

    //@Override
    public void on() {
        if (isOn) {
            System.out.println("이미 전원이 켜져있습니다.");
        } else {
            this.isOn = true;
            System.out.println("전원이 켜져있습니다. 정상적으로 움직일 수 있습니다..");
        }

        //System.out.println("흑인로봇이 걷고 있습니다.터벅....터벅...");
    }

    public void stop() {
    }

    //@Override
    public void smile() {
        System.out.println("흑인로봇이 웃고 있습니다.하하하!하하하!");

    }

    @Override
    public void scream() {
        System.out.println("흑인로봇이 놀래고 있습니다.헉~~~~!!");
    }
}
