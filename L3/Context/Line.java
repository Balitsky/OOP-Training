package L3.Context;

import java.util.List;

public interface Line<E> {

    /**
     * @return повертрає наступний елемент в черзі
     * (тобто тей, що додали найпізніше)
     */
    E next();

    /**
     * @param elem ставить в кінець черги елемент
     */
    void joinToLine(E elem);

    /**
     * @param eList ставить в кінець черги всі елементи з листа
     */
    void joinToLine(List<E> eList);

    /**
     * очишщує чергу. (тобто прибирає всіх з черги)
     */
    void clearLine();
}
