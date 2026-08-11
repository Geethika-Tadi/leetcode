class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < matrix.length; i++) {

            int min = matrix[i][0];
            int col = 0;

            // Find minimum in the row
            for(int j = 1; j < matrix[i].length; j++) {

                if(matrix[i][j] < min) {
                    min = matrix[i][j];
                    col = j;
                }
            }

            // Check whether it is maximum in its column
            boolean lucky = true;

            for(int k = 0; k < matrix.length; k++) {

                if(matrix[k][col] > min) {
                    lucky = false;
                    break;
                }
            }

            if(lucky) {
                ans.add(min);
            }
        }

        return ans;
    }
}