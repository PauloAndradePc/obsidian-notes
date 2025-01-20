class TwoDShape {

    double width;
    double height;

    //Criando metodo.
    void showDim (){
        System.out.println("Width and Heigth are " + width + " and " + height);
    }

    //Criando a Subclasse de TwoDShape dos Triângulos.
    class Triangle extends TwoDShape { // Triangle herda TwoDShape, utilizamos a palavra ( Extends )
        String style; //Adicionando uma caracteristica exclusica para a classe Triangle.

        double area(){ //Como vimos podemos usar os membros de TwoDShape como se fosse da class Triangle
            return width * height / 2;
        }

    }


}
