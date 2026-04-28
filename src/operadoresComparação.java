public class operadoresComparação {
    public static void main(String[] args) {
        var media = 7;
        var presenca = 80;
        var idade = 10;

        //E -> &&
        boolean passouDeAno = media >= 6 && presenca > 75;
        System.out.println(passouDeAno);

        // OU -> ||
        boolean gratuito = idade <5 || idade > 65 ;
        System.out.println(gratuito);

        //NEGAÇÃO -> INVERTIDO OU RESULTADO BOOLEANO
        boolean podeDigitar = !(idade < 18);
        System.out.println(podeDigitar);
    }
}
