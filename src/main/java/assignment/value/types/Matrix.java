package assignment.value.types;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import assignment.value.Value;

@Getter
@EqualsAndHashCode(callSuper = false)
public class Matrix extends Value {
    int columnSize;
    int lineSize;
    Double[][] matrix;

    Matrix(Double[][] matrix) {
        this.matrix = matrix;
        this.lineSize = matrix.length;
        this.columnSize = matrix[0].length;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[\n");
        for (int line = 0; line < lineSize; line++) {
            stringBuilder.append("[ ");
            for (int column = 0; column < columnSize; column++) {
                stringBuilder.append(matrix[line][column]);
                stringBuilder.append(", ");
            }
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
            stringBuilder.append("]\n");
        }
        stringBuilder.append("]\n");
        return stringBuilder.toString();
    }
}
