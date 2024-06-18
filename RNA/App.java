import java.util.ArrayList;
import java.util.Scanner;

public class App {
    
    public static void run() {
        ArrayList<Double> weights = new ArrayList<Double>();
        ArrayList<Double> inputs = new ArrayList<Double>();
        int size;
        Double expectedResult;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o resultado esperado:");
        expectedResult = scanner.nextDouble();
        System.out.println("Insira a quantidade de dados que deseja inserir:");
        size = scanner.nextInt();
        for(int i = 0; i < size; i++){ // fazer for de for em dados
            Double randomWeight = 1 - Math.random()* 2; // gera um peso pseudo-aleatorio entre -1 e 1
            System.out.println("Insira o dado " + (i+1));
            inputs.add(scanner.nextDouble());
            weights.add(randomWeight);
        }
        Neuron neuron = new Neuron(weights, inputs);
        Brain brain = new Brain(neuron, expectedResult, size);
        scanner.close();
        brain.start();
    }
    public static void main(String[] args) {
        App.run();
        
    }
}
