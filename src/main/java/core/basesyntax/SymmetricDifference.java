package core.basesyntax;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * <p>Реализуйте метод, вычисляющий симметрическую разность двух множеств. Метод должен возвращать
 * результат в виде нового множества.</p>
 *
 * <p>Пример: симметрическая разность множеств {1, 2, 3} и {0, 1, 2} равна {0, 3}.</p>
 */
public class SymmetricDifference<T> {
    public Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> copiedSet = new HashSet<>(set1);
        Set<T> copiedSet1 = new HashSet<>(set2);
        copiedSet.removeAll(set2);
        copiedSet1.removeAll(set1);
        copiedSet.addAll(copiedSet1);
        return copiedSet;
    }
}
