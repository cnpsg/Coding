import org.junit.Test;

import java.util.List;

/**
 * @ClassName MiniCodingTest
 * @Description
 * @Author hedahong
 * @Email 13610389254@163.com
 * @Date 2020/9/7 15:42
 * @Version 1.0
 **/
public class MiniCodingTest {


    /**
     * @Author hedahong
     * @Description The program need to support converting the digits from 0 to 99 into letters
     **/
    @Test
    public void test() {
        Letters letters = new Letters();
        List<String> list = null;
        for (int i = 0; i < 100; i++) {
            System.out.println("Input:" + i);
            list = letters.letterListString(String.valueOf(i));
            System.out.println("Output：" + list);
        }
    }

}
