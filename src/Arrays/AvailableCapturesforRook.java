package Arrays;

class AvailableCapturesforRook{
    public int numRookCaptures(char[][] board) {
        int row=-1,col = -1;
        for(int i = 0; i< 8; i++){
            for(int j = 0; j< 8;j++){
                if(board[i][j] == 'R'){
                    row = i;
                    col = j;
                    break;
                }
            }
            if(row!=-1){
                break;
            }
        }
        // char[] rookRow = new char[8];
        // char[] rookColumn = new char[8];

        // for(int i = 0; i<8;i++){
        //     rookRow[i] = board[row][i];
        // }
        // for(int i = 0; i<8; i++){
        //     rookColumn[i] = board[i][col];
        // }

        int left=col-1,right=col+1;
        int top = row-1, bottom = row+1;
        int count = 0;
        while(true){
            if(left == 0){
                break;
            }
            else if(board[row][left] >='A' && board[row][left] <= 'Z'){
                break;
            }
            if(board[row][left] == 'p'){
                count+=1;
                break;
            }
            left-=1;
        }

        while(true){
            if(right == 8){
                break;
            }
            else if(board[row][right] >='A' && board[row][right] <= 'Z'){
                break;
            }
            if(board[row][right] == 'p'){
                count+=1;
                break;
            }
            right+=1;
        }

        while(true){
            if(top == 0){
                break;
            }
            else if(board[top][col] >='A' && board[top][col] <= 'Z'){
                break;
            }
            if(board[top][col] == 'p'){
                count+=1;
                break;
            }
            top-=1;
        }

        while(true){
            if(bottom == 8){
                break;
            }
            else if(board[bottom][col] >='A' && board[bottom][col] <= 'Z'){
                break;
            }
            if(board[bottom][col] == 'p'){
                count+=1;
                break;
            }
            bottom+=1;
        }

        return count;

    }
}