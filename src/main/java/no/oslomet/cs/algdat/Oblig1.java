package no.oslomet.cs.algdat;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oblig1 {

    public static void main(String[] args) {
        int [] a = new int[] {1,2,3,4,5,6,7,8,9};
        int [] b = new int[] {9,8,7,6,5,4,3,2,1};
        int [] c = new int[] {1,4,5,6,7,3,4,6,3};
        int [] d = new int[] {1,1,2,2,3,3,4,4};
        int [] e = new int[] {1,3,2};
        int [] f = new int[] {4,3,2,1};
        int [] g = new int[] {1,2,3,4,};
        int[] a2 = new int[] {6, 10, 9, 4, 1, 3, 8, 5, 2, 7};
        int[] b2 = {5, 2, 8, 4, 7, 6};

        System.out.println(maks(b2));
        //System.out.println(maks(a));
        //System.out.println(maks(b));
        //System.out.println(antallUlikeUsortert(d));
        sorter(a2,3,8);
        System.out.println(Arrays.toString(a2));



    }

    private Oblig1() {}

    // Oppgave 0
    public static int gruppeMedlemmer() {
        //throw new UnsupportedOperationException();
        return 1;
    }

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
        int count = 1;
        if(a.length == 0){
            return 0;
        }
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
        int count = 0;
        for (int i = 0; i < a.length-1; i++) {
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
        if(fra<0){
            throw new IndexOutOfBoundsException("fra er negativ");
        } else if (til> a.length) {
            throw new IndexOutOfBoundsException("til er større enn tabellens lengde");
        }
        if( fra < til) {
            int p = partition(a, fra, til);
            sorter(a,fra,p-1);
            sorter(a,p+1,til);
        }
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
       change(a,i +1, right);
        return i + 1;
}

    // Oppgave 5
    public static void delsortering(int[] a) {
        //throw new UnsupportedOperationException();
        int odd = 0; //posisjon til oddetall
        for (int i = 0; i < a.length; i++) {
            if(!(a[i]%2==0)){  //bytter posisjon på partall og oddetall, legger oddetall til venste i listen
               change(a,odd,i);
               odd++;
            }
        }
        sorter(a, 0,odd-1);
        sorter(a,odd,a.length);
    }

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