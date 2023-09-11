public class ArraysDeUnaDimension {
    // en java los arrays estan implementado como
    // objetos
    // para declararlo debemos especificar el tipo de elementos
    // y luego establecer una nueva instancia donde le diremos la 
    // longitud
    public static void main(String[] args) {
        String diasDeLaSemana[] = new String[7];
        diasDeLaSemana[0] = "Lunes";
        diasDeLaSemana[1] = "Martes";
        diasDeLaSemana[2] = "Miercoles";
        diasDeLaSemana[3] = "Jueves";
        diasDeLaSemana[4] = "Viernes";
        diasDeLaSemana[5] = "Sabado";
        diasDeLaSemana[6] = "Domingo";
        System.out.println("segundo dia de la semana es " + diasDeLaSemana[1]);

        // podemos inicializar un array agregando los [] luego del nombre de la variable
        // seguido = y de los elementos que contendra entre {}
        int numeros[] = {8, 9, 85, -6};
        int minimo, maximo;
        minimo = maximo = numeros[0]; // inicializamos los valores de las variables
        for ( int i = 0; i <= numeros.length - 1; i++) {
            // es importante el length - 1 por que sino tratara de acceder a un indice que no existe
            if (numeros[i] > maximo) maximo = numeros[i];
            if (numeros[i] < minimo) minimo = numeros[i];
        } 
        System.out.println("El valor maximo es " + maximo + " y el valor minimo es " + minimo);  

        // tambien podemos colocar las [] luego de especificar el tipo
        double[] miArrayDouble = {2.3, 8.9};
        System.out.println("Mi array de doubles " + miArrayDouble[1]);
    }
}