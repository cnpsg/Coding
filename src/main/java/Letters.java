import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName letters
 * @Description The program need to support converting the digits from 0 to 99 into letters
 * @Author hedahong
 * @Email 13610389254@163.com
 * @Date 2020/9/7 15:56
 * @Version 1.0
 **/
public class Letters {
        public List<String> letterListString(String digits) {
            List<String> result = new ArrayList<String>();
            if (digits.length() == 0)
                return result;
            result.add("");
            for (int i=0; i<digits.length(); i++){
                result = getLisrString(getDigitStr(digits.charAt(i)),result);
            }
            return result;
        }

        public static String getDigitStr(char a){
            String s = "";
            switch (a) {
                case '0':
                    s = "";
                    break;
                case '1':
                    s = "";
                    break;
                case '2':
                    s = "abc";
                    break;
                case '3':
                    s = "def";
                    break;
                case '4':
                    s = "ghi";
                    break;
                case '5':
                    s = "jkl";
                    break;
                case '6':
                    s = "mno";
                    break;
                case '7':
                    s = "pqrs";
                    break;
                case '8':
                    s = "tuv";
                    break;
                case '9':
                    s = "wxyz";
                    break;
            }
            return s;
        }


        private static List<String> getLisrString(String digit, List<String> l) {
            List<String> result = new ArrayList<String>();
            for (int i = 0; i < digit.length(); i++)
                for (String x : l)
                    result.add(x + digit.charAt(i));
            return result;
        }

}
