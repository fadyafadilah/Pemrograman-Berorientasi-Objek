/**
 *
 * @author FAD
 */
public class HandPhone {
    String jenis_hp;
    int tahun_pembuatan;
    
    public void setDataHP(String jenis_hp, int tahun_pembuatan){
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }
    
    public String getJenisHp (){
        return jenis_hp;
    }
    
    public int getTahunPembuatan(){
        return tahun_pembuatan;
    }
    
    public static void main(String[] args){
        HandPhone hp = new HandPhone();
        hp.setDataHP("Samsung", 2024);
        System.out.println(hp.getJenisHp());
        System.out.println(hp.getTahunPembuatan());
    }
}
