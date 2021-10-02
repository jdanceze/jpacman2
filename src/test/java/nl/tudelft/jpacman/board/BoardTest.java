package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

class BoardTest {

    private final Square[][] grid = {
        { mock(Square.class)}
    };

    private final Square[][] grid2 = {
        {}
    };
    //private final Board board = new Board(grid);

    @Test
    void testInvariant() {
        Board board = new Board(grid);
        assertThat(board.invariant()).isTrue();
    }

    @Test
    void testWidth() {
        Board board = new Board(grid);
        assertThat(board.getWidth()).isEqualTo(1);
    }

    @Test
    void testHeight() {
        Board board = new Board(grid);
        assertThat(board.getHeight()).isEqualTo(1);
    }

    @Test
    void testSquareAt() {
        Board board = new Board(grid2);
        //assertThat(board.squareAt(0, 0)).isEqualTo(grid2[0][0]);
    }




}
