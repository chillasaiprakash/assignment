import java.util.*;
import java.util.stream.Collectors;

public class ListOfList {


    public static void main(String[] args) {
        // Example usage:
        List<List<String>> listOfLists = List.of(
                List.of("9", "NorthCarolina"),
                List.of("7", ""),
                List.of("0", "1"),
                List.of("1", "Florida"),
                List.of("2", "Tampa"),
                List.of("5", "9"),
                List.of("-2", "Kolarado"),
                List.of("10", "Florida"),
                List.of("3", "Californa"),
                List.of("8", "NorthCarolina"),
                List.of("7", ""),
                List.of("6", "Atlanta")
        );

        List<List<String>> lists= listOfLists.stream().filter(listOfLists.)
        Map<String, Integer> map = new HashMap<>();
        for (List<String> list : listOfLists) {
            for (String str : list) {
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }

        // Print result
        System.out.println("The repeated strings in the list of lists are:");
        for (String key : map.keySet()) {
            int count = map.get(key);
            if (count >= 1) {
                System.out.println(key + ": " + count);
            }
        }
    }
     /*   List<String> collect = listOfLists.stream()
                .flatMap(Collection::stream)
                        .collect(Collectors.toList());
        System.out.println(collect);


      */
        //collect.forEach(x -> System.out.println(x));





    }


   /* public static int countOccurrences(List<List<String>> listOfLists, String searchString) {
        int count = 0;
        for (List<String> list : listOfLists) {
            for (String str : list) {
                if (searchString.equals(str)) {
                    count++;
                }
            }
        }
        return count;

    */


