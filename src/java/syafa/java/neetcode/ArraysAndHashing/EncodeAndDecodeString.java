package syafa.java.neetcode.ArraysAndHashing;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EncodeAndDecodeString
{
    class Solution
    {
        static final String DECODER = "0x00";
        public String encode(List<String> strs)
        {
            if (strs.size() == 0)
            {
                return null;
            }
            String encoded = "";
            for (int i = 0; i < strs.size(); i++)
            {
                encoded = encoded.concat(strs.get(i));
                if (strs.size() - i != 1)
                {
                    encoded = encoded.concat(DECODER);
                }
            }
            return encoded;
        }
        public List<String> decode(String str)
        {
            if (str == null)
            {
                return Collections.unmodifiableList(Arrays.asList());
            }
            return Collections.unmodifiableList(Arrays.asList(str.split(DECODER)));
        }
    }
}