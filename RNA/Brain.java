import java.util.ArrayList;

public class Brain {
    Neuron neuron;
    Double expectedResult;
    Double learningRate;
    Double margin;
    Double actualResult;
    int size;
    Double error;
    public Brain(Neuron neuron, Double expectedResult, int size) {
        this.neuron = neuron;
        this.expectedResult = expectedResult;
        this.learningRate = 0.0001;
        this.margin = 1.0;
        this.size = size;
        this.actualResult = Activation.sigmoid(neuron.in());
        this.error = Math.abs(expectedResult - this.actualResult);
    }

    public void backProgramation() { // fazer for de for em dados
        ArrayList<Double> newWeights = new ArrayList<Double>();
        for (int i = 0; i < size; i++) {
            Double w = neuron.getWeights().get(i) + learningRate * error * Activation.sigmoidDerivative(actualResult) * neuron.getInputs().get(i);
            newWeights.add(w);
        }
        this.neuron.setWeights(newWeights); 
        this.actualResult = Activation.sigmoid(this.neuron.in());
        this.error = Math.abs(expectedResult - this.actualResult); // elevar ao quadrao
        System.out.println("Erro:" + error);
        System.out.println("Novos pesos" + newWeights);
        System.out.println("Resultado Atual: " + actualResult);
    }

    public void start() {
        for(int i = 0; i < 100; i++) {
            backProgramation();
        }
        System.out.println("Fim");
    }
}

/*
 * w(t+1)=w(t)+ η * Err * f ' (∑ wi xi ) xi ;
 */
