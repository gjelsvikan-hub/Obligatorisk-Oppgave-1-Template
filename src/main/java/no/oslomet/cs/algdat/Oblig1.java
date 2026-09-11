package no.oslomet.cs.algdat;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oblig1 {

    private Oblig1() {}

    // Oppgave 0
    public static int gruppeMedlemmer() {
        //throw new UnsupportedOperationException();
        return 1;
    }

    //a) Det blir gjort n-1 sammenligninger, der hvert tall sammenlignes med det neste, utenom det første.
    //
    //b) Når listen er sortert eller tilnærmet sortert kronologisk blir det færrest bytter.
    //
    //c) Når listen med tall er usortert eller synkende blir det flest bytter.
    //
    //d) For hvert par som sjekkes er sannsynligheten 1/2 for at de står i riktig posisjon, og man går igjennom arrayet n-1 ganger
    //som medfører (1/2)*(n-1) = (n-1)/2.

    // Oppgave 1
    public static int maks(int[] a) {
        //throw new UnsupportedOperationException();
        if (a.length < 1) {
            throw new NoSuchElementException("listen er tom");
        }
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                change(a,i,i+1);
            }
        }
        return a[a.length - 1];
    }
    private static void change(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int ombyttinger(int[] a) {
        //throw new UnsupportedOperationException();
        int count = 0;
        for(int i = 0; i < a.length-1; i++){ //
            if(a[i]>a[i+1]){ //n-1
                int temp = a[i];
                a[i+1]= a[i];
                a[i]= temp;
                count+=1;
            }
        }
        return count;
    }

    // Oppgave 2
    public static int antallUlikeSortert(int[] a) {
        //throw new UnsupportedOperationException();
        if(a.length == 0){
            return 0;
        }
        int count = 1;
        for(int i = 0; i<a.length-1; i++){
            if(a[i]>a[i+1]){
                throw new IllegalStateException("tabellen er ikke sortert stigende");
            }
            if(a[i]<a[i+1]){
                count++;
            }
        }
        return count;
    }

    // Oppgave 3
    public static int antallUlikeUsortert(int[] a) {
        //throw new UnsupportedOperationException();
        if(a.length == 0){
            return 0;
        }
        int count = 1;
        for (int i = 1; i < a.length; i++) {
            boolean reoccuring = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]){
                    reoccuring = true;
                    break;
                }
            }
            if(!reoccuring){
                count ++;
            }
        }
        return count;
    }
    // Oppgave 4
    public static void sorter(int[] a, int fra, int til) {
        //throw new UnsupportedOperationException();
        if(a == null) {
            throw new NullPointerException("Arrayet er null");
        }
        if(fra < 0 ){
            throw new IndexOutOfBoundsException("fra er negativ");
        }
        if (til > a.length) {
            throw new IndexOutOfBoundsException("til er større enn tabellens lengde");
        }
        if(til - fra <= 1){
            return;
        }
        int p = partition(a, fra, til -1);
        sorter(a,fra,p);
        sorter(a,p+1,til);

    }
private static int partition(int [] a, int left, int right){
        int pivot = a[right];
        int i = left - 1;
        for(int j = left; j < right; j++){
            if(a[j] <= pivot){
                i++;
               change(a,i,j);
            }
        }
       change(a,i + 1, right);
        return i + 1;
}

    // Oppgave 5
    public static void delsortering(int[] a) {
        //throw new UnsupportedOperationException();
        int odd = 0;
        for (int i = 0; i < a.length; i++) {
            if(!(a[i]%2==0)){
               change(a,odd,i);
               odd++;
            }
        }
        sorter(a, 0,odd);
        sorter(a,odd,a.length);
    }

    // Oppgave 6
    public static void rotasjon(char[] a) {
        //throw new UnsupportedOperationException();
        int rotate = 1;
        int n = a.length;
        if(n<2){
            return;
        }
        char[] b = Arrays.copyOfRange(a,n-rotate,n);
        for (int i = n-1; i >= rotate; i--) {
            a[i] = a[i-rotate];
        }
        System.arraycopy(b,0,a,0,rotate);
        }


    // Oppgave 7
    public static void rotasjon(char[] a, int k) {throw new UnsupportedOperationException();}

    // Oppgave 8
    public static String flett(String s, String t) {
        //throw new UnsupportedOperationException();
        if(s.isEmpty() && t.isEmpty()){
            return "";
        }
        String u = "";
        int i = 0, j = 0;

        while(i < s.length() && j < t.length()){
           u+= s.charAt(i++);
           u+= t.charAt(j++);
        }
        while(i < s.length()){
            u+= s.charAt(i++);
        }
        while(j < t.length()){
            u+= t.charAt(j++);
        }
        return u;

    }

    public static String flett(String... s) {
        if(s.length == 0){
            return "";
        }
        // throw new UnsupportedOperationException();
        String result = "";

        int longest = 0;
        for (String str : s){
            if(str.length() > longest){
                longest = str.length();
            }
        }
        for(int i = 0; i < longest; i++){
            for (String str : s){
                if(i < str.length()){
                    result += str.charAt(i);
                }
            }
        }
        return result;
    }

    // Oppgave 9
    public static int[] indeksSortering(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 10
    public static int[] tredjeMin(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 11
    public static boolean inneholdt(String a, String b) {throw new UnsupportedOperationException();}
}