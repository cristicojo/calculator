package calculator;
import java.util.Scanner;

//metode de calcul

public class Calc {

    private float nr;
    private float nr1;
    private String opGlobal;
    private Scanner sc;
    private float rezultat;


    public Calc() {

        sc = new Scanner(System.in);

    }


    private void adunare() {

        float rezultat = nr + nr1;
        this.rezultat = rezultat;

    }

    private void scadere() {

        float rezultat = nr - nr1;
        this.rezultat = rezultat;
    }

    private void inmultire() {

        float rezultat = nr * nr1;
        this.rezultat = rezultat;
    }

    private void impartire() {

        float rezultat = nr / nr1;
        this.rezultat = rezultat;
    }


    public void citeste() {

        System.out.print("Dati numar= ");
        int var = sc.nextInt();


        if (nr == 0)
            nr = var;
        else
            nr1 = var;


    }


    private void citesteoperatorul() {

        System.out.print("Dati operatorul= ");
        opGlobal = sc.next();


    }

    public void ham() {
        int i = 0;
        float x[] = new float[20];
        citesteoperatorul();

        while ((opGlobal.equals("+")) || (opGlobal.equals("-"))
                || (opGlobal.equals("*")) || (opGlobal.equals("/"))) {

            if (opGlobal.equals("+")) {
                citeste();
                adunare();
                System.out.println(rezultat);

                citesteoperatorul();
                if (opGlobal.equals("+")) {
                    citeste();
                    x[i] = rezultat + nr1;
                    System.out.println(x[i]);
                } else if (opGlobal.equals("-")) {
                    citeste();
                    x[i] = rezultat - nr1;
                    System.out.println(x[i]);
                } else if (opGlobal.equals("*")) {
                    citeste();
                    x[i] = rezultat * nr1;
                    System.out.println(x[i]);
                } else if (opGlobal.equals("/")) {
                    citeste();
                    x[i] = rezultat / nr1;
                    System.out.println(x[i]);
                }

                if ((!opGlobal.equals("+")) && (!opGlobal.equals("-"))
                        && (!opGlobal.equals("*")) && (!opGlobal.equals("/")))
                    System.exit(0);


            } else if (opGlobal.equals("-")) {
                citeste();
                scadere();
                System.out.println(rezultat);

                citesteoperatorul();
                if (opGlobal.equals("-")) {
                    citeste();
                    x[i] = rezultat - nr1;
                    System.out.println(x[i]);
                } else if (opGlobal.equals("+")) {
                    citeste();
                    x[i] = rezultat + nr1;
                    System.out.println(x[i]);
                } else if (opGlobal.equals("*")) {
                    citeste();
                    x[i] = rezultat * nr1;
                    System.out.println(x[i]);
                } else if (opGlobal.equals("/")) {
                    citeste();
                    x[i] = rezultat / nr1;
                    System.out.println(x[i]);
                }


                if ((!opGlobal.equals("+")) && (!opGlobal.equals("-"))
                        && (!opGlobal.equals("*")) && (!opGlobal.equals("/")))
                    System.exit(0);

            } else if (opGlobal.equals("*")) {
                citeste();
                inmultire();
                System.out.println(rezultat);

                citesteoperatorul();
                if (opGlobal.equals("-")) {
                    citeste();
                    x[i] = rezultat - nr1;
                    System.out.println(x[i]);
                } else if (opGlobal.equals("+")) {
                    citeste();
                    x[i] = rezultat + nr1;
                    System.out.println(x[i]);
                } else if (opGlobal.equals("*")) {
                    citeste();
                    x[i] = rezultat * nr1;
                    System.out.println(x[i]);
                } else if (opGlobal.equals("/")) {
                    citeste();
                    x[i] = rezultat / nr1;
                    System.out.println(x[i]);
                }


                if ((!opGlobal.equals("+")) && (!opGlobal.equals("-"))
                        && (!opGlobal.equals("*")) && (!opGlobal.equals("/")))
                    System.exit(0);

            } else if (opGlobal.equals("/")) {
                citeste();
                impartire();
                System.out.println(rezultat);

                citesteoperatorul();
                if (opGlobal.equals("-")) {
                    citeste();
                    x[i] = rezultat - nr1;
                    System.out.println(x[i]);
                } else if (opGlobal.equals("+")) {
                    citeste();
                    x[i] = rezultat + nr1;
                    System.out.println(x[i]);
                } else if (opGlobal.equals("*")) {
                    citeste();
                    x[i] = rezultat * nr1;
                    System.out.println(x[i]);
                } else if (opGlobal.equals("/")) {
                    citeste();
                    x[i] = rezultat / nr1;
                    System.out.println(x[i]);
                }


                if ((!opGlobal.equals("+")) && (!opGlobal.equals("-"))
                        && (!opGlobal.equals("*")) && (!opGlobal.equals("/")))
                    System.exit(0);
            }


            while (i < x.length - 1) {

                citesteoperatorul();
                if (opGlobal.equals("+")) {
                    citeste();
                    x[i + 1] = x[i] + nr1;
                    System.out.println(x[i + 1]);
                    i++;
                } else if (opGlobal.equals("-")) {
                    citeste();
                    x[i + 1] = x[i] - nr1;
                    System.out.println(x[i + 1]);
                    i++;
                } else if (opGlobal.equals("*")) {
                    citeste();
                    x[i + 1] = x[i] * nr1;
                    System.out.println(x[i + 1]);
                    i++;
                } else if (opGlobal.equals("/")) {
                    citeste();
                    x[i + 1] = x[i] / nr1;
                    System.out.println(x[i + 1]);
                    i++;
                } else
                    System.exit(0);


                if (i == 19)
                    System.exit(0);

            }

        }
    }
}











