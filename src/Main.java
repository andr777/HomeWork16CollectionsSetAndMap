import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
        System.out.println("Задание 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer numsOne : nums) {
            if (0 == numsOne % 2) {
                System.out.println(numsOne + " - чётные ");

            }
        }

        //Напишите код, с помощью которого
        // можно напечатать только четные числа без повторений в порядке возрастания.
        System.out.println("Задание 2");
        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> numsPrint = new ArrayList<>();
        Integer y = nums2.get(0);

        System.out.println(nums2);
        // добавляем чётные в массив
        for (Integer numsOne : nums2) {
            if (0 == numsOne % 2) {
                numsPrint.add(numsOne);
            }
        }
        System.out.println(numsPrint);

        // убираем дубли
        for (int i = 0; i < numsPrint.size(); i++) {
            for (int y0 = i + 1; y0 < numsPrint.size(); y0++) {

                {
                    if (numsPrint.get(i) == numsPrint.get(y0)) {
                        // numsPrint.set(y0, null);
                        numsPrint.remove(y0);
                    }
                }
            }
        }

        System.out.println(numsPrint);
        // сортировка
        for (int i = 0; i < numsPrint.size(); i++) {
            for (int y0 = i + 1; y0 < numsPrint.size(); y0++) {

                {
                    if (numsPrint.get(i) > numsPrint.get(y0)) {
                        y = numsPrint.get(y0);
                        numsPrint.set(y0, numsPrint.get(i));
                        numsPrint.set(i, y);
                    }
                }
            }
        }
        System.out.println(numsPrint);


        System.out.println("Задание 3");

        String text = "Задание Задание Задание Задание Задание Задание Задание Задание Задание Задание Напишите код, который выводит в консоль все уникальные слова из списка слов, в котором могут встречаться дубли. В качестве отладочной информации возьмите произвольный набор слов или текст, в котором встречаются повторения. Код должен работать с любой последовательностью и объемом списка слов.";

// заполнфем массив словами из строки
        List<String> words = new ArrayList<>(List.of(text.replaceAll("[^\\da-zA-Za-яёА-ЯЁ0-9 ]", "").split(" ")));
        // печатаем массив
        System.out.println("массив слов: ");
        for (String ppp :
                words) {
            System.out.print("'" + ppp + "', ");
        }

        // убираем дубли

        System.out.println("\n печатаем количество повторений для слова. задание 4");
        int z = 1;
        for (int i = 0; i < words.size(); i++) {

            for (int y0 = i + 1; y0 < words.size(); y0++) {


                String s1 = words.get(y0);
                String s2 = words.get(i);

                if (s1.equals(s2)) {

                    words.remove(y0);

                    y0 = y0 - 1;
                    z = z + 1;
                }
            }
            if (z > 1) {
                System.out.println("'" + words.get(i) + "' " + z + " повторов");
                z = 1;
            }
        }
//   печатаем уникальные
        System.out.println("\n печатаем слова по одному без повторов. задание 3");
        for (String ppp :
                words) {
            System.out.print("'" + ppp + "' ");
        }

    }
}
