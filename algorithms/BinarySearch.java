public class BinarySearch {
    public static int indexOf(int[] a, int target){ int l=0,r=a.length-1; while(l<=r){ int m=l+(r-l)/2; if(a[m]==target) return m; if(a[m]<target) l=m+1; else r=m-1; } return -1; }
    public static int firstOccurrence(int[] a,int target){ int l=0,r=a.length-1,ans=-1; while(l<=r){ int m=l+(r-l)/2; if(a[m]>=target){ if(a[m]==target) ans=m; r=m-1; } else l=m+1; } return ans; }
    public static int lastOccurrence(int[] a,int target){ int l=0,r=a.length-1,ans=-1; while(l<=r){ int m=l+(r-l)/2; if(a[m]<=target){ if(a[m]==target) ans=m; l=m+1; } else r=m-1; } return ans; }
    public static void main(String[] args){ int[] a={1,2,2,2,3,4,5}; System.out.println(indexOf(a,4)); System.out.println(firstOccurrence(a,2)); System.out.println(lastOccurrence(a,2)); }
}
