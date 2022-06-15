import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();

        logger.log("Запуск программы");
        logger.log("Запрашиваю входные данные для списка");

        System.out.println("Введите размер списка");
        int N = scanner.nextInt();
        System.out.println("Установите верхнюю границу значений элементов в списке");
        int M = scanner.nextInt();
        List<Integer> list = createList(N, M);

        logger.log("Создаю и наполняю список с параметрами 'Размер списка:" + N +  ", верхняя граница значений: " + M);

        System.out.println("Cписок: " + list);

        logger.log("Запрашиваю порог для фильтра");

        System.out.println("Введите порог для фильтра");
        int F = scanner.nextInt();

        Filter filter = new Filter(F);
        List<Integer> filteredList = filter.filterOut(list);

        logger.log("Вывожу на экран отфильтрованный список");
        System.out.println("Отфильтрованный список: " + filteredList.toString());

        logger.log("Завершение программы");

        }


    public static List<Integer> createList (int N, int M) {
        List<Integer> list= new ArrayList<>(N);
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            list.add(random.nextInt(M));
        }
        return list;

    }
}
