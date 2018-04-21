/*
    Jack Defay
    main.java
    4/11/2018
*/


import java.util.Random;

public class main {
    public static void main(String args[]) {
//        Neuron neuron = new Neuron();
//
//        double[][] matrix1 = {{1, 3}, {2, 4}};
//        double[][] matrix2 = {{2, 1}, {0, 2}};
//
//        for(double[] column : matrix1){
//            for(double item : column){
//                System.out.print(item + ", ");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//        double[][] matrixAnswer;
//
//         matrixAnswer = (neuron.transpose(matrix1));
//
//        for(double[] column : matrixAnswer){
//            for(double item : column){
//                System.out.print(item + ", ");
//            }
//            System.out.println();
//        }

        double[][] training_set_inputs = {{0,0,1}, {1,1,1}, {1,0,1}, {0,1,1}};
        double[][] training_set_outputs = {{0},{1},{1},{0}};

        Neuron neuron = new Neuron();
        System.out.println("random starting synaptic weights: ");
        for(double[] column : neuron.synapticWeights){
            for(double item : column){
                System.out.print(item + ", ");
            }
        }

        System.out.println("\nthe training_set_inputs = ");
        for(double[] column : training_set_inputs){
            for(double item : column){
                System.out.print(item + ", ");
            }
            System.out.println();
        }

//        double[][] answerMatrix;
//
//        answerMatrix = neuron.transpose(training_set_inputs);
//
//        for(double[] column : answerMatrix){
//            for(double item : column){
//                System.out.print(item + ", ");
//            }
//            System.out.println();
//        }

        neuron.train(training_set_inputs, training_set_outputs, 10000);

        System.out.println("new weights after training: ");
        for(double[] column : neuron.synapticWeights){
            for(double item : column){
                System.out.print(item + ", ");
            }
        }

        double[][] temp = {{1},{0},{0}};

        System.out.println("considering a new situation [1,0,0] -> ?: ");
        System.out.print(neuron.think(temp));

//        Random rand = new Random(1);
//        double[][] synaptic_weights = {{(2* rand.nextInt(2))}, {(2* rand.nextInt(2))}, {(2* rand.nextInt(2))}, {(2* rand.nextInt(2))}}; //{{1}, {1}, {1}, {1}};
//        double output = 0;
//        for(int i = 0; i<10000; i++){
//            output = 1/(1+Math.exp(-1*(dot(training_set_inputs, synaptic_weights))));
//            synaptic_weights = add(synaptic_weights,dot(transpose(training_set_inputs), multiply(multiply(subtract(training_set_outputs,output), output), (1-output))));
//        }
//        double[][] temp = {{1},{0},{0}};
//        System.out.print(1/(1+(1/Math.exp(dot(temp, synaptic_weights)))));

//        for(double[] items : synaptic_weights) {
//            for (double item : items) {
//                System.out.println(item);
//            }
//        }
//
//        System.out.println("\n" + output);
    }

//    public static double dot(double[][] matrix1, double[][] matrix2){
//        double sum = 0;
//        for(int a = 0; a<matrix1.length; a++){
//            for(int b = 0; b<matrix2[0].length; b++){
//                sum += matrix1[a][b] * matrix2[a][b];
//            }
//        }
//        return sum;
//    }
//
//    public static double[][] transpose(double[][] matrix){
//        double[][] answer = new double[matrix[0].length][matrix.length];
//        for(int i = 0; i < matrix.length; i++) {
//            for(int j = i+1; j < matrix[0].length; j++) {
//                answer[i][j] = matrix[j][i];
//            }
//        }
//
//        return answer;
//    }
//
//    public static double[][] multiply(double[][] matrix, double scalar){
//        double[][] answer = new double[matrix.length][matrix[0].length];
//        for(int i = 0; i<matrix.length; i++){
//            for(int j = 0; j<matrix[0].length; j++){
//                answer[i][j] = matrix[i][j] * scalar;
//            }
//        }
//
//        return answer;
//    }
//
//    public static double[][] subtract(double[][] matrix, double scaler){
//        double[][] answer = new double[matrix.length][matrix[0].length];
//        for(int i = 0; i<matrix.length; i++){
//            for(int j = 0; j<matrix[0].length; j++){
//                answer[i][j] = matrix[i][j] - scaler;
//            }
//        }
//
//        return answer;
//    }
//
//    public static double[][] add(double[][] matrix, double scaler){
//        double[][] answer = new double[matrix.length][matrix[0].length];
//        for(int i = 0; i<matrix.length; i++){
//            for(int j = 0; j<matrix[0].length; j++){
//                answer[i][j] = matrix[i][j] + scaler;
//            }
//        }
//
//        return answer;
//    }
}
