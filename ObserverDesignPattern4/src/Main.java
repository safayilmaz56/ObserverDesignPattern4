public class Main {
    public static void main(String[] args) {
        Customer musteri = new Customer("05555","Safa");
        musteri.yeniGozlemciEkle(new MakeCampaignObserver());
        musteri.yeniGozlemciEkle(new SendFreeCreditObserver());

        musteri.observerlaraHaberVer();

    }
}