package searches;

public class linear {
    public static boolean linearSearch (double[] _data, double _search) {
        for (int i = 0; i < _data.length; i++) {
            if (_search == _data[i]) {
                return true;
            }
        }

        return false;
    }
}
