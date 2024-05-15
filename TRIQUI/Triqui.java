package juego.triqui;

import juego.excepciones.MovimientoInvalidoException;
import juego.ui.Dialogo;

public class Triqui {
    private char[][] tablero = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

    public void jugar() {
        Jugador jugadorHumano = new Humano();
        Jugador jugadorComputadora = new Computadora();

        char jugadorInicia = (Math.random() > 0.5) ? 'X' : 'O';

        while (true) {
            imprimirTablero();

            try {
                if (jugadorInicia == 'X') {
                    jugadorHumano.realizarMovimiento(tablero, 'X');
                } else {
                    jugadorComputadora.realizarMovimiento(tablero, 'O');
                }

                if (verificarGanador('X')) {
                    imprimirTablero();
                    System.out.println("¡Felicidades! Has ganado contra la computadora.");
                    break;
                }

                if (verificarGanador('O')) {
                    imprimirTablero();
                    System.out.println("¡La computadora ha ganado! Intenta de nuevo.");
                    break;
                }

                if (esEmpate()) {
                    imprimirTablero();
                    System.out.println("¡Es un empate!");
                    break;
                }

                jugadorInicia = (jugadorInicia == 'X') ? 'O' : 'X';
            } catch (MovimientoInvalidoException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void imprimirTablero() {
        System.out.println("  1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("  -----");
            }
        }
        System.out.println();
    }

    private boolean verificarGanador(char jugador) {
        // Verificar filas y columnas
        for (int i = 0; i < 3; i++) {
            if ((tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) ||
                (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador)) {
                return true;
            }
        }

        // Verificar diagonales
        if ((tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) ||
            (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador)) {
            return true;
        }

        return false;
    }

    private boolean esEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    // Getters y setters
    public char[][] getTablero() {
        return tablero;
    }

    public void setTablero(char[][] tablero) {
        this.tablero = tablero;
    }
}
