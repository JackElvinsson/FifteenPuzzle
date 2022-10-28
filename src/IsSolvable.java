import java.util.ArrayList;

public class IsSolvable {

        public boolean isSolvable(int[] puzzle)
    {
        int parity = 0;
        int gridWidth = (int) Math.sqrt(puzzle.length);
        int row = 0; // the current row we are on
        int blankRow = 0; // the row with the blank tile

        for (int i = 0; i < puzzle.length; i++)
        {
            if (i % gridWidth == 0) { // advance to next row
                row++;
            }
            if (puzzle[i] == 0) { // the blank tile
                blankRow = row; // save the row on which encountered
                continue;
            }
            for (int j = i + 1; j < puzzle.length; j++)
            {
                if (puzzle[i] > puzzle[j] && puzzle[j] != 0)
                {
                    parity++;
                }
            }
        }

        if (gridWidth % 2 == 0) { // even grid
            if (blankRow % 2 == 0) { // blank on odd row; counting from bottom
                return parity % 2 == 0;
            } else { // blank on even row; counting from bottom
                return parity % 2 != 0;
            }
        } else { // odd grid
            return parity % 2 == 0;
        }
    }

//    private boolean isSolvable(ArrayList<Integer> list) {
//
//        if(list.size() != 16)
//        {
//            System.err.println("isSolvable function works only" +
//                    "with a list having 0-16 as values");
//        }
//
//        int inversionSum = 0;  // If this sum is even it is solvable
//        for (int i = 0; i < list.size(); i++) {
//            // For empty square add row number to inversionSum
//            if (list.get(i) == 0) {
//                inversionSum += ((i / DIM) + 1);  //add Row number
//                continue;
//            }
//
//            int count = 0;
//            for (int j = i + 1; j < list.size(); j++) {
//                // No need need to count for empty square
//                if (list.get(j) == 0) {
//                    continue;
//                } else if (list.get(i) > list.get(j)) { // If any element greater
//                    count++;                            // than seed increse the
//                }                                       // inversionSum
//            }
//            inversionSum += count;
//        }
//
//        // if inversionSum is even return true, otherwise false
//        return (inversionSum & 1) == 0;
//    }
}
