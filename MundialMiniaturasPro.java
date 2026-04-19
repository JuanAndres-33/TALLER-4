public class MundialMiniaturasPro {

    public static final String RESET = "\u001B[0m";
    public static final String R = "\u001B[41m";
    public static final String G = "\u001B[42m";
    public static final String Y = "\u001B[43m";
    public static final String B = "\u001B[44m";
    public static final String W = "\u001B[47m";
    public static final String N = "\u001B[40m";

    public static void main(String[] args) {

        System.out.println("=========== GRUPO A ===========\n");
        mostrar("MEXICO", mexico());
        mostrar("SUDAFRICA", sudafrica());
        mostrar("COREA DEL SUR", corea());
        mostrar("REPUBLICA CHECA", checa());

        System.out.println("=========== GRUPO B ===========\n");
        mostrar("CANADA", canada());
        mostrar("BOSNIA Y HERZEGOVINA", bosnia());
        mostrar("CATAR", catar());
        mostrar("SUIZA", suiza());

        System.out.println("=========== GRUPO C ===========\n");
        mostrar("BRASIL", brasil());
        mostrar("MARRUECOS", marruecos());
        mostrar("HAITI", haiti());
        mostrar("ESCOCIA", escocia());

        System.out.println("=========== GRUPO D ===========\n");
        mostrar("ESTADOS UNIDOS", usa());
        mostrar("PARAGUAY", paraguay());
        mostrar("AUSTRALIA", australia());
        mostrar("TURQUIA", turquia());
    }

    public static void mostrar(String nombre, char[][] bandera) {
        System.out.println(nombre + ":\n");
        imprimir(bandera);
        System.out.println();
    }

    public static void imprimir(char[][] bandera) {
        for (int i = 0; i < bandera.length; i++) {
            for (int j = 0; j < bandera[i].length; j++) {
                switch (bandera[i][j]) {
                    case 'R': System.out.print(R + "  " + RESET); break;
                    case 'G': System.out.print(G + "  " + RESET); break;
                    case 'Y': System.out.print(Y + "  " + RESET); break;
                    case 'B': System.out.print(B + "  " + RESET); break;
                    case 'W': System.out.print(W + "  " + RESET); break;
                    case 'N': System.out.print(N + "  " + RESET); break;
                    default: System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // ===== GRUPO A =====

    public static char[][] mexico() {
        return new char[][]{
            {'G','G','G','W','W','W','R','R','R'},
            {'G','G','G','W','W','W','R','R','R'},
            {'G','G','G','W','Y','W','R','R','R'},
            {'G','G','G','W','W','W','R','R','R'},
            {'G','G','G','W','W','W','R','R','R'}
        };
    }

    public static char[][] sudafrica() {
        return new char[][]{
            {'R','R','N','G','G','Y','B','B','B'},
            {'W','N','N','G','G','G','B','B','B'},
            {'Y','Y','N','G','G','G','Y','Y','Y'},
            {'W','N','N','G','G','G','R','R','R'},
            {'B','B','N','G','G','Y','R','R','R'}
        };
    }

    public static char[][] corea() {
        return new char[][]{
            {'W','N','W','W','W','W','W','N','W'},
            {'W','W','N','W','R','W','N','W','W'},
            {'W','W','W','R','R','B','W','W','W'},
            {'W','W','N','W','B','W','N','W','W'},
            {'W','N','W','W','W','W','W','N','W'}
        };
    }

    public static char[][] checa() {
        return new char[][]{
            {'B','B','W','W','W','W','W','W','W'},
            {'B','B','B','W','W','W','W','W','W'},
            {'B','B','B','B','W','W','W','W','W'},
            {'B','B','B','R','R','R','R','R','R'},
            {'B','B','R','R','R','R','R','R','R'}
        };
    }

    // ===== GRUPO B =====

    public static char[][] canada() {
        return new char[][]{
            {'R','R','W','W','W','W','W','R','R'},
            {'R','R','W','W','R','W','W','R','R'},
            {'R','R','W','R','R','R','W','R','R'},
            {'R','R','W','W','R','W','W','R','R'},
            {'R','R','W','W','W','W','W','R','R'}
        };
    }

    public static char[][] bosnia() {
        return new char[][]{
            {'B','B','B','Y','Y','Y','Y','Y','B'},
            {'B','B','W','B','Y','Y','Y','Y','B'},
            {'B','W','B','B','W','Y','Y','Y','B'},
            {'W','B','B','B','B','W','Y','Y','B'},
            {'B','B','B','B','B','B','W','Y','B'}
        };
    }

    public static char[][] catar() {
        return new char[][]{
            {'W','W','R','R','R','R','R','R','R'},
            {'W','W','W','R','R','R','R','R','R'},
            {'W','W','R','R','R','R','R','R','R'},
            {'W','W','W','R','R','R','R','R','R'},
            {'W','W','R','R','R','R','R','R','R'}
        };
    }

    public static char[][] suiza() {
        return new char[][]{
            {'R','R','R','W','W','W','R','R','R'},
            {'R','R','W','W','W','W','W','R','R'},
            {'R','R','R','W','W','W','R','R','R'},
            {'R','R','R','W','W','W','R','R','R'},
            {'R','R','R','R','R','R','R','R','R'}
        };
    }

    // ===== GRUPO C =====

    public static char[][] brasil() {
        return new char[][]{
            {'G','G','G','G','G','G','G','G','G'},
            {'G','G','G','Y','Y','Y','G','G','G'},
            {'G','G','Y','Y','B','Y','Y','G','G'},
            {'G','G','G','Y','Y','Y','G','G','G'},
            {'G','G','G','G','G','G','G','G','G'}
        };
    }

    public static char[][] marruecos() {
        return new char[][]{
            {'R','R','R','R','R','R','R','R','R'},
            {'R','R','R','G','G','G','R','R','R'},
            {'R','R','G','R','G','R','G','R','R'},
            {'R','R','R','G','G','G','R','R','R'},
            {'R','R','R','R','R','R','R','R','R'}
        };
    }

    public static char[][] haiti() {
        return new char[][]{
            {'B','B','B','B','B','B','B','B','B'},
            {'B','B','B','W','W','W','B','B','B'},
            {'R','R','R','W','G','W','R','R','R'},
            {'R','R','R','W','Y','W','R','R','R'},
            {'R','R','R','R','R','R','R','R','R'}
        };
    }

    public static char[][] escocia() {
        return new char[][]{
            {'W','W','B','B','B','B','B','W','W'},
            {'B','W','W','B','B','B','W','W','B'},
            {'B','B','W','W','B','W','W','B','B'},
            {'B','W','W','B','B','B','W','W','B'},
            {'W','W','B','B','B','B','B','W','W'}
        };
    }

    // ===== GRUPO D =====

    public static char[][] usa() {
        return new char[][]{
            {'B','W','B','W','B','R','W','R','W'},
            {'W','B','W','B','W','W','R','W','R'},
            {'B','W','B','W','B','R','W','R','W'},
            {'R','W','R','W','R','W','R','W','R'},
            {'W','R','W','R','W','R','W','R','W'}
        };
    }

    public static char[][] paraguay() {
        return new char[][]{
            {'R','R','R','R','R','R','R','R','R'},
            {'R','R','R','R','R','R','R','R','R'},
            {'W','W','W','W','B','W','W','W','W'},
            {'B','B','B','B','B','B','B','B','B'},
            {'B','B','B','B','B','B','B','B','B'}
        };
    }

    public static char[][] australia() {
        return new char[][]{
            {'B','R','W','R','B','B','W','B','B'},
            {'R','R','R','R','R','B','B','B','W'},
            {'W','R','W','R','B','B','W','B','B'},
            {'R','R','R','R','R','B','B','B','B'},
            {'B','R','W','R','B','B','W','B','B'}
        };
    }

    public static char[][] turquia() {
        return new char[][]{
            {'R','R','R','R','R','R','R','R','R'},
            {'R','W','W','R','R','W','R','R','R'},
            {'R','W','R','W','R','R','W','R','R'},
            {'R','W','W','R','R','W','R','R','R'},
            {'R','R','R','R','R','R','R','R','R'}
        };
    }
}