/* TIPOS PRIMITIVOS EM JAVA
 * FAMILIA  - TIPO PRIMITIVO - WRAPPER CLASS - TAMANHO
 * LÓGICO   - boolean        - Boolean       - 1 bit
 * LITERAIS - char           - Character     - 1 byte
 *          -                - String        - 1 byte/cada
 * INTEIROS - byte           - Byte          - 1 byte
 *          - short          - Short         - 2 bytes
 *          - int            - Integer       - 4 bytes
 *          - long           - Long          - 8 bytes
 * REAIS    - float          - Float         - 4 bytes
 *          - double         - Double        - 8 bytes
*/

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // tipos numéricos
        byte idade = 53;
        short ano = 2023;
        int cep = 01543020;
        long cpf = 14598673571L; // é preciso indicar que é long usando L (ou l)
        float pi = 3.1415F; // é preciso indicar que é short usando F (ou f)
        double dolar = 5.56;

        System.out.println("idade: %s\nano: %s\ncep: %s".formatted(idade, ano, cep));
        System.out.println("cpf: %s\npi: %s\ndolar: %s".formatted(cpf, pi, dolar));

        // do menor para o maior temos:
        // byte -> short -> int -> long
        // podemos atribuir um tipo menor a um maior... mas o contrário não.
        // exemplo
        // byte a = 12;
        // short b = a;
        // byte c = b; // erro: Type mismatch: cannot convert from short to byte
        // byte c = (byte) b; // é posível resolver isso, fazendo um casting.

        // Constantes
        // usamos a palavra reservada "final" e escrevemos o nome da constante em
        // upercase
        final double PI = 3.14;
        System.out.println("o valor de pi é: %s".formatted(PI));

    }
}
