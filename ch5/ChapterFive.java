public class ChapterFive {

    /** 5.1, computing the parity of a value */
    public boolean parity(int x) {
        int result = 0;
        while (x != 0) {
            x = x & (x - 1);
            result ^= 1;
        }
        return result == 0;
    }

    /** 5.2, swapping two bits in a value */
    public int swapBits(int x, int i, int j) {
        if (((x >> i) & 1) != ((x >> j) & 1)) {
            x ^= 1 << i;
            x ^= 1 << j;
        }
        return x;
    }

}
