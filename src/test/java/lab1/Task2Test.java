package lab1;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ru.itmo.se.st.Task2;

public class Task2Test {
	@Test
    @DisplayName("Check positive values")
    void checkSorting() {
        assertAll(
                () -> assertArrayEquals(new int[]{5, 6, 9, 23}, Task2.mergesort(new int[]{9, 5, 6, 23})),
                () -> assertArrayEquals(new int[]{1, 3, 5, 7, 9}, Task2.mergesort(new int[]{5, 1, 3, 9, 7})),
                () -> assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, Task2.mergesort(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1})),
                () -> assertArrayEquals(new int[]{22, 28, 30, 82, 159, 166, 166, 287, 289, 338, 365, 371, 444, 451, 520, 527, 567, 623, 676, 714, 719, 741, 771, 783, 818, 874, 884, 914, 960, 970, 983},
                        Task2.mergesort(new int[]{444, 520, 166, 874, 676, 22, 338, 783, 365, 970, 623, 30, 287, 451, 914, 371, 741, 818, 527, 714, 166, 159, 960, 289, 567, 82, 771, 983, 719, 884, 28}))
                );
    }

    @Test
    @DisplayName("Check empty")
    void checkEmpty() {
        assertArrayEquals(new int[]{}, Task2.mergesort(new int[]{}));
    }

    @Test
    @DisplayName("Check negative values")
    void checkNegativeValues() {
        assertArrayEquals(new int[]{-5, -4, -3, -2, -1}, Task2.mergesort(new int[]{-5, -1, -4, -3, -2}));
    }

    @Test
    @DisplayName("Check zeros")
    void checkZeros() {
        assertArrayEquals(new int[]{0, 0, 0, 0, 0}, Task2.mergesort(new int[]{0,0,0,0,0}));
    }

    @Test
    @DisplayName("Check null")
    void checkNull() {
        assertThrows(NullPointerException.class, () -> Task2.mergesort(null));
    }
}
