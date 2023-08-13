package homework5;

public class PathFindingInMaze {
    public static void main(String[] args) {
        char[][] maze = {
                {'S', '1', '0'},
                {'0', '0', '1'},
                {'1', '0', 'E'}
        };
        printMaze(maze);
        findStart(maze);
    }

    public static void printMaze(char[][] maze) {
        for (int row = 0; row < maze.length; row++) {
            for (int col = 0; col < maze[row].length; col++) {
                System.out.print(maze[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void findStart(char[][] maze) {
        int startRow = -1;
        int startCol = -1;
        for (int row = 0; row < maze.length; row++) {
            for (int col = 0; col < maze[row].length; col++) {
                if (maze[row][col] == 'S') {
                    startRow = row;
                    startCol = col;
                    System.out.println("START: " + "[" + row + "]" + "[" + col + "]");
                }
            }
        }
    }
}
