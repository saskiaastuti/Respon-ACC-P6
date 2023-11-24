
package heewan;

public class Heewan {
   class Hewan {
       protected String nama;
       
       public Hewan(String nama){
           this.nama= nama;  
       }
       
       public void info(){
           System.out.println("Sebuah hewan bernama" + nama);
       }
   }

   class Kucing extends Hewan {
        private String jenis;

        public Kucing(String nama, String jenis) {
            super(nama);
            this.jenis = jenis;
        }
        
        @Override
        public void info() {
            System.out.println(" seekor kucing bernama " + nama + " dengan jenis " + jenis);
        }
    }

    class Anjing extends Hewan {
        private int berkaki;

        public Anjing(String nama, int berkaki) {
            super(nama);
            this.berkaki = berkaki;
        }

        @Override
        public void info() {
            System.out.println(" seekor anjing bernama " + nama + " dengan berkaki " + berkaki);
        }
    }
   
    public static void main(String[] args) {
        Heewan hewaan = new Heewan();
        Kucing kucing = hewaan.new Kucing ("Ndut", "Anggora");
        Anjing anjing = hewaan.new Anjing ("Jake", 4);
        
        kucing.info(); 
        anjing.info();
        
   }
    
}
    


 

