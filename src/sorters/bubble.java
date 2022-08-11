package sorters;

public class bubble {
    public static double[] bubbleSort (double[] _data) {
        for (int i = 0; i < _data.length - 1; i++) {
            for (int j = 0; j < _data.length - i - 1; j++) {
                if (_data[j] > _data[j + 1]) {
                    double temp = _data[j];
                    _data[j] = _data[j + 1];
                    _data[j + 1] = temp;
                }
            }
        }

        return _data;
    }
    public static int[] bubbleSort (int[] _data) {
        for (int i = 0; i < _data.length - 1; i++) {
            for (int j = 0; j < _data.length - i - 1; j++) {
                if (_data[j] > _data[j + 1]) {
                    int temp = _data[j];
                    _data[j] = _data[j + 1];
                    _data[j + 1] = temp;
                }
            }
        }

        return _data;
    }
}
