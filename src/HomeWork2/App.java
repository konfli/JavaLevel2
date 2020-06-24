package HomeWork2;

public class App {
    public static void main(String[] args) {
        arrayExceptionInit();
    }

    public static void arrayExceptionInit() {
        String[][] array = {{"a", "1", "1", "1"}, {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        checkArray(array);
        System.out.println(calcArr(array));
    }

    public static void checkArray(String[][] arr) throws MyArraySizeException {

        for (int i = 0; i < arr.length; i++) {
            if (arr.length != 4 || arr[i].length != 4) {
                throw new MyArraySizeException("Неверный размер массива." +
                        "Необходимо подать массив размером [4][4]");
            }
        }
    }

    private static int calcArr(String[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("Невозможно привести ячейку [%s][%s] к типу int" +
                           " содержимое ячейки: %s", i, j, array[i][j]));
                }
            }
        }
        return sum;
    }


}
