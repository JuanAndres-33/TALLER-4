package practicas;

import java.util.Scanner;

public class Mundial {
 
       static Scanner sc = new Scanner(System.in);

    // ===== COLORES ANSI =====
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[41m";
    public static final String VERDE = "\u001B[42m";
    public static final String AMARILLO = "\u001B[43m";
    public static final String AZUL = "\u001B[44m";
    public static final String BLANCO = "\u001B[47m";
    public static final String NEGRO = "\u001B[40m";

    public static void main(String[] args) {

        mostrarMenu();
        int pais = sc.nextInt();

        int[] tamaño = seleccionarTamaño();

        generarBandera(pais, tamaño[0], tamaño[1]);
    }

    // ================= MENU =================
    public static void mostrarMenu() {

        System.out.println("=== GRUPO I ===");
        System.out.println("1. Francia");
        System.out.println("2. Senegal");
        System.out.println("3. Irak");
        System.out.println("4. Noruega");

        System.out.println("\n=== GRUPO J ===");
        System.out.println("5. Argentina");
        System.out.println("6. Argelia");
        System.out.println("7. Austria");
        System.out.println("8. Jordania");

        System.out.println("\n=== GRUPO K ===");
        System.out.println("9. Portugal");
        System.out.println("10. RD Congo");
        System.out.println("11. Uzbekistan");
        System.out.println("12. Colombia");

        System.out.println("\n=== GRUPO L ===");
        System.out.println("13. Inglaterra");
        System.out.println("14. Croacia");
        System.out.println("15. Ghana");
        System.out.println("16. Panama");

        System.out.print("\nSeleccione un pais: ");
    }

    // ================= TAMAÑOS =================
    public static int[] seleccionarTamaño() {

        System.out.println("\nSeleccione tamaño:");
        System.out.println("1. Grande (12x36)");
        System.out.println("2. Mediano (9x27)");
        System.out.println("3. Pequeño (6x18)");
        System.out.println("4. Miniatura (3x9)");

        int op = sc.nextInt();

        switch (op) {
            case 1: return new int[]{12, 36};
            case 2: return new int[]{9, 27};
            case 3: return new int[]{6, 18};
            case 4: return new int[]{3, 9};
            default: return new int[]{6, 18};
        }
    }

    // ================= BANDERAS =================
    public static void generarBandera(int pais, int f, int c) {

        char[][] b = new char[f][c];

        switch (pais) {

            case 1: // Francia
                for(int i=0;i<f;i++)
                    for(int j=0;j<c;j++)
                        b[i][j] = (j<c/3)?'B':(j<2*c/3)?'W':'R';
                break;

            case 2: // Senegal
                for(int i=0;i<f;i++)
                    for(int j=0;j<c;j++)
                        b[i][j] = (j<c/3)?'G':(j<2*c/3)?'Y':'R';
                b[f/2][c/2]='Y';
                break;

            case 3: // Irak
                for(int i=0;i<f;i++)
                    for(int j=0;j<c;j++)
                        b[i][j]=(i<f/3)?'R':(i<2*f/3)?'W':'N';
                break;

            case 4: // Noruega
                for(int i=0;i<f;i++)
                    for(int j=0;j<c;j++)
                        b[i][j]='R';
                for(int i=0;i<f;i++) b[i][c/3]='B';
                for(int j=0;j<c;j++) b[f/2][j]='B';
                break;

            case 5: // Argentina
                for(int i=0;i<f;i++)
                    for(int j=0;j<c;j++)
                        b[i][j]=(i<f/3||i>=2*f/3)?'C':'W';
                b[f/2][c/2]='Y';
                break;

            case 6: // Argelia
                for(int i=0;i<f;i++)
                    for(int j=0;j<c;j++)
                        b[i][j]=(j<c/2)?'G':'W';
                b[f/2][c/2]='R';
                break;

            case 7: // Austria
                for(int i=0;i<f;i++)
                    for(int j=0;j<c;j++)
                        b[i][j]=(i<f/3||i>=2*f/3)?'R':'W';
                break;

            case 8: // Jordania
                for(int i=0;i<f;i++)
                    for(int j=0;j<c;j++)
                        b[i][j]=(i<f/3)?'N':(i<2*f/3)?'W':'G';
                for(int i=0;i<f;i++)
                    for(int j=0;j<c/4;j++)
                        b[i][j]='R';
                break;

            case 9: // Portugal
                for(int i=0;i<f;i++)
                    for(int j=0;j<c;j++)
                        b[i][j]=(j<c/3)?'G':'R';
                b[f/2][c/3]='Y';
                break;

            case 10: // RD Congo
                for(int i=0;i<f;i++)
                    for(int j=0;j<c;j++)
                        b[i][j]='B';
                for(int i=0;i<f;i++)
                    if(i<c) b[i][i]='R';
                break;

            case 11: // Uzbekistan
                for(int i=0;i<f;i++)
                    for(int j=0;j<c;j++)
                        b[i][j]=(i<f/3)?'B':(i<2*f/3)?'W':'G';
                break;

            case 12: // Colombia
                for(int i=0;i<f;i++)
                    for(int j=0;j<c;j++)
                        b[i][j]=(i<f/2)?'Y':(i<3*f/4)?'B':'R';
                break;

            case 13: // Inglaterra
                for(int i=0;i<f;i++)
                    for(int j=0;j<c;j++)
                        b[i][j]='W';
                for(int i=0;i<f;i++) b[i][c/2]='R';
                for(int j=0;j<c;j++) b[f/2][j]='R';
                break;

            case 14: // Croacia
                for(int i=0;i<f;i++)
                    for(int j=0;j<c;j++)
                        b[i][j]=(i<f/3)?'R':(i<2*f/3)?'W':'B';
                b[f/2][c/2]='R';
                break;

            case 15: // Ghana
                for(int i=0;i<f;i++)
                    for(int j=0;j<c;j++)
                        b[i][j]=(i<f/3)?'R':(i<2*f/3)?'Y':'G';
                b[f/2][c/2]='N';
                break;

            case 16: // Panama
                for(int i=0;i<f;i++){
                    for(int j=0;j<c;j++){
                        if(i<f/2 && j<c/2) b[i][j]='W';
                        else if(i<f/2) b[i][j]='R';
                        else if(j<c/2) b[i][j]='B';
                        else b[i][j]='W';
                    }
                }
                break;
        }

        imprimir(b,f,c);
    }

    // ================= IMPRESION A COLOR =================
    public static void imprimir(char[][] b, int f, int c){

        System.out.println("\nBANDERA:\n");

        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){

                switch(b[i][j]){
                    case 'R': System.out.print(ROJO + "  " + RESET); break;
                    case 'G': System.out.print(VERDE + "  " + RESET); break;
                    case 'Y': System.out.print(AMARILLO + "  " + RESET); break;
                    case 'B': System.out.print(AZUL + "  " + RESET); break;
                    case 'W': System.out.print(BLANCO + "  " + RESET); break;
                    case 'N': System.out.print(NEGRO + "  " + RESET); break;
                    case 'C': System.out.print(AZUL + "  " + RESET); break;
                    default: System.out.print("  ");
                }

            }
            System.out.println();
        }
   
    }
}  

