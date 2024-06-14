public class Activation {
    static Double sigmoid(Double in) {
        Double result = 1/ (1 + Math.exp(in));
        return result;
    }
}
