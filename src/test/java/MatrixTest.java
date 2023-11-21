import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    Matrix matrix;

    @BeforeEach
    void setUp() {
        matrix = new Matrix();

    }

    @AfterEach
    void tearDown() {
        matrix = null;
    }

    @Test
    void testAvgArray() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        assertEquals(3, matrix.avgArray(array));
    }

    @Test
    void testIsMatrixSquareTrue() {
        Integer[][] matrix1 = new Integer[5][5];
        assertTrue(matrix.isMatrixSquare(matrix1));
    }

    @Test
    void testIsMatrixSquareTeeth() {
        Integer[][] matrix2 = new Integer[][]{{1,2,3}, {1,2,3,4}, {1,2,3}};
        assertFalse(matrix.isMatrixSquare(matrix2));
    }

    @Test
    void testIsMatrixSquareEmpty() {
        Integer[][] matrix3 = new Integer[0][0];
        assertFalse(matrix.isMatrixSquare(matrix3));
    }

    @Test
    void testIsMatrixSquareDifferentLengths() {
            Integer[][] matrix4 = new Integer[5][6];
            assertFalse(matrix.isMatrixSquare(matrix4));

    }
}