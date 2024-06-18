public class Activation {
    static Double sigmoid(Double in) {
        Double result = 1/ (1 + Math.exp(-in));
        return result;
    }

    static Double sigmoidDerivative(Double in) {
        Double sig = sigmoid(in);
        return sig *(1- sig);
    }
}

// https://www.deeplearningbook.com.br/funcao-de-ativacao/
