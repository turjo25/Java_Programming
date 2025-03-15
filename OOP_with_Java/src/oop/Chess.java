package oop;

public class Chess extends Sudoku {
    public void puzzle2() {
        super.puzzle2();
        int rubics = 300;
        System.out.println(rubics);
        System.out.println(instance);
        System.out.println(check);
        instance += 2;
    }

        public static void main(String[] args){
            Chess solve1 = new Chess();
            Chess solve2 = new Chess();
            solve1.puzzle1();
            solve2.puzzle2();
            System.out.println("Instance value after puzzle2: " + solve1.instance);
        }
    }
