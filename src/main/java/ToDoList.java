import java.util.*;

public class ToDoList {
    public static void collection(Integer n){
        Random random = new Random();

        System.out.println("a: ");
        Integer[] array = new Integer[n];

        for(int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ;");
        }

        System.out.println("\nb: ");

        List<Integer> be_list_and_not_to_be_array = new ArrayList<Integer>(Arrays.asList(array));
        System.out.print(be_list_and_not_to_be_array);

        System.out.println("\nc: ");

        Collections.sort(be_list_and_not_to_be_array);
        System.out.println(be_list_and_not_to_be_array + "sorted list");

        System.out.println("d: ");
        Collections.reverse(be_list_and_not_to_be_array);
        System.out.println(be_list_and_not_to_be_array + "reverse list");

        System.out.println("e: ");
        Collections.shuffle(be_list_and_not_to_be_array);
        System.out.println(be_list_and_not_to_be_array +  "shuffle list");

        System.out.println("f: ");
        Collections.rotate(be_list_and_not_to_be_array, 1);
        System.out.println(be_list_and_not_to_be_array + "rotate list");

        System.out.println("g: ");
        be_list_and_not_to_be_array.add(be_list_and_not_to_be_array.getLast());
        System.out.println(be_list_and_not_to_be_array);

        List<Integer> listik = new ArrayList<>();
        Set<Integer> worry_Masha_i_am_not_duprovskiy = new HashSet<Integer>(be_list_and_not_to_be_array);

        listik.addAll(worry_Masha_i_am_not_duprovskiy);
        System.out.println(listik);

        System.out.println("h: ");
        List<Integer> duplications = be_list_and_not_to_be_array.stream().filter(x -> Collections.frequency(be_list_and_not_to_be_array, x) > 1).toList();
        System.out.println(duplications);


        System.out.println("i: ");
        Integer[] array2 = new Integer[be_list_and_not_to_be_array.size()];
        be_list_and_not_to_be_array.toArray(array2);

        for(int i = 0; i <= n; i++) {
            System.out.print(array2[i] + " ;");
        }

        System.out.println("j: ");

        HashMap<Integer, Integer> counter = new HashMap<>();

        for(int i = 0; i < array2.length; i++) {
            counter.put(array2[i], Collections.frequency(be_list_and_not_to_be_array, array2[i]));
        }
        System.out.println(counter + "\n");
    }
}