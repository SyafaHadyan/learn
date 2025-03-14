package syafa.java.hackerrank.DataStructures.Stacks;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result
{

    /*
     * Complete the 'getMax' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY operations as parameter.
     */

    /*
     * 1 x  -Push the element x into the stack.
     * 2    -Delete the element present at the top of the stack.
     * 3    -Print the maximum element in the stack.
     * 
     * STDIN   Function
     * -----   --------
     * 10      operations[] size n = 10
     * 1 97    operations = ['1 97', '2', '1 20', ....]
     * 2
     * 1 20
     * 2
     * 1 26
     * 1 20
     * 2
     * 3
     * 1 91
     * 3
     * 
     * 26
     * 91
     */
    public static List<Integer> getMax(List<String> operations)
    {
        // Write your code here
        List<Integer> getMaxResult = new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < operations.size(); i++)
        {
            if (Integer.parseInt(String.valueOf(operations.get(i).charAt(0))) == 1)
            {
                getMaxResult.add(Integer.parseInt(String.valueOf(operations.get(i).replace("1 ",""))));
            }
            else if (Integer.parseInt(operations.get(i)) == 2)
            {
                getMaxResult.remove(getMaxResult.size() - 1);
            }
            else if (Integer.parseInt(operations.get(i)) == 3)
            {
                result.add(Collections.max(getMaxResult));
            }
        }
        return result;
    }

}

public class MaximumElement {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> ops = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> res = Result.getMax(ops);

        bufferedWriter.write(
            res.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
