package test03;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: Joost-Li
 * @Email:lilinpeng.ok@163.com
 * @Date: 2021/5/5-23:37
 * @Description:
 **/
public class CircleTestTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void main() {
        Circle circle1 = new Circle("red",2.0,3.0);
        Circle circle2 = new Circle("red",2.0,3.0);
        System.out.println("颜色是否相同:" + circle1.getColor().equals(circle2.getColor()));
    }
}