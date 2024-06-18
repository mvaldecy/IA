import java.util.ArrayList;

class Neuron {
    ArrayList<Double> weights;
    ArrayList<Double> inputs;
    Double learningRate;

    public Neuron(ArrayList<Double> weights, ArrayList<Double> inputs) {
        this.weights = weights;
        this.inputs = inputs;

    }

    public ArrayList<Double>getWeights() {
        return this.weights;
    }

    public void setWeights (ArrayList<Double> weights) {
        this.weights = weights;
    }

    public ArrayList<Double> getInputs() {
        return this.inputs;
    }


    public Double in() {
        Double result = 0.0;
        for (int i = 0; i < weights.size(); i++) {
            result += weights.get(i) * inputs.get(i);
        }
        return result;

    }
}