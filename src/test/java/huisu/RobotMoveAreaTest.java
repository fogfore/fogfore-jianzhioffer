package huisu;

import org.junit.Test;

public class RobotMoveAreaTest {
    @Test
    public void testGetTotalNum() {
        RobotMoveArea robotMoveArea = new RobotMoveArea();
        int totalNum = robotMoveArea.getTotalNum(new int[5][7], 6);
        System.out.println(totalNum);
    }
}
