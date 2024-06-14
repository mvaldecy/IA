import java.util.ArrayList;

class Neuron {
    ArrayList<Double> weights;
    ArrayList<Double> inputs;

    public Neuron(ArrayList<Double> weights) {
        this.weights = weights;
    }

    public ArrayList<Double>getWeights() {
        return this.weights;
    }

    public void setWeights (ArrayList<Double> weights) {
        this.weights = weights;
    }

    public void setInputs(ArrayList<Double> inputs) {
        this.inputs = inputs;
    }
}