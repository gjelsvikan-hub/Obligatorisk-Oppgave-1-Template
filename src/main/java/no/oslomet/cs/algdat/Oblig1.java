package no.oslomet.cs.algdat;

import java.util.NoSuchElementException;

public class Oblig1 {

    public static void main(String[] args) {
        int [] a = new int[] {1,2,3,4,5,6,7,8,9};
        int [] b = new int[] {9,8,7,6,5,4,3,2,1};
        System.out.println(maks(a));
        System.out.println(maks(b));
        System.out.println(ombyttinger(a));
        System.out.println(ombyttinger(b));
    }

    private Oblig1() {}

    // Oppgave 0
    public static int gruppeMedlemmer() {
        throw new UnsupportedOperationException();
        // Skal returne hvor mange som er i gruppa deres.
    }

    // Oppgave 1
    public static int maks(int[] a) {
        //throw new UnsupportedOperationException();
     if(a.length == 0){
         throw new NoSuchElementException("Arrayen er tom");
     }
        for(int i = 0; i < a.length-1; i++){
            if(a[i]>a[i+1]){
                int temp = a[i];
                a[i+1]= a[i];
                a[i]= temp;
            }
        }
        return a[a.length-1];
    }

    public static int ombyttinger(int[] a) {
        //throw new UnsupportedOperationException();
        int count = 0;
        for(int i = 0; i < a.length-1; i++){
            if(a[i]>a[i+1]){
                int temp = a[i];
                a[i+1]= a[i];
                a[i]= temp;
                count+=1;
            }
        }
        return count;
    }











    // Oppgave 2
    public static int antallUlikeSortert(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 3
    public static int antallUlikeUsortert(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 4
    public static void sorter(int[] a, int fra, int til) {throw new UnsupportedOperationException();}

    // Oppgave 5
    public static void delsortering(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 6
    public static void rotasjon(char[] a) {throw new UnsupportedOperationException();}

    // Oppgave 7
    public static void rotasjon(char[] a, int k) {throw new UnsupportedOperationException();}

    // Oppgave 8
    public static String flett(String s, String t) {throw new UnsupportedOperationException();}

    public static String flett(String... s) {throw new UnsupportedOperationException();}

    // Oppgave 9
    public static int[] indeksSortering(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 10
    public static int[] tredjeMin(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 11
    public static boolean inneholdt(String a, String b) {throw new UnsupportedOperationException();}
}