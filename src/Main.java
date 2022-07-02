import java.util.*;

public class Main {
    public static void main(String[] args) {

        int [] array = new int[101];

        HashSet<Integer> hashSet = new HashSet<>();

        for(int i = 1; i< array.length; i++){
            array[i]=i;
            if(array[i]%5==0){
                hashSet.add(i);

            }
        }
        for(int i=1; i< array.length; i++){
            if(array[i]%2==0){
                hashSet.add(i);
            }
        }
        Iterator<Integer> it = hashSet.iterator();
        while(it.hasNext()){
            System.out.println("HashSet "+it.next());
        }
        // При переносе в HashSet соблюсти правило - в начале должны быть числа,
        // которые делятся на 5 без остатка, а в конце те, что не делятся
        //
        //Подсказка: Возможно ли сделать последний пункт, если да то как?

        // Мой ответ:
        // HashSet не может отсортировать по индексу - потому что у HashSet нет метода get().
        // Я бы сделал через LinkedHashset - потому что тут записывается в порядке добавления.

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        for(int i = 1; i< array.length; i++){
            if(array[i]%5==0){
                linkedHashSet.add(i);
            }
        }
        for(int i=1; i< array.length; i++){
            if(array[i]%2==0){
                linkedHashSet.add(i);
            }
        }
        Iterator<Integer> it2 = linkedHashSet.iterator();
        while(it2.hasNext()){
            System.out.println("LinkedHashSet "+it2.next());
        }

    }


}
