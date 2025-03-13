package practice_first_lesson.OOP.twelve;

public class Matrix {
    private Double[][] data;
    private int rows;
    private int cols;

    public Matrix(int size) {
        this.rows = 1;
        this.cols = size;
        this.data = new Double[1][size];
    }

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new Double[rows][cols];
    }

    public void setValue(int row, int col, Double value) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            data[row][col] = value;
        } else {
            throw new IndexOutOfBoundsException("Индекс вне диапазона.");
        }
    }

    public Double getValue(int row, int col) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            return data[row][col];
        } else {
            throw new IndexOutOfBoundsException("Индекс вне диапазона.");
        }
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrix add(Matrix other) {
        if (this.rows == other.rows && this.cols == other.cols) {
            Matrix result = new Matrix(this.rows, this.cols);
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < this.cols; j++) {
                    result.setValue(i, j, this.getValue(i, j) + other.getValue(i, j));
                }
            }
            return result;
        } else {
            throw new IllegalArgumentException("Размерности матриц не совпадают.");
        }
    }

    public Matrix subtract(Matrix other) {
        if (this.rows == other.rows && this.cols == other.cols) {
            Matrix result = new Matrix(this.rows, this.cols);
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < this.cols; j++) {
                    result.setValue(i, j, this.getValue(i, j) - other.getValue(i, j));
                }
            }
            return result;
        } else {
            throw new IllegalArgumentException("Размерности матриц не совпадают.");
        }
    }

    public Matrix multiply(Matrix other) {
        if (this.cols == other.rows) {
            Matrix result = new Matrix(this.rows, other.cols);
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < other.cols; j++) {
                    Double sum = 0.0;
                    for (int k = 0; k < this.cols; k++) {
                        sum += this.getValue(i, k) * other.getValue(k, j);
                    }
                    result.setValue(i, j, sum);
                }
            }
            return result;
        } else {
            throw new IllegalArgumentException("Невозможно умножить матрицы: число столбцов первой не равно числу строк второй.");
        }
    }

}