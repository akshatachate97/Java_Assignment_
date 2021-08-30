/*Write a JAVA program which reads a list of pairs of a word and a page number, and prints the word and a list of the corresponding page numbers*/


import java.util.PriorityQueue;
import java.util.Scanner;
 
public class corresponding
 {
     
    static class Dic implements Comparable<Dic>{
        String moji;
        int page;
        Dic(String moji, int page){
            this.moji=moji;
            this.page=page;
        }
        public int compareTo(Dic d) {
            if(this.moji.equals(d.moji)) {
                return this.page-d.page;
            }
            else {
                return this.moji.compareTo(d.moji);
            }
        }
    }
     
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            PriorityQueue<Dic> pq=new PriorityQueue<>();
			System.out.println("Input pairs of a word and a page number:"); 
            while(sc.hasNextLine()) {
                String str=sc.nextLine();
                String[] token=str.split(" ");
                String s=token[0];
                int n=Integer.parseInt(token[1]);
                pq.add(new Dic(s, n));
            }
            String pre="";
           System.out.println("\nWord and page number in alphabetical order:"); 
            while(!pq.isEmpty()) {
                Dic dic=pq.poll();
                if(dic.moji.equals(pre)) {
                    System.out.print(" "+dic.page);
                }
                else if(pre.equals("")) {
                    System.out.println(dic.moji);
                    System.out.print(dic.page);
                }
                else {
                    System.out.println();
                    System.out.println(dic.moji);
                    System.out.print(dic.page);
                }
                pre=dic.moji;
            }
            System.out.println();
        }
    }
}
