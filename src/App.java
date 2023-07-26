public class App {
    public static void main(String[] arr) {
        int pyramidSize = 9; //tamanho da pirâmide
    
        for(int i = 0; i<pyramidSize; i++){
            int pyramidLayerNumber = i + 1;

            for(int i2 = 0; i2<pyramidLayerNumber; i2++){

                System.out.print(pyramidLayerNumber);

            };
            
            System.out.println();
        }; 
    }
}
