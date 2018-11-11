/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

/**
 *
 * @author dharyl
 */
public class localData {

    void setINDEX(int jml) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void set(int i, setMhs data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int getINDEX() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void SearchNim(String inputNim) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void SearchNama(String inputNama) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void SearchIpk(String inputIpk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public class Compleks {
    setMhs[] data;
    private int index;
    private int x;
   
   
    setMhs dt = new setMhs();
    public Compleks(){
        data = new setMhs[100];
    }
   
    public void get(int ind){
                System.out.println("NIM   : "+data[ind].getNim());
                System.out.println("Nama  : "+data[ind].getNama());
                System.out.println("IPK   : "+data[ind].getIpk());
                System.out.print("\n=====================\n");
                }
   
    public void set(int index, setMhs datuk){
        data[index] = datuk;
    }

    public int getINDEX(){
        return index;
    }
   
    public void setINDEX(int index){
        this.index = index;
    }
  
    public void SearchNim(String nm){
        int a = getINDEX();
        for(int i = 0; i<a; i++){
            if(nm.equals(data[i].getNim())){
                get(i);
            }           
        }
    }
   
    public void SearchNama(String nm){
        int a = getINDEX();
        for(int i = 0; i<a; i++){
            if(nm.equals(data[i].getNama())){
                get(i);
            }           
        }
    }
   
    public void SearchIpk(String ip){
        int a = getINDEX();
        for(int i = 0; i<a; i++){
            if(ip.equals(data[i].getIpk())){
                get(i);
            }            
        }
    }
}
}