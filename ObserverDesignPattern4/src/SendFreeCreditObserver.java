public class SendFreeCreditObserver implements IObserver{
    @Override
    public void Notify(Customer customer) {
        System.out.println(customer.getTelefonNo() + " numarasına sahip " + customer.getKullaniciAdi() + " adlı kullanıcıya bedava kontör gonderildi");

    }
}
