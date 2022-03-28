package com.company.modulo2.variaveisTiposdeDados;

public class Modulo2Java {
    public static void main(String[] args) {

            int i;
            //int i;
            int I;
            //int 1a;
            int _1a;
            int $aq;

            i = 5;
            I = 10;
            _1a = 20;
            $aq = 7;

            final int j = 10;
            //j = 15;
            int asrn246md;
            //int asrn246 78md;
            int asrn2$46_md = 100;
            //int asrn2$46%78_md = 10;

            int quantidadeProdutos = 50;
            //int QuantidadeProduto = 5;
            final int NUMERO_TENTATIVAS = 5;
            //final int numeroTentativas = 5;
            int QUANTIDADE_OPCOES = 26;
            int qtdProd;

            System.out.println(i);
            System.out.println(I);
            System.out.println(_1a);
            System.out.println($aq);

            System.out.println(j);
            System.out.println(asrn2$46_md);

            System.out.println(quantidadeProdutos);
            System.out.println(NUMERO_TENTATIVAS);
            System.out.println(QUANTIDADE_OPCOES);


//        Aula 2:
            //Criar duas variáveis com todos os tipos de dados apresentados na aula

            byte b1 = 10;
            byte b2 = 20;

            short s1 = 20000;
//        short s2 = 40000;

//        int i1 = -10000000000;
            int i2 = 28500;

            long l1 = 1000000000000000000l;
            long l2 = 2004005000500055000l;

//        float f1 = 4.5;
            float f2 = 10.68f;

            double d1 = 85.69;
            double d2 = 99.04d;

            char c1 = 'W';
//        char c2 = 'tw';
            char c3 = '\u0057';

            String st1 = "Jocksan";
            String st2 = "Cicrano";
            String st3 = "kjsa ajd   54894156a4 jiaopsd ";

            String st4 = "09/10/2001";

            boolean bol1 = true;
            boolean bol2 = false;

            System.out.println(b1);
            System.out.println(b2);
            System.out.println(s1);
            System.out.println(i2);
            System.out.println(l1);
            System.out.println(l2);
            System.out.println(f2);
            System.out.println(d1);
            System.out.println(d2);
            System.out.println(c1);
            System.out.println(c3);
            System.out.println(st1);
            System.out.println(st2);
            System.out.println(st3);
            System.out.println(bol1);
            System.out.println(bol2);


// Aula 3;  Tipos de dados e Operadores aritméticos

            System.out.println("Prepós");
            prePos();
            System.out.println("Aritméticos");
            aritmeticos();
            System.out.println("Atribuição");
            atribuicao();
            System.out.println("Precedência");
            precedencia();

        }

        private static void prePos() {
            int k  = 10;

            int i = ++k;
            int j = k--;
            int x = k;

            System.out.println("i: " + i );
            System.out.println("j: " + j );
            System.out.println("x: " + x );

        }

        private static void aritmeticos(){
            int a = 10;
            int b = 20;
            int c = 30;
            int d = 40;
            int e = 50;

            int r1 = a + b;
            int r2 = c - a;
            int r3 = d * d;
            int r4 = e / a;
            int r5 = c % b;

            System.out.println("a + b: " + r1);
            System.out.println("c - a: " + r2);
            System.out.println("d * d: " + r3);
            System.out.println("e / a: " + r4);
            System.out.println("c % b: " + r5);

        }

        private  static void atribuicao(){
            int i = 1500;
            short j = 15;
            long l = 500l;
            int k = 35;
            float f = 3.5f;
            double d = f;

            System.out.println("d: " + d);

            i += 5; //i = i + 5;
            j -= 3; //j = j - 3;
            d /= 2.7d; //d = d / 2.7d;
            l *= 3; //l = l * 3;
            k %= 2; //k = k % 3;

            System.out.println("i: " + i);
            System.out.println("j: " + j);
            System.out.println("d: " + d);
            System.out.println("l: " + l);
            System.out.println("k: " + k);

            i = k = j;
            System.out.println("k: " + k);
            System.out.println("i: " + i);
        }

        private  static void precedencia(){
            int i = 10;
            int j = 20;
            int k = 30;

            int a = i++ + --j * k; //10 + 19 * 30 -> 10 + 570 -> 580
            System.out.println("i++ + --j * k: " + a);

            System.out.println("i: " + i); //11


            int b = k / --i % 3 + 1; // 30 / 10 -> 3 % 3 + 1 -> 1
            System.out.println("i: " + i); //10

            System.out.println("k / --i % 3 + 1: " + b);

            System.out.println("i: " + i); //10


            int c = 2;
            c *= i += 5; // c = 2 * i; i = i + 5 -> c = 2 * i; i = 10 + 5; -> c = 2 * 15 ; -> c = 2 * 15; c = 30;
            System.out.println("c *= i += 5: " + c);

// Aula 4 -- Casting's (Implícito e Explícito)

            byte b1;
            short s1 = 1000;
            b1 = (byte) s1;
            System.out.println(b1);


            long l1;
            int i1 = 10;
            l1 = i1;
            System.out.println(i1);


            int i2;
            long l2 = 1000000000000000000l;
            i2 = (int)l2;
            System.out.println(i2);


            int i3;
            long l3 = 10000l;
            i3 = (int) l3;
            System.out.println(i3);


            double d1;
            float f1 = 10.5f;
            d1 = f1;
            System.out.println(d1);

            float f2;
            float f3;
            double d2 = 10000.58d;
            f2 = (float) d2;
            double d3 = 10000.588888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888d;
            f3 = (float) d3;
            System.out.println(f2);
            System.out.println(f3);


            int i4;
            float f4 = 11.5697f;
            i4  = (int) f4;
            System.out.println(i4);

            b1 = (byte) d3;
            System.out.println(b1);

        }
}
