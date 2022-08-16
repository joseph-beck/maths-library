package Sorters;

public class Merge {

    // Double sorter
    private static void merge (double[] _data, int _left, int _mid,  int _right) {
        int leftSize = _mid - _left + 1;
        int rightSize = _right - _mid;

        double[] leftData = new double[leftSize];
        double[] rightData = new double[rightSize];

        int i, j, count;

        for (i = 0; i < leftSize; i++) {
            leftData[i] = _data[i + _left];
        }
        for (j = 0; j < rightSize; j++) {
            rightData[j] = _data[_mid + j + 1];
        }

        i = j = 0;
        count = _left;

        while (i < leftSize && j < rightSize) {
            if (leftData[i] <= rightData[j]) {
                _data[count] = leftData[i];
                i++;
            }
            else {
                _data[count] = rightData[j];
                j++;
            }

            count++;
        }

        while ( i < leftSize) {
            _data[count] = leftData[i];
            i++; count++;
        }

        while (j < rightSize) {
            _data[count] = rightData[j];
            j++; count++;
        }
    }
    private static void sort (double[] _data, int _left, int _right) {
        if (_left < _right) {
            int mid = _left + (_right - _left) / 2;

            sort(_data, _left, mid);
            sort(_data, mid + 1, _right);

            merge(_data, _left, mid, _right);
        }
    }
    public static double[] mergeSort (double[] _data) {
        sort(_data, 0, _data.length - 1);

        return _data;
    }

    // Float sorter
    private static void merge (float[] _data, int _left, int _mid,  int _right) {
        int leftSize = _mid - _left + 1;
        int rightSize = _right - _mid;

        float[] leftData = new float[leftSize];
        float[] rightData = new float[rightSize];

        int i, j, count;

        for (i = 0; i < leftSize; i++) {
            leftData[i] = _data[i + _left];
        }
        for (j = 0; j < rightSize; j++) {
            rightData[j] = _data[_mid + j + 1];
        }

        i = j = 0;
        count = _left;

        while (i < leftSize && j < rightSize) {
            if (leftData[i] <= rightData[j]) {
                _data[count] = leftData[i];
                i++;
            }
            else {
                _data[count] = rightData[j];
                j++;
            }

            count++;
        }

        while ( i < leftSize) {
            _data[count] = leftData[i];
            i++; count++;
        }

        while (j < rightSize) {
            _data[count] = rightData[j];
            j++; count++;
        }
    }
    private static void sort (float[] _data, int _left, int _right) {
        if (_left < _right) {
            int mid = _left + (_right - _left) / 2;

            sort(_data, _left, mid);
            sort(_data, mid + 1, _right);

            merge(_data, _left, mid, _right);
        }
    }
    public static float[] mergeSort (float[] _data) {
        sort(_data, 0, _data.length - 1);

        return _data;
    }

    // Int sorter
    private static void merge (int[] _data, int _left, int _mid,  int _right) {
        int leftSize = _mid - _left + 1;
        int rightSize = _right - _mid;

        int[] leftData = new int[leftSize];
        int[] rightData = new int[rightSize];

        int i, j, count;

        for (i = 0; i < leftSize; i++) {
            leftData[i] = _data[i + _left];
        }
        for (j = 0; j < rightSize; j++) {
            rightData[j] = _data[_mid + j + 1];
        }

        i = j = 0;
        count = _left;

        while (i < leftSize && j < rightSize) {
            if (leftData[i] <= rightData[j]) {
                _data[count] = leftData[i];
                i++;
            }
            else {
                _data[count] = rightData[j];
                j++;
            }

            count++;
        }

        while ( i < leftSize) {
            _data[count] = leftData[i];
            i++; count++;
        }

        while (j < rightSize) {
            _data[count] = rightData[j];
            j++; count++;
        }
    }
    private static void sort (int[] _data, int _left, int _right) {
        if (_left < _right) {
            int mid = _left + (_right - _left) / 2;

            sort(_data, _left, mid);
            sort(_data, mid + 1, _right);

            merge(_data, _left, mid, _right);
        }
    }
    public static int[] mergeSort (int[] _data) {
        sort(_data, 0, _data.length - 1);

        return _data;
    }
}
