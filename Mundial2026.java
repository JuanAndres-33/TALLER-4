package practicas;

import java.util.Scanner;

public class Mundial2026 {

    static Scanner sc = new Scanner(System.in);

    // ===== COLORES =====
    static final String RESET = "\u001B[0m";
    static final String R = "\u001B[41m";
    static final String G = "\u001B[42m";
    static final String Y = "\u001B[43m";
    static final String B = "\u001B[44m";
    static final String W = "\u001B[47m";
    static final String N = "\u001B[40m";

    // ===== EQUIPOS =====
    static String[] equipos = {
        "Belgica","Egipto","Iran","Nueva Zelanda",
        "España","Cabo Verde","Arabia","Uruguay",
        "Colombia","Alemania","Noruega"
    };

    // ===== TABLA =====
    static int[][] tabla = new int[48][10]; 

    // ===== FIXTURE =====
    static String[][] fixture = {
        {"Belgica vs Egipto","18:00"},
        {"Iran vs Nueva Zelanda","21:00"},
        {"España vs Uruguay","20:00"}
    };

    public static void main(String[] args) {

        int op;

        do {
            menu();
            op = sc.nextInt();

            switch(op){
                case 1: verBandera(); break;
                case 2: verTabla(); break;
                case 3: verFixture(); break;
                case 4: infoPais(); break;
                case 5: registrarPartido(); break;
                case 6: System.out.println("Saliendo..."); break;
            }

        } while(op != 6);
    }

    // ===== MENU =====
    public static void menu(){
        System.out.println("\n==============================");
        System.out.println("   MUNDIAL 2026 🌎");
        System.out.println("==============================");
        System.out.println("1. Ver bandera");
        System.out.println("2. Tabla posiciones");
        System.out.println("3. Fixture");
        System.out.println("4. Info pais");
        System.out.println("5. Registrar partido");
        System.out.println("6. Salir");
        System.out.print("Opcion: ");
    }

    // ===== BANDERAS =====
    public static void verBandera(){

        for(int i=0;i<equipos.length;i++)
            System.out.println((i+1)+". "+equipos[i]);

        System.out.print("Seleccione: ");
        int p = sc.nextInt();

        System.out.println("1. Grande (12x36)");
        System.out.println("2. Mediano (9x27)");
        System.out.println("3. Pequeño (6x18)");
        System.out.println("4. Miniatura (3x9)");
        int t = sc.nextInt();

        int f=6,c=18;

        switch(t){
            case 1: f=12; c=36; break;
            case 2: f=9; c=27; break;
            case 3: f=6; c=18; break;
            case 4: f=3; c=9; break;
        }

        generarBandera(p,f,c);
    }

    public static void generarBandera(int pais,int f,int c){

        char[][] b = new char[f][c];

        switch(pais){

            case 1: 
                for(int i=0;i<f;i++)
                    for(int j=0;j<c;j++)
                        b[i][j]=(j<c/3)?'N':(j<2*c/3)?'Y':'R';
                break;

            case 2:
                for(int i=0;i<f;i++)
                    for(int j=0;j<c;j++)
                        b[i][j]=(i<f/3)?'R':(i<2*f/3)?'W':'N';
                break;

            case 3:
                for(int i=0;i<f;i++)
                    for(int j=0;j<c;j++)
                        b[i][j]=(i<f/3)?'G':(i<2*f/3)?'W':'R';
                break;

            case 4:
                for(int i=0;i<f;i++)
                    for(int j=0;j<c;j++)
                        b[i][j]='B';
                break;

            case 5:
                for(int i=0;i<f;i++)
                    for(int j=0;j<c;j++)
                        b[i][j]=(i<f/4||i>=3*f/4)?'R':'Y';
                break;

            case 6:
                for(int i=0;i<f;i++)
                    for(int j=0;j<c;j++)
                        b[i][j]='B';
                break;

            case 7:
                for(int i=0;i<f;i++)
                    for(int j=0;j<c;j++)
                        b[i][j]='G';
                break;

            case 8:
                for(int i=0;i<f;i++)
                    for(int j=0;j<c;j++)
                        b[i][j]=(i%2==0)?'W':'B';
                break;

            case 9:
                for(int i=0;i<f;i++)
                    for(int j=0;j<c;j++)
                        b[i][j]=(i<f/2)?'Y':(i<3*f/4)?'B':'R';
                break;

            case 10:
                for(int i=0;i<f;i++)
                    for(int j=0;j<c;j++)
                        b[i][j]=(i<f/3)?'N':(i<2*f/3)?'R':'Y';
                break;

            case 11:
                for(int i=0;i<f;i++)
                    for(int j=0;j<c;j++)
                        b[i][j]='R';
                for(int i=0;i<f;i++) b[i][c/3]='B';
                for(int j=0;j<c;j++) b[f/2][j]='B';
                break;
        }

        imprimir(b,f,c);
    }

    public static void imprimir(char[][] b,int f,int c){
        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                switch(b[i][j]){
                    case 'R': System.out.print(R+"  "+RESET); break;
                    case 'G': System.out.print(G+"  "+RESET); break;
                    case 'Y': System.out.print(Y+"  "+RESET); break;
                    case 'B': System.out.print(B+"  "+RESET); break;
                    case 'W': System.out.print(W+"  "+RESET); break;
                    case 'N': System.out.print(N+"  "+RESET); break;
                }
            }
            System.out.println();
        }
    }

    // ===== REGISTRAR PARTIDO =====
    public static void registrarPartido(){

        System.out.println("\n=== REGISTRAR PARTIDO ===");

        for(int i=0;i<equipos.length;i++)
            System.out.println((i+1)+". "+equipos[i]);

        System.out.print("Equipo 1: ");
        int e1 = sc.nextInt()-1;

        System.out.print("Equipo 2: ");
        int e2 = sc.nextInt()-1;

        System.out.print("Goles equipo 1: ");
        int g1 = sc.nextInt();

        System.out.print("Goles equipo 2: ");
        int g2 = sc.nextInt();

        tabla[e1][0]++;
        tabla[e2][0]++;

        tabla[e1][4]+=g1;
        tabla[e1][5]+=g2;

        tabla[e2][4]+=g2;
        tabla[e2][5]+=g1;

        if(g1>g2){
            tabla[e1][1]++;
            tabla[e1][9]+=3;
            tabla[e2][3]++;
        } else if(g2>g1){
            tabla[e2][1]++;
            tabla[e2][9]+=3;
            tabla[e1][3]++;
        } else {
            tabla[e1][2]++;
            tabla[e2][2]++;
            tabla[e1][9]++;
            tabla[e2][9]++;
        }

        tabla[e1][6]=tabla[e1][4]-tabla[e1][5];
        tabla[e2][6]=tabla[e2][4]-tabla[e2][5];

        System.out.println("Partido registrado ✅");
    }

    // ===== TABLA =====
    public static void verTabla(){

        for(int i=0;i<equipos.length;i++){
            System.out.printf("%-15s PJ:%d GF:%d GC:%d Pts:%d\n",
                equipos[i],
                tabla[i][0],
                tabla[i][4],
                tabla[i][5],
                tabla[i][9]);
        }
    }

    // ===== FIXTURE =====
    public static void verFixture(){
        for(int i=0;i<fixture.length;i++){
            System.out.println((i+1)+". "+fixture[i][0]);
        }
    }

    // ===== INFO =====
    public static void infoPais(){

        System.out.print("Pais: ");
        sc.nextLine();
        String p = sc.nextLine();

        if(p.equalsIgnoreCase("Colombia")){
            System.out.println("Capital: Bogota");
            System.out.println("Jugador: Luis Diaz");
        }

        if(p.equalsIgnoreCase("Alemania")){
            System.out.println("Capital: Berlin");
            System.out.println("Jugador: Musiala");
        }
    }
}