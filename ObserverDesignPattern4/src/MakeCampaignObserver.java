public class MakeCampaignObserver implements IObserver{

    @Override
    public void Notify(Customer customer) {
        System.out.println(customer.getTelefonNo() + " numarasına sahip " + customer.getKullaniciAdi() + " adlı kullanıcıya mesaj gonderildi");
    }

}
