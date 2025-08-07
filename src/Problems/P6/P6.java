package Problems.P6;

public class P6 {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;
        int row = 0;
        int column = 0;
        int counter = 0;
        int cycleLen = 2 * numRows - 2;
        int numCycles = (s.length() + cycleLen - 1) / cycleLen;
        int totalCols = numCycles * (numRows - 1);
        String[][] matrix = new String[numRows][totalCols];
        for(int i = 0;i<s.length();i++ ) {
            if(counter<numRows) {
                matrix[row++][column] = s.substring(i,i+1);
                counter++;

            }

            else if(counter<=(2*(numRows)-2)){
                if(row==numRows) row--;
                row--;
                column++;
                matrix[row][column] = s.substring(i, i + 1);
                counter++;

            }

            else {
                counter = 1;
                row=1;
                i--;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String[] ls : matrix) {
            for (String c : ls) {
                if (c != null) sb.append(c);
            }
        }
        return sb.toString();
    }
}
