import jdk.jfr.Timespan;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class Customer {


    private String telefonNo;
    private String kullaniciAdi;
    private List<IObserver> list;

    public Customer(String telefonNo, String kullaniciAdi) {
        this.telefonNo = telefonNo;
        this.kullaniciAdi = kullaniciAdi;
        list = new ArrayList<>();
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public void yeniGozlemciEkle(IObserver observer){
        if(!list.contains(observer)){
            list.add(observer);
        }
    }

    public void observerlaraHaberVer(){
        for (IObserver observer : list){
            observer.Notify(this);
        }
    }
}
