import java.util.Arrays;

public class Sorts {
    public static void bubble(int[] a){ int n=a.length; boolean sw; do{ sw=false; for(int i=1;i<n;i++){ if(a[i-1]>a[i]){int t=a[i];a[i]=a[i-1];a[i-1]=t; sw=true;} } n--; }while(sw); }
    public static void insertion(int[] a){ for(int i=1;i<a.length;i++){ int key=a[i], j=i-1; while(j>=0 && a[j]>key){ a[j+1]=a[j]; j--; } a[j+1]=key; } }
    public static void selection(int[] a){ for(int i=0;i<a.length;i++){ int m=i; for(int j=i+1;j<a.length;j++) if(a[j]<a[m]) m=j; int t=a[i]; a[i]=a[m]; a[m]=t; } }
    public static void mergeSort(int[] a){ mergeSort(a,0,a.length-1); }
    private static void mergeSort(int[] a,int l,int r){ if(l>=r) return; int m=l+(r-l)/2; mergeSort(a,l,m); mergeSort(a,m+1,r); merge(a,l,m,r); }
    private static void merge(int[] a,int l,int m,int r){ int[] tmp=new int[r-l+1]; int i=l,j=m+1,k=0; while(i<=m && j<=r){ tmp[k++]= a[i]<=a[j]? a[i++]:a[j++]; } while(i<=m) tmp[k++]=a[i++]; while(j<=r) tmp[k++]=a[j++]; System.arraycopy(tmp,0,a,l,tmp.length); }
    public static void main(String[] args){ int[] arr={5,2,9,1,5,6}; int[] a1=arr.clone(),a2=arr.clone(),a3=arr.clone(),a4=arr.clone(); bubble(a1); insertion(a2); selection(a3); mergeSort(a4); System.out.println(Arrays.toString(a1)); System.out.println(Arrays.toString(a2)); System.out.println(Arrays.toString(a3)); System.out.println(Arrays.toString(a4)); }
}
